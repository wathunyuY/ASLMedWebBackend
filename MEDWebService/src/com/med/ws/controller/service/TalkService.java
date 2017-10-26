package com.med.ws.controller.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.med.asl.ws.beans.ChatMsgBean;
import com.med.asl.ws.beans.NotificationDataParamBean;
import com.med.asl.ws.beans.ChatMsgBean.SenderDetail;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.contants.NotificationTypeConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiPersonSubscrDAO;
import com.med.ods.dao.NotiPoolDAO;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiPool;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.rq.ChatMessageRqType;

@Service
@Transactional
public class TalkService {
private static Logger logger = LogManager.getLogger(TalkService.class);
	
	@Autowired
	NotiSubscrTblDAO subscrTblDAO;
	@Autowired
	PersonDAO personDAO;
	@Autowired
	NotiSubscrPersonDAO subscrPersonDAO;
	@Autowired
	PersLoginDeviceDAO loginDeviceDAO;
	@Autowired
	ResearchService researchService;
	@Autowired
	PersLoginDeviceDAO persLoginDeviceDAO;
	@Autowired
	NotiPersonSubscrDAO notiPersonSubscrDAO;
	@Autowired
	NotificationService notificationService;
	@Autowired
	ImageService imageService;
	@Autowired
	PersonalService personalService;
	@Autowired
	NotiPoolDAO notiPoolDAO;
	/**
	 * Sent Chat
	 * @param pb
	 * @return 
	 * @throws MEDException
	 * @throws IOException
	 */
	public ChatMsgBean broadcastChatMessage(ProcessBean pb) throws MEDException, IOException { //send chat
		Integer oprid = Integer.parseInt(pb.getOprid());
		ChatMessageRqType rq = pb.getRequest().getChatRqType();// rq
		if (null == rq.getSubscrId()) //.getScheduleId()
			throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS, "subscrId");
		NotiSubscrTbl room = subscrTblDAO.findByPK(rq.getSubscrId());
		if(null == room) throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "room id : "+rq.getSubscrId());
		if(Constants.MSSQL.LOGIC.FALSE == room.getIsActive())  throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "This room is INACTIVE");
		
		if (!StringUtils.isEmpty(rq.getMsg()) || !StringUtils.isEmpty(rq.getImage())) {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"), 
                    rq.getSubscrId()); 
			NotificationDataParamBean parm = new NotificationDataParamBean();
			parm.setChatMsg(rq.getMsg());
			if(null != rq.getImage()){
				String image_dir_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.CHAT_IMAGE_DIRECTORY");//asl_chat/pictures
				String image_name = rq.getSubscrId() +"_"+pb.getOprid()+"_"+Calendar.getInstance().getTime().getTime();//1_1_3132131312
				imageService.convertBase64ToFile(rq.getImage(), image_dir_path, image_name);
				parm.setImagePath(image_name);
			}
			String body = parm.getChatMsg() != null ? parm.getChatMsg() : "Picture"; 
			NotiPool entity = notificationService.saveFcmNoti(oprid, topic, true, null, body, NotificationTypeConstants.CHAT, parm);
			ChatMsgBean rs = this.buildChatMsgBean(entity);
			return rs;
		}
		return null;
	}
	
	private ChatMsgBean buildChatMsgBean(NotiPool noti) {
		try {
			ChatMsgBean msg = new ChatMsgBean(noti.getNotiId(), noti.getPersonOwner(), noti.getCreatedAt(),
					NotificationTypeConstants.CHAT);
			Person per = personDAO.findByPK(noti.getPersonOwner());
			PersonCurrent cur = per.getPersonCurrent();
			NotificationDataParamBean parm = notificationService.buildNotificationDataParamBean(noti);
			SenderDetail sender = new SenderDetail();
			if(null == cur.getPersNickname() || "".equals(cur.getPersNickname()))
				sender.setName(per.getPersonCurrent().getFirstName() + Constants.SYMBOLIC.SPACE + per.getPersonCurrent().getLastName());
			else
				sender.setName(per.getPersonCurrent().getPersNickname());
			if (null != per.getPersonCurrent().getPicturePath()) {
				sender.setPicpath(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY")
						+ Constants.SYMBOLIC.SLASH + per.getPersonCurrent().getPicturePath());
			} else {
				sender.setPicpath(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY")
						+ Constants.SYMBOLIC.SLASH
						+ ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.PROFILE_PIC_DIRECTORY")
						+ Constants.SYMBOLIC.SLASH + per.getPersId());
			}
			msg.setSender(sender);
			msg.setMsg(parm.getChatMsg());
			msg.setScheduleTopic(parm.getScheduleId());
			if(null != parm.getImagePath()){
				String root_endp = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ROOT_IMAGE_DIRECTORY"); //image
				String image_dir_path = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.CHAT_IMAGE_DIRECTORY");//asl_chat/pictures
				msg.setImagePath(root_endp + Constants.SYMBOLIC.SLASH + image_dir_path +Constants.SYMBOLIC.SLASH +  parm.getImagePath());
			}
			return msg;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
	
	/**
	 * Get history
	 * @param roomid
	 * @param lastMassage
	 * @param oprid
	 * @return
	 * @throws MEDException
	 */
	public List<ChatMsgBean> findHistoryChat(Integer roomid,Date lastMassage, Integer oprid) throws MEDException {
		List<ChatMsgBean> result = new ArrayList<>();
		try {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"),roomid); 
			NotiSubscrTbl room = subscrTblDAO.findByPK(roomid);
			if(null == room) throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "room id : "+roomid);
			List<NotiPool> history = notiPoolDAO.findChatByTopic(topic,lastMassage);
			logger.debug("NOTIFICATION " + topic + " : " + history.size());
			for (int i=0;i<10;i++) {
				if(i == history.size()) break;
				result.add(this.buildChatMsgBean(history.get(i)));
			}
		} 
		catch (MEDException med) {
			throw med;
		} 
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
		}
		
		return result;
	}
	public ChatMsgBean findLastMassageByChatroom(Integer roomid) throws MEDException {
		try {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"),roomid); //FIXME แก้แล้ว
			logger.info(topic);
			NotiPool lastPool = notiPoolDAO.findLastChatByTopic(topic);
			if(null == lastPool) return null;
			return this.buildChatMsgBean(lastPool);
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
		}
	}
}
