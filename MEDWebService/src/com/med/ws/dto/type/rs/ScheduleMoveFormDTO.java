package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.ScheduleTableBean;
import com.med.ws.dto.type.rs.ApplicationFormRsType.ApplicationFormPersonDetail;

@JsonInclude(Include.NON_NULL)
public class ScheduleMoveFormDTO {
	private ApplicationFormPersonDetail requester;
	private Integer applicationFormId;
	private String formId;
	private String applicationFormTypeCode;
	private String applicationFormTypeTitle;
	private Date created_at;
	private ScheduleTableBean source;
	private Date targetStartTime;
	private Date targetEndTime;
	private List<ApplicationFormPersonDetail> approvers;
	
	public ApplicationFormPersonDetail getRequester() {
		return requester;
	}
	public void setRequester(ApplicationFormPersonDetail requester) {
		this.requester = requester;
	}
	public Integer getApplicationFormId() {
		return applicationFormId;
	}
	public void setApplicationFormId(Integer applicationFormId) {
		this.applicationFormId = applicationFormId;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public String getApplicationFormTypeCode() {
		return applicationFormTypeCode;
	}
	public void setApplicationFormTypeCode(String applicationFormTypeCode) {
		this.applicationFormTypeCode = applicationFormTypeCode;
	}
	public String getApplicationFormTypeTitle() {
		return applicationFormTypeTitle;
	}
	public void setApplicationFormTypeTitle(String applicationFormTypeTitle) {
		this.applicationFormTypeTitle = applicationFormTypeTitle;
	}
	public ScheduleTableBean getSource() {
		return source;
	}
	public void setSource(ScheduleTableBean source) {
		this.source = source;
	}
	public Date getTargetStartTime() {
		return targetStartTime;
	}
	public void setTargetStartTime(Date targetStartTime) {
		this.targetStartTime = targetStartTime;
	}
	public Date getTargetEndTime() {
		return targetEndTime;
	}
	public void setTargetEndTime(Date targetEndTime) {
		this.targetEndTime = targetEndTime;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public List<ApplicationFormPersonDetail> getApprovers() {
		return approvers;
	}
	public void setApprovers(List<ApplicationFormPersonDetail> approvers) {
		this.approvers = approvers;
	}
	
}
