package com.med.ws.beans;

import com.med.ws.dto.type.rs.SearchPersonalRsType;

public class EmpResponsibleBean {
	private Integer id;
	private SearchPersonalRsType emp;
	private String role;
	public SearchPersonalRsType getEmp() {
		return emp;
	}
	public void setEmp(SearchPersonalRsType emp) {
		this.emp = emp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
