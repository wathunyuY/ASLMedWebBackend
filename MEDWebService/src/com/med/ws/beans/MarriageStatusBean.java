package com.med.ws.beans;

public class MarriageStatusBean {

	private Integer marriageStatusId;
	private String desc;
	private String descrEn;
	private boolean flagMarried;
	public Integer getMarriageStatusId() {
		return marriageStatusId;
	}
	public void setMarriageStatusId(Integer marriageStatusId) {
		this.marriageStatusId = marriageStatusId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean getFlagMarried(){
		return this.flagMarried;
	}
	public void setFlagMarried(boolean flagMarried){
		this.flagMarried = flagMarried;
	}
	public String getDescrEn() {
		return this.descrEn;
	}

	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
}
