package com.med.ws.beans;

public class StdntScholarshipBean {

	protected Integer stdntScholarshipId;
	protected String title;
	protected String investor;
	protected Integer amount;
	protected Integer startYear;
	protected Integer endYear;
	
	public Integer getStdntScholarshipId() {
		return stdntScholarshipId;
	}
	public void setStdntScholarshipId(Integer stdntScholarshipId) {
		this.stdntScholarshipId = stdntScholarshipId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInvestor() {
		return investor;
	}
	public void setInvestor(String investor) {
		this.investor = investor;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getStartYear() {
		return startYear;
	}
	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}
	public Integer getEndYear() {
		return endYear;
	}
	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}
	
}
