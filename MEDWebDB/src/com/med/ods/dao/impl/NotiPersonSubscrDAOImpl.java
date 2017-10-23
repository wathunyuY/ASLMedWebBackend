package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.ods.dao.NotiPersonSubscrDAO;
import com.med.ods.entity.NotiPersonSubscr;
import com.med.ods.entity.NotiPersonSubscrId;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.Person;
@Repository
public class NotiPersonSubscrDAOImpl extends GenericDAOImpl<NotiPersonSubscr, NotiPersonSubscrId>
		implements NotiPersonSubscrDAO {

	@Override
	public List<Person> findPersonBySubscrId(Integer subscrId) {
		List<Person> result = new ArrayList<>();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERSON_BY_SUBSCR_ID");
		Query qr = entityManager.createQuery(hql);
		try{
			qr.setParameter("subscrId", subscrId);
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}catch(Exception ex){
			return null;
		}
		return result;
	}
//
//	@Override
//	public List<NotiSubscrTbl> findNotiSubscrByPersId(Integer persId) {
//		List<NotiSubscrTbl> result = null;
//		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_ACTIVE_NOTI_SUBSCR_TBL_BY_PERS_ID");
//		Query qr = entityManager.createQuery(hql);
//		qr.setParameter("persId", persId);
//		try{
//			result  = qr.getResultList();
//		}catch (NoResultException no) {
//			return new ArrayList<>();
//		}
//		return result;
//	}
	
	
}
