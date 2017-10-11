package com.med.ws.dto.type.rq;

import com.med.ws.dto.type.rs.StdntClinicGroupToSectionRsType;

public class StdntClinicGroupToSectionSaveRqType {

	protected Integer transTaskId; //INT(10)
	protected boolean confirm;
	protected StdntClinicGroupToSectionRsType stdntClinicGroupToSectionRsType;
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
	public StdntClinicGroupToSectionRsType getStdntClinicGroupToSectionRsType() {
		return stdntClinicGroupToSectionRsType;
	}
	public void setStdntClinicGroupToSectionRsType(StdntClinicGroupToSectionRsType stdntClinicGroupToSectionRsType) {
		this.stdntClinicGroupToSectionRsType = stdntClinicGroupToSectionRsType;
	}
	
}
