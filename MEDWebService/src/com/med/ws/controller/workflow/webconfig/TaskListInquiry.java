package com.med.ws.controller.workflow.webconfig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskEndPointDAO;
import com.med.ods.entity.TaskEndpoint;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rs.TaskListRsType;

@Service

public class TaskListInquiry extends AbstractWorkflowController {
	@Autowired
	TaskEndPointDAO taskEndpointDAO;
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		Collection<TaskEndpoint> taskList = taskEndpointDAO.findAll();
		List<TaskListRsType> taskListRs = new ArrayList<TaskListRsType>();
		for(TaskEndpoint t : taskList){
			TaskListRsType task = new TaskListRsType();
			StringJoiner joiner = new StringJoiner("/");
			task.setEnpointId(t.getEnptId());
			task.setTaskEndpoint(joiner.add(t.getEnptZone()).add(t.getEnptType()).add(t.getEnptName()).toString());
			task.setTaskActiveFlag(t.getEnptActFlag());
			task.setTaskMethod(t.getEnptHttpmethod());
			task.setTaskServiceName(t.getTaskServiceTbl().getTaskServiceName());
			taskListRs.add(task);
		}
		ResponseBody rs = new ResponseBody();
		rs.setTaskRsList(taskListRs);
		return rs;
	}
	
}
