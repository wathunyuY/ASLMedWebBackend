package com.med.ws.dto.type.rs;

import com.med.ws.beans.AcadOrgBean;

public class SearchPersonalRsType {
	private Integer persId;
	private String empCode;
	private String empName;
	private String empNid;
	private String empPstn;
	private AcadOrgBean acadOrg;
	private String acadDepartmantDescr;
	private String empPhone;
	private String picPath;
	
	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNid() {
		return empNid;
	}
	public void setEmpNid(String empNid) {
		this.empNid = empNid;
	}
	public String getEmpPstn() {
		return empPstn;
	}
	public void setEmpPstn(String empPstn) {
		this.empPstn = empPstn;
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
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getAcadDepartmantDescr() {
		return acadDepartmantDescr;
	}
	public void setAcadDepartmantDescr(String acadDepartmantDescr) {
		this.acadDepartmantDescr = acadDepartmantDescr;
	}
	
}
