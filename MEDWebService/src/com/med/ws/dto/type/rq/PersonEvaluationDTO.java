package com.med.ws.dto.type.rq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.dto.type.rq.PersonEvaluationDTO.Teacher;

@JsonInclude(Include.NON_NULL)
public class PersonEvaluationDTO {
	List<Group> groups  = new ArrayList<>();

	@JsonInclude(Include.NON_NULL)
	public static class Group {
		Integer groupId;
		String desc;
		List<Teacher> teacherAllList  = new ArrayList<>();
		Map<Integer, Teacher> teacherAllMap;
		Map<Integer, Teacher> teacherMap;
		List<Teacher> teacherList  = new ArrayList<>();
		List<Teacher> teacherListDel = new ArrayList<>();
		Map<Integer, Student> studentAllMap;
		List<Student> studentAllList  = new ArrayList<>();
		List<Student> studentList  = new ArrayList<>();
		List<Student> studentListDel = new ArrayList<>();

		public Integer getGroupId() {
			return groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public List<Teacher> getTeacherList() {
			return teacherList;
		}

		public void setTeacherList(List<Teacher> teacherList) {
			this.teacherList = teacherList;
		}

		public List<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}

		public List<Teacher> getTeacherListDel() {
			return teacherListDel;
		}

		public void setTeacherListDel(List<Teacher> teacherListDel) {
			this.teacherListDel = teacherListDel;
		}

		public List<Student> getStudentListDel() {
			return studentListDel;
		}

		public void setStudentListDel(List<Student> studentListDel) {
			this.studentListDel = studentListDel;
		}

		public List<Teacher> getTeacherAllList() {
			return teacherAllList;
		}

		public void setTeacherAllList(List<Teacher> teacherAllList) {
			this.teacherAllList = teacherAllList;
		}

		public List<Student> getStudentAllList() {
			return studentAllList;
		}

		public void setStudentAllList(List<Student> studentAllList) {
			this.studentAllList = studentAllList;
		}

		public Map<Integer, Teacher> getTeacherAllMap() {
			return teacherAllMap;
		}

		public void setTeacherAllMap(Map<Integer, Teacher> teacherAllMap) {
			this.teacherAllMap = teacherAllMap;
		}

		public Map<Integer, Student> getStudentAllMap() {
			return studentAllMap;
		}

		public void setStudentAllMap(Map<Integer, Student> studentAllMap) {
			this.studentAllMap = studentAllMap;
		}

		public Map<Integer, Teacher> getTeacherMap() {
			return teacherMap;
		}

		public void setTeacherMap(Map<Integer, Teacher> teacherMap) {
			this.teacherMap = teacherMap;
		}

	}

	public static class Teacher {
		Integer poolId;
		String teacherName;
		Integer persId;
		Integer scheduleTopicId;
		String empCode;
		Integer evaPersId;
		List<Student> studentList;
		List<Student> studentAllList;
		List<Student> studentListDel = new ArrayList<>();

		public Integer getPersId() {
			return persId;
		}

		public void setPersId(Integer persId) {
			this.persId = persId;
		}

		public Integer getScheduleTopicId() {
			return scheduleTopicId;
		}

		public void setScheduleTopicId(Integer scheduleTopicId) {
			this.scheduleTopicId = scheduleTopicId;
		}

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getEmpCode() {
			return empCode;
		}

		public void setEmpCode(String empCode) {
			this.empCode = empCode;
		}

		public List<Student> getStudentList() {
			return studentList;
		}

		public void setStudentList(List<Student> studentList) {
			this.studentList = studentList;
		}

		public List<Student> getStudentListDel() {
			return studentListDel;
		}

		public void setStudentListDel(List<Student> studentListDel) {
			this.studentListDel = studentListDel;
		}

		public Integer getPoolId() {
			return poolId;
		}

		public void setPoolId(Integer poolId) {
			this.poolId = poolId;
		}

		public Integer getEvaPersId() {
			return evaPersId;
		}

		public void setEvaPersId(Integer evaPersId) {
			this.evaPersId = evaPersId;
		}

		public List<Student> getStudentAllList() {
			return studentAllList;
		}

		public void setStudentAllList(List<Student> studentAllList) {
			this.studentAllList = studentAllList;
		}

	}

	public static class Student {
		String stdntName;
		String stdntCode;
		Integer scheduleTopicId;
		Integer persId;
		Integer evaPersId;

		public Integer getPersId() {
			return persId;
		}

		public void setPersId(Integer persId) {
			this.persId = persId;
		}

		public Integer getScheduleTopicId() {
			return scheduleTopicId;
		}

		public void setScheduleTopicId(Integer scheduleTopicId) {
			this.scheduleTopicId = scheduleTopicId;
		}

		@Override
		public int hashCode() {
			return Objects.hashCode(this.getStdntCode());
		}

		@Override
		public boolean equals(Object obj) {
			return (obj instanceof Student && ((Student) obj).stdntCode.equals(this.stdntCode));

		}

		public String getStdntName() {
			return stdntName;
		}

		public void setStdntName(String stdntName) {
			this.stdntName = stdntName;
		}

		public String getStdntCode() {
			return stdntCode;
		}

		public void setStdntCode(String stdntCode) {
			this.stdntCode = stdntCode;
		}

		public Integer getEvaPersId() {
			return evaPersId;
		}

		public void setEvaPersId(Integer evaPersId) {
			this.evaPersId = evaPersId;
		}

	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

}