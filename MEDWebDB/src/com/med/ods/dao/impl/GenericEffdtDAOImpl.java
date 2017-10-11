package com.med.ods.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;

import com.med.ods.dao.GenericEffdtDAO;

@Repository
public abstract class GenericEffdtDAOImpl<T, PK  extends Serializable> extends GenericDAOImpl<T, PK> implements GenericEffdtDAO<T, Serializable>{
	
	
	@Override
	public Collection<T> findById(Object obj){
		javax.persistence.Query qr = entityManager.createQuery("From " + persistentClass.getSimpleName()+ " where id."+this.getPrimaryKeyField(persistentClass)+" = :id order by id.effdt");
		qr.setParameter("id", obj);
		return qr.getResultList();
	}
	
	@Override
	public T findByIdAndEffdt(Object id, Object effdt){
		javax.persistence.Query qr = entityManager.createQuery("From " + persistentClass.getSimpleName()+ " where id."+this.getPrimaryKeyField(persistentClass)+" = :id and id.effdt = :dt");
		qr.setParameter("id", id);
		qr.setParameter("dt", effdt);
		T result = null;
		try{
			return (T) qr.getSingleResult();
		}catch (NoResultException nf) {
			return null;
		}
	}
	
	@Override
	public T findMaxEffdtById(Object id){
		javax.persistence.Query qr = entityManager.createQuery("From " + persistentClass.getSimpleName()+ " where id."+this.getPrimaryKeyField(persistentClass)+" = :id order by id.effdt desc");
		qr.setParameter("id", id);
		return (T) qr.getResultList().get(0);
	}
	
	@Override
	public void changeEffStatus(Object id, Object status){
		javax.persistence.Query effdtQr = entityManager.createQuery("update "+persistentClass.getSimpleName()+" set effStatus = :status where id."+this.getPrimaryKeyField(persistentClass)+" = :id");
		javax.persistence.Query headQr = entityManager.createQuery("update "+this.getHeaderClassName(persistentClass)+" set effStatus = :status where "+this.getPrimaryKeyField(persistentClass)+" = :id");
		effdtQr.setParameter("id", id);
		effdtQr.setParameter("status", status);
		headQr.setParameter("id", id);
		headQr.setParameter("status", status);
		effdtQr.executeUpdate();
		headQr.executeUpdate();
	}
	
	private String getPrimaryKeyField(Class<T> persistClass){		
		return persistClass.getSimpleName().substring(0, 1).toLowerCase() + persistClass.getSimpleName().replace("TblEffdt", "Id").substring(1);
	}
	
	private String getHeaderClassName(Class<T> persistClass){
		return persistClass.getSimpleName().replace("TblEffdt", "Tbl");
	}
	
}
