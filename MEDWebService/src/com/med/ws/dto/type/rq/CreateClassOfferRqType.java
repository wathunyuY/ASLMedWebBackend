package com.med.ws.dto.type.rq;

import com.med.ws.dto.type.rs.CourseListRsType;

public class CreateClassOfferRqType {
	// PK
	private Integer calendarId;
	private Integer acadCarId;
	
	private CourseListRsType crseCatalog;

	public Integer getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}

	public Integer getAcadCarId() {
		return acadCarId;
	}

	public void setAcadCarId(Integer acadCarId) {
		this.acadCarId = acadCarId;
	}

	public CourseListRsType getCrseCatalog() {
		return crseCatalog;
	}

	public void setCrseCatalog(CourseListRsType crseCatalog) {
		this.crseCatalog = crseCatalog;
	}
	
}
