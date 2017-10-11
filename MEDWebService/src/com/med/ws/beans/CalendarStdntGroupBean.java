package com.med.ws.beans;

import java.util.List;

import com.med.ws.dto.type.rs.SearchStdntRsType;

public class CalendarStdntGroupBean {
	Integer activityId;
	AcadCampusBean campus;
	List<CalendarYear> yearList;
	
	public static class CalendarYear{
		Integer year;
		List<CalendarAcadOrg> orgList;
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		public List<CalendarAcadOrg> getOrgList() {
			return orgList;
		}
		public void setOrgList(List<CalendarAcadOrg> orgList) {
			this.orgList = orgList;
		}
		
	}
	
	public static class CalendarAcadOrg{
		AcadOrgBean acadOrg;
		List<SearchStdntRsType> person;
		public AcadOrgBean getAcadOrg() {
			return acadOrg;
		}
		public void setAcadOrg(AcadOrgBean acadOrg) {
			this.acadOrg = acadOrg;
		}
		public List<SearchStdntRsType> getPerson() {
			return person;
		}
		public void setPerson(List<SearchStdntRsType> person) {
			this.person = person;
		}
		
	}
	
	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	public AcadCampusBean getCampus() {
		return campus;
	}
	public void setCampus(AcadCampusBean campus) {
		this.campus = campus;
	}
	public List<CalendarYear> getYearList() {
		return yearList;
	}
	public void setYearList(List<CalendarYear> yearList) {
		this.yearList = yearList;
	}
	
	
}
