package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.SectionGroupBean;

public class StdntClinicGroupSectionBean {

	protected String className;
	protected Integer totalSection;
	protected List<SectionGroupBean> sectionGroupList;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Integer getTotalSection() {
		return totalSection;
	}
	public void setTotalSection(Integer totalSection) {
		this.totalSection = totalSection;
	}
	public List<SectionGroupBean> getSectionGroupList() {
		return sectionGroupList;
	}
	public void setSectionGroupList(List<SectionGroupBean> sectionGroupList) {
		this.sectionGroupList = sectionGroupList;
	}
	
	
	
}
