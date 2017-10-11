package com.med.ws.dto.type.rs;

import java.util.HashMap;
import java.util.List;

import com.med.ws.beans.ScheduleTableBean;

public class ScheduleTableRsType {

	protected List<ScheduleTableBean> sectionTableList;
	protected HashMap<String,HashMap<String,List<ScheduleTableBean>>> schedule;
	protected ScheduleTopicFilter filters;
	
	public List<ScheduleTableBean> getSectionTableList() {
		return sectionTableList;
	}
	public void setSectionTableList(List<ScheduleTableBean> sectionTableList) {
		this.sectionTableList = sectionTableList;
	}
	public HashMap<String, HashMap<String, List<ScheduleTableBean>>> getSchedule() {
		return schedule;
	}
	public void setSchedule(HashMap<String, HashMap<String, List<ScheduleTableBean>>> schedule) {
		this.schedule = schedule;
	}
	public ScheduleTopicFilter getFilters() {
		return filters;
	}
	public void setFilters(ScheduleTopicFilter filters) {
		this.filters = filters;
	}

	public static class ScheduleTopicFilter{
		protected FiltersBean privateSchedule;
		protected List<FiltersBean> otherSchedule;
		protected List<FiltersBean> filterSchedule;
		
		public FiltersBean getPrivateSchedule() {
			return privateSchedule;
		}
		public void setPrivateSchedule(FiltersBean privateSchedule) {
			this.privateSchedule = privateSchedule;
		}
		public List<FiltersBean> getOtherSchedule() {
			return otherSchedule;
		}
		public void setOtherSchedule(List<FiltersBean> otherSchedule) {
			this.otherSchedule = otherSchedule;
		}
		public List<FiltersBean> getFilterSchedule() {
			return filterSchedule;
		}
		public void setFilterSchedule(List<FiltersBean> filterSchedule) {
			this.filterSchedule = filterSchedule;
		}
		
		
	}
	public static class FiltersBean{
		protected String id;
		protected String desc;
		protected String color;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		
	}
}
