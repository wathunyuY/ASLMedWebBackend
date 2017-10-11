package com.med.ws.controller.workflow.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskEndPointDAO;
import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskEndpoint;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rq.TaskUpdateRqTye;

@Service

public class TaskUpdate extends AbstractWorkflowController{
	@Autowired
	TaskEndPointDAO taskEndpointDAO;
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		TaskUpdateRqTye taskUpdateRq = processBean.getRequest().getTaskUpdateRq();
		
		String enptName = taskUpdateRq.getName();
		String enptType = taskUpdateRq.getType();
		String enptPathVariableFlag = taskUpdateRq.getPathVariableFlag();
		String enptZone = taskUpdateRq.getZone();
		String enptHttpmethod = taskUpdateRq.getMethod();
		String enptActFlag = taskUpdateRq.getActiveFlag();
		Integer taskServiceTblId = taskUpdateRq.getServiceId();
		Integer enptId = taskUpdateRq.getTaskId();
		
		TaskEndpoint task = taskEndpointDAO.findByPK(enptId);

		task.setEnptName(enptName);
		task.setEnptType(enptType);
		task.setEnptZone(enptZone);
		task.setEnptHttpmethod(enptHttpmethod);
		task.setTaskServiceTbl(taskServiceTblDAO.findByPK(taskServiceTblId));
		task.setEnptActFlag(enptActFlag);
		task.setEnptPathVariableFlag(enptPathVariableFlag);

		taskEndpointDAO.merge(task);

		return null;
	}

}
