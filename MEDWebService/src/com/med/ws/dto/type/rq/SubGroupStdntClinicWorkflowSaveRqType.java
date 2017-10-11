package com.med.ws.dto.type.rq;

import com.med.ws.dto.type.rs.SubGroupStdntClinicRsType;

public class SubGroupStdntClinicWorkflowSaveRqType {

	protected Integer transTaskId;
	protected boolean confirm;
	protected SubGroupStdntClinicRsType subGroupStdntClinicRsType;
	
	
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
	public SubGroupStdntClinicRsType getSubGroupStdntClinicRsType() {
		return subGroupStdntClinicRsType;
	}
	public void setSubGroupStdntClinicRsType(SubGroupStdntClinicRsType subGroupStdntClinicRsType) {
		this.subGroupStdntClinicRsType = subGroupStdntClinicRsType;
	}
	
	
	
}
