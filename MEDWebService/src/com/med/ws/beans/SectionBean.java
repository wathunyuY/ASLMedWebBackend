package com.med.ws.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SectionBean {

	private Integer sectionId;
	private String classSection;
	private Integer classOfferWeek;
	private Date startDate;
	private Date endDate;
	private Boolean secMinor;
	private Integer secRootId;
	private String sectionOrder;
	private String descr;
	
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public Integer getClassOfferWeek() {
		return classOfferWeek;
	}
	public void setClassOfferWeek(Integer classOfferWeek) {
		this.classOfferWeek = classOfferWeek;
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
	public Boolean getSecMinor() {
		return secMinor;
	}
	public void setSecMinor(Boolean secMinor) {
		this.secMinor = secMinor;
	}
	public String getSectionOrder() {
		return sectionOrder;
	}
	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}
	public Integer getSecRootId() {
		return secRootId;
	}
	public void setSecRootId(Integer secRootId) {
		this.secRootId = secRootId;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	

}
