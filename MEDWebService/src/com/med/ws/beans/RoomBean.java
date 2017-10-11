package com.med.ws.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RoomBean {
	private Integer rsvRoomId;
	private String rsvRoomName;
	private String rsvRoomDescr;
	private Integer rsvRoomCount;
	private String rsvRoomPicture;
	private String rsvRoomRemark;
	private Boolean rsvRoomUseStatus;
	private RoomTypeBean rsvRoomType;
	private BuildingBean rsvBuilding;
	public Integer getRsvRoomId() {
		return rsvRoomId;
	}
	public void setRsvRoomId(Integer rsvRoomId) {
		this.rsvRoomId = rsvRoomId;
	}
	public String getRsvRoomName() {
		return rsvRoomName;
	}
	public void setRsvRoomName(String rsvRoomName) {
		this.rsvRoomName = rsvRoomName;
	}
	public String getRsvRoomDescr() {
		return rsvRoomDescr;
	}
	public void setRsvRoomDescr(String rsvRoomDescr) {
		this.rsvRoomDescr = rsvRoomDescr;
	}
	public Integer getRsvRoomCount() {
		return rsvRoomCount;
	}
	public void setRsvRoomCount(Integer rsvRoomCount) {
		this.rsvRoomCount = rsvRoomCount;
	}
	public String getRsvRoomPicture() {
		return rsvRoomPicture;
	}
	public void setRsvRoomPicture(String rsvRoomPicture) {
		this.rsvRoomPicture = rsvRoomPicture;
	}
	public String getRsvRoomRemark() {
		return rsvRoomRemark;
	}
	public void setRsvRoomRemark(String rsvRoomRemark) {
		this.rsvRoomRemark = rsvRoomRemark;
	}
	public Boolean getRsvRoomUseStatus() {
		return rsvRoomUseStatus;
	}
	public void setRsvRoomUseStatus(Boolean rsvRoomUseStatus) {
		this.rsvRoomUseStatus = rsvRoomUseStatus;
	}
	public RoomTypeBean getRsvRoomType() {
		return rsvRoomType;
	}
	public void setRsvRoomType(RoomTypeBean rsvRoomType) {
		this.rsvRoomType = rsvRoomType;
	}
	public BuildingBean getRsvBuilding() {
		return rsvBuilding;
	}
	public void setRsvBuilding(BuildingBean rsvBuilding) {
		this.rsvBuilding = rsvBuilding;
	}
	
	
}
