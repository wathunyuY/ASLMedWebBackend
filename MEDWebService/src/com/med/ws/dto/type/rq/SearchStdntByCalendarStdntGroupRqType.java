package com.med.ws.dto.type.rq;

public class SearchStdntByCalendarStdntGroupRqType {
	private Integer acadCampusId; //INT(10)
	private Integer year; //INT(4)
	private Integer acadOrgId; //INT(10)
	private String activityStartDate; //DATE
	private String activityEndDate; //DATE
	public Integer getAcadCampusId() {
		return acadCampusId;
	}
	public void setAcadCampusId(Integer acadCampusId) {
		this.acadCampusId = acadCampusId;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getAcadOrgId() {
		return acadOrgId;
	}
	public void setAcadOrgId(Integer acadOrgId) {
		this.acadOrgId = acadOrgId;
	}
	public String getActivityStartDate() {
		return activityStartDate;
	}
	public void setActivityStartDate(String activityStartDate) {
		this.activityStartDate = activityStartDate;
	}
	public String getActivityEndDate() {
		return activityEndDate;
	}
	public void setActivityEndDate(String activityEndDate) {
		this.activityEndDate = activityEndDate;
	}
	
}
