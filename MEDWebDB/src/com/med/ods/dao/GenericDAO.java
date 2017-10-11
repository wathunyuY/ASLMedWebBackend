package com.med.ods.dao;

import java.io.Serializable;
import java.util.Collection;

public interface GenericDAO<T, PK extends Serializable> {
	public abstract T findByPK(PK id);

	public abstract Collection<T> findAll();

	public abstract void delete(T entity);

	public abstract void persist(T entity);

	public abstract T merge(T entity);

	public abstract void update(T entity);

	public void save(T entity);

	public abstract void flush();

	public abstract void refresh(Object obj);

	public abstract void commit();

	public abstract void begin();
	

	// public abstract void saveOrUpdate(T entity);

	// public abstract void delete(PK id);

	// public abstract void delete(PK[] ids);

	// public abstract void deleteAll(Collection<T> entities);

	 public abstract boolean exists(PK id);


	Collection<T> findByColumn(String property, Object value) throws Exception;


	// public abstract void initialize(Set<T> set);

	// public abstract void evict(T entity);

//	 public abstract void saveOrUpdateAll(Collection<T> entities);
}
