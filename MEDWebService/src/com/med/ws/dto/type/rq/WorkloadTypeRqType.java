package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.WorkloadTypeBean;

public class WorkloadTypeRqType {
	private Integer mainWorkloadTypeId;
	private List<WorkloadTypeBean> workloadTypeList;
	public Integer getMainWorkloadTypeId() {
		return mainWorkloadTypeId;
	}
	public void setMainWorkloadTypeId(Integer mainWorkloadTypeId) {
		this.mainWorkloadTypeId = mainWorkloadTypeId;
	}
	public List<WorkloadTypeBean> getWorkloadTypeList() {
		return workloadTypeList;
	}
	public void setWorkloadTypeList(List<WorkloadTypeBean> workloadTypeList) {
		this.workloadTypeList = workloadTypeList;
	}
	
}
