package com.med.ws.controller.workflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.med.asl.ws.bean.ResearchCategoryBean;
import com.med.ws.controller.service.ResearchService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.response.ResponseBody;
@Service
@Transactional
public class ResearchCreateCategory extends AbstractWorkflowController {

	@Autowired
	ResearchService service;
	
	@Override
	public ResponseBody processTask(ProcessBean processBean) throws Exception {
		ResearchCategoryBean rq = processBean.getRequest().getResearchCategoryRqType();
		service.createCategory(rq);
		return null;
	}

}
