package com.med.ws.dto.type.rq;

public class ChatMessageRqType {
	protected Integer scheduleId;
	protected String msg;
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
