package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.StdntClinicDetailsBean;

public class StdntClinicGroupRsType {

	private String groupName;
	private String groupNameTxt;
	private Integer groupNo;
	private Integer stdntYear;
	private List<StdntClinicDetailsBean> stdntClinicDetailsBeanList;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public String getGroupNameTxt() {
		return groupNameTxt;
	}
	public void setGroupNameTxt(String groupNameTxt) {
		this.groupNameTxt = groupNameTxt;
	}
	
	public Integer getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}
	public Integer getStdntYear() {
		return stdntYear;
	}
	public void setStdntYear(Integer stdntYear) {
		this.stdntYear = stdntYear;
	}
	public List<StdntClinicDetailsBean> getStdntClinicDetailsBeanList() {
		return stdntClinicDetailsBeanList;
	}
	public void setStdntClinicDetailsBeanList(List<StdntClinicDetailsBean> stdntClinicDetailsBeanList) {
		this.stdntClinicDetailsBeanList = stdntClinicDetailsBeanList;
	}
	
}
