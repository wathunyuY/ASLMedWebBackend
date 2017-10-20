package com.med.ws.dto.type.rq;

public class ChatMessageRqType {
	protected Integer subscrId;
	protected Integer scheduleId;
	protected String msg;
	protected Integer persId;
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
	public Integer getSubscrId() {
		return subscrId;
	}
	public void setSubscrId(Integer subscrId) {
		this.subscrId = subscrId;
	}
	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	
}
