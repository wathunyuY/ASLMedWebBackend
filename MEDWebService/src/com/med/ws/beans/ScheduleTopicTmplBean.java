package com.med.ws.beans;

import java.util.Date;
import java.util.List;

public class ScheduleTopicTmplBean {

	
	protected Integer classTopicId;
	protected String classSection;
	protected Integer topicOrder;
	protected String topicName;
	protected Integer topicHour;
	protected Integer topicMinute;
	protected Integer dayId;
	protected Date studyDate;
	protected Date startTime;
	protected Date endTime;
	protected Boolean groupFlag;
	protected Boolean stdntFlag;
	protected Boolean allFlag;
	protected Integer classWeekId;
	protected List<String> empCodeList;
	
	public Integer getClassTopicId() {
		return classTopicId;
	}
	public void setClassTopicId(Integer classTopicId) {
		this.classTopicId = classTopicId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public Integer getTopicOrder() {
		return topicOrder;
	}
	public void setTopicOrder(Integer topicOrder) {
		this.topicOrder = topicOrder;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Integer getTopicHour() {
		return topicHour;
	}
	public void setTopicHour(Integer topicHour) {
		this.topicHour = topicHour;
	}
	public Integer getDayId() {
		return dayId;
	}
	public void setDayId(Integer dayId) {
		this.dayId = dayId;
	}
	
	public Date getStudyDate() {
		return studyDate;
	}
	public void setStudyDate(Date studyDate) {
		this.studyDate = studyDate;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public ScheduleTopicTmplBean clone() throws CloneNotSupportedException {
        return (ScheduleTopicTmplBean) super.clone();
    }
	public Boolean getGroupFlag() {
		return groupFlag;
	}
	public void setGroupFlag(Boolean groupFlag) {
		this.groupFlag = groupFlag;
	}
	public Boolean getStdntFlag() {
		return stdntFlag;
	}
	public void setStdntFlag(Boolean stdntFlag) {
		this.stdntFlag = stdntFlag;
	}
	public Boolean getAllFlag() {
		return allFlag;
	}
	public void setAllFlag(Boolean allFlag) {
		this.allFlag = allFlag;
	}
	public Integer getClassWeekId() {
		return classWeekId;
	}
	public void setClassWeekId(Integer classWeekId) {
		this.classWeekId = classWeekId;
	}
	public List<String> getEmpCodeList() {
		return empCodeList;
	}
	public void setEmpCodeList(List<String> empCodeList) {
		this.empCodeList = empCodeList;
	}
	public Integer getTopicMinute() {
		return topicMinute;
	}
	public void setTopicMinute(Integer topicMinute) {
		this.topicMinute = topicMinute;
	}
	
	
}
