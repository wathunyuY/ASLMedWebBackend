package com.med.ws.controller.helper;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.HandlerMapping;

import com.med.common.contants.ErrorConstants;
import com.med.common.context.AppContextHelper;
import com.med.common.exception.MEDException;
import com.med.ods.dao.ServiceLogDAO;
import com.med.ods.dao.TaskServiceTblDAO;
import com.med.ods.entity.ServiceLog;
import com.med.ods.entity.TaskEndpoint;
import com.med.ods.entity.TaskServiceTbl;
import com.med.ods.entity.TxnLog;
import com.med.ws.controller.workflow.master.AbstractWorkflowController;
import com.med.ws.controller.workflow.master.ProcessBean;

@Component
@Transactional
public class ServiceLocator {
	@Autowired
	private TaskServiceTblDAO taskServiceTblDAO;
	@Autowired
	private ServiceLogDAO serviceLogDAO;

	private Map<String, AbstractWorkflowController> services;

	public ProcessBean getServiceBeanByEndpoint(HttpServletRequest request) throws MEDException {
		return getServiceBeanByEndpoint(request, new ProcessBean());
	}

	public ProcessBean getServiceBeanByEndpoint(HttpServletRequest request, ProcessBean processBean) throws MEDException {
		String path[] = request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString().split("/");
		/*
		 * ex. /zone/project/serviceName/:path_variable
		 */

		String method = request.getMethod();
		String concat_path = null;
		if (path.length >= 5) {
			concat_path = String.join("/", Arrays.copyOfRange(path, 3, path.length - 1));
		} else {
			concat_path = path[3];
		}
		System.out.println("length=" + path.length);
		System.out.println("concat_path=" + concat_path);
		Object[] obj;
		try {
			obj = taskServiceTblDAO.findServicenameByEndpoint(concat_path, method, path[1], path[2]);
		} catch (Exception e) {
			if (path.length >= 5) {
				System.out.println("try again concat_path>" + concat_path);
				concat_path = String.join("/", Arrays.copyOfRange(path, 3, path.length));
				obj = taskServiceTblDAO.findServicenameByEndpoint(concat_path, method, path[1], path[2]);
			} else {
				throw e;
			}
		}
		TaskServiceTbl ts = (TaskServiceTbl) obj[0];
		TaskEndpoint enp = (TaskEndpoint) obj[1];

		String pathVariable = null;
		
		// FIXME
		if (path.length >= 5 && !enp.getEnptPathVariableFlag().equals("F")) {
			pathVariable = path[path.length - 1];
			System.out.println(pathVariable);
			processBean.setPathVariable(pathVariable);
		}
		// else if (path.length != 5 &&enp.getEnptPathVariableFlag().equals("R")) {
		// throw new MEDException(ErrorConstants.PATH_NOT_FOUND);
		// }
		// processBean.setIsWorkFlowFlag(enp.getEnptWfFlag().equals("T") ? true
		// : false);
		System.out.println("setIsAppReq>" + "app".equalsIgnoreCase(path[2]));
		processBean.setIsAppReq("app".equalsIgnoreCase(path[2]));
		processBean.setService(getServiceBeanByServiceName(ts.getTaskServiceName()));
		if (enp.getEnptTxnLog()) {
			TxnLog txnLog = new TxnLog();
			txnLog.setRequestUrl(request.getRequestURI() + ((request.getQueryString() != null) ? "?" + request.getQueryString() : ""));
			System.out.println(txnLog.getRequestUrl());
			txnLog.setHeader(request.getHeader("User-Agent"));
			txnLog.setRequestTime(Calendar.getInstance().getTime());
			txnLog.setServer(request.getServerName());
			processBean.setTxnLog(txnLog);
		}
		return processBean;
	}

	public void recordService(HttpServletRequest request, String group) throws MEDException {
		String endPoint = request.getRequestURI().split("/")[4];
		ServiceLog log = serviceLogDAO.findByPK(endPoint);
		if (null == log) {
			log = new ServiceLog();
			log.setServiceName(endPoint);
		}
		log.setServiceGroup(group);
		serviceLogDAO.merge(log);
	}

	public AbstractWorkflowController getServiceBeanByServiceName(String className) throws MEDException {
		initialService();
		AbstractWorkflowController service = services.get(className);
		if (service == null) {
			throw new MEDException(ErrorConstants.SERVICE_NOT_FOUND, className); // Serv
		}
		return service;
	}

	public void clearService() {
		services = null;
	}

	private void initialService() {
		if (services == null) {
			services = new HashMap<String, AbstractWorkflowController>();
			Map<String, Object> beans = AppContextHelper.getBeansFromContext();
			System.out.println("bean >" + beans);
			for (Entry<String, Object> bean : beans.entrySet()) {
				if (bean.getValue() instanceof AbstractWorkflowController) {
					services.put(bean.getKey(), (AbstractWorkflowController) bean.getValue());
				}
			}
			System.out.println(services);
		}
	}
}