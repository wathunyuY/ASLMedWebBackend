package com.med.ods.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.common.contants.ConfigMapHelper;
import com.med.common.contants.NotificationTypeConstants;
import com.med.common.utils.DateUtils;
import com.med.ods.dao.NotiPoolDAO;
import com.med.ods.entity.NotiPool;

@Repository
public class NotiPoolDAOImpl extends GenericDAOImpl<NotiPool, Integer> implements NotiPoolDAO{

	private static Logger logger = LogManager.getLogger(NotiPoolDAOImpl.class);
	
	@Override
	public List<NotiPool> findTaskByOwner(Integer persId) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<NotiPool> cq = cb.createQuery(NotiPool.class);
		Root<NotiPool> e = cq.from(NotiPool.class);
		cq.select(e);
		Predicate per = cb.equal(e.get("target"), persId);
		Predicate type = cb.equal(e.get("type"), NotificationTypeConstants.TASK.getCode());
		cq.where(cb.and(per,type));
		cq.orderBy(cb.desc(e.get("createdAt")));
		Query qr = entityManager.createQuery(cq);
		return qr.getResultList();
	}

	@Override
	public List<NotiPool> findByOwner(Integer persId) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<NotiPool> cq = cb.createQuery(NotiPool.class);
		Root<NotiPool> e = cq.from(NotiPool.class);
		cq.select(e);
		Predicate per = cb.or(cb.equal(e.get("personOwner"), persId), cb.equal(e.get("target"), persId));
		cq.where(per);
		cq.orderBy(cb.desc(e.get("createdAt")));
		Query qr = entityManager.createQuery(cq);
		return qr.getResultList();
	}

	@Override
	public List<NotiPool> findByTargetAndTypeList(String target, List<String> types) {
		List<NotiPool> result = new ArrayList<>();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_NOTI_POOL_BY_TARGET_AND_TYPE_LIST");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("target", target);
		qr.setParameter("typeList", types);
		try{
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

	@Override
	public List<NotiPool> findBySentAndTypeList(Boolean sent, List<String> types) {
		List<NotiPool> result = new ArrayList<>();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_NOTI_POOL_BY_SENT_AND_TYPE_LIST");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("sent", sent);
		qr.setParameter("typeList", types);
		try{
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

	@Override
	public List<NotiPool> findChatByTopic(String topic,Date lastMassageDate) {
		List<NotiPool> result = new ArrayList<>();
		String hql;
		if(null == lastMassageDate)
			hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_NOTI_CHAT_POOL_BY_TOPIC");
		else hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_NOTI_CHAT_POOL_BY_TOPIC_AND_LAST_MASSAGE_DATE");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("topic", topic);
		if(null != lastMassageDate)
			qr.setParameter("lastMassageDate", lastMassageDate,TemporalType.TIMESTAMP);
//		qr.setMaxResults(20);
		try{
			result = qr.getResultList();
		}catch (NoResultException no) {
			return null;
		}
		return result;
	}

	@Override
	public NotiPool findLastChatByTopic(String topic) {
		List<NotiPool> result = new ArrayList<>();
		String hql = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.FIND_LAST_NOTI_CHAT_POOL_BY_TOPIC");
		Query qr = entityManager.createQuery(hql);
		qr.setParameter("topic", topic);
		try{
			result = qr.getResultList();
			return 0 < result.size() ? result.iterator().next() : null;
		}catch (NoResultException no) {
			return null;
		}
		
	}
}
