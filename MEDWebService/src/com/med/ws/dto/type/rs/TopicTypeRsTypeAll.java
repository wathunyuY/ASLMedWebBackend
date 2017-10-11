package com.med.ws.dto.type.rs;

public class TopicTypeRsTypeAll {
	protected Integer topicTypeId;
	protected String topicTypeDescr;
	protected String topicTypeDescrShort;
	protected Boolean haveTopicName;
	protected Integer workloadTypeId;
	protected Integer acadProgId;
	protected String colorCode;
	
	public Integer getTopicTypeId() {
		return topicTypeId;
	}

	public void setTopicTypeId(Integer topicTypeId) {
		this.topicTypeId = topicTypeId;
	}

	public String getTopicTypeDescr() {
		return topicTypeDescr;
	}

	public void setTopicTypeDescr(String topicTypeDescr) {
		this.topicTypeDescr = topicTypeDescr;
	}
	
	public String getTopicTypeDescrShort(){
		return this.topicTypeDescrShort;
	}
	public void setTopicTypeDescrShort(String topicTypeDescrShort){
		this.topicTypeDescrShort = topicTypeDescrShort;
	}
	
	public Boolean getHaveTopicName() {
		return haveTopicName;
	}

	public void setHaveTopicName(Boolean haveTopicName) {
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
