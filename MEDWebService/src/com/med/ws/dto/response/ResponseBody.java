package com.med.ws.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.asl.ws.beans.ChatMsgBean;
import com.med.asl.ws.beans.ChatroomBean;
import com.med.asl.ws.beans.MemberBean;
import com.med.asl.ws.beans.ResearchBean;
import com.med.asl.ws.beans.ResearchCategoryBean;
import com.med.asl.ws.beans.ResearchFilterBean;
import com.med.ws.dto.rs.LoginRsType;
import com.med.ws.dto.rs.ServiceListRsType;
import com.med.ws.dto.rs.TaskListRsType;

@JsonInclude(Include.NON_NULL)
public class ResponseBody {

	protected LoginRsType loginRs;
	protected List<TaskListRsType> taskRsList;
	protected List<ServiceListRsType> serviceRsList;
	protected String result;
	protected List<ChatMsgBean> chatMsgListRsType;
	protected String id;
	protected ChatroomBean chatroomRsType;
	protected List<ChatroomBean> chatroomRsTypes;
	protected List<MemberBean> memberRstypes;
	protected List<ResearchCategoryBean> researchCategoryRsTypes; 
	protected ResearchBean researchRsType;
	protected ResearchFilterBean researchFilterRsType;
	protected List<ResearchBean> researchRsTypes;
	protected Boolean isAcceptChatroomLaw;
	protected ChatMsgBean chatMsgRsType;
	protected List<String> fileUploadName;
	public LoginRsType getLoginRs() {
		return loginRs;
	}
	public void setLoginRs(LoginRsType loginRs) {
		this.loginRs = loginRs;
	}
	public List<TaskListRsType> getTaskRsList() {
		return taskRsList;
	}
	public void setTaskRsList(List<TaskListRsType> taskRsList) {
		this.taskRsList = taskRsList;
	}
	public List<ServiceListRsType> getServiceRsList() {
		return serviceRsList;
	}
	public void setServiceRsList(List<ServiceListRsType> serviceRsList) {
		this.serviceRsList = serviceRsList;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public List<ChatMsgBean> getChatMsgListRsType() {
		return chatMsgListRsType;
	}
	public void setChatMsgListRsType(List<ChatMsgBean> chatMsgListRsType) {
		this.chatMsgListRsType = chatMsgListRsType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ChatroomBean getChatroomRsType() {
		return chatroomRsType;
	}
	public void setChatroomRsType(ChatroomBean chatroomRsType) {
		this.chatroomRsType = chatroomRsType;
	}
	public List<ChatroomBean> getChatroomRsTypes() {
		return chatroomRsTypes;
	}
	public void setChatroomRsTypes(List<ChatroomBean> chatroomRsTypes) {
		this.chatroomRsTypes = chatroomRsTypes;
	}
	public List<MemberBean> getMemberRstypes() {
		return memberRstypes;
	}
	public void setMemberRstypes(List<MemberBean> memberRstypes) {
		this.memberRstypes = memberRstypes;
	}
	public List<ResearchCategoryBean> getResearchCategoryRsTypes() {
		return researchCategoryRsTypes;
	}
	public void setResearchCategoryRsTypes(List<ResearchCategoryBean> researchCategoryRsTypes) {
		this.researchCategoryRsTypes = researchCategoryRsTypes;
	}
	public ResearchBean getResearchRsType() {
		return researchRsType;
	}
	public void setResearchRsType(ResearchBean researchRsType) {
		this.researchRsType = researchRsType;
	}
	public ResearchFilterBean getResearchFilterRsType() {
		return researchFilterRsType;
	}
	public void setResearchFilterRsType(ResearchFilterBean researchFilterRsType) {
		this.researchFilterRsType = researchFilterRsType;
	}
	public List<ResearchBean> getResearchRsTypes() {
		return researchRsTypes;
	}
	public void setResearchRsTypes(List<ResearchBean> researchRsTypes) {
		this.researchRsTypes = researchRsTypes;
	}
	public Boolean getIsAcceptChatroomLaw() {
		return isAcceptChatroomLaw;
	}
	public void setIsAcceptChatroomLaw(Boolean isAcceptChatroomLaw) {
		this.isAcceptChatroomLaw = isAcceptChatroomLaw;
	}
	public ChatMsgBean getChatMsgRsType() {
		return chatMsgRsType;
	}
	public void setChatMsgRsType(ChatMsgBean chatMsgRsType) {
		this.chatMsgRsType = chatMsgRsType;
	}
	public List<String> getFileUploadName() {
		return fileUploadName;
	}
	public void setFileUploadName(List<String> fileUploadName) {
		this.fileUploadName = fileUploadName;
	}
	
	

}