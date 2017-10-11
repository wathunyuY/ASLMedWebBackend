package com.med.ods.dao;

import java.io.Serializable;
import java.util.List;

import com.med.common.exception.MEDException;
import com.med.ods.entity.PermsPersGroup;

public interface PermsPersGroupDAO extends GenericDAO<PermsPersGroup, Serializable> {
	public List<PermsPersGroup> findPermsPersGroupByPersId(Integer persId) throws MEDException;

	public void deletePermsPersGroupByTblId(String permsPersGroupTblId);

	public List<PermsPersGroup> findPermsPersGroupByTblId(String permsPersGroupTblId);

	public void deleteByPersonId(List<Integer> personGrpDel, String permsPersGroupTblId);
}
