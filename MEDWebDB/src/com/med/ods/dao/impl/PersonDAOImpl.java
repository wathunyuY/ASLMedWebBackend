package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.PersonDAO;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;

@Repository
public class PersonDAOImpl extends GenericDAOImpl<Person, Integer> implements PersonDAO {

	private static Logger logger = LogManager.getLogger(PersonDAOImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonCurrent> findStdntByName(String name) throws MEDException {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.GET_STDNT_BY_NAME");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("name", name + "%");
		List<PersonCurrent> result = new ArrayList<PersonCurrent>();
		try {
			result = qr.getResultList();
			System.err.println("First Name Search Result(s): " + result.size());
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return result;
	}

}
