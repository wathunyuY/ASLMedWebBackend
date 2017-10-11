package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.AcadInstBean;

public class AcadInstRqType {
	private Integer mainAcadInstId;
	private List<AcadInstBean> acadInstList;
	public Integer getMainAcadInstId() {
		return mainAcadInstId;
	}
	public void setMainAcadInsId(Integer mainAcadInstId) {
		this.mainAcadInstId = mainAcadInstId;
	}
	public List<AcadInstBean> getAcadInstList() {
		return acadInstList;
	}
	public void setAcadInstList(List<AcadInstBean> acadInstList) {
		this.acadInstList = acadInstList;
	}
	
}
