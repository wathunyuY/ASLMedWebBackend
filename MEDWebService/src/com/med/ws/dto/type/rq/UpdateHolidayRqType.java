package com.med.ws.dto.type.rq;

public class UpdateHolidayRqType {
	private Integer holidayId;
	private String holidayTitle;
	private String holidayTitleEn;
	private String descr;
	private String descrEn;
	private String startDate;
	private String endDate;
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
}
