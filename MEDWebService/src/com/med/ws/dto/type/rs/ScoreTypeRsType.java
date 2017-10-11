package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.ScoreBean;

public class ScoreTypeRsType {
	private List<ScoreBean> ScoreTypeList;

	public List<ScoreBean> getScoreTypeList() {
		return ScoreTypeList;
	}

	public void setScoreTypeList(List<ScoreBean> scoreTypeList) {
		ScoreTypeList = scoreTypeList;
	}
	
}
