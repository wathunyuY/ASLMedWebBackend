package com.med.ws.dto.type.rs;

public class SearchTeacherByTimePeriodRsType {
	private SearchPersonalRsType teacher;
	private String reason;
	private String level;
	public SearchPersonalRsType getTeacher() {
		return teacher;
	}
	public void setTeacher(SearchPersonalRsType teacher) {
		this.teacher = teacher;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}
