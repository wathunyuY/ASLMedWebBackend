package com.med.ws.beans;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EventBean {
	private Integer id;
	private String title;
	private String titleEn;
	private String descr;
	private String descrEn;
	private String startDate;
	private String endDate;
	private AgendaTblBean agenda;
	private List<EmpResponsibleBean> empRespoList;
	private List<Integer> empRespoDelList;
	private List<ActivityBean> activities;
	private List<Integer> delActivities;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleEn() {
		return titleEn;
	}
	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDescrEn() {
		return descrEn;
	}
	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public AgendaTblBean getAgenda() {
		return agenda;
	}
	public void setAgenda(AgendaTblBean agenda) {
		this.agenda = agenda;
	}
	public List<EmpResponsibleBean> getEmpRespoList() {
		return empRespoList;
	}
	public void setEmpRespoList(List<EmpResponsibleBean> empRespoList) {
		this.empRespoList = empRespoList;
	}
	public List<ActivityBean> getActivities() {
		return activities;
	}
	public void setActivities(List<ActivityBean> activities) {
		this.activities = activities;
	}
	public List<Integer> getEmpRespoDelList() {
		return empRespoDelList;
	}
	public void setEmpRespoDelList(List<Integer> empRespoDelList) {
		this.empRespoDelList = empRespoDelList;
	}
	public List<Integer> getDelActivities() {
		return delActivities;
	}
	public void setDelActivities(List<Integer> delActivities) {
		this.delActivities = delActivities;
	}

	
}
