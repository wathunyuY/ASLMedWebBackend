package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.ScheduleTopicTmplBean;

public class SchedulTopicTmplRsType {
	
	protected Integer sectionId;
	protected String classSection;
	protected List<ScheduleTopicTmplBean> scheduleTopicTmplBeanList;
	
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
	public List<ScheduleTopicTmplBean> getScheduleTopicTmplBeanList() {
		return scheduleTopicTmplBeanList;
	}
	public void setScheduleTopicTmplBeanList(List<ScheduleTopicTmplBean> scheduleTopicTmplBeanList) {
		this.scheduleTopicTmplBeanList = scheduleTopicTmplBeanList;
	}
	
	
}
