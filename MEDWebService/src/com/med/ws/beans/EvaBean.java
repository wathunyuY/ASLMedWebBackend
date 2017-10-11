package com.med.ws.beans;

import java.util.List;

public class EvaBean {
	private Integer evaId;
//	private EvaActionTypeBean evaActionType;
	private SearchStdntBean evaluated;
	private String descr;
	private String descrEn;
	private String title;
	private String titleEn;
	private Boolean isTmpl;
	private List<EvaQnaSectionBean> evaQnaSections;
	private PatientInfoBean patientInformation;
	public Integer getEvaId() {
		return evaId;
	}
	public void setEvaId(Integer evaId) {
		this.evaId = evaId;
	}
	public SearchStdntBean getEvaluated() {
		return evaluated;
	}
	public void setEvaluated(SearchStdntBean evaluated) {
		this.evaluated = evaluated;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleEn() {
		return titleEn;
	}
	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}
	public Boolean getIsTmpl() {
		return isTmpl;
	}
	public void setIsTmpl(Boolean isTmpl) {
		this.isTmpl = isTmpl;
	}
	public List<EvaQnaSectionBean> getEvaQnaSections() {
		return evaQnaSections;
	}
	public void setEvaQnaSections(List<EvaQnaSectionBean> evaQnaSections) {
		this.evaQnaSections = evaQnaSections;
	}
	public PatientInfoBean getPatientInformation() {
		return patientInformation;
	}
	public void setPatientInformation(PatientInfoBean patientInformation) {
		this.patientInformation = patientInformation;
	}
	
	
}
