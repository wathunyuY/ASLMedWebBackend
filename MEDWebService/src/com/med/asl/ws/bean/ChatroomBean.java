package com.med.asl.ws.bean;

import java.util.List;

public class ChatroomBean {
	private Integer subscrId;
	private Boolean allUserFlag;
	private String type;
	private String subscrName;
	private List<Integer> members;
	private List<MemberBean> memberDetails;
	public List<MemberBean> getMemberDetails() {
		return memberDetails;
	}
	public void setMemberDetails(List<MemberBean> memberDetails) {
		this.memberDetails = memberDetails;
	}
	public Integer getSubscrId() {
		return subscrId;
	}
	public void setSubscrId(Integer subscrId) {
		this.subscrId = subscrId;
	}
	
	public Boolean getAllUserFlag() {
		return allUserFlag;
	}
	public void setAllUserFlag(Boolean allUserFlag) {
		this.allUserFlag = allUserFlag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubscrName() {
		return subscrName;
	}
	public void setSubscrName(String subscrName) {
		this.subscrName = subscrName;
	}
	public List<Integer> getMembers() {
		return members;
	}
	public void setMembers(List<Integer> members) {
		this.members = members;
	}
	
	
}
