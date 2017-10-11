package com.med.ws.controller.endpoint;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.common.utils.JWTUtils;
import com.med.ods.dao.ServiceLogDAO;
import com.med.ods.entity.TxnLog;
import com.med.ws.controller.helper.ServiceLocator;
import com.med.ws.controller.service.LogService;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;
import com.med.ws.dto.request.MasterParams;
import com.med.ws.dto.request.MasterRequest;
import com.med.ws.dto.response.ExceptionBody;
import com.med.ws.dto.response.ExceptionResponse;
import com.med.ws.dto.response.MasterResponse;

@RestController
@RequestMapping({ "/private/main", "/private/app" })
public class PrivateServiceEndpoint {
	/**
	 * @param required
	 *            `jws` key in HttpServletRequest's header
	 */
	@Autowired
	private ServiceLocator serviceLocator;
	@Autowired
	private ServiceLogDAO serviceLogDAO;
	@Autowired
	private LogService logService;
	
	private static Logger logger = LogManager.getLogger(PrivateServiceEndpoint.class);

	private String menuleft = "TBL01";

	@SingleSubmit
	@RequestMapping(value = { "/**/{path_variable}" }, method = { RequestMethod.POST, RequestMethod.PUT, }, produces = "application/json")
	public @ResponseBody MasterResponse allRequestJSONMethod(@PathVariable String path_variable, @RequestBody MasterRequest masterRequest, HttpServletRequest httpReq)
			throws Exception {
		logger.info("Request>" + masterRequest);
		logger.info("path_variable>" + path_variable);
		logger.info("EndPoint> " + httpReq.getRequestURI().split("/")[4]);

		ProcessBean processBean = serviceLocator.getServiceBeanByEndpoint(httpReq);
		AbstractWorkflowController service = processBean.getService();
		processBean.setRequest(masterRequest);
		// processBean.setPathVariable(path_variable);
		processBean.setOprid(JWTUtils.authenAndGetPersId(httpReq.getHeader(Constants.JWT.HEADER_NAME)));
		// serviceLocator.recordService(httpReq, this.menuleft);
		MasterResponse res = service.execute(processBean);
		saveLog(httpReq, processBean);
		return res;
	}

	@RequestMapping(value = { "/**/{path_variable}" }, method = { RequestMethod.GET, RequestMethod.DELETE }, produces = "application/json")
	public @ResponseBody MasterResponse allRequestNONJSONMethod(@PathVariable String path_variable, MasterParams params, HttpServletRequest httpReq)
			throws Exception {
		logger.info("URI> " + httpReq.getRequestURI());
		logger.info("Request>" + (params).toString());
		logger.info("path_variable>" + path_variable);
		logger.info("EndPoint> " + httpReq.getRequestURI().split("/")[4]);

		ProcessBean processBean = serviceLocator.getServiceBeanByEndpoint(httpReq);
		AbstractWorkflowController service = processBean.getService();
		processBean.setParams(params);
		// processBean.setPathVariable(path_variable);
		processBean.setOprid(JWTUtils.authenAndGetPersId(httpReq.getHeader(Constants.JWT.HEADER_NAME)));
		// serviceLocator.recordService(httpReq, this.menuleft);
		MasterResponse res = service.execute(processBean);
		saveLog(httpReq, processBean);
		return res;
	}


	private void saveLog(HttpServletRequest request, ProcessBean processBean) {
		TxnLog txnLog = new TxnLog();
		txnLog.setRequestUrl(request.getRequestURI());
		txnLog.setRequestOprid(processBean.getOprid() != null ? Integer.parseInt(processBean.getOprid()) : null);
//		txnLogDAO.persist(txnLog);
		processBean.setTxnLog(txnLog);
	}

	@ExceptionHandler(Exception.class)
	public ExceptionResponse handleException(HttpServletRequest request, Exception ex) {
		String errorDesc;
		Long errorCd;
		ExceptionBody body = new ExceptionBody();

		if (ex instanceof MEDException) {
			errorDesc = ((MEDException) ex).getErrorDesc();
			errorCd = ((MEDException) ex).getErrorCd();
			body.setErrorMessage(((MEDException) ex).getReadableMessage());
		} else if (ex instanceof HttpMessageNotReadableException) {
			errorDesc = ex.getLocalizedMessage();
			errorCd = ErrorConstants.MISSING_REQUIRED_FIELD.getErrorCd();
		} else {
			MEDException medEx = new MEDException(ErrorConstants.UNKNOW_ERROR, ex);
			String st = ((MEDException) medEx).getReadableStackTrace();
			errorDesc = ex.getMessage();
			errorCd = ErrorConstants.UNKNOW_ERROR.getErrorCd();
			body.setErrorMessage(((MEDException) ex).getMessage());
			body.setStacktrace(st);
		}
		ExceptionResponse res = new ExceptionResponse(errorCd, errorDesc);
		res.setData(body);
		return res;
	}
}
