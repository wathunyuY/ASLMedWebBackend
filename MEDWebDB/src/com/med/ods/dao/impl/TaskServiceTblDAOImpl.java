package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.med.common.contants.ErrorConstants;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.exception.MEDException;
import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskServiceTbl;

@Repository
public class TaskServiceTblDAOImpl extends GenericDAOImpl<TaskServiceTbl, Integer> implements TaskServiceTblDAO {
	
	public Object[] findServicenameByEndpoint(String enptName, String enptMethod, String enptZone, String enptType) throws MEDException {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.ENPT_SERVICE_TASK");
		Query query = entityManager.createQuery(hql);
		query.setParameter("enptHttpmethod", enptMethod);
		query.setParameter("enptZone", enptZone);
		query.setParameter("enptName", enptName);
		query.setParameter("enptType", enptType);
		try {
			List<Object[]> result = query.getResultList();
			if (result.size() < 1) {
				System.out.println("workflow not found with params [" + enptMethod + "," + enptType + ", " + enptZone + "," + enptName + "]");
				throw new MEDException(ErrorConstants.WORKFLOW_NOT_FOUND, enptMethod + "," + enptType + ", " + enptZone + "," + enptName);
			} else {
				return result.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TaskServiceTbl> findAllOrderByName() throws MEDException {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_ALL_TASK_SERVICE_ORDER_BY_NAME");
		return entityManager.createQuery(hql).getResultList();
	}

}