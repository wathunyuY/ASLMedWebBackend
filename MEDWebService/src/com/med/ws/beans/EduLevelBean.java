package com.med.ws.beans;

public class EduLevelBean {
	
	private Integer eduLvlId;
	private String desc;
	private String descShort;
	private String descrEn;
	private String descrShortEn;
	public Integer getEduLvlId() {
		return eduLvlId;
	}
	public void setEduLvlId(Integer eduLvlId) {
		this.eduLvlId = eduLvlId;
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
	public String getDescrEn() {
		return this.descrEn;
	}

	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
	public String getDescrShortEn() {
		return this.descrShortEn;
	}

	public void setDescrShortEn(String descrShortEn) {
		this.descrShortEn = descrShortEn;
	}
	
}
