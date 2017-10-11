package com.med.ws.dto.type.rq;

public class ScoreTypeRqType {
	private Integer scoreTypeId;
	private String scoreTypeTitle; //varchar(150)
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
	
	
}
