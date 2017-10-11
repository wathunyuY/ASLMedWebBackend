package com.med.ws.beans;

import java.util.List;

public class WorkloadTypeAndAcadProgListBean {

	private List<AcadProgBean> acadProgList;
	private List<WorkloadTypeBean> workloadTypeList;
	
	public List<WorkloadTypeBean> getWorkloadTypeList(){
		return this.workloadTypeList;
	}
	public void setWorkloadTypeList(List<WorkloadTypeBean> workloadTypeList){
		this.workloadTypeList = workloadTypeList;
	}
	
	public List<AcadProgBean> getAcadProgList(){
		return this.acadProgList;
	}
	public void setAcadProgList(List<AcadProgBean> acadProgList){
		this.acadProgList = acadProgList;
	}
}
