package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.NotiAttribute;

public interface NotiAttributeDAO extends GenericDAO<NotiAttribute, Serializable>{
	public List<NotiAttribute> findByNotiId(Integer id);
}
