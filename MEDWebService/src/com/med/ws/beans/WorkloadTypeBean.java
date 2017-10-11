package com.med.ws.beans;

public class WorkloadTypeBean {

	private Integer workloadTypeId;
	private String effdt;
	private String descr;
	private String descrShort;
	private Float unitWorkload;
	
	public Integer getWorkloadTypeId(){
		return this.workloadTypeId;
	}
	public void setWorkloadTypeId(Integer workloadTypeId){
		this.workloadTypeId = workloadTypeId;
	}
	public String getEffdt() {
		return this.effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getDescr(){
		return this.descr;
	}
	public void setDescr(String descr){
		this.descr = descr;
	}

	public String getDescrShort(){
		return this.descrShort;
	}
	public void setDescrShort(String descrShort){
		this.descrShort = descrShort;
	}
	
	public Float getUnitWorkload(){
		return this.unitWorkload;
	}
	public void setUnitWorkload(Float unitWorkload){
		this.unitWorkload = unitWorkload;
	}
}
