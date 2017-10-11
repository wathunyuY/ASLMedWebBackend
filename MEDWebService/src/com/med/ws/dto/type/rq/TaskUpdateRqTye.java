package com.med.ws.dto.type.rq;

public class TaskUpdateRqTye {

	private String name;
	private String type;
	private String activeFlag;
	private String zone;
	private String method;
	private String pathVariableFlag;
	private Integer serviceId;
	private Integer taskId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getPathVariableFlag() {
		return pathVariableFlag;
	}
	public void setPathVariableFlag(String pathVariableFlag) {
		this.pathVariableFlag = pathVariableFlag;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	
}
