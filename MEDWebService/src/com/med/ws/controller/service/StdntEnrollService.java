package com.med.ws.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StdntEnrollService {
	
	private static Logger logger = LogManager.getLogger(StdntEnrollService.class);
	
//	@Autowired
//	ScheduleTopicTempSectionStdntDAO scheduleTopicTempSectionStdntDAO;
//	@Autowired
//	TermTblDAO termTblDAO;
//	@Autowired
//	ScheduleTopicTempDAO scheduleTopicTempDAO;
//	@Autowired
//	ClassOfferDAO classOfferDAO;
//	
	public List<String> getStdntCodeListInScheduleTopicTemp() throws Exception {
		
//		List<String> termList = termTblDAO.findTermsListByActiveCalendar();
//		List<String> classSectionList = classOfferDAO.findClassSectionListByTermList(termList);
		List<String> stdntCodeList = new ArrayList<>(); //scheduleTopicTempDAO.findScheduleTopicByClassSectionList(classSectionList);
		return stdntCodeList;
		
	}

}
