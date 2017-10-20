package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ws.controller.service.PersonalService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
@Service
@Transactional
public class UpdateChatNickname extends AbstractWorkflowController {
	@Autowired
	PersonalService service;
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		service.updateNickname(processBean.getParams().getNickname(), Integer.parseInt(processBean.getPathVariable()));
		return null;
	}

}
