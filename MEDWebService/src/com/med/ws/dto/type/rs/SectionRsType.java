package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.SectionBean;

public class SectionRsType {

	protected String classSection;
	protected String crseCode;
	protected String crseName;
	protected List<SectionBean> sectionBeanList;
	
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public List<SectionBean> getSectionBeanList() {
		return sectionBeanList;
	}
	public void setSectionBeanList(List<SectionBean> sectionBeanList) {
		this.sectionBeanList = sectionBeanList;
	}
	public String getCrseCode() {
		return crseCode;
	}
	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}
	public String getCrseName() {
		return crseName;
	}
	public void setCrseName(String crseName) {
		this.crseName = crseName;
	}
	
	
}
