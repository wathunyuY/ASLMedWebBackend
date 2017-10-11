package com.med.ws.beans;

import java.util.List;

public class SubGroupBean {
	
	protected Integer groupNo;
	protected List<SubGroupStdntBean> subGroupStdntBeanList;
	
	public Integer getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}
	public List<SubGroupStdntBean> getSubGroupStdntBeanList() {
		return subGroupStdntBeanList;
	}
	public void setSubGroupStdntBeanList(List<SubGroupStdntBean> subGroupStdntBeanList) {
		this.subGroupStdntBeanList = subGroupStdntBeanList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupNo == null) ? 0 : groupNo.hashCode());
		result = prime * result + ((subGroupStdntBeanList == null) ? 0 : subGroupStdntBeanList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubGroupBean other = (SubGroupBean) obj;
		if (groupNo == null) {
			if (other.groupNo != null)
				return false;
		} else if (!groupNo.equals(other.groupNo))
			return false;
		if (subGroupStdntBeanList == null) {
			if (other.subGroupStdntBeanList != null)
				return false;
		} else if (!subGroupStdntBeanList.equals(other.subGroupStdntBeanList))
			return false;
		return true;
	}
	
	
}
