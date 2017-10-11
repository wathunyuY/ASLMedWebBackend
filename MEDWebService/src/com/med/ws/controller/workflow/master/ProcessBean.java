package com.med.ws.controller.workflow.master;

import com.med.ods.entity.TxnLog;
import com.med.ws.dto.request.MasterParams;
import com.med.ws.dto.request.MasterRequest;
import com.med.ws.dto.response.MasterResponse;

public class ProcessBean {
	private MasterRequest request;
	private MasterResponse response;
	private MasterParams params;
	private String pathVariable;
	private String oprid;
	private AbstractWorkflowController service;
	private Boolean isWorkFlowFlag = Boolean.FALSE;
	private String endpoint;
	private String method;
	private Boolean isAppReq;
	private TxnLog txnLog;
	
	public MasterResponse getResponse() {
		return response;
	}

	public void setResponse(MasterResponse response) {
		this.response = response;
	}

	public String getPathVariable() {
		return pathVariable;
	}

	public void setPathVariable(String pathVariable) {
		this.pathVariable = pathVariable;
	}

	public String getOprid() {
		return oprid;
	}

	public void setOprid(String oprid) {
		this.oprid = oprid;
	}

	public MasterParams getParams() {
		return params;
	}

	public void setParams(MasterParams params) {
		this.params = params;
	}

	public MasterRequest getRequest() {
		return request;
	}

	public void setRequest(MasterRequest request) {
		this.request = request;
	}

	public AbstractWorkflowController getService() {
		return service;
	}

	public void setService(AbstractWorkflowController service) {
		this.service = service;
	}

	public Boolean getIsWorkFlowFlag() {
		return isWorkFlowFlag;
	}

	public void setIsWorkFlowFlag(Boolean isWorkFlowFlag) {
		this.isWorkFlowFlag = isWorkFlowFlag;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Boolean getIsAppReq() {
		return isAppReq;
	}

	public void setIsAppReq(Boolean isAppReq) {
		this.isAppReq = isAppReq;
	}

	public TxnLog getTxnLog() {
		return txnLog;
	}

	public void setTxnLog(TxnLog txnLog) {
		this.txnLog = txnLog;
	}


}
