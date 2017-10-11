package com.med.ws.beans;

public class PersEduGradBean {

	protected Integer persEduGradId;
	protected Integer highestGraduId ;
	protected AddrProvinceBean province;
	protected String eduGraduateDiploma;
	protected String eduAcademy;
	protected Integer gradFinishYear;
	protected EduLevelBean eduLevel;
	protected Float gradeGpa;
	
	public Integer getPersEduGradId() {
		return persEduGradId;
	}
	public void setPersEduGradId(Integer persEduGradId) {
		this.persEduGradId = persEduGradId;
	}
	public Integer getHighestGraduId() {
		return highestGraduId;
	}
	public void setHighestGraduId(Integer highestGraduId) {
		this.highestGraduId = highestGraduId;
	}
	public AddrProvinceBean getProvince() {
		return province;
	}
	public void setProvince(AddrProvinceBean province) {
		this.province = province;
	}
	public String getEduGraduateDiploma() {
		return eduGraduateDiploma;
	}
	public void setEduGraduateDiploma(String eduGraduateDiploma) {
		this.eduGraduateDiploma = eduGraduateDiploma;
	}
	public String getEduAcademy() {
		return eduAcademy;
	}
	public void setEduAcademy(String eduAcademy) {
		this.eduAcademy = eduAcademy;
	}
	public Integer getGradFinishYear() {
		return gradFinishYear;
	}
	public void setGradFinishYear(Integer gradFinishYear) {
		this.gradFinishYear = gradFinishYear;
	}
	public EduLevelBean getEduLevel() {
		return eduLevel;
	}
	public void setEduLevel(EduLevelBean eduLevel) {
		this.eduLevel = eduLevel;
	}

	public Float getGradeGpa() {
		return gradeGpa;
	}
	public void setGradeGpa(Float gradeGpa) {
		this.gradeGpa = gradeGpa;
	}
	
}
