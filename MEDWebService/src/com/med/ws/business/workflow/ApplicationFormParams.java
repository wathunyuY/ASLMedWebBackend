package com.med.ws.business.workflow;

import java.util.Date;

import com.med.ods.entity.Person;
import com.med.ws.dto.type.rq.ApplicationFormEnrollClassRqType;
import com.med.ws.dto.type.rs.ScheduleSwapFormDTO;

public class ApplicationFormParams {
	private Person requester;
	private Integer scheduleId;
	private Date start;
	private Date end;
	private String remark;
	private ApplicationFormEnrollClassRqType applicationFormEnrollClassRqType;
	private ScheduleSwapFormDTO ScheduleSwapRqType;
	
	public Person getRequester() {
		return requester;
	}
	public void setRequester(Person requester) {
		this.requester = requester;
	}
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public ScheduleSwapFormDTO getScheduleSwapRqType() {
		return ScheduleSwapRqType;
	}
	public void setScheduleSwapRqType(ScheduleSwapFormDTO scheduleSwapRqType) {
		ScheduleSwapRqType = scheduleSwapRqType;
	}
	public ApplicationFormEnrollClassRqType getApplicationFormEnrollClassRqType() {
		return applicationFormEnrollClassRqType;
	}
	public void setApplicationFormEnrollClassRqType(ApplicationFormEnrollClassRqType applicationFormEnrollClassRqType) {
		this.applicationFormEnrollClassRqType = applicationFormEnrollClassRqType;
	}
	
}
