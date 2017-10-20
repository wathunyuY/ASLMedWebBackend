package com.med.ods.criteria.bean;

import java.util.Date;

public class ResearchSearchRqType {
	private String symbol;
	private Integer category;
	private String analyst;
	private String startDate;
	private String endDate;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public String getAnalyst() {
		return analyst;
	}
	public void setAnalyst(String analyst) {
		this.analyst = analyst;
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
}
