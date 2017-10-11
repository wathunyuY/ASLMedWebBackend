package com.med.ods.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.TaskEndPointDAO;
import com.med.ods.entity.TaskEndpoint;

@Repository
public class TaskEndpointDAOImpl extends GenericDAOImpl<TaskEndpoint, Integer> implements TaskEndPointDAO {
	public TaskEndpoint findEndpointByName(String enptName, String enptMethod, String enptZone) throws MEDException {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_TASK_ENDPOINT_BY_NAME");
		Query query = entityManager.createQuery(hql);
		query.setParameter("enptHttpmethod", enptMethod);
		query.setParameter("enptZone", enptZone);
		query.setParameter("enptName", enptName);
		try {
			return (TaskEndpoint) query.getResultList().get(0);
		} catch (Exception e) {
			System.out.println("endpoint not found with params [" + enptMethod + "," + enptZone + "," + enptName + "]");
			throw new MEDException(ErrorConstants.WORKFLOW_NOT_FOUND);
		}
	}

}