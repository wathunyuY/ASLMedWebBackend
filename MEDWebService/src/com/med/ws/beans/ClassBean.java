package com.med.ws.beans;

import java.util.List;

public class ClassBean {
	// PK
	private Integer classCrseOfferNbr;
	private String classTermId;
	private Integer classAcadCarId;
	private String classSection;
	private String classCrseCatalogNbr;
	
	// Class Information
	private String start;
	private String end;
	private Boolean classEnroll;
	private List<SectionBean> sections;
	private Integer weekPerSec;
	
	private CrseBean classDetail;
	
	
	public Integer getClassCrseOfferNbr() {
		return classCrseOfferNbr;
	}

	public void setClassCrseOfferNbr(Integer classCrseOfferNbr) {
		this.classCrseOfferNbr = classCrseOfferNbr;
	}

	public String getClassTermId() {
		return classTermId;
	}

	public void setClassTermId(String classTermId) {
		this.classTermId = classTermId;
	}

	public Integer getClassAcadCarId() {
		return classAcadCarId;
	}

	public void setClassAcadCarId(Integer classAcadCarId) {
		this.classAcadCarId = classAcadCarId;
	}

	public String getClassCrseCatalogNbr() {
		return classCrseCatalogNbr;
	}

	public void setClassCrseCatalogNbr(String classCrseCatalogNbr) {
		this.classCrseCatalogNbr = classCrseCatalogNbr;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public Boolean getClassEnroll() {
		return classEnroll;
	}

	public void setClassEnroll(Boolean classEnroll) {
		this.classEnroll = classEnroll;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public CrseBean getClassDetail() {
		return classDetail;
	}

	public void setClassDetail(CrseBean classDetail) {
		this.classDetail = classDetail;
	}

	public List<SectionBean> getSections() {
		return sections;
	}

	public void setSections(List<SectionBean> sections) {
		this.sections = sections;
	}

	public Integer getWeekPerSec() {
		return weekPerSec;
	}

	public void setWeekPerSec(Integer weekPerSec) {
		this.weekPerSec = weekPerSec;
	}

}
