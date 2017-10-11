package com.med.ws.beans;

import java.util.Date;
import java.util.List;

public class ScheduleTableBean {

	 protected String title;
     protected Date startTime;
     protected Date endTime;
     protected String code;
     protected Integer hour;
     protected Integer minute;
     protected Boolean allDay;
     protected String topicName;
     protected Integer scheduleTopicId;
     protected String topicType;
     protected Integer filterFlag;
     protected String colorTopicCode;
     protected String colorClassSectionCode;
     protected Boolean Owner;
     protected List<HandoutDocumentBean> document;
     
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Boolean getAllDay() {
		return allDay;
	}
	public void setAllDay(Boolean allDay) {
		this.allDay = allDay;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Integer getScheduleTopicId() {
		return scheduleTopicId;
	}
	public void setScheduleTopicId(Integer scheduleTopicId) {
		this.scheduleTopicId = scheduleTopicId;
	}
	public String getTopicType() {
		return topicType;
	}
	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Integer getMinute() {
		return minute;
	}
	public void setMinute(Integer minute) {
		this.minute = minute;
	}
	public Integer getFilterFlag() {
		return filterFlag;
	}
	public void setFilterFlag(Integer filterFlag) {
		this.filterFlag = filterFlag;
	}
	public String getColorTopicCode() {
		return colorTopicCode;
	}
	public void setColorTopicCode(String colorTopicCode) {
		this.colorTopicCode = colorTopicCode;
	}
	public String getColorClassSectionCode() {
		return colorClassSectionCode;
	}
	public void setColorClassSectionCode(String colorClassSectionCode) {
		this.colorClassSectionCode = colorClassSectionCode;
	}
	public Boolean getOwner() {
		return Owner;
	}
	public void setOwner(Boolean owner) {
		Owner = owner;
	}
	
	public List<HandoutDocumentBean> getDocument() {
		return document;
	}
	public void setDocument(List<HandoutDocumentBean> document) {
		this.document = document;
	}

	public static class HandoutDocumentBean {
		 protected String title;
		 protected String descrshort;
		 protected String link;
		 
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public String getDescrshort() {
			return descrshort;
		}
		public void setDescrshort(String descrshort) {
			this.descrshort = descrshort;
		}
		public String getLink() {
			return link;
		}
		public void setLink(String link) {
			this.link = link;
		}
	}

}
