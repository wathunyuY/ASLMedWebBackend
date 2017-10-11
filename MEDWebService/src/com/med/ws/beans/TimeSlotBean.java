package com.med.ws.beans;

import java.util.Date;
import java.util.List;

import com.med.ws.dto.type.rs.SearchPersonalRsType;

public class TimeSlotBean {

	protected Date startTime;
	protected Date endTime;
	protected List<persOccupied> stdntOccupied;
	protected Integer stdntOccupiedAmount;

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

	public Integer getStdntOccupiedAmount() {
		return stdntOccupiedAmount;
	}
	public void setStdntOccupiedAmount(Integer stdntOccupiedAmount) {
		this.stdntOccupiedAmount = stdntOccupiedAmount;
	}
	public List<persOccupied> getStdntOccupied() {
		return stdntOccupied;
	}
	public void setStdntOccupied(List<persOccupied> stdntOccupied) {
		this.stdntOccupied = stdntOccupied;
	}
	
	@Override
	public String toString() {
		return "TimeSlotBean [startTime=" + startTime + ", endTime=" + endTime + ", stdntOccupied=" + stdntOccupied
				+ ", stdntOccupiedAmount=" + stdntOccupiedAmount + "]";
	}
	public static class persOccupied{
		protected String Code;
		protected String fullName;
		protected Integer scheduleTopicId;
		protected String topicName;
		protected Date startTime;
		protected Date endTime;
		
		public String getCode() {
			return Code;
		}
		public void setCode(String code) {
			Code = code;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public Integer getScheduleTopicId() {
			return scheduleTopicId;
		}
		public void setScheduleTopicId(Integer scheduleTopicId) {
			this.scheduleTopicId = scheduleTopicId;
		}
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
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
}
