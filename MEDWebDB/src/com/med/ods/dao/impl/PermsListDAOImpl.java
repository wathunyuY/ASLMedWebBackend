package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.PermsListDAO;
import com.med.ods.entity.PermsList;
import com.med.ods.entity.PermsListId;

@Repository
public class PermsListDAOImpl extends GenericDAOImpl<PermsList, PermsListId> implements PermsListDAO {

	private static Logger logger = LogManager.getLogger(PermsListDAOImpl.class);

	public void deleteByPermsListId(List<String> persList, String permsTblId) {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.DELETE_PERMS_LIST_BY_PERMS_LIST_ID");
		Query query = entityManager.createQuery(hql);
		query.setParameter("persList", persList);
		query.setParameter("permsId", permsTblId);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<PermsList> findPermsListByPermListTblId(List<String> permListTblIdList) throws MEDException {
		String hqlM = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.GET_PERM_LIST_BY_PERM_LIST_TBL_ID");
		List<PermsList> listPermList = null;
		Query query = entityManager.createQuery(hqlM);
		query.setParameter("permListTblIdList", permListTblIdList);
		try {
			listPermList = query.getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return listPermList;
	}
}
