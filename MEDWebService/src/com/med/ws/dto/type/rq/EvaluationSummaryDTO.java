package com.med.ws.dto.type.rq;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class EvaluationSummaryDTO {

	List<Student> studentList;
	List<TeacherName> teacherList;
	List<TopicType> allTopicList;

	@JsonInclude(Include.NON_NULL)
	public static class Student {
		@JsonProperty("stdntCode")
		String stdntCode;
		Boolean isDone;
		String scheduleDate;
		@JsonProperty("name")
		String name;
		List<TopicType> topicTypeList;
		Map<Integer, TopicType> topicTypeMap;
		Map<String, TopicType> topicTypeMapString;

		public String getStdntCode() {
			return stdntCode;
		}

		public void setStdntCode(String stdntCode) {
			this.stdntCode = stdntCode;
		}

		public Map<Integer, TopicType> getTopicTypeMap() {
			return topicTypeMap;
		}

		public void setTopicTypeMap(Map<Integer, TopicType> topicTypeMap) {
			this.topicTypeMap = topicTypeMap;
		}

		public List<TopicType> getTopicTypeList() {
			return topicTypeList;
		}

		public void setTopicTypeList(List<TopicType> topicTypeList) {
			this.topicTypeList = topicTypeList;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public Boolean getIsDone() {
			return isDone;
		}

		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}

		public String getScheduleDate() {
			return scheduleDate;
		}

		public void setScheduleDate(String scheduleDate) {
			this.scheduleDate = scheduleDate;
		}

		public Map<String, TopicType> getTopicTypeMapString() {
			return topicTypeMapString;
		}

		public void setTopicTypeMapString(Map<String, TopicType> topicTypeMapString) {
			this.topicTypeMapString = topicTypeMapString;
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class TeacherName {
		String name;
		Boolean isDone;
		String scheduleDate;
		String tel;
		List<TopicType> topicTypeList;
		Map<Integer, TopicType> topicTypeMap;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getIsDone() {
			return isDone;
		}

		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}

		public String getScheduleDate() {
			return scheduleDate;
		}

		public void setScheduleDate(String scheduleDate) {
			this.scheduleDate = scheduleDate;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public List<TopicType> getTopicTypeList() {
			return topicTypeList;
		}

		public void setTopicTypeList(List<TopicType> topicTypeList) {
			this.topicTypeList = topicTypeList;
		}

		public Map<Integer, TopicType> getTopicTypeMap() {
			return topicTypeMap;
		}

		public void setTopicTypeMap(Map<Integer, TopicType> topicTypeMap) {
			this.topicTypeMap = topicTypeMap;
		}

	}

	@JsonInclude(Include.NON_NULL)
	public static class TopicType {
		@JsonProperty("topicName")
		String topicName;
		@JsonProperty("topicTypeId")
		Integer topicTypeId;
		@JsonProperty("topicTypeIdER")
		String topicTypeIdString;
		Detail detail;

		public Integer getTopicTypeId() {
			return topicTypeId;
		}

		public void setTopicTypeId(Integer topicTypeId) {
			this.topicTypeId = topicTypeId;
		}

		public String getTopicName() {
			return topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public Detail getDetail() {
			return detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public String getTopicTypeIdString() {
			return topicTypeIdString;
		}

		public void setTopicTypeIdString(String topicTypeIdString) {
			this.topicTypeIdString = topicTypeIdString;
		}
	}

	@JsonInclude(Include.NON_NULL)
	public static class Detail {

		@JsonProperty("count")
		Integer count = 0;
		@JsonProperty("s_done")
		Integer s_done = 0;
		@JsonProperty("t_done")
		Integer t_done = 0;
		List<TeacherName> teacherList;
		List<Student> studentList;

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getS_done() {
			return s_done;
		}

		public void setS_done(Integer s_done) {
			this.s_done = s_done;
		}

		public Integer getT_done() {
			return t_done;
		}

		public void setT_done(Integer t_done) {
			this.t_done = t_done;
		}

		public List<TeacherName> getTeacherList() {
			return teacherList;
		}

		public void setTeacherList(List<TeacherName> teacherList) {
			this.teacherList = teacherList;
		}

		public List<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}

	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<TopicType> getAllTopicList() {
		return allTopicList;
	}

	public void setAllTopicList(List<TopicType> allTopicList) {
		this.allTopicList = allTopicList;
	}

	public List<TeacherName> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<TeacherName> teacherList) {
		this.teacherList = teacherList;
	}

}