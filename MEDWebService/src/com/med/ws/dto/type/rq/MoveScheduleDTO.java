package com.med.ws.dto.type.rq;

import java.util.Date;

public class MoveScheduleDTO {
	Integer scheduleTopicId;
	Date date;
	Date startTime;
	Date endTime;

	public Integer getScheduleTopicId() {
		return scheduleTopicId;
	}

	public void setScheduleTopicId(Integer scheduleTopicId) {
		this.scheduleTopicId = scheduleTopicId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
