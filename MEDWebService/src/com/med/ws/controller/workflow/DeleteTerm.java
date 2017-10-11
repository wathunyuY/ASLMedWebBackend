//package com.med.ws.controller.workflow;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.med.common.contants.ErrorConstants;
//import com.med.common.exception.MEDException;
//import com.med.ods.entity.TermTblId;
//import com.med.ws.controller.service.CalendarService;
//import com.med.ws.controller.workflow.master.AbstractWorkflowController;
//import com.med.ws.controller.workflow.master.ProcessBean;
//import com.med.ws.dto.response.ResponseBody;
//import com.med.ws.dto.type.rq.TermRqType;
//
//@Service
//
//public class DeleteTerm extends AbstractWorkflowController{
//
//	@Autowired
//	CalendarService calendarService;
//	
//	@Override
//	public ResponseBody processTask(ProcessBean processBean) throws Exception {
//		ResponseBody rs = new ResponseBody();
//		try {
//			TermRqType rq = processBean.getRequest().getTermRqType();
//			TermTblId termId = new TermTblId();
//			termId.setTermId(rq.getTerm().getTermId());
//			termId.setAcadCarId(rq.getTerm().getAcadCarId());
//			calendarService.deleteTerm(termId);
//		} catch (MEDException me){
//			throw me;
//		} catch (Exception e) {
//			logger.error(e.getMessage(),e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//		return rs;
//	}
//	
//}
