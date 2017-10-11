package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.dto.type.rs.StdntClinicGroupRsType;

public class StdntClinicGroupSaveRqType {

	protected Integer transTaskId; //INT(10);
	protected boolean confirm;
	protected List<StdntClinicGroupRsType> stdntClinicGroupRsTypeList;
	
	public Integer getTransTaskId() {
		return transTaskId;
	}
	public void setTransTaskId(Integer transTaskId) {
		this.transTaskId = transTaskId;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	public List<StdntClinicGroupRsType> getStdntClinicGroupRsTypeList() {
		return stdntClinicGroupRsTypeList;
	}
	public void setStdntClinicGroupRsTypeList(List<StdntClinicGroupRsType> stdntClinicGroupRsTypeList) {
		this.stdntClinicGroupRsTypeList = stdntClinicGroupRsTypeList;
	}
}
