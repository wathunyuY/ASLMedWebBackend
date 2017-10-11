package com.med.ws.beans;

import java.util.Date;

public class HolidayBean {
	private Integer holidayId;
	private String holidayTitle; //varchar(255)
	private String holidayTitleEn; //varchar(255)
	private String descr; //text
	private String descrEn; //text
	private String startDate; //date
	private String endDate; //date
	private Date startDateLong;
	private Date endDateLong;
	public Integer getHolidayId() {
		return holidayId;
	}
	public void setHolidayId(Integer holidayId) {
		this.holidayId = holidayId;
	}
	public String getHolidayTitle() {
		return holidayTitle;
	}
	public void setHolidayTitle(String holidayTitle) {
		this.holidayTitle = holidayTitle;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getHolidayTitleEn() {
		return holidayTitleEn;
	}
	public void setHolidayTitleEn(String holidayTitleEn) {
		this.holidayTitleEn = holidayTitleEn;
	}
	public String getDescrEn() {
		return descrEn;
	}
	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
	public Date getStartDateLong() {
		return startDateLong;
	}
	public void setStartDateLong(Date startDateLong) {
		this.startDateLong = startDateLong;
	}
	public Date getEndDateLong() {
		return endDateLong;
	}
	public void setEndDateLong(Date endDateLong) {
		this.endDateLong = endDateLong;
	}
	
}
