package com.med.ws.controller.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.asl.ws.beans.ChatroomBean;
import com.med.asl.ws.beans.MemberBean;
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
	TalkService talkService;
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
	AccountService accountService;
	/**
	 * Create Chatroom
	 * @author Wathunyu.y
	 * @throws MEDException 
	 * 
	 */
	public void createAndUpdateChatroom(ChatroomBean rq ,Integer oprid) throws MEDException{
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
			logger.error(ex.getMessage() ,ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
	}
	/**
	 * Delete chatroom
	 * @throws MEDException 
	 */
	public void deleteChatroom(Integer subscrId) throws MEDException{
		NotiSubscrTbl tbl = subscrTblDAO.findByPK(subscrId);
		try{
			for(NotiPersonSubscr s: tbl.getNotiPersonSubscrs())
				notiPersonSubscrDAO.delete(s);
			for(NotiSubscrPerson p: tbl.getNotiSubscrPersons())
				subscrPersonDAO.delete(p);
			subscrTblDAO.delete(tbl);
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "room id : "+subscrId);
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
			NotiSubscrTbl tbl =  subscrTblDAO.findByPK(subscrId);//FIXME ปิดห้องแล้วต้อง ลบ tokent ที่ subscr มั้ย ?
			tbl.setIsActive(status);
			tbl.setLastUpdOprid(oprid);
			tbl.setLastUpdDttm(Calendar.getInstance().getTime());
			subscrTblDAO.merge(tbl);
		}catch(NullPointerException ne){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "room id : "+subscrId);
		}
	}
	/**
	 * Get chatroom all
	 * @author Wathunyu.y
	 * @throws MEDException 
	 * 
	 */
	public List<ChatroomBean> getChatroom() throws MEDException{
		List<ChatroomBean> rs = new ArrayList<>();
		try{
			List<NotiSubscrTbl> tbls = (List<NotiSubscrTbl>) subscrTblDAO.findAll();
			if(0 < tbls.size()){
				for(NotiSubscrTbl tbl : tbls){
					ChatroomBean b = new ChatroomBean();
					b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
					b.setIsActive(tbl.getIsActive() == Constants.MSSQL.LOGIC.TRUE ? true:false);
					b.setMemberDetails(new ArrayList<>());
					b.setSubscrId(tbl.getSubscrId());
					b.setSubscrName(tbl.getSubscrName());
					b.setSubscrDescr(tbl.getSubscrDescr());
					b.setLastMassage(talkService.findLastMassageByChatroom(tbl.getSubscrId()));
					rs.add(b);
				}
			}
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
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
			b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
			b.setMemberDetails(getMembersByChatroom(tbl.getSubscrId()));
			b.setIsActive(tbl.getIsActive() == Constants.MSSQL.LOGIC.TRUE ? true:false);
			b.setSubscrId(tbl.getSubscrId());
			b.setSubscrName(tbl.getSubscrName());
			b.setSubscrDescr(tbl.getSubscrDescr());
			return b;
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "room id : "+subscrId);
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
			List<NotiSubscrTbl> tbls =  subscrTblDAO.findByPersId(persId);
			if(null != tbls){
				for(NotiSubscrTbl tbl : tbls){
					ChatroomBean b = new ChatroomBean();
					if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
						b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
						b.setMemberDetails(new ArrayList<>());
						b.setSubscrId(tbl.getSubscrId());
						b.setSubscrName(tbl.getSubscrName());
						b.setSubscrDescr(tbl.getSubscrDescr());
						b.setLastMassage(talkService.findLastMassageByChatroom(tbl.getSubscrId()));
						rs.add(b);
					}
				}
			}
			return rs;
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ persId);
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
		NotiSubscrTbl room = subscrTblDAO.findByPK(subscrId);
		if(null == room) throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ subscrId);
		if(Constants.MSSQL.LOGIC.FALSE == room.getIsActive()) 	throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not active for id:"+ subscrId);
		if(Constants.MSSQL.LOGIC.TRUE == room.getAllUserFlag()) throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom is public for id:"+ subscrId);
		for(Integer member :members){
			try{
				NotiPersonSubscrId id = new NotiPersonSubscrId(subscrId, member);
				NotiPersonSubscr tbl = new NotiPersonSubscr();
				tbl.setId(id);
				tbl.setLastUpdDttm(now);
				tbl.setStatus("sub");
				notiPersonSubscrDAO.merge(tbl);
			}catch(Exception ex){
				logger.error(ex.getMessage(),ex);
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
	public void deleteMemberBySubscrId(Integer persId,Integer subscrId) throws MEDException{
		try{
			NotiPersonSubscrId npid = new NotiPersonSubscrId(subscrId, persId);
			notiPersonSubscrDAO.delete(notiPersonSubscrDAO.findByPK(npid));
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for persId:"+ persId);
		}
		
	}
	
	/**
	 * Get members by subscrId
	 * @author Wathunyu.y
	 * @param subscrId
	 * @return 
	 * @throws MEDException 
	 */
	public List<MemberBean> getMembersByChatroom(Integer subscrId) throws MEDException{
		List<MemberBean> rs = new ArrayList<>();
		try{
			List<Person> members = notiPersonSubscrDAO.findPersonBySubscrId(subscrId);
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
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return rs;
	}
	 /**
	  * accept chat law by pers
	 * @throws MEDException 
	  */
	public void acceptChatLaw(Integer persId) throws MEDException{
		try{
			accountService.updateAcceptChatrooLaw(true, persId);
		}catch(Exception ex){
			logger.error(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "device not found for persId:"+ persId);
		}
	}
	/**
	 * check accept law by token
	 * @throws MEDException 
	 * 
	 */
	public Boolean checkAcceptChatLaw(Integer persId ) throws MEDException{
		try{
			return accountService.getAcceptChatrooLaw(persId);
		}catch(Exception ex){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "device not found for persId:"+ persId);
		}
	}
	
}
