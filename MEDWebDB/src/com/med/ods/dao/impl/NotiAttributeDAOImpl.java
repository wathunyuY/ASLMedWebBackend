package com.med.ods.dao.impl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.ods.dao.NotiAttributeDAO;
import com.med.ods.entity.NotiAttribute;
import com.med.ods.entity.NotiAttributeId;

@Repository
public class NotiAttributeDAOImpl extends GenericDAOImpl<NotiAttribute, NotiAttributeId> implements NotiAttributeDAO{

	private static Logger logger = LogManager.getLogger(NotiAttributeDAOImpl.class);
	
	@Override
	public List<NotiAttribute> findByNotiId(Integer id) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<NotiAttribute> cq = cb.createQuery(NotiAttribute.class);
		Root<NotiAttribute> e = cq.from(NotiAttribute.class);
		cq.select(e);
		cq.where(cb.equal(e.get("id").get("notiId"), id));
		Query qr = entityManager.createQuery(cq);
		return qr.getResultList();
	}

}
