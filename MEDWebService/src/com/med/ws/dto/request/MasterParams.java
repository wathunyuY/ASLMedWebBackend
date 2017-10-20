package com.med.ws.dto.request;

import java.lang.reflect.Field;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MasterParams {
	private String year;
	private String group;
	private String termId;
	private String termDesc;
	private String enptId;
	private String serviceId;
	private String calendarYear;
	private String courseId;
	private String dist;
	private String permListTblId;
	private String persId;
	private String filterNull;
	private String parms;
	private String type;
	private String acadProgId;
	private String calendarId;
	private String programId;
	private String transTaskId;
	private String effdt;
	private String id;
	private String classSection;
	private String startDate;
	private String tmpl;
	private String evaluationId;
	private String classTopicId;
	private String secret;
	private String sectionId;
	private String scheduleId;
	private String date;
	private String startTime;
	private String endTime;
	private String reportId;
	private String seq;
	private boolean all;
	private boolean confirm;
	private boolean approve;
	private String scheduleTopicId;
	private String acadCareer;
	private String empCode;
	private String scope;
	private String active;
	private String nickname;
	
	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getEnptId() {
		return enptId;
	}

	public void setEnptId(String enptId) {
		this.enptId = enptId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getTermDesc() {
		return termDesc;
	}

	public void setTermDesc(String termDesc) {
		this.termDesc = termDesc;
	}

	public String getCalendarYear() {
		return calendarYear;
	}

	public void setCalendarYear(String calendarYear) {
		this.calendarYear = calendarYear;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getPermListTblId() {
		return permListTblId;
	}

	public void setPermListTblId(String permListTblId) {
		this.permListTblId = permListTblId;
	}

	public String getPersId() {
		return persId;
	}

	public void setPersId(String persId) {
		this.persId = persId;
	}

	public String getFilterNull() {
		return filterNull;
	}

	public void setFilterNull(String filterNull) {
		this.filterNull = filterNull;
	}
	
	public String getParms() {
		return parms;
	}

	public void setParms(String parms) {
		this.parms = parms;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAcadProgId() {
		return acadProgId;
	}

	public void setAcadProgId(String acadProgId) {
		this.acadProgId = acadProgId;
	}

	public String getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public boolean isConfirm() {
		return confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	
	public String getTransTaskId() {
		return transTaskId;
	}

	public void setTransTaskId(String transTaskId) {
		this.transTaskId = transTaskId;
	}

	public String getEffdt() {
		return effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	
	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTmpl() {
		return tmpl;
	}

	public void setTmpl(String tmpl) {
		this.tmpl = tmpl;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		  result.append( this.getClass().getName() );
		  result.append( " Params {" );

		  //determine fields declared in this class only (no fields of superclass)
		  Field[] fields = this.getClass().getDeclaredFields();

		  //print field names paired with their values
		  for ( Field field : fields  ) {
		    result.append("  ");
		    try {
		      result.append( field.getName() );
		      result.append(":");
		      //requires access to private field:
		      result.append( field.get(this) );
		      result.append(", ");
		    } catch ( IllegalAccessException ex ) {
		      System.out.println(ex);
		    }
		  }
		  result.append("}");

		  return result.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public String getClassTopicId() {
		return classTopicId;
	}

	public void setClassTopicId(String classTopicId) {
		this.classTopicId = classTopicId;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getScheduleTopicId() {
		return scheduleTopicId;
	}

	public void setScheduleTopicId(String scheduleTopicId) {
		this.scheduleTopicId = scheduleTopicId;
	}

	public String getAcadCareer() {
		return acadCareer;
	}

	public void setAcadCareer(String acadCareer) {
		this.acadCareer = acadCareer;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
