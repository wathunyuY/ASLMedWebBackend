package com.med.ws.dto.type.rs;

import java.util.List;
import java.util.Map;

import com.med.ws.beans.TopicTypeBean;

public class EvaMappingTopicDataRsType {
	private List<ClassTopicBean> classTopicList;
	private List<TopicTypeBean> topicTypeBean;
	private Map<String, String> evaSelector;
	
	public List<ClassTopicBean> getClassTopicList() {
		return classTopicList;
	}

	public void setClassTopicList(List<ClassTopicBean> classTopicList) {
		this.classTopicList = classTopicList;
	}

	public List<TopicTypeBean> getTopicTypeBean() {
		return topicTypeBean;
	}

	public void setTopicTypeBean(List<TopicTypeBean> topicTypeBean) {
		this.topicTypeBean = topicTypeBean;
	}

	public Map<String, String> getEvaSelector() {
		return evaSelector;
	}

	public void setEvaSelector(Map<String, String> evaSelector) {
		this.evaSelector = evaSelector;
	}


	public static class ClassTopicBean{
		Integer id;
		String topicName;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}
		
	}
}
