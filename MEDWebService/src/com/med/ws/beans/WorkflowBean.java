package com.med.ws.beans;

public class WorkflowBean {
	private Integer workflowId;
	private Integer calendarId;
	private Integer workflowTemplateId;
	private String title;
	private String status;
	private String classSection;
	public Integer getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(Integer workflowId) {
		this.workflowId = workflowId;
	}
	public Integer getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}
	public Integer getWorkflowTemplateId() {
		return workflowTemplateId;
	}
	public void setWorkflowTemplateId(Integer workflowTemplateId) {
		this.workflowTemplateId = workflowTemplateId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	
}
