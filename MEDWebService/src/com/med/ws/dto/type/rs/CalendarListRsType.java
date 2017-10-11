package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.CalendarBean;

public class CalendarListRsType {
	private List<CalendarBean> calendar;

	public List<CalendarBean> getCalendar() {
		return calendar;
	}

	public void setCalendar(List<CalendarBean> calendar) {
		this.calendar = calendar;
	}
}
