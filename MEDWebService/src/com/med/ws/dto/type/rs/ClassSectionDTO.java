package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.SectionBean;

@JsonInclude(Include.NON_NULL)
public class ClassSectionDTO {
	String classSection;
	String classTitle;
	String crseCode;
	Integer sectionId;
	List<SectionBean> sections;
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getClassTitle() {
		return classTitle;
	}
	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}
	public String getCrseCode() {
		return crseCode;
	}
	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public List<SectionBean> getSections() {
		return sections;
	}
	public void setSections(List<SectionBean> sections) {
		this.sections = sections;
	}
}
