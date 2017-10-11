package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.ods.dao.NotiSubscrTblDAO;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.Person;

@Repository
public class NotiSubscrTblDAOImpl extends GenericDAOImpl<NotiSubscrTbl, Integer> implements NotiSubscrTblDAO{

	
	@Override
	public List<Person> findPersonBySubId(String subid) {
		List<Person> result = new ArrayList<>();
//		String hql = "select distinct p.persLoginDevice.person from NotiSubscrPerson p where p.notiSubscrTbl.subscrId = :subid";
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERSON_FROM_NOTISUBSCRPERSON_BY_SUBID");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("subid", subid);
		try{
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

}
