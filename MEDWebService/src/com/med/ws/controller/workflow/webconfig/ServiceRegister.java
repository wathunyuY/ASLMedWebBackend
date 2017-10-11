package com.med.ws.controller.workflow.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskEndPointDAO;
import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskServiceTbl;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rq.ServiceRegRqType;

@Service

public class ServiceRegister extends AbstractWorkflowController {
	@Autowired
	TaskEndPointDAO taskEndpointDAO;
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;

	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ServiceRegRqType serviceReqRq= processBean.getRequest().getServiceRegRq();
		TaskServiceTbl service = new TaskServiceTbl();
		service.setTaskServiceName(serviceReqRq.getName());
		taskServiceTblDAO.persist(service);
		return null;
	}

}
