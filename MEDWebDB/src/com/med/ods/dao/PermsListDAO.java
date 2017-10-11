package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.entity.PermsList;

public interface PermsListDAO extends GenericDAO<PermsList, Serializable> {
	public List<PermsList> findPermsListByPermListTblId(List<String> permListTblIdList) throws MEDException;

	public void deleteByPermsListId(List<String> persList, String permsTblId);
}
