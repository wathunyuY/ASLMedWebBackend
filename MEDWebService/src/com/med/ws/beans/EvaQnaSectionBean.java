package com.med.ws.beans;

import java.util.List;

public class EvaQnaSectionBean {
	private Integer evaQnaSectionId;
	private Double value;
	private String descr;
	private String descrEn;
	private Boolean haveRemark;
	private String titleRemark;
	
	private String answerRemark;
	
	private List<EvaQnaQuestionBean> evaQnaQuestions;

	public Integer getEvaQnaSectionId() {
		return evaQnaSectionId;
	}

	public void setEvaQnaSectionId(Integer evaQnaSectionId) {
		this.evaQnaSectionId = evaQnaSectionId;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
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

	public Boolean getHaveRemark() {
		return haveRemark;
	}

	public void setHaveRemark(Boolean haveRemark) {
		this.haveRemark = haveRemark;
	}

	public String getTitleRemark() {
		return titleRemark;
	}

	public void setTitleRemark(String titleRemark) {
		this.titleRemark = titleRemark;
	}

	public List<EvaQnaQuestionBean> getEvaQnaQuestions() {
		return evaQnaQuestions;
	}

	public void setEvaQnaQuestions(List<EvaQnaQuestionBean> evaQnaQuestions) {
		this.evaQnaQuestions = evaQnaQuestions;
	}

	public String getAnswerRemark() {
		return answerRemark;
	}

	public void setAnswerRemark(String answerRemark) {
		this.answerRemark = answerRemark;
	}
	
}
