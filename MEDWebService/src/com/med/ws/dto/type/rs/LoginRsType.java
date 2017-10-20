package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.MenuBean;

@JsonInclude(Include.NON_NULL)
public class LoginRsType {

	private String username;
	private List<?> role;
	private String signature;
	private List<MenuBean> menuList;
	private String persPicturePath;
	private List<String> topics;
	private Boolean typeEmp;
	private String name;
	private Boolean typeStdnt;
	private String group;
	public List<MenuBean> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuBean> menuList) {
		this.menuList = menuList;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public List<?> getRole() {
		return role;
	}

	public void setRole(List<?> role) {
		this.role = role;
	}

	public String getPersPicturePath() {
		return persPicturePath;
	}

	public void setPersPicturePath(String persPicturePath) {
		this.persPicturePath = persPicturePath;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Boolean getTypeEmp() {
		return typeEmp;
	}

	public void setTypeEmp(Boolean typeEmp) {
		this.typeEmp = typeEmp;
	}

	public Boolean getTypeStdnt() {
		return typeStdnt;
	}

	public void setTypeStdnt(Boolean typeStdnt) {
		this.typeStdnt = typeStdnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}


}
