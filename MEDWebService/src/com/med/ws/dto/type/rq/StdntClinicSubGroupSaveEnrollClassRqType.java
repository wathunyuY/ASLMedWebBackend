package com.med.ws.dto.type.rq;

import java.util.List;

public class StdntClinicSubGroupSaveEnrollClassRqType {

	protected List<StdntCodeScheduleTopicId> stdntCodeList;
	protected String classSection;
	protected Integer transTaskId;
	
	
	public List<StdntCodeScheduleTopicId> getStdntCodeList() {
		return stdntCodeList;
	}
	public void setStdntCodeList(List<StdntCodeScheduleTopicId> stdntCodeList) {
		this.stdntCodeList = stdntCodeList;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public Integer getTransTaskId() {
		return transTaskId;
	}

	public void setTransTaskId(Integer transTaskId) {
		this.transTaskId = transTaskId;
	}

	public static class StdntCodeScheduleTopicId {
		protected String stdntCode;
		protected List<Integer> scheduleTopicIdList;
		public String getStdntCode() {
			return stdntCode;
		}
		public void setStdntCode(String stdntCode) {
			this.stdntCode = stdntCode;
		}
		public List<Integer> getScheduleTopicIdList() {
			return scheduleTopicIdList;
		}
		public void setScheduleTopicIdList(List<Integer> scheduleTopicIdList) {
			this.scheduleTopicIdList = scheduleTopicIdList;
		}
		
		
	}
}
