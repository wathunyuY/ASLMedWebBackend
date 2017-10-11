package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.CalendarEmpGroupBean;

public class SearchEmpByCalendarEmpGroupRqType {
	private List<CalendarEmpGroupBean> empGroupList;

	public List<CalendarEmpGroupBean> getEmpGroupList() {
		return empGroupList;
	}

	public void setEmpGroupList(List<CalendarEmpGroupBean> empGroupList) {
		this.empGroupList = empGroupList;
	}
	
}
