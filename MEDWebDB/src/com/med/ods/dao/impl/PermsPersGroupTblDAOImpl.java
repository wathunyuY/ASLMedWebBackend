package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.ods.dao.PermsPersGroupTblDAO;
import com.med.ods.entity.PermsPersGroupTbl;

@Repository
public class PermsPersGroupTblDAOImpl extends GenericDAOImpl<PermsPersGroupTbl, String> implements PermsPersGroupTblDAO {

	@SuppressWarnings("unchecked")
	public List<PermsPersGroupTbl> findPermsPersGroupTblByPermsListTblId(String permsListTblId) {
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERMS_PERS_GROUP_TBL_BY_PERMS_LIST_TBL_ID");
		Query query = entityManager.createQuery(hql);
		query.setParameter("permsListTblId", permsListTblId);
		return (List<PermsPersGroupTbl>) query.getResultList();
	}

}
