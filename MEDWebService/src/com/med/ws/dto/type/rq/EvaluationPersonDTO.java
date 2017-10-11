package com.med.ws.dto.type.rq;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EvaluationPersonDTO {
	Integer evaluationPersonId;
	Integer classTopicId;
	String classTopicName;
	String classSection;
	Integer sectionId;
	Integer scheduleTopicId;
	String groupDesc;
	String sectionOrder;
	Person evaluator;
	Person evaluated;
	Boolean activeFlag;
	Boolean newFlag;
	String evaluationId;
	Date startDate;
	Date endDate;

	public static class Person {
		Integer persId;
		String name;

		public Integer getPersId() {
			return persId;
		}

		public void setPersId(Integer persId) {
			this.persId = persId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public Integer getEvaluationPersonId() {
		return evaluationPersonId;
	}

	public void setEvaluationPersonId(Integer evaluationPersonId) {
		this.evaluationPersonId = evaluationPersonId;
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

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionOrder() {
		return sectionOrder;
	}

	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}

	public Person getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(Person evaluator) {
		this.evaluator = evaluator;
	}

	public Person getEvaluated() {
		return evaluated;
	}

	public void setEvaluated(Person evaluated) {
		this.evaluated = evaluated;
	}

	public Integer getScheduleTopicId() {
		return scheduleTopicId;
	}

	public void setScheduleTopicId(Integer scheduleTopicId) {
		this.scheduleTopicId = scheduleTopicId;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Boolean getNewFlag() {
		return newFlag;
	}

	public void setNewFlag(Boolean newFlag) {
		this.newFlag = newFlag;
	}

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public String getClassTopicName() {
		return classTopicName;
	}

	public void setClassTopicName(String classTopicName) {
		this.classTopicName = classTopicName;
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

}