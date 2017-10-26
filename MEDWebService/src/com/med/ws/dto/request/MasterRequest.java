package com.med.ws.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.asl.ws.beans.ChatroomBean;
import com.med.asl.ws.beans.ResearchBean;
import com.med.asl.ws.beans.ResearchCategoryBean;
import com.med.ods.criteria.bean.ResearchSearchRqType;
import com.med.ws.dto.rq.ChatMessageRqType;
import com.med.ws.dto.rq.LoginRqType;
import com.med.ws.dto.rq.ServiceRegRqType;
import com.med.ws.dto.rq.ServiceUpdateRqType;
import com.med.ws.dto.rq.TaskRegRqType;
import com.med.ws.dto.rq.TaskUpdateRqTye;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class MasterRequest {
	protected LoginRqType loginRq;
	protected ChatMessageRqType chatRqType;
	protected ResearchCategoryBean researchCategoryRqType;
	protected ResearchBean researchRqtype;
	protected ResearchSearchRqType researchSearchRqType;
	protected ChatroomBean chatroomBeanRqType;
	protected ServiceUpdateRqType serviceUpdateRqType;
	protected ServiceRegRqType serviceRegRq;
	protected TaskRegRqType taskRegRq;
	protected TaskUpdateRqTye taskUpdateRq;
	public ServiceUpdateRqType getServiceUpdateRq() {
		return serviceUpdateRqType;
	}

	public void setServiceUpdateRq(ServiceUpdateRqType serviceUpdateRqType) {
		this.serviceUpdateRqType = serviceUpdateRqType;
	}

	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";
		try {
			jsonInString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return (jsonInString);
	}

	public LoginRqType getLoginRq() {
		return loginRq;
	}

	public void setLoginRq(LoginRqType loginRq) {
		this.loginRq = loginRq;
	}

	public ChatMessageRqType getChatRqType() {
		return chatRqType;
	}

	public void setChatRqType(ChatMessageRqType chatRqType) {
		this.chatRqType = chatRqType;
	}
	public ChatroomBean getChatroomBeanRqType() {
		return chatroomBeanRqType;
	}

	public void setChatroomBeanRqType(ChatroomBean chatroomBeanRqType) {
		this.chatroomBeanRqType = chatroomBeanRqType;
	}

	public ResearchCategoryBean getResearchCategoryRqType() {
		return researchCategoryRqType;
	}

	public void setResearchCategoryRqType(ResearchCategoryBean researchCategoryRqType) {
		this.researchCategoryRqType = researchCategoryRqType;
	}

	public ResearchBean getResearchRqtype() {
		return researchRqtype;
	}

	public void setResearchRqtype(ResearchBean researchRqtype) {
		this.researchRqtype = researchRqtype;
	}

	public ResearchSearchRqType getResearchSearchRqType() {
		return researchSearchRqType;
	}

	public void setResearchSearchRqType(ResearchSearchRqType researchSearchRqType) {
		this.researchSearchRqType = researchSearchRqType;
	}

	public ServiceUpdateRqType getServiceUpdateRqType() {
		return serviceUpdateRqType;
	}

	public void setServiceUpdateRqType(ServiceUpdateRqType serviceUpdateRqType) {
		this.serviceUpdateRqType = serviceUpdateRqType;
	}

	public ServiceRegRqType getServiceRegRq() {
		return serviceRegRq;
	}

	public void setServiceRegRq(ServiceRegRqType serviceRegRq) {
		this.serviceRegRq = serviceRegRq;
	}

	public TaskRegRqType getTaskRegRq() {
		return taskRegRq;
	}

	public void setTaskRegRq(TaskRegRqType taskRegRq) {
		this.taskRegRq = taskRegRq;
	}

	public TaskUpdateRqTye getTaskUpdateRq() {
		return taskUpdateRq;
	}

	public void setTaskUpdateRq(TaskUpdateRqTye taskUpdateRq) {
		this.taskUpdateRq = taskUpdateRq;
	}
	
	

}
