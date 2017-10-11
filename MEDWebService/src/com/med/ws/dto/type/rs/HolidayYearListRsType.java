package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.YearBean;

public class HolidayYearListRsType {
	private List<YearBean> yearList;

	public List<YearBean> getYearList() {
		return yearList;
	}

	public void setYearList(List<YearBean> yearList) {
		this.yearList = yearList;
	}
	
}
