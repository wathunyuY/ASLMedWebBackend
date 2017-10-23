package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.ws.controller.service.ChatService;
import com.med.ws.controller.service.FirebaseCloudMessagingService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service
public class LogoutWorkflow extends AbstractWorkflowController {

	@Autowired
	FirebaseCloudMessagingService fcmService;
	@Autowired
	ChatService chatService;
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		processBean.setOprid("2");
		fcmService.deleteDeviceToken(processBean);
//		if (processBean.getIsAppReq())
		fcmService.logoutUnsubscribeOrderFromService(processBean);
		return null;
	}

}
