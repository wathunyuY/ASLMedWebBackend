package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.med.ws.beans.ScheduleTableBean;
import com.med.ws.dto.type.rs.ApplicationFormRsType.ApplicationFormPersonDetail;

public class ScheduleSwapFormDTO {
	private ApplicationFormPersonDetail requester;
	private Integer applicationFormId;
	private String formId;
	private String applicationFormTypeCode;
	private String applicationFormTypeTitle;
	private Date created_at;
	private ScheduleSwapPair requestForm;
	private ScheduleSwapPair approvalForm;
//	private List<ApplicationFormPersonDetail> approvers;
	private Boolean approve;
	private String remark;
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

	public ScheduleSwapPair getRequestForm() {
		return requestForm;
	}

	public void setRequestForm(ScheduleSwapPair requestForm) {
		this.requestForm = requestForm;
	}

	public ScheduleSwapPair getApprovalForm() {
		return approvalForm;
	}

	public void setApprovalForm(ScheduleSwapPair approvalForm) {
		this.approvalForm = approvalForm;
	}

//	public List<ApplicationFormPersonDetail> getApprovers() {
//		return approvers;
//	}
//	public void setApprovers(List<ApplicationFormPersonDetail> approvers) {
//		this.approvers = approvers;
//	}
	
	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public static class ScheduleSwapPair{
		ScheduleTableBean source;
		Date sourceSelectedStart;
		Date sourceSelectedEnd;
		ScheduleTableBean destination;
		Date destinationSuggestStart;
		Date destinationSuggestEnd;
		
		public ScheduleTableBean getSource() {
			return source;
		}
		public void setSource(ScheduleTableBean source) {
			this.source = source;
		}
		public ScheduleTableBean getDestination() {
			return destination;
		}
		public void setDestination(ScheduleTableBean destination) {
			this.destination = destination;
		}
		public Date getDestinationSuggestStart() {
			return destinationSuggestStart;
		}
		public void setDestinationSuggestStart(Date destinationSuggestStart) {
			this.destinationSuggestStart = destinationSuggestStart;
		}
		public Date getDestinationSuggestEnd() {
			return destinationSuggestEnd;
		}
		public void setDestinationSuggestEnd(Date destinationSuggestEnd) {
			this.destinationSuggestEnd = destinationSuggestEnd;
		}
		public Date getSourceSelectedStart() {
			return sourceSelectedStart;
		}
		public void setSourceSelectedStart(Date sourceSelectedStart) {
			this.sourceSelectedStart = sourceSelectedStart;
		}
		public Date getSourceSelectedEnd() {
			return sourceSelectedEnd;
		}
		public void setSourceSelectedEnd(Date sourceSelectedEnd) {
			this.sourceSelectedEnd = sourceSelectedEnd;
		}
		
	}
}
