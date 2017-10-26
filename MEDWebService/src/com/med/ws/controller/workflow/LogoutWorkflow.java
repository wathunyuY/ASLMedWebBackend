package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.ws.controller.service.AccountService;
import com.med.ws.controller.service.ChatService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
public class LogoutWorkflow extends AbstractWorkflowController {

	@Autowired
	AccountService service;
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		service.updateAcceptChatrooLaw(false, Integer.parseInt(processBean.getOprid()));
		return null;
	}

}
