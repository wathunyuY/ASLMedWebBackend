package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadOrgBean {
	private Integer acadOrgId;
	private String effdt;
	private String acadOrgCode; //varchar(45)
	private String status;
	private String desc; //varchar(255)
	private String descEn; //varchar(255)
	private String descShort; //varchar(45)
	private String descShortEn; //varchar(45)
	private AcadCampusBean acadCampus;
	private List<AcadDepartmentBean> acadDepartmentList;
	private List<Integer> deleteAcadDepartmentIdList;
	// use in CalendarService
	private Integer calendarGroupId;
	public Integer getAcadOrgId() {
		return acadOrgId;
	}
	public void setAcadOrgId(Integer acadOrgId) {
		this.acadOrgId = acadOrgId;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getAcadOrgCode() {
		return acadOrgCode;
	}
	public void setAcadOrgCode(String acadOrgCode) {
		this.acadOrgCode = acadOrgCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDescShort() {
		return descShort;
	}
	public void setDescShort(String descShort) {
		this.descShort = descShort;
	}
	public String getDescEn() {
		return descEn;
	}
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}
	public String getDescShortEn() {
		return descShortEn;
	}
	public void setDescShortEn(String descShortEn) {
		this.descShortEn = descShortEn;
	}
	public Integer getCalendarGroupId() {
		return calendarGroupId;
	}
	public void setCalendarGroupId(Integer calendarGroupId) {
		this.calendarGroupId = calendarGroupId;
	}
	public AcadCampusBean getAcadCampus() {
		return acadCampus;
	}
	public void setAcadCampus(AcadCampusBean acadCampus) {
		this.acadCampus = acadCampus;
	}
	public List<AcadDepartmentBean> getAcadDepartmentList() {
		return acadDepartmentList;
	}
	public void setAcadDepartmentList(List<AcadDepartmentBean> acadDepartmentList) {
		this.acadDepartmentList = acadDepartmentList;
	}
	public List<Integer> getDeleteAcadDepartmentIdList() {
		return deleteAcadDepartmentIdList;
	}
	public void setDeleteAcadDepartmentIdList(List<Integer> deleteAcadDepartmentIdList) {
		this.deleteAcadDepartmentIdList = deleteAcadDepartmentIdList;
	}
	
	
}
