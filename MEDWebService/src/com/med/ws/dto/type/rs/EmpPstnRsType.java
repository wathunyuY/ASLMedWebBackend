package com.med.ws.dto.type.rs;

import com.med.ws.beans.EmpFowBean;

public class EmpPstnRsType {
	private Integer empPstnId;
	private EmpFowBean empFow;
	private String pstnName;
	private String pstnNameEn;
	private String pstnAbbrName;
	private String pstnAbbrNameEn;
//	private String pstnFowName;
	
	
	
	public Integer getEmpPstnId() {
		return this.empPstnId;
	}

	public void setEmpPstnId(Integer empPstnId) {
		this.empPstnId = empPstnId;
	}

	public EmpFowBean getEmpFow() {
		return this.empFow;
	}

	public void setEmpFowCode(EmpFowBean empFow) {
		this.empFow = empFow;
	}

	public String getPstnName() {
		return this.pstnName;
	}

	public void setPstnName(String pstnName) {
		this.pstnName = pstnName;
	}

	public String getPstnNameEn() {
		return this.pstnNameEn;
	}

	public void setPstnNameEn(String pstnNameEn) {
		this.pstnNameEn = pstnNameEn;
	}

	public String getPstnAbbrName() {
		return this.pstnAbbrName;
	}

	public void setPstnAbbrName(String pstnAbbrName) {
		this.pstnAbbrName = pstnAbbrName;
	}

	public String getPstnAbbrNameEn() {
		return this.pstnAbbrNameEn;
	}

	public void setPstnAbbrNameEn(String pstnAbbrNameEn) {
		this.pstnAbbrNameEn = pstnAbbrNameEn;
	}

//	public String getPstnFowName() {
//		return this.pstnFowName;
//	}
//
//	public void setPstnFowName(String pstnFowName) {
//		this.pstnFowName = pstnFowName;
//	}
}
