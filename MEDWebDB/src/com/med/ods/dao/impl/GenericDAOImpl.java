package com.med.ods.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import javax.persistence.metamodel.EntityType;

import org.springframework.stereotype.Repository;
import com.med.ods.dao.GenericDAO;

@Repository
public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, Serializable> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.persistentClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	}

	protected EntityManager getCurrentEntityManager() {
		return this.entityManager;
	}

	@Override
	public T findByPK(Serializable pk) {
		return entityManager.find(persistentClass, pk);
	}

//	public Collection<T> findByColumn(Object object) throws Exception {
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<T> cq = cb.createQuery(persistentClass);
//		Root<T> root = cq.from(persistentClass);
//		cq.select(root);
//		String attr = null;
//		for (Field field : object.getClass().getDeclaredFields()) {
//			try {
//				attr = persistentClass.getDeclaredField(field.getName()).getName();
//
//				Object obj = null;
//				field.setAccessible(true);				
//				obj = field.get(persistentClass.getDeclaredField(field.getName()));
//				if (obj != null) {
//					cq.where(cb.equal(root.get(attr), object));
//				}
//			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
//				throw e;
//			}
//		}
//		TypedQuery<T> q = entityManager.createQuery(cq);
//
//		return q.getResultList();
//	}

	@Override
	public Collection<T> findByColumn(String property, Object value) throws Exception {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(persistentClass);
		String attr = null;
		attr = persistentClass.getDeclaredField(property).getName();
		Root<T> root = cq.from(persistentClass);
		cq.select(root);
		cq.where(cb.equal(root.get(attr), value));
		TypedQuery<T> q = entityManager.createQuery(cq);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> findAll() {
		return entityManager.createQuery("From " + persistentClass.getSimpleName()).getResultList();
	}

	@Override
	public void commit() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void begin() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void delete(T entity) {
		entityManager.remove(entity);
	}

	@Override
	public void persist(T entity) {
		entityManager.persist(entity);
	}

	@Override
	public T merge(T entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void flush() {
		entityManager.flush();
	}

	@Override
	public void refresh(Object obj) {
		entityManager.refresh(obj);
	}

	public void saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
	}

	public void delete(Serializable pk) {
		// TODO Auto-generated method stub
	}

	public void delete(Serializable[] pks) {
		// TODO Auto-generated method stub
	}

	public void deleteAll(Collection<T> entities) {
		// TODO Auto-generated method stub
	}

	public boolean exists(Serializable pk) {
		return entityManager.contains(findByPK(pk));
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
	}

	public void save(T entity) {
		// TODO Auto-generated method stub
	}

	public void initialize(Set<T> set) {
		// TODO Auto-generated method stub
	}

	public void evict(T entity) {
		// TODO Auto-generated method stub
	}

	public void saveOrUpdateAll(Collection<T> entities) {
		// TODO Auto-generated method stub}
	}

}
