package com.med.ods.dao.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.DateUtils;
import com.med.ods.criteria.bean.ResearchSearchRqType;
import com.med.ods.dao.ResearchTblDAO;
import com.med.ods.entity.ResearchTbl;
@Repository
public class ResearchTblDAOImpl extends GenericDAOImpl<ResearchTbl, Integer> implements ResearchTblDAO {

	private static Logger logger = LogManager.getLogger(ResearchTblDAOImpl.class);

	
	@Override
	public List<String> findDistinctField(String field) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ResearchTbl> cq = cb.createQuery(ResearchTbl.class);
		Root<ResearchTbl> e = cq.from(ResearchTbl.class);
		cq.select(e.get(field)).distinct(true);
		Query qr = entityManager.createQuery(cq);
		return qr.getResultList();
	}

	@Override
	public List<ResearchTbl> search(ResearchSearchRqType filter) throws MEDException, ParseException {
//		String hqlM = ConfigMapHelper.getConfigValue("SQL_CONSTANTS.SEARCH_RESEARCH");
		List<ResearchTbl> rs = null;
		String hql = "from ResearchTbl r where 1=1 ";
		if(null != filter.getCategory())
			hql += " and r.researchCategoryTbl.categoryId ="+filter.getCategory();
		if(null != filter.getAnalyst())
			hql += " and r.researchAuthor ='"+filter.getAnalyst()+"'";
		if(null != filter.getSymbol())
			hql += " and r.researchSybol = '"+filter.getSymbol()+"'";
		if(null != filter.getStartDate() && null != filter.getEndDate()){
			Date s = DateUtils.convertStringToDate(filter.getStartDate());
			Date e = DateUtils.convertStringToDate(filter.getEndDate());
			hql += " and r.researchCreateDate between convert(datetime,'"
				+DateUtils.convertDateToDateOnlyFormatString(s)+"') and convert(datetime,'"
				+DateUtils.convertDateToDateOnlyFormatString(e)+" 23:59:59:999')";
		}
		if(null != filter.getStartDate() && null == filter.getEndDate()){
			Date s = DateUtils.convertStringToDate(filter.getStartDate());
			hql += " and r.researchCreateDate between convert(datetime,'"+DateUtils.convertDateToDateOnlyFormatString(s)+"') and convert(datetime,GETDATE())";
		}
			Query query = entityManager.createQuery(hql);
		try {
			rs = query.getResultList();
		} catch (Exception e) {
			logger.info(hql);
			logger.error(e.getMessage());
			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
		}
		return rs;
	}
	
}
