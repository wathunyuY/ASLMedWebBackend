package com.med.ws.dto.type.rq;

public class RoomServiceRqType {
	protected Integer rsvRoomId;
	protected String rsvRoomName; //varchar(150)
	protected String rsvRoomDescr; //varchar(255)
	protected Integer rsvRoomCount; //int(10) unsigned
	protected String rsvRoomPicture; //varchar(150)
	protected String rsvRoomRemark; //text
	protected Boolean rsvRoomUseStatus; //tinyint(1)
	protected Integer rsvRoomTypeId;
	protected Integer rsvBuildingId;
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
	public Integer getRsvRoomTypeId() {
		return rsvRoomTypeId;
	}
	public void setRsvRoomTypeId(Integer rsvRoomTypeId) {
		this.rsvRoomTypeId = rsvRoomTypeId;
	}
	public Integer getRsvBuildingId() {
		return rsvBuildingId;
	}
	public void setRsvBuildingId(Integer rsvBuildingId) {
		this.rsvBuildingId = rsvBuildingId;
	}
	
}
