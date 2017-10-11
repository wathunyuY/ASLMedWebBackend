//package com.med.ws.controller.workflow;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.med.common.contants.ErrorConstants;
//import com.med.common.exception.MEDException;
//import com.med.ws.controller.service.CalendarService;
//import com.med.ws.controller.workflow.master.AbstractWorkflowController;
//import com.med.ws.controller.workflow.master.ProcessBean;
//import com.med.ws.dto.response.ResponseBody;
//
//@Service
//
//public class DeleteCalendar extends AbstractWorkflowController{
//	
//	private static Logger logger = LogManager.getLogger(DeleteCalendar.class);
//
//	@Autowired
//	CalendarService calendarService;
//	
//	@Override
//	public ResponseBody processTask(ProcessBean processBean) throws Exception {
//		ResponseBody rs = new ResponseBody();
//		try {
//			Integer calendarId = Integer.parseInt(processBean.getPathVariable());
//			calendarService.deleteCalendar(calendarId);
//		} catch (MEDException me){
//			throw me;
//		} catch (NumberFormatException ne){
//			throw ne;
//		} catch (Exception e) {
//			logger.error(e.getMessage(),e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//		return rs;
//	}
//
//}
