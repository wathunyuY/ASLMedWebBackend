package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.AcadPlanBean;
import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.CrseBean;
import com.med.ws.beans.GrdBsBean;
import com.med.ws.beans.SubjectTblBean;

@JsonInclude(Include.NON_NULL)
public class GetCrseMasterDataRsType {
	private List<AcadProgBean> acadProgList;
	private List<AcadPlanBean> acadPlanList;
	private List<SubjectTblBean> subjectList;
	private List<AcadOrgBean> acadOrgList;
	private List<GrdBsBean> grdBsList;
	private List<CrseBean> crseList;

	public List<AcadProgBean> getAcadProgList() {
		return acadProgList;
	}

	public void setAcadProgList(List<AcadProgBean> acadProgList) {
		this.acadProgList = acadProgList;
	}

	public void setAcadPlanList(List<AcadPlanBean> acadPlanList) {
		this.acadPlanList = acadPlanList;
	}

	public List<AcadPlanBean> getAcadPlanList() {
		return acadPlanList;
	}

	public List<SubjectTblBean> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<SubjectTblBean> subjectList) {
		this.subjectList = subjectList;
	}

	public List<AcadOrgBean> getAcadOrgList() {
		return acadOrgList;
	}

	public void setAcadOrgList(List<AcadOrgBean> acadOrgList) {
		this.acadOrgList = acadOrgList;
	}

	public List<GrdBsBean> getGrdBsList() {
		return grdBsList;
	}

	public void setGrdBsList(List<GrdBsBean> grdBsList) {
		this.grdBsList = grdBsList;
	}

	public List<CrseBean> getCrseList() {
		return crseList;
	}

	public void setCrseList(List<CrseBean> crseList) {
		this.crseList = crseList;
	}
	
	
	
}
