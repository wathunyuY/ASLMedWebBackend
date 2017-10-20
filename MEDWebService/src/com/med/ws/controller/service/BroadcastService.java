package com.med.ws.controller.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Notification;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import com.google.gson.Gson;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.contants.NotificationTypeConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiAttributeDAO;
import com.med.ods.dao.NotiLogDAO;
import com.med.ods.dao.NotiPoolDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiPool;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;
import com.med.ws.beans.ChatMsgBean;
import com.med.ws.beans.ChatMsgBean.SenderDetail;
import com.med.ws.beans.NotificationDataParamBean;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.type.rq.ChatMessageRqType;

@Service
@Transactional
public class BroadcastService {

	private static Logger logger = LogManager.getLogger(BroadcastService.class);

	@Autowired
	PersonDAO personDAO;
//	@Autowired
//	PersonalService personalService;
//	@Autowired
//	ScheduleTopicTeacherDAO scheduleTopicTeacherDAO;
//	@Autowired
//	EmpInfoDAO empInfoDAO;
//	@Autowired
//	StdntInfoDAO stdntInfoDAO;
//	@Autowired
//	SectionStdntDAO sectionStdntDAO;
//	@Autowired
//	ScheduleTopicDAO scheduleTopicDAO;
//	@Autowired
//	CalendarTblDAO calendarTblDAO;
	@Autowired
	FirebaseCloudMessagingService fcmService;
	@Autowired
	NotificationService notiService;
//	@Autowired
//	ScheduleTopicSectionStdntDAO scheduleTopicSectionStdntDAO;
	@Autowired
	NotiPoolDAO notiPoolDAO;
	@Autowired
	NotiLogDAO notiLogDAO;
	@Autowired
	NotiAttributeDAO notiAttributeDAO;
	@Autowired
	PersonalService personalService;

	private ChatMsgBean buildChatMsgBean(NotiPool noti) {
		try {
			ChatMsgBean msg = new ChatMsgBean(noti.getNotiId(), noti.getPersonOwner(), noti.getCreatedAt(),
					NotificationTypeConstants.CHAT);
			Person per = personDAO.findByPK(noti.getPersonOwner());
			PersonCurrent cur = per.getPersonCurrent();
			NotificationDataParamBean parm = notiService.buildNotificationDataParamBean(noti);
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
			return msg;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	public List<ChatMsgBean> findHistoryChat(Integer roomid,Date lastMassage, Integer oprid) throws MEDException {
		List<ChatMsgBean> result = new ArrayList<>();
		try {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"),roomid); 
			Boolean allow = true;
//			ScheduleTopic sct = scheduleTopicDAO.findByPK(roomid);
//			if (personalService.isEmp(oprid)){
//				ScheduleTopicTeacher findTeacher = sct.getScheduleTopicTeachers().stream()
//						.filter(o -> (oprid.equals(o.getEmpInfo().getPerson().getPersId())) )
//						.findFirst()
//						.orElse(null);
//				if (findTeacher != null)
//					allow = true;
//			}else{
//				ScheduleTopicSectionStdnt findStdnt = sct.getScheduleTopicSectionStdnts().stream()
//						.filter(o -> oprid.equals(o.getStdntInfo().getPerson().getPersId()))
//						.findFirst()
//						.orElse(null);
//				if (findStdnt != null)
//					allow = true;
//			} FIXME uncomment
			
			if (!allow) {
				throw new MEDException(ErrorConstants.SCHEDULE_NOT_ALLOW, roomid);
			}
			List<NotiPool> history = notiPoolDAO.findChatByTopic(topic,lastMassage);
			logger.debug("NOTIFICATION " + topic + " : " + history.size());
			for (NotiPool noti : history) {
				// logger.debug("LOOP");
				result.add(this.buildChatMsgBean(noti));
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
	public ChatMsgBean findLastMassageByChatroom(Integer roomid, Integer oprid) throws MEDException {
		try {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"),roomid); 
			NotiPool lastPool = notiPoolDAO.findLastChatByTopic(topic);
			if(null == lastPool) return null;
			return this.buildChatMsgBean(lastPool);
		}
		catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
		}
	}

	public List<String> getSubscribeTopics(Integer persId) throws MEDException {
		String topicFormat = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"); 
		List<String> topics = new ArrayList<String>();
//		if (personalService.isEmp(persId)) {
//			String empcode = empInfoDAO.findByPersId(persId).getEmpCode();
//			List<ScheduleTopicTeacher> scheduleTopicTeacherList = scheduleTopicTeacherDAO
//					.findScheduleTopicTeacherByEmpCode(empcode);
//			for (ScheduleTopicTeacher ls : scheduleTopicTeacherList) {
//				String topic = String.format(topicFormat, ls.getScheduleTopic().getScheduleTopicId()); 
//				topics.add(topic);
//			}
//		} else {
//			StdntInfo stdntInfo = stdntInfoDAO.findByPersId(persId);
//
//			List<String> classSectionList = sectionStdntDAO.findByStdntCode(stdntInfo.getStdntCode());
//			List<ScheduleTopic> scheduleTopicList = scheduleTopicDAO.findByClassSectionList(classSectionList);
//			for (ScheduleTopic ls : scheduleTopicList) {
//				String topic = String.format(topicFormat, ls.getScheduleTopicId()); 
//				topics.add(topic);
//			}
//		} FIXME uncomment
		return topics;
	}

	public void broadcastChatMessage(ProcessBean pb) throws MEDException { //send chat
//		Integer oprid = Integer.parseInt(pb.getOprid());
		ChatMessageRqType rq = pb.getRequest().getChatRqType();
		Integer oprid = rq.getPersId();
		if (null == rq.getSubscrId()) //.getScheduleId()
			throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS, "subscrId");
		if (!StringUtils.isEmpty(rq.getMsg())) {
			String topic = String.format(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"), 
                    rq.getSubscrId()); 
			NotificationDataParamBean parm = new NotificationDataParamBean();
			parm.setChatMsg(rq.getMsg());
			parm.setScheduleId(rq.getScheduleId());
			NotiPool entity = notiService.saveFcmNoti(oprid, topic, true, null, rq.getMsg(), NotificationTypeConstants.CHAT, parm);
			
			Sender sender = new Sender(Constants.FIREBASE.SERVER_KEY);
			try {
				String ownerDataJson = new Gson().toJson(personalService.getPerson(oprid));
				String dataJson = new Gson().toJson(parm);
				Notification.Builder noti_bd = new Notification.Builder("myicon");
				noti_bd.title(entity.getTitle());
				noti_bd.body(rq.getMsg());
				
				Message.Builder msg_bd = new Message.Builder();
				msg_bd.priority(Message.Priority.HIGH);
				msg_bd.notification(noti_bd.build());
				msg_bd.addData("type", NotificationTypeConstants.CHAT.getCode());
				msg_bd.addData("detail", dataJson);
				msg_bd.addData("owner", ownerDataJson);
				msg_bd.addData("sentDate", entity.getCreatedAt().toString());
				Message fcm_msg = msg_bd.build();

				Result result = sender.sendNoRetry(fcm_msg, topic);
				if (null != result.getFailure() && result.getFailure() > 0)
					logger.info("Send failed: " + result.getFailure());
			} catch (IOException io) {
				logger.error(io.getMessage(), io);
				throw new MEDException(ErrorConstants.UNKNOW_HTTP_ERROR);
			} catch (Exception e){
				logger.error(e.getMessage(), e);
				throw e;
			}
			
		}
	}

}