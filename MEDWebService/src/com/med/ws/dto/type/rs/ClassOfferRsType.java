package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.MatchClassOfferBean;

public class ClassOfferRsType {

	private Integer taskId;
	private List<MatchClassOfferBean> matchClassOfferList;
	
	public Integer getTaskId(){
		return this.taskId;
	}
	public void setTaskId(Integer taskId){
		this.taskId = taskId;
	}
	
	public List<MatchClassOfferBean> getMatchClassOfferList(){
		return this.matchClassOfferList;
	}
	public void setMatchClassOfferList(List<MatchClassOfferBean> matchClassOfferList){
		this.matchClassOfferList = matchClassOfferList;
	}

}
