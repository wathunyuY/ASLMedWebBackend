package com.med.ws.dto.type.rs;

public class NationalityRsType {
	private Integer nationalityId;
	private String descr;
	private String descrEn;
	
	public Integer getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Integer nationalityId) {
		this.nationalityId = nationalityId;
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
}
