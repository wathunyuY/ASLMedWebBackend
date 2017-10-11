package com.med.ws.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadDegrBean {

	private Integer acadDegrId;
	private String effdt;
	private String effStatus;
	private String descr;
	private String descrShort;
	private String descrEn;
	private String descrShortEn;
	
	public Integer getAcadDegrId() {
		return this.acadDegrId;
	}

	public void setAcadDegrId(Integer acadDegrId) {
		this.acadDegrId = acadDegrId;
	}
	
	public String getEffdt() {
		return this.effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	
	public String getEffStatus() {
		return this.effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	public String getDescrShort() {
		return this.descrShort;
	}

	public void setDescrShort(String descrShort) {
		this.descrShort = descrShort;
	}
	
	public String getDescrEn() {
		return this.descrEn;
	}

	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
	
	public String getDescrShortEn() {
		return this.descrShortEn;
	}

	public void setDescrShortEn(String descrShortEn) {
		this.descrShortEn = descrShortEn;
	}
	
//	public Date getLastUpdDttm() {
//		return this.lastUpdDttm;
//	}
//
//	public void setLastUpdDttm(Date lastUpdDttm) {
//		this.lastUpdDttm = lastUpdDttm;
//	}
//	
//	public Integer getLastUpdOprid() {
//		return this.lastUpdOprid;
//	}
//
//	public void setLastUpdOprid(Integer lastUpdOprid) {
//		this.lastUpdOprid = lastUpdOprid;
//	}
}
