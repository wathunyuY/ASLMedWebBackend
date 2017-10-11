package com.med.ws.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadCarBean {
	private Integer acadCarId;
	private String effdt;
	private String desc;
	private String descEn;//varchar(255)
	private String descShort; //varchar(255)
	private String descShortEn; //varchar(45)
	private String effStatus; //varchar(45)
	public Integer getAcadCarId() {
		return acadCarId;
	}
	public void setAcadCarId(Integer acadCarId) {
		this.acadCarId = acadCarId;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDescShort() {
		return descShort;
	}
	public void setDescShort(String descShort) {
		this.descShort = descShort;
	}
	public String getDescEn() {
		return descEn;
	}
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}
	public String getDescShortEn() {
		return descShortEn;
	}
	public void setDescShortEn(String descShortEn) {
		this.descShortEn = descShortEn;
	}
	public String getEffStatus() {
		return effStatus;
	}
	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	
}
