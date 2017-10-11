package com.med.ws.controller.workflow.master;

import com.med.ws.dto.response.MasterResponse;
import com.med.ws.dto.response.ResponseBody;

public interface WorkflowInterface {

	public ResponseBody processTask(ProcessBean processBean) throws Exception;

	public MasterResponse execute(ProcessBean processBean) throws Exception;

//	MasterResponse execute(ProcessBean processBean, HttpServletprocessBean.getRequest() httpReq) throws MEDException;

}
