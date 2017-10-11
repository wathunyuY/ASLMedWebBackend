package com.med.ws.beans;

public class BuildingBean {
	protected Integer rsvBuildingId;
	protected String rsvBuildingName;
	protected String rsvBuildingDescr;
	protected Boolean rsvIsRsv;
	public Integer getRsvBuildingId() {
		return rsvBuildingId;
	}
	public void setRsvBuildingId(Integer rsvBuildingId) {
		this.rsvBuildingId = rsvBuildingId;
	}
	public String getRsvBuildingName() {
		return rsvBuildingName;
	}
	public void setRsvBuildingName(String rsvBuildingName) {
		this.rsvBuildingName = rsvBuildingName;
	}
	public String getRsvBuildingDescr() {
		return rsvBuildingDescr;
	}
	public void setRsvBuildingDescr(String rsvBuildingDescr) {
		this.rsvBuildingDescr = rsvBuildingDescr;
	}
	public Boolean getRsvIsRsv() {
		return rsvIsRsv;
	}
	public void setRsvIsRsv(Boolean rsvIsRsv) {
		this.rsvIsRsv = rsvIsRsv;
	}
	
}
