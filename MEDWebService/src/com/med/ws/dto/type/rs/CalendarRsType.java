package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadCarBean;
import com.med.ws.beans.AgendaTblBean;
import com.med.ws.beans.HolidayBean;
import com.med.ws.beans.TermTblBean;

public class CalendarRsType {
	private Integer calendarId;
	private String calendarTitle;
	private String calendarTitleEn;
	private String calendarDescr;
	private String calendarDescrEn;
	private String status;
	private AcadCarBean acadCar;
	private AcadCampusBean acadCampus;
	private List<TermTblBean> term;
	private List<HolidayBean> holidays;
	private List<AgendaTblBean> agendas;
	public Integer getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Integer calendarId) {
		this.calendarId = calendarId;
	}
	public String getCalendarTitle() {
		return calendarTitle;
	}
	public void setCalendarTitle(String calendarTitle) {
		this.calendarTitle = calendarTitle;
	}
	public String getCalendarDescr() {
		return calendarDescr;
	}
	public void setCalendarDescr(String calendarDescr) {
		this.calendarDescr = calendarDescr;
	}
	public List<TermTblBean> getTerm() {
		return term;
	}
	public void setTerm(List<TermTblBean> term) {
		this.term = term;
	}
	public List<HolidayBean> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<HolidayBean> holidays) {
		this.holidays = holidays;
	}
	public List<AgendaTblBean> getAgendas() {
		return agendas;
	}
	public void setAgendas(List<AgendaTblBean> agendas) {
		this.agendas = agendas;
	}
	public AcadCarBean getAcadCar() {
		return acadCar;
	}
	public void setAcadCar(AcadCarBean acadCar) {
		this.acadCar = acadCar;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCalendarTitleEn() {
		return calendarTitleEn;
	}
	public void setCalendarTitleEn(String calendarTitleEn) {
		this.calendarTitleEn = calendarTitleEn;
	}
	public String getCalendarDescrEn() {
		return calendarDescrEn;
	}
	public void setCalendarDescrEn(String calendarDescrEn) {
		this.calendarDescrEn = calendarDescrEn;
	}
	public AcadCampusBean getAcadCampus() {
		return acadCampus;
	}
	public void setAcadCampus(AcadCampusBean acadCampus) {
		this.acadCampus = acadCampus;
	}
	
}
