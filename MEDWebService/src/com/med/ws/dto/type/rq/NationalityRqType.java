package com.med.ws.dto.type.rq;

public class NationalityRqType {
	private Integer nationalityId;
	private String descr; //varchar(45)
	private String descrEn; //varchar(45)
	
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
