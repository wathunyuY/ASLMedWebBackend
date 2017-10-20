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

import com.med.asl.ws.bean.ChatroomBean;
import com.med.asl.ws.bean.MemberBean;
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.NotiSubscrPersonId;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.PersLoginDevice;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;

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
					if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
						ChatroomBean b = new ChatroomBean();
						b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
						b.setMemberDetails(new ArrayList<>());
						b.setSubscrId(tbl.getSubscrId());
						b.setSubscrName(tbl.getSubscrName());
						b.setSubscrDescr(tbl.getSubscrDescr());
						b.setLastMassage(broadcastService.findLastMassageByChatroom(tbl.getSubscrId(), 1));
						rs.add(b);
					}
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
			if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
				b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
				b.setMemberDetails(getMembersByChatroom(tbl.getSubscrId()));
				b.setSubscrId(tbl.getSubscrId());
				b.setSubscrName(tbl.getSubscrName());
				b.setSubscrDescr(tbl.getSubscrDescr());
				return b;
			}else return null; 
				
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
		try{
			List<ChatroomBean> rs = new ArrayList<>();
			List<NotiSubscrTbl> tbls =  subscrTblDAO.findByPersId(persId);//FIXME wirte dao impl
			logger.info("1-1-1--1-");
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

		for(Integer member :members){
			List<PersLoginDevice> devi = loginDeviceDAO.findByPersId(member);
			if(null != devi){
				for(PersLoginDevice d : devi){
					NotiSubscrPersonId npId = new NotiSubscrPersonId(subscrId, d.getPersLoginDevice());
					NotiSubscrPerson np = new NotiSubscrPerson();
					np.setLastUpdDttm(now);
					np.setId(npId);
					np.setStatus("");
					subscrPersonDAO.merge(np);
				}
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
			if(null != dev){
				for(PersLoginDevice d : dev){
					NotiSubscrPersonId id = new NotiSubscrPersonId(subscrId,d.getPersLoginDevice());
					NotiSubscrPerson p = subscrPersonDAO.findByPK(id);
					p.setStatus("remove");
					subscrPersonDAO.merge(p);
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
			List<Person> members = subscrPersonDAO.findPersonBySubscrId(subscrId);
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
			
		}
		return rs;
	}
}
