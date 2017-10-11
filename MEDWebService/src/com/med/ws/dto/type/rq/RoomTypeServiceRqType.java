package com.med.ws.dto.type.rq;

public class RoomTypeServiceRqType {
	protected Integer rsvRoomTypeId;
	protected String rsvRoomTypeTitle; //varchar(255)
	protected String rsvRoomTypeDescr; //varchar(255)
	public Integer getRsvRoomTypeId() {
		return rsvRoomTypeId;
	}
	public void setRsvRoomTypeId(Integer rsvRoomTypeId) {
		this.rsvRoomTypeId = rsvRoomTypeId;
	}
	public String getRsvRoomTypeTitle() {
		return rsvRoomTypeTitle;
	}
	public void setRsvRoomTypeTitle(String rsvRoomTypeTitle) {
		this.rsvRoomTypeTitle = rsvRoomTypeTitle;
	}
	public String getRsvRoomTypeDescr() {
		return rsvRoomTypeDescr;
	}
	public void setRsvRoomTypeDescr(String rsvRoomTypeDescr) {
		this.rsvRoomTypeDescr = rsvRoomTypeDescr;
	}
	
}
