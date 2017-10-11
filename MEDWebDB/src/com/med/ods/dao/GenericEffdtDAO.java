package com.med.ods.dao;

import java.io.Serializable;
import java.util.Collection;

public interface GenericEffdtDAO<T, PK extends Serializable> extends GenericDAO<T, Serializable> {
	
//	public abstract void setPersistentEffdtClass(Class<T> persistentEffdtClass);
	public abstract Collection<T> findById(Object id );
	public abstract T findByIdAndEffdt(Object id, Object effdt);
	public abstract T findMaxEffdtById(Object id);
	public abstract void changeEffStatus(Object id, Object status);
}
