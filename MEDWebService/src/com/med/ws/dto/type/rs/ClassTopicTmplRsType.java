package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadProgBean;
import com.med.ws.dto.type.rq.EvaluationDTO;

public class ClassTopicTmplRsType {
	private Integer taskId;
	private String taskStatus;
	private String classSection;
	private String crseCode;
	private String crseTitle;
	private String subjectDescr;
	private Integer acadProgId;
	private String acadProgDescr;
	private String creditDetail;
	private Integer classWeek;
	private String section;
	private String tmplNbr;
	private List<ClassTopicRsType> classTopicRsList;
	private List<Integer> delClassTopicTmplList;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getCrseTitle() {
		return crseTitle;
	}
	public String getCrseCode() {
		return crseCode;
	}
	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}
	public void setCrseTitle(String crseTitle) {
		this.crseTitle = crseTitle;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public List<ClassTopicRsType> getClassTopicRsList() {
		return classTopicRsList;
	}
	public void setClassTopicRsList(List<ClassTopicRsType> classTopicRsList) {
		this.classTopicRsList = classTopicRsList;
	}
	public List<Integer> getDelClassTopicTmplList() {
		return delClassTopicTmplList;
	}
	public void setDelClassTopicTmplList(List<Integer> delClassTopicTmplList) {
		this.delClassTopicTmplList = delClassTopicTmplList;
	}
	public String getSubjectDescr() {
		return subjectDescr;
	}
	public void setSubjectDescr(String subjectDescr) {
		this.subjectDescr = subjectDescr;
	}
	public String getAcadProgDescr() {
		return acadProgDescr;
	}
	public void setAcadProgDescr(String acadProgDescr) {
		this.acadProgDescr = acadProgDescr;
	}
	public String getCreditDetail() {
		return creditDetail;
	}
	public void setCreditDetail(String creditDetail) {
		this.creditDetail = creditDetail;
	}
	public Integer getClassWeek() {
		return classWeek;
	}
	public void setClassWeek(Integer classWeek) {
		this.classWeek = classWeek;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTmplNbr() {
		return tmplNbr;
	}
	public void setTmplNbr(String tmplNbr) {
		this.tmplNbr = tmplNbr;
	}
	public Integer getAcadProgId() {
		return acadProgId;
	}
	public void setAcadProgId(Integer acadProgId) {
		this.acadProgId = acadProgId;
	}
}
