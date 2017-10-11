package com.med.ws.beans;


public class TaskBean {
	private Integer taskId;
	private Integer taskConstant;
	private String taskName;
	private String descr;
	private Integer seq;
	private String status;
	private String remark;
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
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
	public Integer getTaskConstant() {
		return taskConstant;
	}
	public void setTaskConstant(Integer taskConstant) {
		this.taskConstant = taskConstant;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
