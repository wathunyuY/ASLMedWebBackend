package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.Person;

public interface NotiSubscrTblDAO extends GenericDAO<NotiSubscrTbl, Serializable>{
	public List<Person> findPersonBySubId(Integer subid);
	public List<NotiSubscrTbl> findByPersId(Integer persId);
}
