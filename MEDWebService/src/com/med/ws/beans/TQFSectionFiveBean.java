package com.med.ws.beans;

import java.util.List;
import java.util.Map;

public class TQFSectionFiveBean {
	private String crseFramework;
	private String formativeEvlt;
	private String summativeEvlt;
	private String criteria;
	private List<TeachPlan> weeklyPlan;

	public static class TeachPlan {
		Integer week;
		List<String> teacherFaculties;
		Map<String, Float> sumHours;
		List<TqfTopicBean> topics;
		
		public Integer getWeek() {
			return week;
		}

		public void setWeek(Integer week) {
			this.week = week;
		}

		public List<String> getTeacherFaculties() {
			return teacherFaculties;
		}

		public void setTeacherFaculties(List<String> teacherFaculties) {
			this.teacherFaculties = teacherFaculties;
		}

		public Map<String, Float> getSumHours() {
			return sumHours;
		}

		public void setSumHours(Map<String, Float> sumHours) {
			this.sumHours = sumHours;
		}

		public List<TqfTopicBean> getTopics() {
			return topics;
		}

		public void setTopics(List<TqfTopicBean> topics) {
			this.topics = topics;
		}

	}

	public static class TqfTopicBean {		
		String topicName;
		String topicType;
		String teachMethod;
		String objective;
		String content;
		Float hour;		
		public String getTopicName() {
			return topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public String getTopicType() {
			return topicType;
		}

		public void setTopicType(String topicType) {
			this.topicType = topicType;
		}

		public Float getHour() {
			return hour;
		}

		public void setHour(Float hour) {
			this.hour = hour;
		}

		public String getTeachMethod() {
			return teachMethod;
		}

		public void setTeachMethod(String teachMethod) {
			this.teachMethod = teachMethod;
		}

		public String getObjective() {
			return objective;
		}

		public void setObjective(String objective) {
			this.objective = objective;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	}

	public String getCrseFramework() {
		return crseFramework;
	}

	public void setCrseFramework(String crseFramework) {
		this.crseFramework = crseFramework;
	}

	public List<TeachPlan> getWeeklyPlan() {
		return weeklyPlan;
	}

	public void setWeeklyPlan(List<TeachPlan> weeklyPlan) {
		this.weeklyPlan = weeklyPlan;
	}

	public String getFormativeEvlt() {
		return formativeEvlt;
	}

	public void setFormativeEvlt(String formativeEvlt) {
		this.formativeEvlt = formativeEvlt;
	}

	public String getSummativeEvlt() {
		return summativeEvlt;
	}

	public void setSummativeEvlt(String summativeEvlt) {
		this.summativeEvlt = summativeEvlt;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

}
