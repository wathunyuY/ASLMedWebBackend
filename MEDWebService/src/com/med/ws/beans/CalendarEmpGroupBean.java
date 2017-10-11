package com.med.ws.beans;

import java.util.List;

import com.med.ws.dto.type.rs.SearchPersonalRsType;

public class CalendarEmpGroupBean {
	protected Integer activityId;
	protected AcadOrgBean acadOrg;
	protected List<SearchPersonalRsType> empList;
	
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public AcadOrgBean getAcadOrg() {
		return acadOrg;
	}
	public void setAcadOrg(AcadOrgBean acadOrg) {
		this.acadOrg = acadOrg;
	}
	public List<SearchPersonalRsType> getEmpList() {
		return empList;
	}
	public void setEmpList(List<SearchPersonalRsType> empList) {
		this.empList = empList;
	}
	
}
