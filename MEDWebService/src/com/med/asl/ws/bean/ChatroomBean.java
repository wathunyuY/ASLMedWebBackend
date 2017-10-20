package com.med.asl.ws.bean;

import java.util.List;

import com.med.ws.beans.ChatMsgBean;

public class ChatroomBean {
	private Integer subscrId;
	private Boolean allUserFlag;
	private String type;
	private String subscrName;
	private String subscrDescr;
	private ChatMsgBean lastMassage;
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
	public String getSubscrDescr() {
		return subscrDescr;
	}
	public void setSubscrDescr(String subscrDescr) {
		this.subscrDescr = subscrDescr;
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
	public ChatMsgBean getLastMassage() {
		return lastMassage;
	}
	public void setLastMassage(ChatMsgBean lastMassage) {
		this.lastMassage = lastMassage;
	}
	
	
}
