package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.CalendarBean;

public class SelectCrseCatalogType {

	private Integer taskId;
	private String taskStatus;
	private CalendarBean calendar;
	private List<YearGroup> yearList;
	
	public Integer getTaskId() {
		return taskId;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public CalendarBean getCalendar() {
		return calendar;
	}

	public void setCalendar(CalendarBean calendar) {
		this.calendar = calendar;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public List<YearGroup> getYearList() {
		return yearList;
	}

	public void setYearList(List<YearGroup> yearList) {
		this.yearList = yearList;
	}

	public static class YearGroup{
		private Integer year;
		private List<CourseListRsType> courseList;
		public Integer getYear() {
			return year;
		}
		public void setYear(Integer year) {
			this.year = year;
		}
		public List<CourseListRsType> getCourseList() {
			return courseList;
		}
		public void setCourseList(List<CourseListRsType> courseList) {
			this.courseList = courseList;
		}
		
	}

}
