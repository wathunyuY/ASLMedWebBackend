package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.SectionPeriodBean;

public class StdntClinicGroupToSectionRsType {

	protected List<SectionPeriodBean> periods;
	protected List<StdntClinicGroupRsType> groupList;
	protected List<StdntClinicGroupSectionBean> classLists;
	
	public List<SectionPeriodBean> getPeriods() {
		return periods;
	}
	public void setPeriods(List<SectionPeriodBean> periods) {
		this.periods = periods;
	}
	public List<StdntClinicGroupRsType> getGroupList() {
		return groupList;
	}
	public void setGroupList(List<StdntClinicGroupRsType> groupList) {
		this.groupList = groupList;
	}
	public List<StdntClinicGroupSectionBean> getClassLists() {
		return classLists;
	}
	public void setClassLists(List<StdntClinicGroupSectionBean> classLists) {
		this.classLists = classLists;
	}
	
	
}
