package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadCarBean;
import com.med.ws.beans.DateFullCalendarBean;
import com.med.ws.beans.TermTblBean;

public class ScheduleOverviewRsType {
	private Integer calendarId;
	private String calendarTitle;
	private String calendarDescr;
	private String status;
	private AcadCarBean acadCar;
	private AcadCampusBean acadCampus;
	private List<TermTblBean> term;
	private List<DateFullCalendarBean> holidays;
	private List<DateFullCalendarBean> events;
	private List<DateFullCalendarBean> activities;
	private List<DateFullCalendarBean> scheduleTopics;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AcadCarBean getAcadCar() {
		return acadCar;
	}
	public void setAcadCar(AcadCarBean acadCar) {
		this.acadCar = acadCar;
	}
	public AcadCampusBean getAcadCampus() {
		return acadCampus;
	}
	public void setAcadCampus(AcadCampusBean acadCampus) {
		this.acadCampus = acadCampus;
	}
	public List<TermTblBean> getTerm() {
		return term;
	}
	public void setTerm(List<TermTblBean> term) {
		this.term = term;
	}
	public List<DateFullCalendarBean> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<DateFullCalendarBean> holidays) {
		this.holidays = holidays;
	}
	public List<DateFullCalendarBean> getEvents() {
		return events;
	}
	public void setEvents(List<DateFullCalendarBean> events) {
		this.events = events;
	}
	public List<DateFullCalendarBean> getActivities() {
		return activities;
	}
	public void setActivities(List<DateFullCalendarBean> activities) {
		this.activities = activities;
	}
	public List<DateFullCalendarBean> getScheduleTopics() {
		return scheduleTopics;
	}
	public void setScheduleTopics(List<DateFullCalendarBean> scheduleTopics) {
		this.scheduleTopics = scheduleTopics;
	}
	
}
