package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.NotiPersonSubscr;
import com.med.ods.entity.NotiSubscrTbl;
import com.med.ods.entity.Person;

public interface NotiPersonSubscrDAO extends GenericDAO<NotiPersonSubscr, Serializable> {
	List<Person> findPersonBySubscrId(Integer subscrId);
//	List<NotiSubscrTbl> findNotiSubscrByPersId(Integer persId);
}
