package com.med.ws.controller.workflow.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskServiceTbl;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service

public class ServiceDelete extends AbstractWorkflowController{
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		Integer serviceId = Integer.parseInt(processBean.getParams().getServiceId());
		TaskServiceTbl service = taskServiceTblDAO.findByPK(serviceId);

		taskServiceTblDAO.delete(service);

		return null;
	}

}
