package com.med.ws.controller.workflow.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskServiceTbl;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rq.ServiceUpdateRqType;

@Service

public class ServiceUpdate extends AbstractWorkflowController{
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ServiceUpdateRqType serviceUpadateRq = processBean.getRequest().getServiceUpdateRq();
		TaskServiceTbl service = taskServiceTblDAO.findByPK(serviceUpadateRq.getServiceId());
		
		service.setTaskServiceName(serviceUpadateRq.getName());
		
		taskServiceTblDAO.merge(service);
		
		return null;
	}

}
