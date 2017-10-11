package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.entity.PersLoginDevice;

public interface PersLoginDeviceDAO extends GenericDAO<PersLoginDevice, Serializable> {
	public PersLoginDevice findByRegisTokenAndUser(String token , Integer persId);
	public PersLoginDevice findByRegisTokenOrderByLastUpdttm(String token);
}
