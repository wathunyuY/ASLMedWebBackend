package com.med.ods.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.dao.GenericVwDAO;

public abstract class GenericVwDAOImpl<T, PK extends Serializable> implements GenericVwDAO<T, Serializable> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> persistentClass;
	protected Class<PK> compositeKeyClass;

	@SuppressWarnings("unchecked")
	public GenericVwDAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.persistentClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
		this.compositeKeyClass = (Class<PK>) genericSuperclass.getActualTypeArguments()[1];
	}

	@Override
	public Collection<T> findByField(String fieldName, Object value) throws MEDException{
		try {		
			Field field = compositeKeyClass.getDeclaredField(fieldName);
			String hql = "From " + persistentClass.getSimpleName() + " where id."+field.getName()+" = :value";
			Query qr = entityManager.createQuery(hql);
			qr.setParameter("value", value);
			return qr.getResultList();
		} catch (SecurityException | NoSuchFieldException ex) {
//			ex.printStackTrace();
			throw new MEDException(ErrorConstants.FIELD_NOT_FOUND);
		} catch(IllegalArgumentException ie){
//			ie.printStackTrace();
			throw new MEDException(ErrorConstants.FIELD_TYPE_ERROR);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findAll() {
		return entityManager.createQuery("From " + persistentClass.getSimpleName()).getResultList();
	}

	@Override
	public <K,V> Collection<T> findByMultipleField(Map<K,V> param) throws MEDException{
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(persistentClass);
		Root<T> root = cq.from(persistentClass);
		cq.select(root);
		List<Predicate> predList = new ArrayList<>();
		for(Map.Entry<K, V> ent: param.entrySet()){
			Predicate p = cb.and(cb.equal(root.get("id").get((String) ent.getKey()), ent.getValue()));
			predList.add(p);
		}
		Predicate[] predArray = new Predicate[predList.size()];
		predList.toArray(predArray);
		cq.where(predArray);
		TypedQuery<T> q = entityManager.createQuery(cq);
		return q.getResultList();		
	}
}
