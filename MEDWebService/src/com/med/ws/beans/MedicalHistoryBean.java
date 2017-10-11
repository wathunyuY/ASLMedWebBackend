package com.med.ws.beans;

public class MedicalHistoryBean {

	protected Integer medicalHistoryId;
	protected String descr;
	protected String location;
	protected Integer cureYear;
	
	public Integer getMedicalHistoryId() {
		return medicalHistoryId;
	}
	public void setMedicalHistoryId(Integer medicalHistoryId) {
		this.medicalHistoryId = medicalHistoryId;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getCureYear() {
		return cureYear;
	}
	public void setCureYear(Integer cureYear) {
		this.cureYear = cureYear;
	}
	
	
}
