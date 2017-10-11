package com.med.ods.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import com.med.common.exception.MEDException;

public interface GenericVwDAO<T, PK extends Serializable> {
	public abstract Collection<T> findAll();
	public abstract Collection<T> findByField(String fieldName, Object value) throws MEDException;
	public abstract <K, V> Collection<T> findByMultipleField(Map<K,V> param) throws MEDException;
}
