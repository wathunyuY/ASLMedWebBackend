package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.ods.dao.PersLoginDeviceDAO;
import com.med.ods.entity.PersLoginDevice;

@Repository
public class PersLoginDeviceDAOImpl extends GenericDAOImpl<PersLoginDevice, Integer> implements PersLoginDeviceDAO {

	private static Logger logger = LogManager.getLogger(PersLoginDeviceDAOImpl.class);
	
	@Override
	public PersLoginDevice findByRegisTokenAndUser(String token , Integer persId) {
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<PersLoginDevice> cq = cb.createQuery(PersLoginDevice.class);
//		Root<PersLoginDevice> root = cq.from(PersLoginDevice.class);
//		cq.select(root);
//		Predicate p = cb.and(cb.equal(root.get("regisToken"), token));
//		cq.where(p);
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERS_DEVICE_BY_TOKEN_AND_USER");
		Query qr = entityManager.createQuery(hql);
		try{
			qr.setParameter("token", token);
			qr.setParameter("user", persId);
			return (PersLoginDevice) qr.getSingleResult();
		}catch (NoResultException nu) {
			return null;
		}
	}

	@Override
	public PersLoginDevice findByRegisTokenOrderByLastUpdttm(String token) {
//		List<PersLoginDevice> result = new ArrayList<>();
		PersLoginDevice result = new PersLoginDevice();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERS_DEVICE_BY_TOKEN_ORDER_BY_LASTUPDTTM");
		Query qr = entityManager.createQuery(hql);
		try{
			qr.setParameter("token", token);
//			result = qr.getResultList();
			result = (PersLoginDevice) qr.getSingleResult();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

	@Override
	public List<PersLoginDevice> findByPersId(Integer persId) {
		List<PersLoginDevice> result = new ArrayList<>();
//		ersLoginDevice result = new PersLoginDevice();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_PERS_DEVICE_BY_PERSON_ORDER_BY_LASTUPDTTM");
		Query qr = entityManager.createQuery(hql);
		try{
			qr.setParameter("persId", persId);
//			result = qr.getResultList();
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

	
	
}
