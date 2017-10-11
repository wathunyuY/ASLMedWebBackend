package com.med.ws.dto.type.rq;

import java.util.ArrayList;
import java.util.List;

public class EvaInitRqType {
	Integer sectionId;
	Behavior behavior;
	Data data;

	public static class Data {
		List<Integer> classTopicList = new ArrayList<>();
		List<Integer> topicTypeList = new ArrayList<>();

		public static class ClassTopic {
			Integer classTopicId;

			public Integer getClassTopicId() {
				return classTopicId;
			}

			public void setClassTopicId(Integer classTopicId) {
				this.classTopicId = classTopicId;
			}
		}

		public static class TopicType {
			Integer topicTypeId;

			public Integer getTopicTypeId() {
				return topicTypeId;
			}

			public void setTopicTypeId(Integer topicTypeId) {
				this.topicTypeId = topicTypeId;
			}
		}

		public List<Integer> getClassTopicList() {
			return classTopicList;
		}

		public void setClassTopicList(List<Integer> classTopicList) {
			this.classTopicList = classTopicList;
		}

		public List<Integer> getTopicTypeList() {
			return topicTypeList;
		}

		public void setTopicTypeList(List<Integer> topicTypeList) {
			this.topicTypeList = topicTypeList;
		}
	}

	public static class Behavior {
		Integer evaTblId;
		Integer maxPerson;
		Integer minPerson;
		String scope;
		Boolean selectFlag;
		String selector;

		public Integer getEvaTblId() {
			return evaTblId;
		}

		public void setEvaTblId(Integer evaTblId) {
			this.evaTblId = evaTblId;
		}

		public Integer getMaxPerson() {
			return maxPerson;
		}

		public void setMaxPerson(Integer maxPerson) {
			this.maxPerson = maxPerson;
		}

		public Integer getMinPerson() {
			return minPerson;
		}

		public void setMinPerson(Integer minPerson) {
			this.minPerson = minPerson;
		}

		public String getScope() {
			return scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public Boolean getSelectFlag() {
			return selectFlag;
		}

		public void setSelectFlag(Boolean selectFlag) {
			this.selectFlag = selectFlag;
		}

		public String getSelector() {
			return selector;
		}

		public void setSelector(String selector) {
			this.selector = selector;
		}

	}

	public Behavior getBehavior() {
		return behavior;
	}

	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
}
