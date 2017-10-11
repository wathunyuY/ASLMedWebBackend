package com.med.ws.controller.workflow.master;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;
import com.med.common.exception.MEDException;
import com.med.ods.entity.TxnLog;
import com.med.ws.controller.service.LogService;
import com.med.ws.dto.response.MasterResponse;
import com.med.ws.dto.response.ResponseBody;

public abstract class AbstractWorkflowController implements WorkflowInterface {
	// public MasterprocessBean.getRequest() processBean.getRequest();
	// public String pathVariable;
	// public MasterResponse response;
	public static Logger logger = LogManager.getLogger(AbstractWorkflowController.class);
	// public MasterParams params;
	// public String oprid;
//	@Autowired
//	TransWorkflowDAO transWorkflowDAO;

	@Autowired
	LogService logService;
	// @Override
	// public MasterResponse execute(ProcessBean processBean,
	// HttpServletprocessBean.getRequest() httpReq) throws MEDException {
	//
	// try {
	// processBean.setOprid(JWTUtils.authenAndGetPersId(httpReq.getHeader(Constants.JWT.HEADER_NAME)));
	// logger.info("oprid:" + processBean.getOprid());
	// } catch (Exception e) {
	// logger.error(e.getMessage(), e);
	// }
	//
	// return execute(processBean);
	// }

	@Override
	public MasterResponse execute(ProcessBean processBean) throws Exception {
		logger.info("execute");
		logger.debug(processBean.getRequest());
		Long startTime = Calendar.getInstance().getTimeInMillis();
		TxnLog txnLog = processBean.getTxnLog();
		if (txnLog != null) {
			txnLog = logService.initTxnLog(processBean);
		}
		////////////////////////////////////////////////////////////////////////////////

		try {
			MasterResponse response = new MasterResponse();
			response.setSeverity(Constants.SEVERITY.SUCCESS);
			processBean.setResponse(response);
			ResponseBody data = processTask(processBean);
			response.setData(data);
		} catch (Exception e) {
			logger.error(e.getMessage());
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			if (txnLog != null) {
				e.printStackTrace(pw);
				txnLog.setStackTrace(sw.toString().getBytes());
				Long endTime = Calendar.getInstance().getTimeInMillis();
				txnLog.setExecuteTime((int) (endTime - startTime));
				logService.saveTxnLog(processBean);
			}
			if (e instanceof MEDException) {
				throw e;
			} else {
				throw new MEDException(ErrorConstants.UNKNOW_ERROR, e);
			}
		}

		////////////////////////////////////////////////////////////////////////////////

//		if (processBean.getIsWorkFlowFlag()) {
//			// logger.info("=================== Initiate workflow step
//			// ==========================");
//			try {
//				// TODO Work flow logic here
//				logger.info(transWorkflowDAO.findAll());
//			} catch (Exception e) {
//				logger.error(e.getMessage(), e);
//				throw new MEDException(ErrorConstants.FLUSH_WORKFLOW_ERROR);
//			}
//			// logger.info("=================== End workflow step
//			// ==========================");
//		}

		////////////////////////////////////////////////////////////////////////////////

		Long endTime = Calendar.getInstance().getTimeInMillis();
		logger.info("Execute time: " + (endTime - startTime) + " ms");
		logger.debug(processBean.getResponse());
		if (txnLog != null) {
			txnLog.setExecuteTime((int) (endTime - startTime));
			logService.saveTxnLog(processBean);
		}
		return processBean.getResponse();
	}

}