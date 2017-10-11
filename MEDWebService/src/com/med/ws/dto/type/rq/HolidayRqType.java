package com.med.ws.dto.type.rq;

import com.med.ws.beans.HolidayBean;

public class HolidayRqType {
	private Integer year;
	private HolidayBean holiday;
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public HolidayBean getHoliday() {
		return holiday;
	}
	public void setHoliday(HolidayBean holiday) {
		this.holiday = holiday;
	}
	
}
