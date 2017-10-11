package com.med.ws.beans;

public class DateFullCalendarBean {
	private Integer dateId;
	private String dateTitle;
	private String dateDescr;
	private String start;
	private String end;
	private Boolean allDay;
	private String color;
	public Integer getDateId() {
		return dateId;
	}
	public void setDateId(Integer dateId) {
		this.dateId = dateId;
	}
	public String getDateTitle() {
		return dateTitle;
	}
	public void setDateTitle(String dateTitle) {
		this.dateTitle = dateTitle;
	}
	public String getDateDescr() {
		return dateDescr;
	}
	public void setDateDescr(String dateDescr) {
		this.dateDescr = dateDescr;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Boolean getAllDay() {
		return allDay;
	}
	public void setAllDay(Boolean allDay) {
		this.allDay = allDay;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
