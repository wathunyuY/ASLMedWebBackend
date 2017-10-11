package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.entity.TaskServiceTbl;

public interface TaskServiceTblDAO extends GenericDAO<TaskServiceTbl, Serializable> {
	
	public Object[] findServicenameByEndpoint(String enptName, String enptMethod, String enptZone, String category) throws MEDException;

	public List<TaskServiceTbl> findAllOrderByName() throws MEDException;
}
