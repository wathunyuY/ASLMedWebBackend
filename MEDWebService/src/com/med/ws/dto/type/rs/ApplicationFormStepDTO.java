package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.med.ws.dto.type.rs.ApplicationFormRsType.ApplicationFormPersonDetail;

public class ApplicationFormStepDTO {
	Integer stepNo;
	String stepName;
	String stepStatusCode;
	ApplicationFormPersonDetail requester;
	List<ApplicationFormPersonDetail> personList;
	Date effdt;
	public Integer getStepNo() {
		return stepNo;
	}
	public void setStepNo(Integer stepNo) {
		this.stepNo = stepNo;
	}
	public String getStepName() {
		return stepName;
	}
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	public String getStepStatusCode() {
		return stepStatusCode;
	}
	public void setStepStatusCode(String stepStatusCode) {
		this.stepStatusCode = stepStatusCode;
	}
	public ApplicationFormPersonDetail getRequester() {
		return requester;
	}
	public void setRequester(ApplicationFormPersonDetail requester) {
		this.requester = requester;
	}
	public List<ApplicationFormPersonDetail> getPersonList() {
		return personList;
	}
	public void setPersonList(List<ApplicationFormPersonDetail> personList) {
		this.personList = personList;
	}
	public Date getEffdt() {
		return effdt;
	}
	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}
	
}
