package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.NotiSubscrPerson;
import com.med.ods.entity.Person;

public interface NotiSubscrPersonDAO extends GenericDAO<NotiSubscrPerson, Serializable>{
	public List<Person> findPersonBySubscrId(Integer subscrId);
}
