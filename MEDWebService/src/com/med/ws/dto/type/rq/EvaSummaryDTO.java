package com.med.ws.dto.type.rq;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.dto.type.rq.EvaluationSummaryDTO.TopicType;

@JsonInclude(Include.NON_NULL)
public class EvaSummaryDTO {
	List<StudentEvaRow> studentList;
	List<TeacherEvaRow> teacherList;
	List<Evaluation> evaList;
	
	public List<StudentEvaRow> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentEvaRow> studentList) {
		this.studentList = studentList;
	}

	public List<Evaluation> getEvaList() {
		return evaList;
	}

	public void setEvaList(List<Evaluation> evaList) {
		this.evaList = evaList;
	}
	
	
	public List<TeacherEvaRow> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<TeacherEvaRow> teacherList) {
		this.teacherList = teacherList;
	}


	@JsonInclude(Include.NON_NULL)
	public static class TeacherEvaRow{
		String nid;
		String teacherCode;
		String name;
		Map<Integer, Evaluation> evaluationList;
		public String getNid() {
			return nid;
		}
		public void setNid(String nid) {
			this.nid = nid;
		}
		public String getTeacherCode() {
			return teacherCode;
		}
		public void setTeacherCode(String teacherCode) {
			this.teacherCode = teacherCode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Map<Integer, Evaluation> getEvaluationList() {
			return evaluationList;
		}
		public void setEvaluationList(Map<Integer, Evaluation> evaluationList) {
			this.evaluationList = evaluationList;
		}
	}
	

	@JsonInclude(Include.NON_NULL)
	public static class StudentEvaRow{
		String stdntCode;
		@JsonProperty("name")
		String name;
		Map<Integer, Evaluation> evaluationList;
		public String getStdntCode() {
			return stdntCode;
		}
		public void setStdntCode(String stdntCode) {
			this.stdntCode = stdntCode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Map<Integer, Evaluation> getEvaluationList() {
			return evaluationList;
		}
		public void setEvaluationList(Map<Integer, Evaluation> evaluationList) {
			this.evaluationList = evaluationList;
		}
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class Evaluation{
		String evaName;
		Integer evaId;
		List<String> headers;
		List<Detail> detail;
		public String getEvaName() {
			return evaName;
		}
		public void setEvaName(String evaName) {
			this.evaName = evaName;
		}
		public Integer getEvaId() {
			return evaId;
		}
		public void setEvaId(Integer evaId) {
			this.evaId = evaId;
		}
		public List<Detail> getDetail() {
			return detail;
		}
		public void setDetail(List<Detail> detail) {
			this.detail = detail;
		}
		public List<String> getHeaders() {
			return headers;
		}
		public void setHeaders(List<String> headers) {
			this.headers = headers;
		}
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class Detail {
		String header;
		Integer count;
		String color;
		List<PersonInvolve> personList;
		public Detail(){
		}
		public Detail(String header, Integer count){
			this.header = header;
			this.count = count;
		}
		
		public String getHeader() {
			return header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public Integer getCount() {
			return count;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
		public List<PersonInvolve> getPersonList() {
			return personList;
		}
		public void setPersonList(List<PersonInvolve> personList) {
			this.personList = personList;
		}
	}
	
	@JsonInclude(Include.NON_NULL)
	public static class PersonInvolve{
		String code;
		String name;
		String tel;
		Boolean isDone;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public Boolean getIsDone() {
			return isDone;
		}
		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}
		
	}
}
