package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.med.ws.beans.SubGroupStdntBean;

public class SubGroupStdntClinicRsType {

	protected Integer sectionId;
	protected String classSection;
    protected List<TopicForSubGroupBean> subGroupTopicList;
    protected List<SubGroupStdntBean> stdntOrderList;
    protected List<SubGroupStdntBean> stdntEnrollClassList;
    
    public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public List<TopicForSubGroupBean> getSubGroupTopicList() {
		return subGroupTopicList;
	}
	public void setSubGroupTopicList(List<TopicForSubGroupBean> subGroupTopicList) {
		this.subGroupTopicList = subGroupTopicList;
	}
	public List<SubGroupStdntBean> getStdntOrderList() {
		return stdntOrderList;
	}
	public void setStdntOrderList(List<SubGroupStdntBean> stdntOrderList) {
		this.stdntOrderList = stdntOrderList;
	}
	
	public List<SubGroupStdntBean> getStdntEnrollClassList() {
		return stdntEnrollClassList;
	}
	public void setStdntEnrollClassList(List<SubGroupStdntBean> stdntEnrollClassList) {
		this.stdntEnrollClassList = stdntEnrollClassList;
	}



	static public class SubTopicForSubGroupBean {
		protected Integer scheduleTopicId;
    	protected String topicName;
    	protected Integer classTopicId;
    	protected boolean groupFlag;
    	protected Integer classWeek;
    	protected Date startTime;
    	protected Date endTime;
    	protected List<SearchPersonalRsType> teacherList;
    	protected Integer groupNo;

    	
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}
		public Integer getClassTopicId() {
			return classTopicId;
		}
		public void setClassTopicId(Integer classTopicId) {
			this.classTopicId = classTopicId;
		}
		public boolean isGroupFlag() {
			return groupFlag;
		}
		public void setGroupFlag(boolean groupFlag) {
			this.groupFlag = groupFlag;
		}
		public Integer getClassWeek() {
			return classWeek;
		}
		public void setClassWeek(Integer classWeek) {
			this.classWeek = classWeek;
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
		public List<SearchPersonalRsType> getTeacherList() {
			return teacherList;
		}
		public void setTeacherList(List<SearchPersonalRsType> teacherList) {
			this.teacherList = teacherList;
		}
		public Integer getGroupNo() {
			return groupNo;
		}
		public void setGroupNo(Integer groupNo) {
			this.groupNo = groupNo;
		}
		public Integer getScheduleTopicId() {
			return scheduleTopicId;
		}
		public void setScheduleTopicId(Integer scheduleTopicId) {
			this.scheduleTopicId = scheduleTopicId;
		}
	}
	
	static public class TopicForSubGroupBean {
		
		protected String topicName;
		protected Integer topicId;
		protected boolean grouped;
		protected Integer totalGroup;
		protected List<SubTopicForSubGroupBean> subTopicForSubGroupBeanList;
		protected HashMap<Integer,List<SubGroupStdntBean>> stdntEnrollClassList;
		protected HashMap<Integer,List<SubGroupStdntBean>> stdntWkfwList;
		
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}
		public Integer getTopicId() {
			return topicId;
		}
		public void setTopicId(Integer topicId) {
			this.topicId = topicId;
		}
		public boolean isGrouped() {
			return grouped;
		}
		public void setGrouped(boolean grouped) {
			this.grouped = grouped;
		}
		public List<SubTopicForSubGroupBean> getSubTopicForSubGroupBeanList() {
			return subTopicForSubGroupBeanList;
		}
		public void setSubTopicForSubGroupBeanList(List<SubTopicForSubGroupBean> subTopicForSubGroupBeanList) {
			this.subTopicForSubGroupBeanList = subTopicForSubGroupBeanList;
		}
		public Integer getTotalGroup() {
			return totalGroup;
		}
		public void setTotalGroup(Integer totalGroup) {
			this.totalGroup = totalGroup;
		}
		public HashMap<Integer, List<SubGroupStdntBean>> getStdntEnrollClassList() {
			return stdntEnrollClassList;
		}
		public void setStdntEnrollClassList(HashMap<Integer, List<SubGroupStdntBean>> stdntEnrollClassList) {
			this.stdntEnrollClassList = stdntEnrollClassList;
		}
		public HashMap<Integer, List<SubGroupStdntBean>> getStdntWkfwList() {
			return stdntWkfwList;
		}
		public void setStdntWkfwList(HashMap<Integer, List<SubGroupStdntBean>> stdntWkfwList) {
			this.stdntWkfwList = stdntWkfwList;
		}
		
	}
   
}
