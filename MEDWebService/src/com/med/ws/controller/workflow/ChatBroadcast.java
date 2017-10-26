package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.ws.controller.service.TalkService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
public class ChatBroadcast extends AbstractWorkflowController {

	@Autowired
	TalkService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		service.broadcastChatMessage(processBean);
		return null;
	}

}
