package com.med.ws.beans;

import java.util.List;

public class AssignTaskBean {

	private Integer transTaskId;
	private List<String> empCode;
	
	public Integer getTransTaskId(){
		return this.transTaskId;
	}
	public void setTransTaskId(Integer transTaskId){
		this.transTaskId = transTaskId;
	}
	
	public List<String> getEmpCode(){
		return this.empCode;
	}
	public void setEmpCode(List<String> empCode){
		this.empCode = empCode;
	}
}
