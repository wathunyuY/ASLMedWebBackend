package com.med.ws.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CalendarBean {
	protected Integer calendarId;
	protected String calendarTitle;
	protected String calendarTitleEn;
	protected String calendarDescr;
	protected String calendarDescrEn;
	protected AcadCarBean acadCar;
	protected AcadCampusBean acadCampus;
	protected String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}
	public String getCalendarTitle() {
		return calendarTitle;
	}
	public void setCalendarTitle(String calendarTitle) {
		this.calendarTitle = calendarTitle;
	}
	public String getCalendarDescr() {
		return calendarDescr;
	}
	public void setCalendarDescr(String calendarDescr) {
		this.calendarDescr = calendarDescr;
	}
	public AcadCarBean getAcadCar() {
		return acadCar;
	}
	public void setAcadCar(AcadCarBean acadCar) {
		this.acadCar = acadCar;
	}
	public String getCalendarTitleEn() {
		return calendarTitleEn;
	}
	public void setCalendarTitleEn(String calendarTitleEn) {
		this.calendarTitleEn = calendarTitleEn;
	}
	public String getCalendarDescrEn() {
		return calendarDescrEn;
	}
	public void setCalendarDescrEn(String calendarDescrEn) {
		this.calendarDescrEn = calendarDescrEn;
	}
	public AcadCampusBean getAcadCampus() {
		return acadCampus;
	}
	public void setAcadCampus(AcadCampusBean acadCampus) {
		this.acadCampus = acadCampus;
	}
	
	
	
}
