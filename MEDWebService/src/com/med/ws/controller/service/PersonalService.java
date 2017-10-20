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

import com.med.asl.ws.bean.MemberBean;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.PersonCurrentDAO;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;
import com.med.ws.dto.type.rq.LoginRqType;
import com.med.ws.dto.type.rs.LoginRsType;

@Service
@Transactional
public class PersonalService {
	private static Logger logger = LogManager.getLogger(PersonalService.class);
	
	@Autowired
	PersonDAO personDAO;
	@Autowired
	PersonCurrentDAO personCurrentDAO;
	
	/**
	 * Search person
	 * @author Wathunyu.y
	 * @throws MEDException 
	 * 
	 */
	public List<MemberBean> SearchPerson(String key) throws MEDException{
		List<MemberBean> rs = new ArrayList<>();
		try{
			List<PersonCurrent> persons = new ArrayList<>();
			if(null == key || "".equals(key))
				persons = (List<PersonCurrent>) personCurrentDAO.findAll();
			else
				persons = personDAO.findStdntByKey(key);
			if(null != persons){
				for(PersonCurrent p : persons){
					MemberBean b = new MemberBean();
					b.setPersId(p.getPersId());
					b.setFullName(p.getPrefix() + p.getFirstName() + " " +p.getLastName());
					rs.add(b);
				}
			}
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);

		}
		return rs; 
	}
	
	/**
	 * get person
	 * @author Wathunyu.y
	 * @throws MEDException 
	 * 
	 */
	public MemberBean getPerson(Integer persId) throws MEDException{
		MemberBean b = new MemberBean();
		try{
			PersonCurrent p = personCurrentDAO.findByPK(persId);
			if(null != p){
				b.setPersId(p.getPersId());
				b.setFullName(p.getPrefix() + p.getFirstName() + " " +p.getLastName());
			}
		}catch(Exception ex){
			logger.info(ex.getMessage(),ex);
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);

		}
		return b; 
	}
	
	/**
	 * Crete person from asl
	 * @throws MEDException 
	 */
	public void createPerson(LoginRqType rq,LoginRsType rs) throws MEDException{
		Person person = null;
		PersonCurrent personCurrent =  personDAO.findByAslUserId(rq.getName());
		if(null == personCurrent){
			person = new Person();
			personDAO.persist(person);
			personCurrent = new PersonCurrent(person);
			personCurrentDAO.persist(personCurrent);
		}else {
			person = personCurrent.getPerson();
			personDAO.merge(person);
		}
		Date now = Calendar.getInstance().getTime();
		personCurrent.setAslUserId(rq.getName());
		personCurrent.setLastUpdDttm(now);
		personCurrent.setLastUpdOprid(person.getPersId());
		person.setLastUpdDttm(now);
		person.setLastUpdOprid(person.getPersId());
		
	}
	
	/**
	 * update nickName 
	 * @throws MEDException 
	 */
	public void updateNickname(String nickname,Integer persId) throws MEDException{
		try{
			PersonCurrent p = personCurrentDAO.findByPK(persId);
			p.setPersNickname(nickname);
			personCurrentDAO.merge(p);
		}catch(Exception ex){
			throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS,"ID : "+persId +" not found");
		}
	}
}
