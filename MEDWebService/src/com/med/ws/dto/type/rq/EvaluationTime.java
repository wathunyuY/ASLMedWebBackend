package com.med.ws.dto.type.rq;

public class EvaluationTime {
	Integer hour;
	Integer day;
	Integer minute;
	Boolean setDateFlag;
	
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getMinute() {
		return minute;
	}
	public void setMinute(Integer minute) {
		this.minute = minute;
	}
	public Boolean getSetDateFlag() {
		return setDateFlag;
	}
	public void setSetDateFlag(Boolean setDateFlag) {
		this.setDateFlag = setDateFlag;
	}

}
