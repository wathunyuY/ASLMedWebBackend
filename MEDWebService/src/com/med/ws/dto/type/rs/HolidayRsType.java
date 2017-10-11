package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.HolidayBean;

public class HolidayRsType {
	private Integer year;
	private List<HolidayBean> holiday;

	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<HolidayBean> getHoliday() {
		return holiday;
	}

	public void setHoliday(List<HolidayBean> holiday) {
		this.holiday = holiday;
	}
}
