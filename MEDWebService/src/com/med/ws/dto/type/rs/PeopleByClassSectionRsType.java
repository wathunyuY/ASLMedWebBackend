package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.SectionBean;

public class PeopleByClassSectionRsType {
	Integer sectionId;
	String sectionNo;
	SectionPeople people;
	public static class SectionPeople{
		List<SearchPersonalRsType> teacherList;
		List<SearchStdntRsType> stdntList;
		public List<SearchPersonalRsType> getTeacherList() {
			return teacherList;
		}
		public void setTeacherList(List<SearchPersonalRsType> teacherList) {
			this.teacherList = teacherList;
		}
		public List<SearchStdntRsType> getStdntList() {
			return stdntList;
		}
		public void setStdntList(List<SearchStdntRsType> stdntList) {
			this.stdntList = stdntList;
		}
	}
	
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(String sectionNo) {
		this.sectionNo = sectionNo;
	}
	public SectionPeople getPeople() {
		return people;
	}
	public void setPeople(SectionPeople people) {
		this.people = people;
	}
	
}
