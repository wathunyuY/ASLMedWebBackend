package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.RoomBean;
import com.med.ws.dto.type.rq.EvaluationDTO;

public class ClassTopicRsType implements Cloneable {

	private Integer classTopicId;
	private String classSection;
	private String catalogNbr;
	private Integer topicOrder;
	private String topicName;
	private Integer topicHour;
	private Integer topicMinute;
	private String topicObjective;
	private String topicContent;
	private Boolean haveTmpl;
	private String descrOrder;
	private Integer sequence;
	private Boolean ignoreTeacher;
	// private List<ClassTopicTmplsBean> classTopicTmplsList;
	private ScheduleClassTopic scheduleClassTopic;

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
//	public ClassTopicRsType() {
//		
//	}
//	
//	public ClassTopicRsType(ClassTopicRsType another) {
//		this.classTopicId = another.getClassTopicId();
//	}

	public String getCatalogNbr() {
		return catalogNbr;
	}

	public void setCatalogNbr(String catalogNbr) {
		this.catalogNbr = catalogNbr;
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

	public String getTopicObjective() {
		return topicObjective;
	}

	public void setTopicObjective(String topicObjective) {
		this.topicObjective = topicObjective;
	}

	public String getTopicContent() {
		return topicContent;
	}

	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}

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

	public Boolean getHaveTmpl() {
		return haveTmpl;
	}

	public void setHaveTmpl(Boolean haveTmpl) {
		this.haveTmpl = haveTmpl;
	}

	public String getDescrOrder() {
		return descrOrder;
	}

	public void setDescrOrder(String descrOrder) {
		this.descrOrder = descrOrder;
	}

	// public List<ClassTopicTmplsBean> getClassTopicTmplsList() {
	// return classTopicTmplsList;
	// }
	//
	// public void setClassTopicTmplsList(List<ClassTopicTmplsBean>
	// classTopicTmplsList) {
	// this.classTopicTmplsList = classTopicTmplsList;
	// }

	public ScheduleClassTopic getScheduleClassTopic() {
		return scheduleClassTopic;
	}

	public void setScheduleClassTopic(ScheduleClassTopic scheduleClassTopic) {
		this.scheduleClassTopic = scheduleClassTopic;
	}

	public Integer getSequence() {
		return sequence;
	}

	public Boolean getIgnoreTeacher() {
		return ignoreTeacher;
	}

	public void setIgnoreTeacher(Boolean ignoreTeacher) {
		this.ignoreTeacher = ignoreTeacher;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public static class ScheduleClassTopic {
		private Integer classTopicTmplId;
//		private Integer scheduleTopicId;
		private Date date;
		private Integer weekId;
		private Long startTime;
		private Long endTime;
		private Integer dayId;
		private Boolean groupFlag;
		private List<SearchPersonalRsType> teachers;
		private Integer order;

		public Integer getClassTopicTmplId() {
			return classTopicTmplId;
		}

		public void setClassTopicTmplId(Integer classTopicTmplId) {
			this.classTopicTmplId = classTopicTmplId;
		}

		public Integer getDayId() {
			return dayId;
		}

		public void setDayId(Integer dayId) {
			this.dayId = dayId;
		}

		public Long getStartTime() {
			return startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Boolean getGroupFlag() {
			return groupFlag;
		}

		public void setGroupFlag(Boolean groupFlag) {
			this.groupFlag = groupFlag;
		}

		public List<SearchPersonalRsType> getTeachers() {
			return teachers;
		}

		public void setTeachers(List<SearchPersonalRsType> teachers) {
			this.teachers = teachers;
		}

		public Integer getOrder() {
			return order;
		}

		public void setOrder(Integer order) {
			this.order = order;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Integer getWeekId() {
			return weekId;
		}

		public void setWeekId(Integer weekId) {
			this.weekId = weekId;
		}

	}

	public Integer getTopicMinute() {
		return topicMinute;
	}

	public void setTopicMinute(Integer topicMinute) {
		this.topicMinute = topicMinute;
	}

}
