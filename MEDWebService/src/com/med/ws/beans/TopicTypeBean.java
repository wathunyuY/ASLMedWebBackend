package com.med.ws.beans;

public class TopicTypeBean {
	private int topicTypeId;
	private String descr;
	private String descrShort;
	private Boolean haveTopicName;
	
	private WorkloadTypeBean workloadType;
	private AcadProgBean acadProg;
	
	public int getTopTypeId(){
		return this.topicTypeId;
	}
	public void setTopicTypeId(int topicTypeId){
		this.topicTypeId = topicTypeId;
	}
	public String getdescr(){
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
	
	public WorkloadTypeBean getWorkloadType(){
		return this.workloadType;
	}
	public void setWorkloadType(WorkloadTypeBean workloadType){
		this.workloadType = workloadType;
	}
	
	public AcadProgBean getAcadProg(){
		return this.acadProg;
	}
	public void setAcadProg(AcadProgBean acadProg){
		this.acadProg = acadProg;
	}
	
	
}
