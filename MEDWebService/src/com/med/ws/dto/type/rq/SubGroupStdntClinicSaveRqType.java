package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.SubGroupBean;
import com.med.ws.dto.type.rq.StdntClinicSubGroupSaveEnrollClassRqType.StdntCodeScheduleTopicId;
import com.med.ws.dto.type.rs.SubGroupStdntClinicRsType.TopicForSubGroupBean;

public class SubGroupStdntClinicSaveRqType {

	 protected String classSection;
	 protected Integer sectionId;
	 protected Integer taskId;
	 protected Boolean wkfwFlag;
	 protected TopicForSubGroupBean subGroupTopic;
	 
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public TopicForSubGroupBean getSubGroupTopic() {
		return subGroupTopic;
	}
	public void setSubGroupTopic(TopicForSubGroupBean subGroupTopic) {
		this.subGroupTopic = subGroupTopic;
	}
	public Boolean getWkfwFlag() {
		return wkfwFlag;
	}
	public void setWkfwFlag(Boolean wkfwFlag) {
		this.wkfwFlag = wkfwFlag;
	}



	public static class StdntEnrollClassGroupNo {
		protected String stdntCode;
		protected Integer groupNo;
		public String getStdntCode() {
			return stdntCode;
		}
		public void setStdntCode(String stdntCode) {
			this.stdntCode = stdntCode;
		}
		public Integer getGroupNo() {
			return groupNo;
		}
		public void setGroupNo(Integer groupNo) {
			this.groupNo = groupNo;
		}
		
		
	}
	    
}
