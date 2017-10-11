package com.med.ws.dto.type.rs;

public class TopicTypeRsType {
	Integer topicTypeId;
	String topicTypeDescr;
	Boolean haveTopicName;

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

	public Boolean getHaveTopicName() {
		return haveTopicName;
	}

	public void setHaveTopicName(Boolean haveTopicName) {
		this.haveTopicName = haveTopicName;
	}
}