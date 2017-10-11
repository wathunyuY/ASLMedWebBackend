package com.med.ws.dto.type.rq;

import java.util.List;

public class TopicTypeRqType {

	protected Integer topicTypeId ;
	protected String descr; //varchar(255)
	protected String descrShort; //varchar(45)
	protected Boolean haveTopicName; //tinyint(1)
	protected Integer workloadTypeId; //datetime
	protected Integer acadProgId;
	protected String colorCode;
	
	protected List<Integer> topicTypeIdList;
	
	public List<Integer> getTopicTypeIdList(){
		return this.topicTypeIdList;
	}
	public void setTopicTypeIdList(List<Integer> topicTypeIdList){
		this.topicTypeIdList = topicTypeIdList;
	}
	
	public Integer getTopicTypeId(){
		return this.topicTypeId;
	}
	public void setTopicTypeId(Integer topicTypeId){
		this.topicTypeId = topicTypeId;
	}
	
	public String getDescr(){
		return this.descr;
	}
	public void setDescr(String descr){
		this.descr = descr;
	}
	
	public String getDescrShort(){
		return this.descrShort;
	}
	public void setDescrShort(String descrShort){
		this.descrShort = descrShort;
	}
	
	public Boolean getHaveTopicName(){
		return this.haveTopicName;
	}
	public void setHaveTopicName(Boolean haveTopicName){
		this.haveTopicName = haveTopicName;
	}
	
	public Integer getWorkloadTypeId(){
		return this.workloadTypeId;
	}
	public void setWorkloadTypeId(Integer workloadTypeId){
		this.workloadTypeId = workloadTypeId;
	}
	
	public Integer getAcadProgId(){
		return this.acadProgId;
	}
	public void setAcadProgId(Integer acadProgId){
		this.acadProgId = acadProgId;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	
}
