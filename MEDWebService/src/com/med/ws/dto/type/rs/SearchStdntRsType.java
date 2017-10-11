package com.med.ws.dto.type.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.AcadOrgBean;

@JsonInclude(Include.NON_NULL)
public class SearchStdntRsType {
	protected String fullName;
	protected String stdntCode;
	protected Integer year;
	protected String programName;
	protected Integer persId;
	protected AcadOrgBean acadOrg;
	protected String picPath;
	protected String email2;
	protected String moblie1;
	protected String mobile2;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	public AcadOrgBean getAcadOrg() {
		return acadOrg;
	}
	public void setAcadOrg(AcadOrgBean acadOrg) {
		this.acadOrg = acadOrg;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getMoblie1() {
		return moblie1;
	}
	public void setMoblie1(String moblie1) {
		this.moblie1 = moblie1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	
	
}
