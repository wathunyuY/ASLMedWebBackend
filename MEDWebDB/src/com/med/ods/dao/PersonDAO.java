package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.entity.Person;
import com.med.ods.entity.PersonCurrent;

public interface PersonDAO extends GenericDAO<Person, Serializable>{
	
	public List<PersonCurrent> findStdntByName(String name) throws MEDException;

}
