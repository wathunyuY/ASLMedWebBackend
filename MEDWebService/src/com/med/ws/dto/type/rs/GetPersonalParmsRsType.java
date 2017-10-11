package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.EmpFowBean;

public class GetPersonalParmsRsType {
	private List<AcadOrgBean> acadOrgList;
	private List<EmpFowBean> empFowList;
	public List<AcadOrgBean> getAcadOrgList() {
		return acadOrgList;
	}
	public void setAcadOrgList(List<AcadOrgBean> acadOrgList) {
		this.acadOrgList = acadOrgList;
	}
	public List<EmpFowBean> getEmpFowList() {
		return empFowList;
	}
	public void setEmpFowList(List<EmpFowBean> empFowList) {
		this.empFowList = empFowList;
	}
	
}
