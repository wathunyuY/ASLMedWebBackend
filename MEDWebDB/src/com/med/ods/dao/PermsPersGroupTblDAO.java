package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.ods.entity.PermsPersGroupTbl;

public interface PermsPersGroupTblDAO extends GenericDAO<PermsPersGroupTbl, Serializable> {

	public List<PermsPersGroupTbl> findPermsPersGroupTblByPermsListTblId(String permsListTblId) ;
}
