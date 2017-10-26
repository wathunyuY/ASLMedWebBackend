package com.med.ws.dto.rs;

public class TaskListRsType {
	private String taskEndpoint;
	private String taskMethod;
	private String taskServiceName;
	private String taskActiveFlag;
	private Integer endpointId;
	
	public String getTaskEndpoint() {
		return taskEndpoint;
	}
	public void setTaskEndpoint(String taskEndpoint) {
		this.taskEndpoint = taskEndpoint;
	}
	public String getTaskMethod() {
		return taskMethod;
	}
	public void setTaskMethod(String taskMethod) {
		this.taskMethod = taskMethod;
	}
	public String getTaskServiceName() {
		return taskServiceName;
	}
	public void setTaskServiceName(String taskServiceName) {
		this.taskServiceName = taskServiceName;
	}
	public String getTaskActiveFlag() {
		return taskActiveFlag;
	}
	public void setTaskActiveFlag(String taskActiveFlag) {
		this.taskActiveFlag = taskActiveFlag;
	}
	public Integer getEndpointId() {
		return endpointId;
	}
	public void setEnpointId(Integer endpointId) {
		this.endpointId = endpointId;
	}
}