package com.med.ws.dto.type.rq;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EvaluationPersonGroup {
	Integer scheduleId;
	String scheduleDesc;
	Integer classTopicId;
	String classTopicName;
	List<EvaluationPersonDTO> evaluationPerson;
	Date startDate;
	Date endDate;

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getScheduleDesc() {
		return scheduleDesc;
	}

	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}

	public List<EvaluationPersonDTO> getEvaluationPerson() {
		return evaluationPerson;
	}

	public void setEvaluationPerson(List<EvaluationPersonDTO> evaluationPerson) {
		this.evaluationPerson = evaluationPerson;
	}

	public Integer getClassTopicId() {
		return classTopicId;
	}

	public void setClassTopicId(Integer classTopicId) {
		this.classTopicId = classTopicId;
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