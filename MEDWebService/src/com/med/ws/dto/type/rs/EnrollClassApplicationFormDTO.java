package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.med.ws.dto.type.rs.ApplicationFormRsType.ApplicationFormPersonDetail;

public class EnrollClassApplicationFormDTO {
	private ApplicationFormPersonDetail requester;
	private Integer applicationFormId;
	private String formId;
	private String applicationFormTypeCode;
	private String applicationFormTypeTitle;
	private String status;
//	private List<ApplicationFormPersonDetail> approvers;
	private String classSection;
	private Integer sectionId;
	private String groupNo;
	private Date created_at;
	private Date approveDate;
	private String crseTitle;
	private Date sectionStart;
	private Date sectionEnd;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
//	public List<ApplicationFormPersonDetail> getApprovers() {
//		return approvers;
//	}
//	public void setApprovers(List<ApplicationFormPersonDetail> approvers) {
//		this.approvers = approvers;
//	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public String getCrseTitle() {
		return crseTitle;
	}
	public void setCrseTitle(String crseTitle) {
		this.crseTitle = crseTitle;
	}
	public String getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}
	public Date getSectionStart() {
		return sectionStart;
	}
	public void setSectionStart(Date sectionStart) {
		this.sectionStart = sectionStart;
	}
	public Date getSectionEnd() {
		return sectionEnd;
	}
	public void setSectionEnd(Date sectionEnd) {
		this.sectionEnd = sectionEnd;
	}
	
	
}
