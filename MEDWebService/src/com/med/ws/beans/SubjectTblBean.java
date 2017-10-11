package com.med.ws.beans;

public class SubjectTblBean {
	private Integer id;
	private String effdt;
	private String effStatus;
	private String desc;
	private String descShort;
	private Integer minCredit;
	private String selectiveType;
//	private AcadOrgBean acadOrg;
	private AcadProgBean acadProg;
	public Integer getId() {
		return id;
	}
	public void setId(Integer integer) {
		this.id = integer;
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
	public String getDescShort() {
		return descShort;
	}
	public void setDescShort(String descShort) {
		this.descShort = descShort;
	}
	public String getEffStatus() {
		return effStatus;
	}
	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}
//	public AcadOrgBean getAcadOrg() {
//		return acadOrg;
//	}
//	public void setAcadOrg(AcadOrgBean acadOrg) {
//		this.acadOrg = acadOrg;
//	}
	public AcadProgBean getAcadProg() {
		return acadProg;
	}
	public void setAcadProg(AcadProgBean acadProg) {
		this.acadProg = acadProg;
	}
	public Integer getMinCredit() {
		return minCredit;
	}
	public void setMinCredit(Integer minCredit) {
		this.minCredit = minCredit;
	}
	public String getSelectiveType() {
		return selectiveType;
	}
	public void setSelectiveType(String selectiveType) {
		this.selectiveType = selectiveType;
	}
	
}
