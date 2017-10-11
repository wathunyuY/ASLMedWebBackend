package com.med.ws.beans;

import java.util.List;
import java.util.Map;

import com.med.ws.beans.TQFSectionFiveBean.TeachPlan;

public class TQFSectionThreeBean {
	private String crseDescr;
	private String crseDescrEn;
	private String hoursOfAdvisor;
	private Integer lectureHour;
	private Integer operationHour;
	private Integer selfLearningHour;
	private Map<String, String> learningHour;
	public String getCrseDescr() {
		return crseDescr;
	}
	public void setCrseDescr(String crseDescr) {
		this.crseDescr = crseDescr;
	}
	public String getHoursOfAdvisor() {
		return hoursOfAdvisor;
	}
	public void setHoursOfAdvisor(String hoursOfAdvisor) {
		this.hoursOfAdvisor = hoursOfAdvisor;
	}
	public String getCrseDescrEn() {
		return crseDescrEn;
	}
	public void setCrseDescrEn(String crseDescrEn) {
		this.crseDescrEn = crseDescrEn;
	}
	public Integer getLectureHour() {
		return lectureHour;
	}
	public void setLectureHour(Integer lectureHour) {
		this.lectureHour = lectureHour;
	}
	public Integer getOperationHour() {
		return operationHour;
	}
	public void setOperationHour(Integer operationHour) {
		this.operationHour = operationHour;
	}
	public Integer getSelfLearningHour() {
		return selfLearningHour;
	}
	public void setSelfLearningHour(Integer selfLearningHour) {
		this.selfLearningHour = selfLearningHour;
	}
	public Map<String, String> getLearningHour() {
		return learningHour;
	}
	public void setLearningHour(Map<String, String> learningHour) {
		this.learningHour = learningHour;
	}
	

}
