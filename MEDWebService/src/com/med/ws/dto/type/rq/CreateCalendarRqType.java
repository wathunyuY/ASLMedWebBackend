package com.med.ws.dto.type.rq;


public class CreateCalendarRqType {
	protected String calendarTitle; //varchar(255)
	protected Integer termNumber;
	protected Integer acadCarId;
	protected Integer acadCampusId;
	public String getCalendarTitle() {
		return calendarTitle;
	}
	public void setCalendarTitle(String calendarTitle) {
		this.calendarTitle = calendarTitle;
	}
	public Integer getTermNumber() {
		return termNumber;
	}
	public void setTermNumber(Integer termNumber) {
		this.termNumber = termNumber;
	}
	public Integer getAcadCarId() {
		return acadCarId;
	}
	public void setAcadCarId(Integer acadCarId) {
		this.acadCarId = acadCarId;
	}
	public Integer getAcadCampusId() {
		return acadCampusId;
	}
	public void setAcadCampusId(Integer acadCampusId) {
		this.acadCampusId = acadCampusId;
	} 
	
	
}
