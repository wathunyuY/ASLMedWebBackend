package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadCampusBean {
	private Integer id;
	private String effdt;
	private String effStatus;
	private Integer acadInstId;
	private String desc; //varchar(255)
	private String descShort; //varchar(45)
	private String descEn; //varchar(255)
	private String descShortEn; //varchar(45)
	private List<Integer> yearList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getEffStatus() {
		return effStatus;
	}
	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	public Integer getAcadInstId() {
		return acadInstId;
	}
	public void setAcadInstId(Integer acadInstId) {
		this.acadInstId = acadInstId;
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
	public List<Integer> getYearList() {
		return yearList;
	}
	public void setYearList(List<Integer> yearList) {
		this.yearList = yearList;
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
	
}
