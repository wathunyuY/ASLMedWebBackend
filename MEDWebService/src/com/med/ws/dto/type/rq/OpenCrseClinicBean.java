package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.ClassBean;
import com.med.ws.beans.TermTblBean;

public class OpenCrseClinicBean {
	private Integer taskId;
	private String taskStatus;
	private Integer calendarId;
	private String calendarDesc;
	private Integer year;
	private String startTerm;
	private String endTerm;
	private List<ClassBean> classList;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public Integer getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}
	public String getCalendarDesc() {
		return calendarDesc;
	}
	public void setCalendarDesc(String calendarDesc) {
		this.calendarDesc = calendarDesc;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public List<ClassBean> getClassList() {
		return classList;
	}
	public void setClassList(List<ClassBean> classList) {
		this.classList = classList;
	}
	public String getStartTerm() {
		return startTerm;
	}
	public void setStartTerm(String startTerm) {
		this.startTerm = startTerm;
	}
	public String getEndTerm() {
		return endTerm;
	}
	public void setEndTerm(String endTerm) {
		this.endTerm = endTerm;
	}
}
