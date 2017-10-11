package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ActivityBean {
	private Integer id;
	private String title;
	private String titleEn;
	private String descr;
	private String descrEn;
	private String startDate;
	private String endDate;
	private Boolean override;
	private List<EmpResponsibleBean> empRespoList;
	private List<Integer> empRespoDelList;
	private List<CalendarStdntGroupBean> stdntGroupList;
	private List<CalendarEmpGroupBean> empGroupList;
	private List<ActivityInviteBean> empInvitedList;
	private List<Integer> empInvitedDelList;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEn() {
		return titleEn;
	}

	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDescrEn() {
		return descrEn;
	}

	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getOverride() {
		return override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
	}
	public List<EmpResponsibleBean> getEmpRespoList() {
		return empRespoList;
	}

	public void setEmpRespoList(List<EmpResponsibleBean> empRespoList) {
		this.empRespoList = empRespoList;
	}

	public List<CalendarStdntGroupBean> getStdntGroupList() {
		return stdntGroupList;
	}

	public void setStdntGroupList(List<CalendarStdntGroupBean> stdntGroupList) {
		this.stdntGroupList = stdntGroupList;
	}

	public List<CalendarEmpGroupBean> getEmpGroupList() {
		return empGroupList;
	}

	public void setEmpGroupList(List<CalendarEmpGroupBean> empGroupList) {
		this.empGroupList = empGroupList;
	}

	public List<ActivityInviteBean> getEmpInvitedList() {
		return empInvitedList;
	}

	public void setEmpInvitedList(List<ActivityInviteBean> empInvitedList) {
		this.empInvitedList = empInvitedList;
	}

	public List<Integer> getEmpRespoDelList() {
		return empRespoDelList;
	}

	public void setEmpRespoDelList(List<Integer> empRespoDelList) {
		this.empRespoDelList = empRespoDelList;
	}

	public List<Integer> getEmpInvitedDelList() {
		return empInvitedDelList;
	}

	public void setEmpInvitedDelList(List<Integer> empInvitedDelList) {
		this.empInvitedDelList = empInvitedDelList;
	}

	public static class ActivityInviteBean {
		private Integer id;
		private String invitedName;
		private String email;
		private String telNo;
		private Boolean emailStatus;
		private String remark;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getInvitedName() {
			return invitedName;
		}
		public void setInvitedName(String invitedName) {
			this.invitedName = invitedName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelNo() {
			return telNo;
		}
		public void setTelNo(String telNo) {
			this.telNo = telNo;
		}
		public Boolean getEmailStatus() {
			return emailStatus;
		}
		public void setEmailStatus(Boolean emailStatus) {
			this.emailStatus = emailStatus;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		
	}

}
