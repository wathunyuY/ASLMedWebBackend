package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.ws.controller.service.ResearchService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
@Service
@Transactional
public class ResearchGetFilter extends AbstractWorkflowController {
	@Autowired
	ResearchService service;
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ResponseBody rs = new ResponseBody();
		rs.setResearchFilterRsType(service.getResearchFilter());
		return rs;
	}

}
