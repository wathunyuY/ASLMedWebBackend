package com.med.ws.beans;

import java.util.Date;

public class SectionPeriodBean implements Cloneable{

	protected String name;
	protected Date maxDate;
	protected Date minDate;
	protected Date startDate;
	protected Date endDate;
	protected Integer classWeek;
	protected Integer maxSection;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}
	public Date getMinDate() {
		return minDate;
	}
	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getClassWeek() {
		return classWeek;
	}
	public void setClassWeek(Integer classWeek) {
		this.classWeek = classWeek;
	}
	public Integer getMaxSection() {
		return maxSection;
	}
	public void setMaxSection(Integer maxSection) {
		this.maxSection = maxSection;
	}
	public SectionPeriodBean clone()throws CloneNotSupportedException{  
		return (SectionPeriodBean)super.clone();  
		}  
	
}
