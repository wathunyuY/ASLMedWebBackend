package com.med.ods.dao;

import java.io.Serializable;

import com.med.common.exception.MEDException;
import com.med.ods.entity.PersAccount;

public interface PersAccountDAO extends GenericDAO<PersAccount, Serializable>{

	PersAccount findByUsername(String username) throws MEDException;

	public String generateEmpUserName(String empFowId, String departTypeId, String acadOrgCode) throws Exception;
	
}
