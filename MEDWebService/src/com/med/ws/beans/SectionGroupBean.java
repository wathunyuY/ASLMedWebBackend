package com.med.ws.beans;

import java.util.Date;
import java.util.List;

public class SectionGroupBean {

	private Integer sectionId;
	private String classSection;
	private Integer classOfferWeek;
	private Date startDate;
	private Date endDate;
	private List<GroupBean> groupList;
	private Integer maxGroup;
	private Integer colspan;
	private String mapGroupName;
	private Integer position;
	private Boolean isDuplc;
	
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
	public List<GroupBean> getGroupList() {
		return groupList;
	}
	public void setGroupList(List<GroupBean> groupList) {
		this.groupList = groupList;
	}
	public Integer getMaxGroup() {
		return maxGroup;
	}
	public void setMaxGroup(Integer maxGroup) {
		this.maxGroup = maxGroup;
	}
	public Integer getColspan() {
		return colspan;
	}
	public void setColspan(Integer colspan) {
		this.colspan = colspan;
	}
	public String getMapGroupName() {
		return mapGroupName;
	}
	public void setMapGroupName(String mapGroupName) {
		this.mapGroupName = mapGroupName;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Boolean getIsDuplc() {
		return isDuplc;
	}
	public void setIsDuplc(Boolean isDuplc) {
		this.isDuplc = isDuplc;
	}
	
	
}
