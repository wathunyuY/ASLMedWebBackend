package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

public class ApplicationFormRsType {
	private Integer applicationFormId;
	private String formId;
	private String applicationTypeCode;
	private String applicationTypeTitle;
	private ApplicationFormPersonDetail requester;
	private String status;
	private String remark;
	private List<ApplicationFormPersonDetail> approver;
	private Date created;
	
	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Integer getApplicationFormId() {
		return applicationFormId;
	}

	public void setApplicationFormId(Integer applicationFormId) {
		this.applicationFormId = applicationFormId;
	}

	public String getApplicationTypeCode() {
		return applicationTypeCode;
	}

	public void setApplicationTypeCode(String applicationTypeCode) {
		this.applicationTypeCode = applicationTypeCode;
	}

	public String getApplicationTypeTitle() {
		return applicationTypeTitle;
	}

	public void setApplicationTypeTitle(String applicationTypeTitle) {
		this.applicationTypeTitle = applicationTypeTitle;
	}

	public ApplicationFormPersonDetail getRequester() {
		return requester;
	}

	public void setRequester(ApplicationFormPersonDetail requester) {
		this.requester = requester;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ApplicationFormPersonDetail> getApprover() {
		return approver;
	}

	public void setApprover(List<ApplicationFormPersonDetail> approver) {
		this.approver = approver;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public static class ApplicationFormPersonDetail{
		Integer persId;
		String username;
		String name;
		String picPath;
		String empEmail;
		String empPhone;
		String acadOrgDescr;
		String remark;
		String statusCode;
		Date statusDate;
		
		public Date getStatusDate() {
			return statusDate;
		}
		public void setStatusDate(Date statusDate) {
			this.statusDate = statusDate;
		}
		public Integer getPersId() {
			return persId;
		}
		public void setPersId(Integer persId) {
			this.persId = persId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPicPath() {
			return picPath;
		}
		public void setPicPath(String picPath) {
			this.picPath = picPath;
		}
		public String getEmpEmail() {
			return empEmail;
		}
		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}
		public String getEmpPhone() {
			return empPhone;
		}
		public void setEmpPhone(String empPhone) {
			this.empPhone = empPhone;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getAcadOrgDescr() {
			return acadOrgDescr;
		}
		public void setAcadOrgDescr(String acadOrgDescr) {
			this.acadOrgDescr = acadOrgDescr;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}
		
	}
}
