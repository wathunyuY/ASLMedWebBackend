package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.PermsPersGroupDAO;
import com.med.ods.entity.PermsPersGroup;
import com.med.ods.entity.PermsPersGroupId;

@Repository
public class PermsPersGroupDAOImpl extends GenericDAOImpl<PermsPersGroup, PermsPersGroupId> implements PermsPersGroupDAO {

	private static Logger logger = LogManager.getLogger(PermsPersGroupDAOImpl.class);

	public void deleteByPersonId(List<Integer> persList, String permsPersGroupTblId) {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.DELETE_PERMS_PERS_GROUP_BY_PERS_ID");
		Query query = entityManager.createQuery(hql);
		query.setParameter("persList", persList);
		query.setParameter("permsPersGroupTblId", permsPersGroupTblId);
		query.executeUpdate();
	}

	public void deletePermsPersGroupByTblId(String permsPersGroupTblId) {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.DELETE_PERMS_PERS_GROUP_BY_TBL_ID");
		Query query = entityManager.createQuery(hql);
		query.setParameter("permsPersGroupTblId", permsPersGroupTblId);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<PermsPersGroup> findPermsPersGroupByTblId(String permsPersGroupTblId) {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERMS_PERS_GROUP_BY_TBL_ID");
		Query query = entityManager.createQuery(hql);
		query.setParameter("permsPersGroupTblId", permsPersGroupTblId);
		return (List<PermsPersGroup>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<PermsPersGroup> findPermsPersGroupByPersId(Integer persId) throws MEDException {
		String hqlM = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.GET_PERMS_GRP_BY_PERS_ID");
		List<PermsPersGroup> listPermsPerGrp = null;
		Query query = entityManager.createQuery(hqlM);
		System.out.println("hql");
		System.out.println(hqlM);
		System.out.println(persId);
		query.setParameter("persId", persId);
		try {
			listPermsPerGrp = query.getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return listPermsPerGrp;
	}
}
