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
import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.NotiSubscrTbl;

@Service
@Transactional
public class ChatService {
	private static Logger logger = LogManager.getLogger(ChatService.class);
	
	@Autowired
	NotiSubscrTblDAO subscrTblDAO;
	@Autowired
	PersonDAO personDAO;
	
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
			tbl.setAllUserFlag(rq.getAllUserFlag() ? Constants.MSSQL.LOGIC.TRUE : Constants.MSSQL.LOGIC.FALSE);
			tbl.setLastUpdOprid(oprid);
			
			if(rq.getAllUserFlag() && null != rq.getMembers()){
				List<Integer> users = rq.getMembers();
				if(0 < users.size()){
					//FIXME addMember
					
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
			logger.info(personDAO.findByPK(1));
			List<NotiSubscrTbl> tbls = (List<NotiSubscrTbl>) subscrTblDAO.findAll();
			if(0 < tbls.size()){
				for(NotiSubscrTbl tbl : tbls){
					if(Constants.MSSQL.LOGIC.TRUE == tbl.getIsActive()){
						ChatroomBean b = new ChatroomBean();
						b.setAllUserFlag(tbl.getAllUserFlag() == Constants.MSSQL.LOGIC.TRUE ? true:false);
						b.setMembers(new ArrayList<>());
						b.setSubscrId(tbl.getSubscrId());
						b.setSubscrName(tbl.getSubscrName());
						rs.add(b);
					}
				}
			}
		}catch(Exception ex){
			
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
				b.setMembers(new ArrayList<>());
				b.setSubscrId(tbl.getSubscrId());
				b.setSubscrName(tbl.getSubscrName());
				return b;
			}
			return null;
		}catch(Exception ex){
			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "Chatroom not found for id:"+ subscrId);
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
	 * 
	 */
	
}
