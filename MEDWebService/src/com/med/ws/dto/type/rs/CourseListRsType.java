package com.med.ws.dto.type.rs;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CourseListRsType {
	String acadProgDescr;
	String acadPlanDescr;
	String subjectDescr;
	String crseType;
	Integer crseLevel;
	String crseTitleLong;
	String crseId;
	Date effDt;
	Boolean status;
	Integer weeksPerSec;
	Integer sections;
	Boolean isMinor;
	
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
	public String getCrseType() {
		return crseType;
	}
	public void setCrseType(String crseType) {
		this.crseType = crseType;
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
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Integer getCrseLevel() {
		return crseLevel;
	}
	public void setCrseLevel(Integer crseLevel) {
		this.crseLevel = crseLevel;
	}
	public Integer getWeeksPerSec() {
		return weeksPerSec;
	}
	public void setWeeksPerSec(Integer weeksPerSec) {
		this.weeksPerSec = weeksPerSec;
	}
	public Integer getSections() {
		return sections;
	}
	public void setSections(Integer sections) {
		this.sections = sections;
	}
	public Boolean getIsMinor() {
		return isMinor;
	}
	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}
}
