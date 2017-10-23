package com.med.ws.controller.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.asl.ws.bean.ChatroomBean;
import com.med.asl.ws.bean.MemberBean;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiPersonSubscrDAO;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiPersonSubscr;
import com.med.ods.entity.NotiPersonSubscrId;
import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.NotiSubscrPersonId;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.PersLoginDevice;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;
import com.med.ws.controller.workflow.master.ProcessBean;

@Service
@Transactional
public class ChatService {
	private static Logger logger = LogManager.getLogger(ChatService.class);
	
	@Autowired
	NotiSubscrTblDAO subscrTblDAO;
	@Autowired
	PersonDAO personDAO;
	@Autowired
	NotiSubscrPersonDAO subscrPersonDAO;
	@Autowired
	PersLoginDeviceDAO loginDeviceDAO;
	@Autowired 
	BroadcastService broadcastService;
	@Autowired
	ResearchService researchService;
	@Autowired
	PersLoginDeviceDAO persLoginDeviceDAO;
	@Autowired
	NotiPersonSubscrDAO notiPersonSubscrDAO;
	@Autowired
	NotificationService notificationService;
	@Autowired
	FirebaseCloudMessagingService firebaseCloudMessagingService;
	
	/**
	 * Create Chatroom
	 * @author Wathunyu.y
	 * 
	 */
	public void createAndUpdateChatroom(ChatroomBean rq ,Integer oprid){
		try{
			Date now = Calendar.getInstance().getTime();
			NotiSubscrTbl tbl = null != rq.getSubscrId() ? subscrTblDAO.findByPK(rq.getSubscrId()) : null;
			if(null == tbl) {
				tbl = new NotiSubscrTbl();
				subscrTblDAO.persist(tbl);
			}else subscrTblDAO.merge(tbl);
			tbl.setIsActive(Constants.MSSQL.LOGIC.TRUE);
			tbl.setLastUpdDttm(now);
			tbl.setSubscrName(rq.getSubscrName());
			tbl.setSubscrDescr(rq.getSubscrDescr());
			if(null != rq.getAllUserFlag())
				tbl.setAllUserFlag(rq.getAllUserFlag() ? Constants.MSSQL.LOGIC.TRUE : Constants.MSSQL.LOGIC.FALSE);
			else tbl.setAllUserFlag(Constants.MSSQL.LOGIC.FALSE);
			tbl.setLastUpdOprid(oprid);
			
			if(!rq.getAllUserFlag() && null != rq.getMembers()){
				List<Integer> users = rq.getMembers();
				if(0 < users.size()){
					this.addMembers(users, tbl.getSubscrId());
					
				}
			}
		}catch(Exception ex){
			logger.info(ex.getMessage() + "error");
			return;
		}
	}
	/**
	 * Get chatroom all
	 * @author Wathunyu.y
	 * 
	 */
	public List<ChatroomBean> getChatroom(){
		List<ChatroomBean> rs = new ArrayList<>();
		try{
			researchService.getCategory();
			List<NotiSubscrTbl> tbls = (List<NotiSubscrTbl>) subscrTblDAO.findAll();
			if(0 < tbls.size()){
				for(NotiSubscrTbl tbl : tbls){
//					if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
						ChatroomBean b = new ChatroomBean();
						b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
						b.setIsActive(tbl.getIsActive() == Constants.MSSQL.LOGIC.TRUE ? true:false);
						b.setMemberDetails(new ArrayList<>());
						b.setSubscrId(tbl.getSubscrId());
						b.setSubscrName(tbl.getSubscrName());
						b.setSubscrDescr(tbl.getSubscrDescr());
						b.setLastMassage(broadcastService.findLastMassageByChatroom(tbl.getSubscrId(), 1));
						rs.add(b);
//					}
				}
			}
			
		}catch(Exception ex){
			logger.info(ex.getMessage());
		}
		return rs;
		
	}
	/**
	 * Get chatroom by id
	 * @author Wathunyu.y
	 * @throws MEDException 
	 * 
	 */
	public ChatroomBean getChatroom(Integer subscrId) throws MEDException{
		try{
			NotiSubscrTbl tbl =  subscrTblDAO.findByPK(subscrId);
			ChatroomBean b = new ChatroomBean();
//			if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
				b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
				b.setMemberDetails(getMembersByChatroom(tbl.getSubscrId()));
				b.setIsActive(tbl.getIsActive() == Constants.MSSQL.LOGIC.TRUE ? true:false);
				b.setSubscrId(tbl.getSubscrId());
				b.setSubscrName(tbl.getSubscrName());
				b.setSubscrDescr(tbl.getSubscrDescr());
				return b;
//			}else return null; 
				
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ subscrId);
		}
	}
	/**
	 * Get chatroom by person (my room and public room)
	 * @author Wathunyu.y
	 * @param persId
	 */
	public List<ChatroomBean> getChatroomByPerson(Integer persId) throws MEDException{
		if(null == personDAO.findByPK(persId))
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ persId);
		try{
			List<ChatroomBean> rs = new ArrayList<>();
			List<NotiSubscrTbl> tbls =  subscrTblDAO.findByPersId(persId);//FIXME wirte dao impl
			if(null != tbls){
				for(NotiSubscrTbl tbl : tbls){
					ChatroomBean b = new ChatroomBean();
					if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
						b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
//						b.setMemberDetails(getMembersByChatroom(tbl.getSubscrId()));
						b.setMemberDetails(new ArrayList<>());
						b.setSubscrId(tbl.getSubscrId());
						b.setSubscrName(tbl.getSubscrName());
						b.setSubscrDescr(tbl.getSubscrDescr());
						b.setLastMassage(broadcastService.findLastMassageByChatroom(tbl.getSubscrId(), 1));
						rs.add(b);
					}
				}
			}
			return rs;
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ persId);
		}
	}
	
	/**
	 * Change Chatroom active status
	 * @author Wathunyu.y
	 * @param subscrId 
	 * @param status
	 * @throws MEDException 
	 */
	public void changeChatroomActiveStatus(Integer subscrId,Integer status,Integer oprid) throws MEDException{
		try{
			NotiSubscrTbl tbl =  subscrTblDAO.findByPK(subscrId);
			tbl.setIsActive(status);
			tbl.setLastUpdOprid(oprid);
			tbl.setLastUpdDttm(Calendar.getInstance().getTime());
			subscrTblDAO.merge(tbl);
		}catch(NullPointerException ne){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ subscrId);
		}
	}
	
	/**
	 * add member
	 * @author Wathunyu.y
	 * @throws Exception 
	 * 
	 */
	public Integer addMembers(List<Integer> members ,Integer subscrId) throws Exception{
		Date now = Calendar.getInstance().getTime();
		NotiSubscrTbl group = subscrTblDAO.findByPK(subscrId);
		if(null == group) throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ subscrId);
		if(Constants.MSSQL.LOGIC.FALSE == group.getIsActive()) 	throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not active for id:"+ subscrId);
		logger.info("tests");
		for(Integer member :members){
//			List<PersLoginDevice> devi = loginDeviceDAO.findByPersId(member);
//			if(null != devi){
//				for(PersLoginDevice d : devi){
//					NotiSubscrPersonId npId = new NotiSubscrPersonId(subscrId, d.getPersLoginDevice());
//					NotiSubscrPerson np = new NotiSubscrPerson();
//					np.setLastUpdDttm(now);
//					np.setId(npId);
//					np.setStatus("");
//					subscrPersonDAO.merge(np);
//				}
//			}
			try{
				NotiPersonSubscrId id = new NotiPersonSubscrId(subscrId, member);
				NotiPersonSubscr tbl = new NotiPersonSubscr();
				tbl.setId(id);
				tbl.setLastUpdDttm(now);
				tbl.setStatus("sub");
				notiPersonSubscrDAO.merge(tbl);
			}catch(Exception ex){
				logger.info(ex.getMessage(),ex);
			}
		}
		return 0;
	}
	/**
	 * delete member
	 * @author Wathunyu.y
	 * @param persId
	 * @throws MEDException 
	 */
	public void deleteMemberByPerrId(Integer persId,Integer subscrId) throws MEDException{
		List<PersLoginDevice> dev = loginDeviceDAO.findByPersId(persId);
		try{
			NotiPersonSubscrId npid = new NotiPersonSubscrId(subscrId, persId);
			notiPersonSubscrDAO.delete(notiPersonSubscrDAO.findByPK(npid));
			if(null != dev){
				for(PersLoginDevice d : dev){
					NotiSubscrPersonId id = new NotiSubscrPersonId(subscrId,d.getPersLoginDevice());
					NotiSubscrPerson p = subscrPersonDAO.findByPK(id);
					if(null != p){
						subscrPersonDAO.delete(p);
					}
				}
			}
		}catch(Exception ex){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for persId:"+ persId);
		}
		
	}
	
	/**
	 * Get members by subscrId
	 * @author Wathunyu.y
	 * @param subscrId
	 * @return 
	 */
	public List<MemberBean> getMembersByChatroom(Integer subscrId){
		List<MemberBean> rs = new ArrayList<>();
		try{
			List<Person> members = notiPersonSubscrDAO.findPersonBySubscrId(subscrId);
//			List<Person> members = subscrPersonDAO.findPersonBySubscrId(subscrId);
//			Collection<NotiPersonSubscr> members = subscrTblDAO.findByPK(subscrId).getNotiPersonSubscrs();
			logger.info(members.size());
			if(null != members){
				for(Person m : members){
					MemberBean b= new MemberBean();
					PersonCurrent cur = m.getPersonCurrent();
					b.setPersId(m.getPersId());
					b.setFullName(cur.getPrefix() + cur.getFirstName() + " " + cur.getLastName());
					rs.add(b);
				}
			}
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
		}
		return rs;
	}
	 /**
	  * accept chat law by pers
	 * @throws MEDException 
	  */
	public void acceptChatLaw(ProcessBean rq) throws MEDException{
		try{
			Integer persId = null == rq.getOprid() ? Integer.parseInt(rq.getPathVariable()) : Integer.parseInt(rq.getOprid());//FIXME
			PersLoginDevice device = persLoginDeviceDAO.findByRegisTokenAndUser(rq.getRequest().getFcmTokenRqType().getFcmToken(), persId); //findByPersId(persId);
			device.setAcceptFlag(Constants.MSSQL.LOGIC.TRUE);
			persLoginDeviceDAO.merge(device);
			List<NotiSubscrTbl> tbls =  subscrTblDAO.findByPersId(persId);//ดูว่า คนนี้ ติดตามห้องไหนบ้าง
			String topicFormat = ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.SUBSCRIBE_CHAT_TOPIC"); 
			for(NotiSubscrTbl room : tbls){
				String topic = String.format(topicFormat, room.getSubscrId()); 
				firebaseCloudMessagingService.userSubscribe(topic, rq.getRequest().getFcmTokenRqType().getFcmToken());
			}
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
		}
	}
	/**
	 * check accept law by token
	 * @throws MEDException 
	 * 
	 */
	public Boolean checkAcceptChatLaw(Integer persId ,String token) throws MEDException{
		try{
			return persLoginDeviceDAO.findByRegisTokenAndUser(token, persId).getAcceptFlag() == Constants.MSSQL.LOGIC.TRUE ? true :false;
		}catch(Exception ex){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "device not found for persId:"+ persId);
		}
	}
	
}
