package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.PersAccountDAO;
import com.med.ods.entity.PersAccount;

@Repository
public class PersAccountDAOImpl extends GenericDAOImpl<PersAccount, Integer> implements PersAccountDAO {
	
	private static Logger logger = LogManager.getLogger(PersAccountDAOImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public PersAccount findByUsername(String username) throws MEDException {
		String hqlM = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.GET_ACCOUNT_BY_USER");
		PersAccount account;
		List<PersAccount> listAccount = null;
		Query query = entityManager.createQuery(hqlM);
		query.setParameter("username", username);
		try {
			listAccount = query.getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		if (listAccount.size() != 1) {
			logger.error("found " + listAccount.size());
			throw new MEDException(ErrorConstants.LOGIN_ERROR);
		}
		account = listAccount.get(0);
		return account;
	}
	
	@Override
	public String generateEmpUserName(String empFowId,String departTypeId,String acadOrgCode) throws Exception {
		
		String sql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.GENERATE_USERNAME_EMP");
		Query query = entityManager.createNativeQuery(sql);
		query.setParameter("empFowId", empFowId);
		query.setParameter("departTypeId", departTypeId);
		query.setParameter("acadOrgCode", acadOrgCode);
		return (String)query.getResultList().get(0);
		
	}

}
