package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.ods.dao.NotiSubscrPersonDAO;
import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.NotiSubscrPersonId;
import com.med.ods.entity.Person;

@Repository
public class NotiSubscrPersonDAOImpl extends GenericDAOImpl<NotiSubscrPerson, NotiSubscrPersonId> implements NotiSubscrPersonDAO{
	private static Logger logger = LogManager.getLogger(NotiSubscrPersonDAOImpl.class);
	@Override
	public List<Person> findPersonBySubscrId(Integer subscrId) {
		List<Person> result = new ArrayList<>();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_DISTINCT_PERSON_BY_SUBSCR_ID");
		logger.info(hql);
		Query qr = entityManager.createQuery(hql);
		try{
			qr.setParameter("subscrId", subscrId);
			result = qr.getResultList();
		}catch (NoResultException no) {
			logger.info("nores " + no.getMessage(),no);
			return null;
		}catch(Exception ex){
			logger.info("ex" + ex.getMessage(),ex);
			return null;
		}
		return result;
	}
}
