package com.med.ws.controller.workflow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.med.ws.controller.service.FirebaseCloudMessagingService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rq.FcmTokenRqType;

@Service
public class FirebaseUpdateToken extends AbstractWorkflowController{
	
	private static Logger logger = LogManager.getLogger(FirebaseUpdateToken.class);

	@Autowired
	FirebaseCloudMessagingService fcmService;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		FcmTokenRqType rq = processBean.getRequest().getFcmTokenRqType();
//		Integer oprid = Integer.parseInt(processBean.getOprid());
		fcmService.saveDeviceToken(rq.getFcmToken(), rq.getPersId()); //FIXME oprid
		return null;
	}
	
	
}
