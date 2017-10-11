package com.med.ws.beans;

import java.util.List;

public class EvaQnaQuestionBean {
	private Integer evaQnaQuestionId;
	private String title;
	private String titleEn;
	private Integer answerTypeId;
//	private AnswerTypeBean answerType;
	private List<EvaQnaAnswerBean> evaQnaAnswers;
	private double maxValue; //max score of question
	public Integer getEvaQnaQuestionId() {
		return evaQnaQuestionId;
	}
	public void setEvaQnaQuestionId(Integer evaQnaQuestionId) {
		this.evaQnaQuestionId = evaQnaQuestionId;
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
	public Integer getAnswerTypeId() {
		return answerTypeId;
	}
	public void setAnswerTypeId(Integer answerTypeId) {
		this.answerTypeId = answerTypeId;
	}
	public List<EvaQnaAnswerBean> getEvaQnaAnswers() {
		return evaQnaAnswers;
	}
	public void setEvaQnaAnswers(List<EvaQnaAnswerBean> evaQnaAnswers) {
		this.evaQnaAnswers = evaQnaAnswers;
	}
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
	
	
}
