package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadCarBean;
import com.med.ws.beans.HolidayBean;

public class CalendarMasterDataRsType {
	private List<AcadCarBean> acadCarList;
	private List<HolidayBean> date;
	public List<AcadCarBean> getAcadCarList() {
		return acadCarList;
	}
	public void setAcadCarList(List<AcadCarBean> acadCarList) {
		this.acadCarList = acadCarList;
	}
	public List<HolidayBean> getDate() {
		return date;
	}
	public void setDate(List<HolidayBean> list) {
		this.date = list;
	}
}
