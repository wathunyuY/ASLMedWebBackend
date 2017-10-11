package com.med.ws.beans;

import java.util.List;

public class TermTblBean {
	private String termId;
	private Integer acadCarId;
	private String order;
	private String desc;
	private String descEn;
	private String startDate;
	private String endDate;
	private Integer acadYear;
	private Integer stdntLevel;
	private List<ClassBean> classList;
	
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public Integer getAcadCarId() {
		return acadCarId;
	}
	public void setAcadCarId(Integer acadCarId) {
		this.acadCarId = acadCarId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDescEn() {
		return descEn;
	}
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Integer getAcadYear() {
		return acadYear;
	}
	public void setAcadYear(Integer acadYear) {
		this.acadYear = acadYear;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public List<ClassBean> getClassList() {
		return classList;
	}
	public void setClassList(List<ClassBean> classList) {
		this.classList = classList;
	}
	public Integer getStdntLevel() {
		return stdntLevel;
	}
	public void setStdntLevel(Integer stdntLevel) {
		this.stdntLevel = stdntLevel;
	}
	
	
}
