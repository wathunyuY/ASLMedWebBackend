package com.med.ods.dao;

import java.io.Serializable;

import com.med.common.exception.MEDException;
import com.med.ods.entity.TaskEndpoint;

public interface TaskEndPointDAO extends GenericDAO<TaskEndpoint, Serializable> {
	public TaskEndpoint findEndpointByName(String enptName, String enptMethod, String enptZone) throws MEDException;
}
