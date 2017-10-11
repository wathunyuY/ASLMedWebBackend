package com.med.ws.controller.workflow.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskEndPointDAO;
import com.med.ods.entity.TaskEndpoint;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;

@Service

public class TaskDelete extends AbstractWorkflowController{
	@Autowired
	TaskEndPointDAO taskEndpointDAO;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		Integer enptId = Integer.parseInt(processBean.getParams().getEnptId());
		TaskEndpoint task = taskEndpointDAO.findByPK(enptId);

		taskEndpointDAO.delete(task);

		return null;
	}

}
