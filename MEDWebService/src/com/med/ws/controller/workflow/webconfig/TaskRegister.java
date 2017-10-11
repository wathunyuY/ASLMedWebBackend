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
import com.med.ws.dto.type.rq.TaskRegRqType;

@Service

public class TaskRegister extends AbstractWorkflowController {
	@Autowired
	TaskEndPointDAO taskEndpointDAO;
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;

	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		TaskRegRqType taskRegRq = processBean.getRequest().getTaskRegRq();
		TaskEndpoint task = new TaskEndpoint();

		String enptName = taskRegRq.getName();
		String enptType = taskRegRq.getType();
		String enptPathVariableFlag = taskRegRq.getPathVariableFlag();
		String enptZone = taskRegRq.getZone();
		String enptHttpmethod = taskRegRq.getMethod();
		String enptActFlag = taskRegRq.getActiveFlag();
		Integer taskServiceTblId = taskRegRq.getServiceId();

		task.setEnptName(enptName);
		task.setEnptType(enptType);
		task.setEnptZone(enptZone);
		task.setEnptHttpmethod(enptHttpmethod);
		task.setTaskServiceTbl(taskServiceTblDAO.findByPK(taskServiceTblId));
		task.setEnptActFlag(enptActFlag);
		task.setEnptPathVariableFlag(enptPathVariableFlag);

		taskEndpointDAO.save(task);

		return null;
	}

}
