package com.med.ws.dto.type.rs;

public class SearchStdntByTimePeriodRsType {
	private SearchStdntRsType student;
	private String reason;
	private String level;
	public SearchStdntRsType getStudent() {
		return student;
	}
	public void setStudent(SearchStdntRsType student) {
		this.student = student;
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
