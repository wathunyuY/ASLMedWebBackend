package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ws.controller.service.ChatService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
@Service
@Transactional
public class DeleteMemberByChatroom extends AbstractWorkflowController {
	
	@Autowired
	ChatService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		if(null != processBean.getPathVariable())
			service.deleteMemberBySubscrId(Integer.parseInt(processBean.getParams().getPersId()), 
					Integer.parseInt(processBean.getPathVariable()));
		else throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELDS_PARAMS," 'subscrId' is missing");
		return null;
	}

}
