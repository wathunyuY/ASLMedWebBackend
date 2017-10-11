package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ws.controller.service.ChatService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
@Transactional
public class CreateChatroom extends AbstractWorkflowController {

	@Autowired
	ChatService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		service.createAndUpdateChatroom(processBean.getRequest().getChatroomBeanRqType(), Integer.parseInt(processBean.getOprid()));
		return null;
	}

}
