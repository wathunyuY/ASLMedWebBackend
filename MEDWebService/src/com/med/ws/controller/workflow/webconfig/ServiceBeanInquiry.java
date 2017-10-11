package com.med.ws.controller.workflow.webconfig;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.TaskServiceTbl;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
import com.med.ws.dto.type.rs.ServiceListRsType;

@Service

public class ServiceBeanInquiry extends AbstractWorkflowController {
	@Autowired
	TaskServiceTblDAO taskServiceTblDAO;

	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		Collection<TaskServiceTbl> serviceList = taskServiceTblDAO.findAllOrderByName();
		List<ServiceListRsType> serviceRsList = new ArrayList<ServiceListRsType>();
		for (TaskServiceTbl t : serviceList) {
			ServiceListRsType service = new ServiceListRsType();
			service.setServiceId(t.getTaskServiceId());
			service.setServiceName(t.getTaskServiceName());
			serviceRsList.add(service);
		}
		ResponseBody rs = new ResponseBody();
		rs.setServiceRsList(serviceRsList);
		return rs;
	}

}
