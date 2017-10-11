package com.med.ws.dto.type.rs;

import com.med.ws.beans.EvaBean;

public class EvaAnswerSheetSubmitRsType {
	private Integer evaMappingId;
	private EvaBean eva;
	private Double totalScore;
	public Integer getEvaMappingId() {
		return evaMappingId;
	}
	public void setEvaMappingId(Integer evaMappingId) {
		this.evaMappingId = evaMappingId;
	}
	public EvaBean getEva() {
		return eva;
	}
	public void setEva(EvaBean eva) {
		this.eva = eva;
	}
	public Double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}
	
}
