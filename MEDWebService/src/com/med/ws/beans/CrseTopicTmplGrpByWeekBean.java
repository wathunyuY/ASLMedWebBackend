package com.med.ws.beans;

import java.util.Date;
import java.util.List;

public class CrseTopicTmplGrpByWeekBean {
	Integer week;
	List<DayTmpl> day;
	
	public Integer getWeek() {
		return week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	public List<DayTmpl> getDay() {
		return day;
	}

	public void setDay(List<DayTmpl> day) {
		this.day = day;
	}

	public static class DayTmpl{
		Integer dayId;
		String day;
		List<CrseTopicDetail> topics;
		public Integer getDayId() {
			return dayId;
		}
		public void setDayId(Integer dayId) {
			this.dayId = dayId;
		}
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public List<CrseTopicDetail> getTopics() {
			return topics;
		}
		public void setTopics(List<CrseTopicDetail> topics) {
			this.topics = topics;
		}
		
	}
	
	public static class CrseTopicDetail {
		Integer topicTmplId;
		String title;
		String descr;
		Integer hour;
		Integer minute;
		Date startTime;
		Date endTime;
		Boolean groupFlag;
		public Integer getTopicTmplId() {
			return topicTmplId;
		}
		public void setTopicTmplId(Integer topicTmplId) {
			this.topicTmplId = topicTmplId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescr() {
			return descr;
		}
		public void setDescr(String descr) {
			this.descr = descr;
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
		public Boolean getGroupFlag() {
			return groupFlag;
		}
		public void setGroupFlag(Boolean groupFlag) {
			this.groupFlag = groupFlag;
		}
		
	}
}
