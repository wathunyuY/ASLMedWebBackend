package com.med.ws.beans;

public class ScoreBean {
	private Integer scoreTypeId;
	private String scoreTypeTitle; //varchar(150)
	private float scoreValue;
	private float minScore;
	private float maxScore;
	
	public Integer getScoreTypeId() {
		return scoreTypeId;
	}
	public void setScoreTypeId(Integer scoreTypeId) {
		this.scoreTypeId = scoreTypeId;
	}
	public String getScoreTypeTitle() {
		return scoreTypeTitle;
	}
	public void setScoreTypeTitle(String scoreTypeTitle) {
		this.scoreTypeTitle = scoreTypeTitle;
	}
	public float getScoreValue() {
		return scoreValue;
	}
	public void setScoreValue(float scoreValue) {
		this.scoreValue = scoreValue;
	}
	public float getMinScore() {
		return minScore;
	}
	public void setMinScore(float minScore) {
		this.minScore = minScore;
	}
	public float getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(float maxScore) {
		this.maxScore = maxScore;
	}
	
}
