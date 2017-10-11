package com.med.ws.beans;

import java.util.List;

public class StdntClinicGroupSectionDetailBean {
	
	protected Integer colspan;
	protected String type;
	protected String hide;
	protected Integer sectionId;
	protected List<GroupBean> groupNames;
	
	public Integer getColspan() {
		return colspan;
	}
	public void setColspan(Integer colspan) {
		this.colspan = colspan;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHide() {
		return hide;
	}
	public void setHide(String hide) {
		this.hide = hide;
	}
	public Integer getSectionId() {
		return sectionId;
	}
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	public List<GroupBean> getGroupNames() {
		return groupNames;
	}
	public void setGroupNames(List<GroupBean> groupNames) {
		this.groupNames = groupNames;
	}
	
}
