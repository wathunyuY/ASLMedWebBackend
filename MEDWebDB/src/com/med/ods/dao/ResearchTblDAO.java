package com.med.ods.dao;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.criteria.bean.ResearchSearchRqType;
import com.med.ods.entity.ResearchTbl;

public interface ResearchTblDAO extends GenericDAO<ResearchTbl, Serializable> {
	public List<String> findDistinctField(String field);
	public List<ResearchTbl> search(ResearchSearchRqType filter) throws MEDException,ParseException;

}
