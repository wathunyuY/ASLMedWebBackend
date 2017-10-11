package com.med.ws.dto.type.rq;

public class ApplicationFormRqType {

	protected Integer applicationFormId;
	protected String remark;
	protected Boolean accept;
	protected Integer seq;
	
	public Integer getApplicationFormId() {
		return applicationFormId;
	}
	public void setApplicationFormId(Integer applicationFormId) {
		this.applicationFormId = applicationFormId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Boolean getAccept() {
		return accept;
	}
	public void setAccept(Boolean accept) {
		this.accept = accept;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	
}
