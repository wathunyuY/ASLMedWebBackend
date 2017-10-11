package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

public class OccupiedPersonRsType {
	
	List<OccupiedStdntGroup> stdntTab;
	List<OccupiedTeacherGroup> teacherTab;
	public List<OccupiedStdntGroup> getStdntTab() {
		return stdntTab;
	}
	public void setStdntTab(List<OccupiedStdntGroup> stdntTab) {
		this.stdntTab = stdntTab;
	}
	public List<OccupiedTeacherGroup> getTeacherTab() {
		return teacherTab;
	}
	public void setTeacherTab(List<OccupiedTeacherGroup> teacherTab) {
		this.teacherTab = teacherTab;
	}
	
	public static class OccupiedStdntGroup{
		OccupiedScheduleDetail schedule;
		List<SearchStdntRsType> stdntList;
		public OccupiedScheduleDetail getSchedule() {
			return schedule;
		}
		public void setSchedule(OccupiedScheduleDetail schedule) {
			this.schedule = schedule;
		}
		public List<SearchStdntRsType> getStdntList() {
			return stdntList;
		}
		public void setStdntList(List<SearchStdntRsType> stdntList) {
			this.stdntList = stdntList;
		}
		
	}
	public static class OccupiedTeacherGroup{
		OccupiedScheduleDetail schedule;
		List<SearchPersonalRsType> teacherList;
		public OccupiedScheduleDetail getSchedule() {
			return schedule;
		}
		public void setSchedule(OccupiedScheduleDetail schedule) {
			this.schedule = schedule;
		}
		public List<SearchPersonalRsType> getTeacherList() {
			return teacherList;
		}
		public void setTeacherList(List<SearchPersonalRsType> teacherList) {
			this.teacherList = teacherList;
		}
		
	}
	public static class OccupiedScheduleDetail{
		Integer scheduleId;
		Date date;
		Date startTime;
		Date endTime;
		String descr;
		public Integer getScheduleId() {
			return scheduleId;
		}
		public void setScheduleId(Integer scheduleId) {
			this.scheduleId = scheduleId;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
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
		public String getDescr() {
			return descr;
		}
		public void setDescr(String descr) {
			this.descr = descr;
		}
	}
}
