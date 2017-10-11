package com.med.ws.beans;

public class SubGroupStdntBean {

	protected String stdntCode;
	protected String fullName;
	protected String gender;
	protected String picPath;
	protected float gpa;
	
	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

}
