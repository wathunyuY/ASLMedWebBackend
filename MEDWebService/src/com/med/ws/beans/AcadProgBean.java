package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadProgBean {
	protected Integer acadProgId;
	protected String effdt;
	protected String effStatus;
	protected String desc; //varchar(255)
	private String descEn; //varchar(255)
	private String descShort; //varchar(255)
	private String descShortEn; //varchar(45)
	private String startYear; //date
	private String endYear; //date
	private AcadCarBean acadCar;
	private AcadGroupBean acadGroup;
	protected List<AcadPlanBean> acadPlanList;
	protected List<SubjectTblBean> subjectTblList;
	
	public Integer getAcadProgId() {
		return acadProgId;
	}
	public void setAcadProgId(Integer acadProgId) {
		this.acadProgId = acadProgId;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getEffStatus() {
		return effStatus;
	}
	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<AcadPlanBean> getAcadPlanList() {
		return acadPlanList;
	}
	public void setAcadPlanList(List<AcadPlanBean> acadPlanList) {
		this.acadPlanList = acadPlanList;
	}
	public String getDescEn() {
		return descEn;
	}
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}
	public String getDescShort() {
		return descShort;
	}
	public void setDescShort(String descShort) {
		this.descShort = descShort;
	}
	public String getDescShortEn() {
		return descShortEn;
	}
	public void setDescShortEn(String descShortEn) {
		this.descShortEn = descShortEn;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public List<SubjectTblBean> getSubjectTblList() {
		return subjectTblList;
	}
	public void setSubjectTblList(List<SubjectTblBean> subjectTblList) {
		this.subjectTblList = subjectTblList;
	}
	public AcadCarBean getAcadCar() {
		return acadCar;
	}
	public void setAcadCar(AcadCarBean acadCar) {
		this.acadCar = acadCar;
	}
	public AcadGroupBean getAcadGroup() {
		return acadGroup;
	}
	public void setAcadGroup(AcadGroupBean acadGroup) {
		this.acadGroup = acadGroup;
	}
	
}
