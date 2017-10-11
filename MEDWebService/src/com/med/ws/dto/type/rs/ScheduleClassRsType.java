package com.med.ws.dto.type.rs;

import java.util.Date;

public class ScheduleClassRsType {
	private String subjectName;
	private String subSectionCode;
	private String subSectionNumCode;
	private Date startDate;
	private Date endDate;
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubSectionCode() {
		return subSectionCode;
	}
	public void setSubSectionCode(String subSectionCode) {
		this.subSectionCode = subSectionCode;
	}
	public String getSubSectionNumCode() {
		return subSectionNumCode;
	}
	public void setSubSectionNumCode(String string) {
		this.subSectionNumCode = string;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
