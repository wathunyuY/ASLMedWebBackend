package com.med.ws.dto.type.rs;

import java.util.Date;

public class CourseDetailListRsType {
	String acadProgDescr;
	String acadPlanDescr;
	String subjectDescr;
	String crseTitleLong;
	String crseId;
	Date effDt;
	
	public String getAcadProgDescr() {
		return acadProgDescr;
	}
	public void setAcadProgDescr(String acadProgDescr) {
		this.acadProgDescr = acadProgDescr;
	}
	public String getAcadPlanDescr() {
		return acadPlanDescr;
	}
	public void setAcadPlanDescr(String acadPlanDescr) {
		this.acadPlanDescr = acadPlanDescr;
	}
	public String getSubjectDescr() {
		return subjectDescr;
	}
	public void setSubjectDescr(String subjectDescr) {
		this.subjectDescr = subjectDescr;
	}
	public String getCrseTitleLong() {
		return crseTitleLong;
	}
	public void setCrseTitleLong(String crseTitleLong) {
		this.crseTitleLong = crseTitleLong;
	}
	public Date getEffDt() {
		return effDt;
	}
	public void setEffDt(Date effDt) {
		this.effDt = effDt;
	}
	public String getCrseId() {
		return crseId;
	}
	public void setCrseId(String string) {
		this.crseId = string;
	}
}
