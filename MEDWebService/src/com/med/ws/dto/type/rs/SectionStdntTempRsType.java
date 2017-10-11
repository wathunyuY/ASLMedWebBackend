package com.med.ws.dto.type.rs;

public class SectionStdntTempRsType {
	
	protected String fullName;
	protected String stdntCode;
	protected float stdntGpa;
	protected String sectionTblOrder;
	protected String className;
	protected Integer persId;
	protected String classSection;
	protected Integer sectionId;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	public float getStdntGpa() {
		return stdntGpa;
	}
	public void setStdntGpa(float stdntGpa) {
		this.stdntGpa = stdntGpa;
	}

	public String getSectionTblOrder() {
		return sectionTblOrder;
	}
	public void setSectionTblOrder(String sectionTblOrder) {
		this.sectionTblOrder = sectionTblOrder;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	
}
