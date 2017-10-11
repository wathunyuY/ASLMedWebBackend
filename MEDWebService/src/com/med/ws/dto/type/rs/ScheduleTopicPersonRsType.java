package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.SearchStdntBean;

public class ScheduleTopicPersonRsType {

	protected List<SearchPersonalRsType> teacherList;
	protected List<SearchStdntBean> stdntList;
	
	public List<SearchPersonalRsType> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<SearchPersonalRsType> teacherList) {
		this.teacherList = teacherList;
	}
	public List<SearchStdntBean> getStdntList() {
		return stdntList;
	}
	public void setStdntList(List<SearchStdntBean> stdntList) {
		this.stdntList = stdntList;
	}
	
	
}
