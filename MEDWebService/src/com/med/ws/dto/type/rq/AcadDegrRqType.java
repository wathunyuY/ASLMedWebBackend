package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.AcadDegrBean;

public class AcadDegrRqType {

	private Integer mainAcadDegrId;
	private List<AcadDegrBean> acadDegrList;
	
	public Integer getMainAcadDegrId() {
		return mainAcadDegrId;
	}
	public void setMainAcadDegrId(Integer mainAcadDegrId) {
		this.mainAcadDegrId = mainAcadDegrId;
	}
	public List<AcadDegrBean> getAcadDegrList() {
		return acadDegrList;
	}
	public void setAcadDegrList(List<AcadDegrBean> acadDegrList) {
		this.acadDegrList = acadDegrList;
	}
	
	
}
