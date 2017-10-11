package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AcadPlanBean {
	private Integer acadPlanId;
	private String effdt;
	private String desc;
	private String descEn;
	private Integer duration;
	private LvlGroupBean lvlGroup;
	private List<AcadCampusBean> acadCampusList;
	private AcadDegrBean acadDegr;
	private boolean isDegrMain;
	private String effStatus;
	private AcadProgBean acadProg;
	public Integer getAcadPlanId() {
		return acadPlanId;
	}
	public void setAcadPlanId(Integer acadPlanId) {
		this.acadPlanId = acadPlanId;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getDescEn() {
		return descEn;
	}
	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}
	public LvlGroupBean getLvlGroup() {
		return lvlGroup;
	}
	public void setLvlGroup(LvlGroupBean lvlGroup) {
		this.lvlGroup = lvlGroup;
	}
	public String getEffStatus() {
		return effStatus;
	}
	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
	public AcadProgBean getAcadProg() {
		return acadProg;
	}
	public void setAcadProg(AcadProgBean acadProg) {
		this.acadProg = acadProg;
	}
	public AcadDegrBean getAcadDegr() {
		return acadDegr;
	}
	public void setAcadDegr(AcadDegrBean acadDegr) {
		this.acadDegr = acadDegr;
	}
	
	public List<AcadCampusBean> getAcadCampusList() {
		return acadCampusList;
	}
	public void setAcadCampusList(List<AcadCampusBean> acadCampusList) {
		this.acadCampusList = acadCampusList;
	}
	public boolean getIsDegrMain() {
		return isDegrMain;
	}
	public void setIsDegrMain(boolean isDegrMain) {
		this.isDegrMain = isDegrMain;
	}
	
	
	
	
}
