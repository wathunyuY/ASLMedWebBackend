package com.med.ws.controller.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CalendarService {

//	@Autowired
//	CalendarTblDAO calendarTblDAO;
//	@Autowired
//	TermTblDAO termTblDAO;
//	@Autowired
//	AcadCarTblDAO acadCarTblDAO;
//	@Autowired
//	HolidayDAO holidayDAO;
////	@Autowired
////	HolidayService holidayService;
//	@Autowired
//	AcadOrgTblDAO acadOrgDAO;
//	@Autowired
//	PermsPersGroupTblDAO permsPersGroupTblDAO;
//	@Autowired
//	EmpInfoDAO empInfoDAO;
//	@Autowired
//	AcadCampusTblDAO acadCampusDAO;
//	@Autowired
//	StdntLevelTblDAO stdntLevelTblDAO;
//	@Autowired
//	MasterDataService masterDataService;
//	@Autowired
//	AgendaTblDAO agendaTblDAO;
//	@Autowired
//	EventTblDAO eventDAO;
//	@Autowired
//	EventRespoDAO eventRespoDAO;
//	@Autowired
//	ActivityTblDAO activityTblDAO;
//	@Autowired
//	ActivityRespoDAO activityRespoDAO;
//	@Autowired
//	ActivityStdntGroupDAO activityStdntGroupDAO;
//	@Autowired
//	EventStdntGroupDAO eventStdntGroupDAO;
//	@Autowired
//	EventEmpGroupDAO eventEmpGroupDAO;
//	@Autowired
//	ScheduleTopicDAO scheduleTopicDAO;
//	@Autowired
//	ScheduleTopicTempDAO scheduleTopicTempDAO;
////	@Autowired
////	ScheduleService scheduleService;
//	@Autowired
//	PersonalService personalService;
//	@Autowired
//	StdntInfoDAO stdntInfoDAO;
//	@Autowired
//	ActivityEmpDAO activityEmpDAO;
//	@Autowired
//	ActivityStdntDAO activityStdntDAO;
//	@Autowired
//	PersonDAO personDAO;
//	@Autowired
//	ActivityInviteDAO activityInviteDAO;
////	@Autowired
////	InitWorkflowService initWorkflowService;
////	@Autowired
////	ClassService classService;
//	
//	private static Logger logger = LogManager.getLogger(CalendarService.class);
//	
//
//	public CalendarRsType getCalendarById(int calendarId) throws Exception {
//		CalendarRsType calendarRsType = new CalendarRsType();
//		try {
//			CalendarTbl calendar = calendarTblDAO.findByPK(calendarId);
//			calendarRsType.setCalendarId(calendarId);
//			calendarRsType.setCalendarTitle(calendar.getCalendarTitle());
//			calendarRsType.setCalendarTitleEn(calendar.getTitleEn());
//			calendarRsType.setCalendarDescrEn(calendar.getDescrEn());
//			calendarRsType.setCalendarDescr(calendar.getDescr());
//			calendarRsType.setStatus(calendar.getStatus());
//			// Setting ACAD_CAR
//			AcadCarBean acadCarBean = new AcadCarBean();
//			acadCarBean.setAcadCarId(calendar.getAcadCarTbl().getAcadCarId());
//			acadCarBean.setDesc(calendar.getAcadCarTbl().getDescr());
//			calendarRsType.setAcadCar(acadCarBean);
//			
//			AcadCampusBean acadCampusBean = new AcadCampusBean();
//			acadCampusBean.setId(calendar.getAcadCampusTbl().getAcadCampusId());
//			acadCampusBean.setDesc(calendar.getAcadCampusTbl().getDescr());
//			calendarRsType.setAcadCampus(acadCampusBean);
//			
//			// Setting TERM_TBL
//			List<TermTblBean> termList = new ArrayList<TermTblBean>();
//			List<TermTbl> terms = termTblDAO.findAllTermByYear(calendar.getCalendarTitle());
//			for (TermTbl term : terms) {
//				TermTblBean bean = new TermTblBean();
//				bean.setTermId(term.getId().getTermId());
//				bean.setStdntLevel(term.getStdntLevelTbl().getStdntLevelTblId());
//				bean.setAcadCarId(term.getAcadCarTbl().getAcadCarId());
//				bean.setOrder(term.getTermOrder());
//				bean.setDesc(term.getDescr());
//				bean.setDescEn(term.getDescrEn());
//				bean.setAcadYear(term.getAcadYear());
//				if (null != term.getStartDate()) {
//					bean.setStartDate(DateUtils.convertDateToString(term.getStartDate()));
//				}
//				if (null != term.getEndDate()) {
//					bean.setEndDate(DateUtils.convertDateToString(term.getEndDate()));
//				}
//
//				termList.add(bean);
//			}
//			calendarRsType.setTerm(termList);
//			
//			// Setting HOLIDAY_TBL
//			List<HolidayBean> holidayList = new ArrayList<HolidayBean>();
//			for (Holiday h : holidayDAO.findHolidaysByCalendar(calendarId)) {
//				HolidayBean holidayBean = new HolidayBean();
//				holidayBean.setHolidayId(h.getHolidayId());
//				holidayBean.setHolidayTitle(h.getHolidayTitle());
//				holidayBean.setHolidayTitleEn(h.getTitleEn());
//				holidayBean.setDescr(h.getDescr());
//				holidayBean.setDescrEn(h.getDescrEn());
//				holidayBean.setStartDate(DateUtils.convertDateToString(h.getStartDate()));
//				holidayBean.setEndDate(DateUtils.convertDateToString(h.getEndDate()));
//				holidayList.add(holidayBean);
//			}
//			calendarRsType.setHolidays(holidayList);
//
//			// Setting AGENDA_TBL
//			calendarRsType.setAgendas(this.getAgendaByCalendarId(calendarId));
//
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//		return calendarRsType;
//
//	}
//
//	public List<CalendarBean> getAllCalendarList() throws Exception {
//		List<CalendarBean> calendarList = new ArrayList<CalendarBean>();
//		try {
//			Collection<CalendarTbl> calendarQueryList = calendarTblDAO.findAll();
//			for (CalendarTbl cld : calendarQueryList) {
//				CalendarBean calendarBean = new CalendarBean();
//				calendarBean.setCalendarId(cld.getCalendarId());
//				calendarBean.setCalendarTitle(cld.getCalendarTitle());
//				calendarBean.setCalendarTitleEn(cld.getTitleEn());
//				calendarBean.setCalendarDescr(cld.getDescr());
//				calendarBean.setCalendarDescrEn(cld.getDescrEn());
//				calendarBean.setStatus(cld.getStatus());
//				AcadCarBean acadCarBean = new AcadCarBean();
//				acadCarBean.setAcadCarId(cld.getAcadCarTbl().getAcadCarId());
//				acadCarBean.setDesc(cld.getAcadCarTbl().getDescr());
//				calendarBean.setAcadCar(acadCarBean);
//				AcadCampusBean acadCampusBean = new AcadCampusBean();
//				acadCampusBean.setId(cld.getAcadCampusTbl().getAcadCampusId());
//				acadCampusBean.setDesc(cld.getAcadCampusTbl().getDescr());
//				calendarBean.setAcadCampus(acadCampusBean);
//				calendarList.add(calendarBean);
//			}
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND);
//		}
//		return calendarList;
//	}
//
//	public void updateCalendar(CalendarRqType data, Integer oprid) throws Exception {
//		CalendarTbl cal = calendarTblDAO.findByPK(data.getCalendarId());
//		// cal.setCalendarTitle(data.getCalendarTitle());
//		// cal.setTitleEn(data.getCalendarTitleEn());
//		cal.setDescr(data.getCalendarDescr());
//		cal.setDescrEn(data.getCalendarDescrEn());
//		cal.setLastUpdDttm(Calendar.getInstance().getTime());
//		cal.setLastUpdOprid(oprid);
//		calendarTblDAO.merge(cal);
//	}
//
//	public void updateCalendarStatus(Integer calendarId, Date lastUpdDt, Integer oprid) throws Exception {
//		try {
//			CalendarTbl calendar = calendarTblDAO.findByPK(calendarId);
//			calendar.setStatus(ConfigMapHelper.getConfigValue("STATUS_CONSTANTS.ACTIVE"));
//			calendar.setLastUpdDttm(lastUpdDt);
//			calendar.setLastUpdOprid(oprid);
//			calendarTblDAO.merge(calendar);
//			Integer acadCarIdUgrd = Integer.parseInt(ConfigMapHelper.getConfigValue("CONFIG_CONSTANTS.ACAD_CAR_ID_UGRD"));
//			if(acadCarIdUgrd == calendar.getAcadCarTbl().getAcadCarId()){
////				initWorkflowService.initOpenCrseClinicLevel1(calendarId, lastUpdDt,oprid);
//			}
//			
//		} catch (NullPointerException nu) {
//			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "CALENDAR_ID: " + calendarId);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//	}
//
//	/**
//	 * @author Teerapan V.
//	 */
//	public FullCalendarRsType getFullCalendarByPersId(int calendarId, int oprid) throws Exception {
//		FullCalendarRsType fullCalendarRsType = new FullCalendarRsType();
//		try {
//			CalendarTbl calendar = calendarTblDAO.findByPK(calendarId);
//			fullCalendarRsType.setCalendarId(calendarId);
//			fullCalendarRsType.setCalendarTitle(calendar.getCalendarTitle());
//			fullCalendarRsType.setCalendarDescr(calendar.getDescr());
//			fullCalendarRsType.setStatus(calendar.getStatus());
//			
//			AcadCarBean acadCarBean = new AcadCarBean();
//			acadCarBean.setAcadCarId(calendar.getAcadCarTbl().getAcadCarId());
//			acadCarBean.setDesc(calendar.getAcadCarTbl().getDescr());
//			fullCalendarRsType.setAcadCar(acadCarBean);
//			
//			AcadCampusBean acadCampusBean = new AcadCampusBean();
//			acadCampusBean.setId(calendar.getAcadCampusTbl().getAcadCampusId());
//			acadCampusBean.setDesc(calendar.getAcadCampusTbl().getDescr());
//			acadCampusBean.setDescEn(calendar.getAcadCampusTbl().getDescrEn());
//			acadCampusBean.setDescShort(calendar.getAcadCampusTbl().getDescrShort());
//			acadCampusBean.setDescShortEn(calendar.getAcadCampusTbl().getDescrShortEn());
//			fullCalendarRsType.setAcadCampus(acadCampusBean);
//			
//			List<TermTblBean> termList = new ArrayList<TermTblBean>();
//			for (TermTbl term : calendar.getTermTbls()) {
//				TermTblBean bean = new TermTblBean();
//				bean.setTermId(term.getId().getTermId());
//				bean.setStdntLevel(term.getStdntLevelTbl().getStdntLevelTblId());
//				bean.setAcadCarId(term.getAcadCarTbl().getAcadCarId());
//				bean.setOrder(term.getTermOrder());
//				bean.setDesc(term.getDescr());
//				bean.setAcadYear(term.getAcadYear());
//				if (null != term.getStartDate()) {
//					bean.setStartDate(DateUtils.convertDateToString(term.getStartDate()));
//				}
//				if (null != term.getEndDate()) {
//					bean.setEndDate(DateUtils.convertDateToString(term.getEndDate()));
//				}
//				termList.add(bean);
//			}
//			fullCalendarRsType.setTerm(termList);
//
//            // Getting ACTIVITY_TBL by PersId
////            List<ActivityTbl> actList = activityTblDAO.findByPersIdAndCalendar(oprid, calendarId);
////            List<DateFullCalendarBean> actRsList = new ArrayList<>();
////            for (ActivityTbl act : actList) {
////                DateFullCalendarBean actBean = new DateFullCalendarBean();
////                actBean.setDateId(act.getActivityId());
////                actBean.setDateTitle(act.getTitle());
////                actBean.setDateDescr(act.getDescr());
////                if (null != act.getStartDate())
////                    actBean.setStart(DateUtils.convertDateToString(act.getStartDate()));
////                if (null != act.getEndDate())
////                    actBean.setEnd(DateUtils.convertDateToString(act.getEndDate()));
////                actRsList.add(actBean);
////            }
//			
//			// Setting AGENDA
//			List<DateFullCalendarBean> agendas = new ArrayList<>();
//			for(AgendaTbl ag: calendar.getAgendaTbls()){
//				DateFullCalendarBean agend = new DateFullCalendarBean();
//				agend.setDateId(ag.getAgendaId());
//				agend.setDateTitle(ag.getTitle());
//				agend.setDateDescr(ag.getDescr());
//				agend.setStart(DateUtils.convertDateToString(ag.getStartDate()));
//				agend.setEnd(DateUtils.convertDateToString(ag.getEndDate()));
//				agendas.add(agend);
//			}
//			fullCalendarRsType.setAgendas(agendas);
//			
//
//			List<DateFullCalendarBean> holidays = new ArrayList<DateFullCalendarBean>();
//			for (Holiday holiday : holidayDAO.findHolidaysByCalendar(calendarId)) {
//				DateFullCalendarBean bean = new DateFullCalendarBean();
//				bean.setDateId(holiday.getHolidayId());
//				bean.setDateTitle(holiday.getHolidayTitle());
//				bean.setDateDescr(holiday.getDescr());
//				if (null != holiday.getStartDate()) {
//					bean.setStart(DateUtils.convertDateToString(holiday.getStartDate()));
//				}
//				if (null != holiday.getEndDate()) {
//					bean.setEnd(DateUtils.convertDateToString(holiday.getEndDate()));
//				}
//				holidays.add(bean);
//			}
//			fullCalendarRsType.setHolidays(holidays);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//		return fullCalendarRsType;
//
//	}
//
//	/**
//	 * @author Teerapan V.
//	 * */
//	public FullCalendarRsType getFullCalendar(Integer calendarId) throws MEDException{
//		FullCalendarRsType fullCalendarRsType = new FullCalendarRsType();
//		try {
//			CalendarTbl calendar = calendarTblDAO.findByPK(calendarId);
//			fullCalendarRsType.setCalendarId(calendarId);
//			fullCalendarRsType.setCalendarTitle(calendar.getCalendarTitle());
//			fullCalendarRsType.setCalendarDescr(calendar.getDescr());
//			fullCalendarRsType.setStatus(calendar.getStatus());
//			
//			AcadCarBean acadCarBean = new AcadCarBean();
//			acadCarBean.setAcadCarId(calendar.getAcadCarTbl().getAcadCarId());
//			acadCarBean.setDesc(calendar.getAcadCarTbl().getDescr());
//			fullCalendarRsType.setAcadCar(acadCarBean);
//			
//			AcadCampusBean acadCampusBean = new AcadCampusBean();
//			acadCampusBean.setId(calendar.getAcadCampusTbl().getAcadCampusId());
//			acadCampusBean.setDesc(calendar.getAcadCampusTbl().getDescr());
//			acadCampusBean.setDescEn(calendar.getAcadCampusTbl().getDescrEn());
//			acadCampusBean.setDescShort(calendar.getAcadCampusTbl().getDescrShort());
//			acadCampusBean.setDescShortEn(calendar.getAcadCampusTbl().getDescrShortEn());
//			fullCalendarRsType.setAcadCampus(acadCampusBean);
//			
//			List<TermTblBean> termList = new ArrayList<TermTblBean>();
//			for (TermTbl term : calendar.getTermTbls()) {
//				TermTblBean bean = new TermTblBean();
//				bean.setTermId(term.getId().getTermId());
//				bean.setStdntLevel(term.getStdntLevelTbl().getStdntLevelTblId());
//				bean.setAcadCarId(term.getAcadCarTbl().getAcadCarId());
//				bean.setOrder(term.getTermOrder());
//				bean.setDesc(term.getDescr());
//				bean.setAcadYear(term.getAcadYear());
//				if (null != term.getStartDate()) {
//					bean.setStartDate(DateUtils.convertDateToString(term.getStartDate()));
//				}
//				if (null != term.getEndDate()) {
//					bean.setEndDate(DateUtils.convertDateToString(term.getEndDate()));
//				}
//				termList.add(bean);
//			}
//			fullCalendarRsType.setTerm(termList);
//
//			// Setting AGENDA
//			List<DateFullCalendarBean> agendas = new ArrayList<>();
//			for(AgendaTbl ag: calendar.getAgendaTbls()){
//				DateFullCalendarBean agend = new DateFullCalendarBean();
//				agend.setDateId(ag.getAgendaId());
//				agend.setDateTitle(ag.getTitle());
//				agend.setDateDescr(ag.getDescr());
//				agend.setStart(DateUtils.convertDateToString(ag.getStartDate()));
//				agend.setEnd(DateUtils.convertDateToString(ag.getEndDate()));
//				agendas.add(agend);
//			}
//			fullCalendarRsType.setAgendas(agendas);
//			
//			List<EventBean> events = new ArrayList<>();
//			List<EventTbl> eventQuery = eventDAO.findByCalendarId(calendarId);
//			for(EventTbl ev: eventQuery){
//				EventBean evnt = new EventBean();
//				evnt.setId(ev.getEventId());
//				evnt.setTitle(ev.getTitle());
//				evnt.setDescr(ev.getDescr());
//				evnt.setStartDate(DateUtils.convertDateToString(ev.getStartDate()));
//				evnt.setEndDate(DateUtils.convertDateToString(ev.getEndDate()));
//				Set<ActivityTbl> actList = ev.getActivityTbls();
//				List<ActivityBean> actBeanList = new ArrayList<>();
//				for(ActivityTbl at: actList){
//					ActivityBean actBean = new ActivityBean();
//					actBean.setId(at.getActivityId());
//					actBean.setDescr(at.getDescr());
//					actBean.setTitle(at.getTitle());
//					actBean.setStartDate(DateUtils.convertDateToString(at.getStartDate()));
//					actBean.setEndDate(DateUtils.convertDateToString(at.getEndDate()));
//					actBeanList.add(actBean);
//				}
//				evnt.setActivities(actBeanList);
//				events.add(evnt);
//			}
//			fullCalendarRsType.setEvents(events);
//			
//
//			List<DateFullCalendarBean> holidays = new ArrayList<DateFullCalendarBean>();
//			for (Holiday holiday : holidayDAO.findHolidaysByCalendar(calendarId)) {
//				DateFullCalendarBean bean = new DateFullCalendarBean();
//				bean.setDateId(holiday.getHolidayId());
//				bean.setDateTitle(holiday.getHolidayTitle());
//				bean.setDateDescr(holiday.getDescr());
//				if (null != holiday.getStartDate()) {
//					bean.setStart(DateUtils.convertDateToString(holiday.getStartDate()));
//				}
//				if (null != holiday.getEndDate()) {
//					bean.setEnd(DateUtils.convertDateToString(holiday.getEndDate()));
//				}
//				holidays.add(bean);
//			}
//			fullCalendarRsType.setHolidays(holidays);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//		return fullCalendarRsType;
//	}
//	
//	public void updateTerm(TermRqType data, Integer oprid) throws Exception {
//		TermTblId pk = new TermTblId();
//		pk.setTermId(data.getTerm().getTermId());
//		pk.setAcadCarId(data.getTerm().getAcadCarId());
//		try {
//			TermTbl term = termTblDAO.findByPK(pk);
//			term.setDescr(data.getTerm().getDesc());
//			term.setDescrEn(data.getTerm().getDescEn());
//			if (!StringUtils.isEmpty(data.getTerm().getStartDate())) {
//				term.setStartDate(DateUtils.convertStringToDate(data.getTerm().getStartDate()));
//			}
//			if (!StringUtils.isEmpty(data.getTerm().getEndDate())) {
//				term.setEndDate(DateUtils.convertStringToDate(data.getTerm().getEndDate()));
//			}
//			term.setLastUpdDttm(Calendar.getInstance().getTime());
//			term.setLastUpdOprid(oprid);
//			termTblDAO.merge(term);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.UNKNOW_DATABASE_ERROR);
//		}
//	}
//
//	// CALENDAR_TBL is 1-1 with ACAD_CAR
//	public List<AgendaTblBean> getAgendaByCalendarId(Integer id) throws Exception {
//		List<AgendaTblBean> agendaList = new ArrayList<AgendaTblBean>();
//		CalendarTbl cal = calendarTblDAO.findByPK(id);
//		if (ObjectUtils.isEmpty(cal)) {
//			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND_PARAMS, "CalendarTbl");
//		} else {
//			for (AgendaTbl ag : cal.getAgendaTbls()) {
//				AgendaTblBean agendaBean = new AgendaTblBean();
//				agendaBean.setId(ag.getAgendaId());
//				agendaBean.setTitle(ag.getTitle());
//				agendaBean.setTitleEn(ag.getTitleEn());
//				agendaBean.setDescr(ag.getDescr());
//				agendaBean.setDescrEn(ag.getDescrEn());
//				if (null != ag.getStartDate()) {
//					agendaBean.setStartDate(DateUtils.convertDateToString(ag.getStartDate()));
//				}
//				if (null != ag.getEndDate()) {
//					agendaBean.setEndDate(DateUtils.convertDateToString(ag.getEndDate()));
//				}
//				agendaList.add(agendaBean);
//			}
//			return agendaList;
//		}
//
//	}
//
//	public void createAgenda(AgendaTblBean data, Integer oprid) throws Exception {
//		AgendaTbl agenda = new AgendaTbl();
//		agenda.setAgendaId(data.getId());
//		agenda.setTitle(data.getTitle());
//		agenda.setTitleEn(data.getTitleEn());
//		agenda.setDescr(data.getDescr());
//		agenda.setDescrEn(data.getDescrEn());
//		agenda.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//		agenda.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//		if (!ObjectUtils.isEmpty(data.getCalendar())) {
//			agenda.setCalendarTbl(calendarTblDAO.findByPK(data.getCalendar().getCalendarId()));
//		}
//		agenda.setLastUpdDttm(Calendar.getInstance().getTime());
//		agenda.setLastUpdOprid(oprid);
//		agendaTblDAO.persist(agenda);
//	}
//
//	public void updateAgenda(AgendaTblBean data, Integer oprid) throws Exception {
//		AgendaTbl agenda = agendaTblDAO.findByPK(data.getId());
//		agenda.setAgendaId(data.getId());
//		agenda.setTitle(data.getTitle());
//		agenda.setTitleEn(data.getTitleEn());
//		agenda.setDescr(data.getDescr());
//		agenda.setDescrEn(data.getDescrEn());
//		agenda.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//		agenda.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//		agenda.setLastUpdDttm(Calendar.getInstance().getTime());
//		agenda.setLastUpdOprid(oprid);
//		agendaTblDAO.merge(agenda);
//	}
//
//	public void deleteAgenda(Integer agendaId) throws Exception {
//		try {
//			agendaTblDAO.delete(agendaTblDAO.findByPK(agendaId));
//		} catch (DataIntegrityViolationException err) {
//			throw new MEDException(ErrorConstants.FOREIGN_KEY_CONSTRAINT_FAILS);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//	}
//
//	public List<EventBean> getAllEvent() throws Exception {
//		List<EventBean> eventList = new ArrayList<EventBean>();
//		for (EventTbl ev : eventDAO.findAll()) {
//			EventBean eventBean = new EventBean();
//			eventBean.setId(ev.getEventId());
//			eventBean.setDescr(ev.getDescr());
//			eventBean.setDescrEn(ev.getDescrEn());
//			eventBean.setTitle(ev.getTitle());
//			eventBean.setTitleEn(ev.getTitleEn());
//			if (null != ev.getStartDate()) {
//				eventBean.setStartDate(DateUtils.convertDateToString(ev.getStartDate()));
//			}
//			if (null != ev.getEndDate()) {
//				eventBean.setEndDate(DateUtils.convertDateToString(ev.getEndDate()));
//			}
//			// Setting AGENDA_TBL
//			AgendaTblBean agendaBean = new AgendaTblBean();
//			agendaBean.setId(ev.getAgendaTbl().getAgendaId());
//			agendaBean.setTitle(ev.getAgendaTbl().getTitle());
//			agendaBean.setDescr(ev.getAgendaTbl().getDescr());
//			CalendarBean calbean = new CalendarBean();
//			calbean.setCalendarId(ev.getAgendaTbl().getCalendarTbl().getCalendarId());
//			calbean.setCalendarDescr(ev.getAgendaTbl().getCalendarTbl().getDescr());
//			AcadCarBean acadcar = new AcadCarBean();
//			acadcar.setAcadCarId(ev.getAgendaTbl().getCalendarTbl().getAcadCarTbl().getAcadCarId());
//			acadcar.setDesc(ev.getAgendaTbl().getCalendarTbl().getAcadCarTbl().getDescr());
//			calbean.setAcadCar(acadcar);
//			agendaBean.setCalendar(calbean);
//			eventBean.setAgenda(agendaBean);
//
//			// Setting
//			eventList.add(eventBean);
//		}
//		return eventList;
//	}
//
//	public List<EventBean> getEventByAgendaId(Integer agendaId) throws Exception {
//		List<EventBean> eventList = new ArrayList<EventBean>();
//		AgendaTbl agenda = agendaTblDAO.findByPK(agendaId);
//		for (EventTbl ev : agenda.getEventTbls()) {
//			EventBean eventBean = new EventBean();
//			eventBean.setId(ev.getEventId());
//			eventBean.setDescr(ev.getDescr());
//			eventBean.setDescrEn(ev.getDescrEn());
//			eventBean.setTitle(ev.getTitle());
//			eventBean.setTitleEn(ev.getTitleEn());
//			if (null != ev.getStartDate()) {
//				eventBean.setStartDate(DateUtils.convertDateToString(ev.getStartDate()));
//			}
//			if (null != ev.getEndDate()) {
//				eventBean.setEndDate(DateUtils.convertDateToString(ev.getEndDate()));
//			}
//
//			// Setting AGENDA_TBL
//			AgendaTblBean agendaBean = new AgendaTblBean();
//			agendaBean.setId(agenda.getAgendaId());
//			agendaBean.setTitle(agenda.getTitle());
//			agendaBean.setDescr(agenda.getDescr());
//			eventBean.setAgenda(agendaBean);
//			eventList.add(eventBean);
//		}
//		return eventList;
//	}
//
//	public EventBean getEventById(Integer eventId) throws Exception {
//		EventBean eventBean = new EventBean();
//		try {
//			EventTbl ev = eventDAO.findByPK(eventId);
//			eventBean.setId(ev.getEventId());
//			eventBean.setDescr(ev.getDescr());
//			eventBean.setDescrEn(ev.getDescrEn());
//			eventBean.setTitle(ev.getTitle());
//			eventBean.setTitleEn(ev.getTitleEn());
//			if (null != ev.getStartDate()) {
//				eventBean.setStartDate(DateUtils.convertDateToString(ev.getStartDate()));
//			}
//			if (null != ev.getEndDate()) {
//				eventBean.setEndDate(DateUtils.convertDateToString(ev.getEndDate()));
//			}
//			// Setting AGENDA_TBL
//			AgendaTblBean agendaBean = new AgendaTblBean();
//			agendaBean.setId(ev.getAgendaTbl().getAgendaId());
//			agendaBean.setTitle(ev.getAgendaTbl().getTitle());
//			agendaBean.setDescr(ev.getAgendaTbl().getDescr());
//			agendaBean.setStartDate(DateUtils.convertDateToString(ev.getStartDate()));
//			agendaBean.setEndDate(DateUtils.convertDateToString(ev.getEndDate()));
//			CalendarBean calbean = new CalendarBean();
//			calbean.setCalendarId(ev.getAgendaTbl().getCalendarTbl().getCalendarId());
//			calbean.setCalendarDescr(ev.getAgendaTbl().getCalendarTbl().getDescr());
//			AcadCarBean acadcar = new AcadCarBean();
//			acadcar.setAcadCarId(ev.getAgendaTbl().getCalendarTbl().getAcadCarTbl().getAcadCarId());
//			acadcar.setDesc(ev.getAgendaTbl().getCalendarTbl().getAcadCarTbl().getDescr());
//			calbean.setAcadCar(acadcar);
//			agendaBean.setCalendar(calbean);
//			agendaBean.setStartDate(DateUtils.convertDateToString(ev.getAgendaTbl().getStartDate()));
//			agendaBean.setEndDate(DateUtils.convertDateToString(ev.getAgendaTbl().getEndDate()));
//			eventBean.setAgenda(agendaBean);
//
//			// // Setting EVENT_RESPO
//			List<EmpResponsibleBean> empRespoList = new ArrayList<EmpResponsibleBean>();
//			for (EventRespo er : ev.getEventRespos()) {
//				EmpResponsibleBean empRespo = new EmpResponsibleBean();
//				empRespo.setId(er.getEventRespoId());
//				empRespo.setEmp(personalService.setPersonalBean(er.getEmpInfo()));
//				empRespo.setRole(er.getRole());
//				empRespoList.add(empRespo);
//			}
//			eventBean.setEmpRespoList(empRespoList);
//			//
//			// // Setting EVENT_EMP_GROUP
//			// List<CalendarEmpGroupBean> empGroupList = new ArrayList<>();
//			// for (EventEmpGroup eg : ev.getEventEmpGroups()) {
//			// CalendarEmpGroupBean empGroup = new CalendarEmpGroupBean();
//			// empGroup.setId(eg.getEventEmpGroupId());
//			// AcadOrgBean org = new AcadOrgBean();
//			// org.setAcadOrgId(eg.getAcadOrgTbl().getAcadOrgId());
//			// org.setDesc(eg.getAcadOrgTbl().getDescr());
//			// empGroup.setAcadOrg(org);
//			// empGroupList.add(empGroup);
//			// }
//			// eventBean.setEmpGroupList(empGroupList);
//
//			// Setting EVENT_STDNT_GROUP
//			// List<CalendarStdntGroupBean> stdntGroupList =
//			// this.setCalendarStdntGroupList(eventId, true);
//			// eventBean.setStdntGroupList(stdntGroupList);
//
//			eventBean.setActivities(this.getActivityByEventId(eventId));
//
//		} catch (NullPointerException ne) {
//			throw new MEDException(ErrorConstants.OBJECT_NOT_FOUND);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//
//		return eventBean;
//	}
//
//	public void createEvent(EventBean data, Integer oprid) throws Exception {
//		Date now = Calendar.getInstance().getTime();
//		try {
//			EventTbl event = new EventTbl();
//			event.setAgendaTbl(agendaTblDAO.findByPK(data.getAgenda().getId()));
//			// event.setEventId(data.getId());
//			event.setDescr(data.getDescr());
//			event.setDescrEn(data.getDescrEn());
//			event.setTitle(data.getTitle());
//			event.setTitleEn(data.getTitleEn());
//			if (!StringUtils.isEmpty(data.getStartDate())) {
//				event.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//			}
//			if (!StringUtils.isEmpty(data.getEndDate())) {
//				event.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//			}
//			event.setLastUpdDttm(now);
//			event.setLastUpdOprid(oprid);
//			eventDAO.persist(event);
//
//			// Saving EVENT_RESPO
//			if (!CollectionUtils.isEmpty(data.getEmpRespoList())) {
//				for (EmpResponsibleBean erb : data.getEmpRespoList()) {
//					EventRespo emp = new EventRespo();
//					emp.setEventTbl(event);
//					emp.setEmpInfo(empInfoDAO.findByPK(erb.getEmp().getEmpCode()));
//					emp.setRole(erb.getRole());
//					emp.setLastUpdDttm(now);
//					emp.setLastUpdOprid(oprid);
//					eventRespoDAO.persist(emp);
//				}
//			}
//
//			// Saving EVENT_EMP_GROUP
//			// for (CalendarEmpGroupBean eg : data.getEmpGroupList()) {
//			// EventEmpGroup empGroup = new EventEmpGroup();
//			// empGroup.setEventTbl(event);
//			// empGroup.setAcadOrgTbl(acadOrgDAO.findByPK(eg.getAcadOrg().getAcadOrgId()));
//			// empGroup.setLastUpdDttm(now);
//			// empGroup.setLastUpdOprid(oprid);
//			// eventEmpGroupDAO.persist(empGroup);
//			// // this.insertEmpList();
//			// }
//
//			// Saving EVENT_STDNT_GROUP
//			// for (CalendarStdntGroupBean sg : data.getStdntGroupList()) {
//			// EventStdntGroup stdntGroup = new EventStdntGroup();
//			// stdntGroup.setEventTbl(event);
//			// stdntGroup.setAcadCampusTbl(acadCampusDAO.findByPK(sg.getAcadCampus().getId()));
//			// stdntGroup.setAcadOrgTbl(acadOrgDAO.findByPK(sg.getAcadOrg().getAcadOrgId()));
//			// stdntGroup.setStdntLevelTbl(stdntLevelTblDAO.findByPK(sg.getStdntYear()));
//			// stdntGroup.setLastUpdDttm(now);
//			// stdntGroup.setLastUpdOprid(oprid);
//			// eventStdntGroupDAO.persist(stdntGroup);
//			// // this.insertStdntList();
//			// }
//
//			for (ActivityBean act : data.getActivities()) {
//				this.createActivity(act, event, oprid);
//			}
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//
//	}
//
//	public void updateEvent(EventBean data, Integer oprid) throws Exception {
//		Date now = Calendar.getInstance().getTime();
//
//		EventTbl event = eventDAO.findByPK(data.getId());
//		event.setDescr(data.getDescr());
//		event.setDescrEn(data.getDescrEn());
//		event.setTitle(data.getTitle());
//		event.setTitleEn(data.getTitleEn());
//		if (!StringUtils.isEmpty(data.getStartDate())) {
//			event.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//		}
//		if (!StringUtils.isEmpty(data.getEndDate())) {
//			event.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//		}
//		event.setLastUpdDttm(now);
//		event.setLastUpdOprid(oprid);
//		eventDAO.merge(event);
//
//		// Delete EVENT_RESPO
//		if (!CollectionUtils.isEmpty(data.getEmpRespoDelList())) {
//			for (Integer empRes : data.getEmpRespoDelList()) {
//				eventRespoDAO.delete(eventRespoDAO.findByPK(empRes));
//			}
//		}
//
//		// Update EVENT_RESPO
//		if (!CollectionUtils.isEmpty(data.getEmpRespoList())) {
//			for (EmpResponsibleBean rs : data.getEmpRespoList()) {
//				EventRespo respo = (null != rs.getId()) ? eventRespoDAO.findByPK(rs.getId()) : new EventRespo();
//				respo.setEventTbl(event);
//				respo.setEmpInfo(empInfoDAO.findByPK(rs.getEmp().getEmpCode()));
//				respo.setRole(rs.getRole());
//				respo.setLastUpdDttm(now);
//				respo.setLastUpdOprid(oprid);
//				eventRespoDAO.merge(respo);
//			}
//		}
//
//		// Delete ACTIVITY_TBL
//		if (!CollectionUtils.isEmpty(data.getDelActivities())) {
//			for (Integer actId : data.getDelActivities()) {
//				this.deleteActivity(actId);
//			}
//		}
//
//		// Update ACTIVITY_TBL
//		if (!CollectionUtils.isEmpty(data.getActivities())) {
//			for (ActivityBean act : data.getActivities()) {
//				if (null != act.getId()) {
//					this.updateActivity(act, oprid);
//				} else {
//					this.createActivity(act, event, oprid);
//				}
//			}
//		}
//
//	}
//
//	public void deleteEvent(Integer eventId) throws Exception {
//		try {
//			eventDAO.delete(eventDAO.findByPK(eventId));
//		} catch (DataIntegrityViolationException err) {
//			throw new MEDException(ErrorConstants.FOREIGN_KEY_CONSTRAINT_FAILS);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//	}
//
//	public List<ActivityBean> getActivityByEventId(Integer eventId) throws Exception {
//		List<ActivityBean> actList = new ArrayList<ActivityBean>();
//		EventTbl event = eventDAO.findByPK(eventId);
//		for (ActivityTbl at : event.getActivityTbls()) {
//			ActivityBean act = this.getActivityById(at.getActivityId());
//			actList.add(act);
//		}
//		return actList;
//	}
//
//	public ActivityBean getActivityById(Integer actId) throws Exception {
//		ActivityBean act = new ActivityBean();
//		ActivityTbl at = activityTblDAO.findByPK(actId);
//		act.setId(at.getActivityId());
//		act.setDescr(at.getDescr());
//		act.setDescrEn(at.getDescrEn());
//		act.setTitle(at.getTitle());
//		act.setTitleEn(at.getTitleEn());
//		act.setOverride(at.getOverride());
//		if (null != at.getStartDate()) {
//			act.setStartDate(DateUtils.convertDateToString(at.getStartDate()));
//		}
//		if (null != at.getEndDate()) {
//			act.setEndDate(DateUtils.convertDateToString(at.getEndDate()));
//		}
//
//		// Setting ACTIVITY_RESPO
//		List<EmpResponsibleBean> empRespoList = new ArrayList<EmpResponsibleBean>();
//		for (ActivityRespo er : at.getActivityRespos()) {
//			EmpResponsibleBean empRespo = new EmpResponsibleBean();
//			empRespo.setId(er.getActivityRespoId());
//			empRespo.setEmp(personalService.setPersonalBean(er.getEmpInfo()));
//			empRespo.setRole(er.getRole());
//			empRespoList.add(empRespo);
//		}
//		act.setEmpRespoList(empRespoList);
//
//		// Setting ACTIVITY_EMP_GROUP
//		act.setEmpGroupList(this.setCalendarEmpGroupList(actId, false));
//
//		// Setting ACTIVITY_STDNT_GROUP
//		act.setStdntGroupList(this.setCalendarStdntGroupList(actId, false));
//
//		// Setting ACTIVITY_INVITE
//		act.setEmpInvitedList(this.setActivityInvitedList(at));
//
//		return act;
//	}
//
//	public void createActivity(ActivityBean data, EventTbl event, Integer oprid) throws Exception {
//		Date now = Calendar.getInstance().getTime();
//		try {
//			ActivityTbl act = new ActivityTbl();
//			act.setEventTbl(event);
//			act.setDescr(data.getDescr());
//			act.setDescrEn(data.getDescrEn());
//			act.setTitle(data.getTitle());
//			act.setTitleEn(data.getTitleEn());
//			act.setOverride(data.getOverride());
//			if (!StringUtils.isEmpty(data.getStartDate())) {
//				act.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//			}
//			if (!StringUtils.isEmpty(data.getEndDate())) {
//				act.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//			}
//			act.setLastUpdDttm(Calendar.getInstance().getTime());
//			act.setLastUpdOprid(oprid);
//			activityTblDAO.persist(act);
//
//			// Setting ACTIVITY_RESPO
//			if (!CollectionUtils.isEmpty(data.getEmpRespoList())) {
//				for (EmpResponsibleBean erb : data.getEmpRespoList()) {
//					ActivityRespo emp = new ActivityRespo();
//					emp.setActivityTbl(act);
//					emp.setEmpInfo(empInfoDAO.findByPK(erb.getEmp().getEmpCode()));
//					emp.setRole(erb.getRole());
//					emp.setLastUpdDttm(now);
//					emp.setLastUpdOprid(oprid);
//					activityRespoDAO.persist(emp);
//				}
//			}
//
//			// Setting ACTIVITY_STDNT
//			if (!CollectionUtils.isEmpty(data.getStdntGroupList())) {
//				for (ActivityStdnt st : this.buildActivityStdnt(data.getStdntGroupList(), act, oprid)) {
//					activityStdntDAO.merge(st);
//				}
//			}
//
//			// Setting ACTIVITY_EMP
//			if (!CollectionUtils.isEmpty(data.getEmpGroupList())) {
//				for (ActivityEmp emp : this.buildActivityEmp(data.getEmpGroupList(), act, oprid)) {
//					activityEmpDAO.merge(emp);
//				}
//			}
//
//			if (!CollectionUtils.isEmpty(data.getEmpInvitedList())) {
//				for (ActivityInvite inv : this.buildActivityInvite(data.getEmpInvitedList(), act, oprid)) {
//					activityInviteDAO.merge(inv);
//				}
//
//			}
//
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//
//	}
//
//	public void updateActivity(ActivityBean data, Integer oprid) throws Exception {
//		ActivityTbl act = activityTblDAO.findByPK(data.getId());
//		act.setDescr(data.getDescr());
//		act.setDescrEn(data.getDescrEn());
//		act.setTitle(data.getTitle());
//		act.setTitleEn(data.getTitleEn());
//		act.setOverride(data.getOverride());
//		if (!StringUtils.isEmpty(data.getStartDate())) {
//			act.setStartDate(DateUtils.convertStringToDate(data.getStartDate()));
//		}
//		if (!StringUtils.isEmpty(data.getEndDate())) {
//			act.setEndDate(DateUtils.convertStringToDate(data.getEndDate()));
//		}
//		act.setLastUpdDttm(Calendar.getInstance().getTime());
//		act.setLastUpdOprid(oprid);
//		activityTblDAO.merge(act);
//
//		// Delete ACTIVITY_RESPO
//		if (!CollectionUtils.isEmpty(data.getEmpRespoDelList())) {
//			for (Integer actRespo : data.getEmpRespoDelList()) {
//				activityRespoDAO.delete(activityRespoDAO.findByPK(actRespo));
//			}
//		}
//
//		// Update ACTIVITY_RESPO
//		if (!CollectionUtils.isEmpty(data.getEmpRespoList())) {
//			for (EmpResponsibleBean rs : data.getEmpRespoList()) {
//				ActivityRespo respo = (null != rs.getId()) ? activityRespoDAO.findByPK(rs.getId()) : new ActivityRespo();
//				respo.setActivityTbl(act);
//				respo.setEmpInfo(empInfoDAO.findByPK(rs.getEmp().getEmpCode()));
//				respo.setRole(rs.getRole());
//				respo.setLastUpdDttm(Calendar.getInstance().getTime());
//				respo.setLastUpdOprid(oprid);
//				activityRespoDAO.merge(respo);
//			}
//		}
//
//		// Update ACTIVITY_STDNT
//		if (!CollectionUtils.isEmpty(data.getStdntGroupList())) {
//			for (ActivityStdnt std : this.buildActivityStdnt(data.getStdntGroupList(), act, oprid)) {
//				activityStdntDAO.merge(std);
//			}
//		}
//		
//		// Update ACTIVITY_EMP
//		if (!CollectionUtils.isEmpty(data.getEmpGroupList())) {
//			for (ActivityEmp emp : this.buildActivityEmp(data.getEmpGroupList(), act, oprid)) {
//				activityEmpDAO.merge(emp);
//			}
//		}
//		
//		// Delete ACTIVITY_INVITE
//		if (!CollectionUtils.isEmpty(data.getEmpInvitedDelList())) {
//			for (Integer delInv : data.getEmpInvitedDelList()) {
//				activityInviteDAO.delete(activityInviteDAO.findByPK(delInv));
//			}
//		}
//		
//		// Update ACTIVTIY_INVITE in isDel
//		if (!CollectionUtils.isEmpty(data.getEmpInvitedList())) {
//			for (ActivityInvite inv : this.buildActivityInvite(data.getEmpInvitedList(), act, oprid)) {
//				activityInviteDAO.merge(inv);
//			}
//		}
//		
//
//	}
//
//	public void deleteActivity(Integer activityId) throws Exception {
//		try {
//			activityTblDAO.delete(activityTblDAO.findByPK(activityId));
//		} catch (DataIntegrityViolationException err) {
//			throw new MEDException(ErrorConstants.FOREIGN_KEY_CONSTRAINT_FAILS);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//	}
//
//	public List<SearchStdntRsType> getStdntByCalendarStdntGroup(SearchStdntByCalendarStdntGroupRqType rq)
//			throws Exception {
//		List<SearchStdntRsType> result = new ArrayList<SearchStdntRsType>();
//		// Handle Request
//		Set<Integer> campusSet = new HashSet<Integer>();
//		Set<Integer> orgSet = new HashSet<Integer>();
//		Set<Integer> yearSet = new HashSet<Integer>();
//		Date start;
//		Date end;
//		try {
//			if (null == rq.getAcadCampusId() || null == rq.getYear() || null == rq.getAcadOrgId()) {
//				throw new MEDException(ErrorConstants.MISSING_REQUIRED_FIELD);
//			} else {
//				start = DateUtils.convertStringToDate(rq.getActivityStartDate());
//				end = DateUtils.convertStringToDate(rq.getActivityEndDate());
//			}
//			// Traversing
//			campusSet.add(rq.getAcadCampusId());
//			orgSet.add(rq.getAcadOrgId());
//			yearSet.add(rq.getYear());
//
//			// List<Integer> campusList = new ArrayList<Integer>();
//			// campusList.addAll(campusSet);
//			// List<Integer> orgList = new ArrayList<Integer>();
//			// orgList.addAll(orgSet);
//			// List<Integer> yearList = new ArrayList<Integer>();
//			// yearList.addAll(yearSet);
//			// Set<StdntInfo> query =
//			// stdntInfoDAO.findByCalendarStdntGroup(campusList, orgList,
//			// yearList, start, end);
//			Set<StdntInfo> query = stdntInfoDAO.findByCalendarStdntGroup(campusSet, orgSet, yearSet, start, end);
//			for (StdntInfo stdnt : query) {
//				result.add(personalService.setStdntBean(stdnt));
//			}
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//
//		return result;
//	}
//
//	public List<SearchPersonalRsType> getEmpByCalendarEmpGroup(SearchEmpByCalendarEmpGroupRqType rq) throws Exception {
//		List<SearchPersonalRsType> result = new ArrayList<SearchPersonalRsType>();
//		Set<Integer> orgSet = new HashSet<>();
//		try {
//			for (CalendarEmpGroupBean ls : rq.getEmpGroupList()) {
//				orgSet.add(ls.getAcadOrg().getAcadOrgId());
//			}
//			for (EmpInfo emp : empInfoDAO.findEmpByAcadOrgList(orgSet)) {
//				result.add(personalService.setPersonalBean(emp));
//			}
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//
//		return result;
//	}
//
//	private List<CalendarStdntGroupBean> setCalendarStdntGroupList(Integer actId, Boolean isEventLevel)
//			throws Exception {
//		List<CalendarStdntGroupBean> result = new ArrayList<CalendarStdntGroupBean>();
//		for (AcadCampusTbl cp : activityStdntDAO.findDistinctAcadCampusByAct(actId)) {
//			CalendarStdntGroupBean group = new CalendarStdntGroupBean();
//			group.setActivityId(actId);
//			AcadCampusBean camp = new AcadCampusBean();
//			camp.setId(cp.getAcadCampusId());
//			camp.setDesc(cp.getDescr());
//			group.setCampus(camp);
//
//			List<CalendarYear> yrList = new ArrayList<>();
//			for (StdntLevelTbl yr : activityStdntDAO.findDistinctYearByActAndCampus(actId, cp.getAcadCampusId())) {
//				CalendarYear year = new CalendarYear();
//				year.setYear(yr.getStdntLevelTblId());
//
//				List<CalendarAcadOrg> orgList = new ArrayList<>();
//				for (AcadOrgTbl o : activityStdntDAO.findDistinctAcadOrgByActAndCampusAndYear(actId,
//						cp.getAcadCampusId(), yr.getStdntLevelTblId())) {
//					CalendarAcadOrg org = new CalendarAcadOrg();
//					AcadOrgBean orgBean = new AcadOrgBean();
//					orgBean.setAcadOrgId(o.getAcadOrgId());
//					orgBean.setDesc(o.getDescr());
//					orgBean.setAcadOrgCode(o.getAcadOrgCode());
//					org.setAcadOrg(orgBean);
//
//					// Setting PERSON inside ACAD_ORG
//					List<SearchStdntRsType> stdntList = new ArrayList<>();
//					for (ActivityStdnt stdnt : activityStdntDAO.findByActAndCampusAndYearAndOrg(actId, camp.getId(),
//							year.getYear(), o.getAcadOrgId())) {
//						SearchStdntRsType std = personalService.setStdntBean(stdnt.getStdntInfo());
//						stdntList.add(std);
//					}
//					org.setPerson(stdntList);
//					orgList.add(org);
//				}
//				year.setOrgList(orgList);
//				yrList.add(year);
//			}
//			group.setYearList(yrList);
//			result.add(group);
//		}
//
//		return result;
//	}
//
//	private List<CalendarEmpGroupBean> setCalendarEmpGroupList(Integer id, Boolean isEventLevel) throws Exception {
//		List<CalendarEmpGroupBean> result = new ArrayList<>();
//		for (AcadOrgTbl og : activityEmpDAO.findDistinctAcadOrgByActivityId(id)) {
//			CalendarEmpGroupBean group = new CalendarEmpGroupBean();
//			group.setActivityId(id);
//
//			// Setting ACAD_ORG
//			AcadOrgBean orgBean = new AcadOrgBean();
//			orgBean.setAcadOrgId(og.getAcadOrgId());
//			orgBean.setAcadOrgCode(og.getAcadOrgCode());
//			orgBean.setDesc(og.getDescr());
//			group.setAcadOrg(orgBean);
//
//			List<SearchPersonalRsType> emps = new ArrayList<>();
//			for (ActivityEmp eps : activityEmpDAO.findByActivityAndAcadOrg(id, og.getAcadOrgId())) {
//				SearchPersonalRsType emp = personalService.setPersonalBean(eps.getEmpInfo());
//				emps.add(emp);
//			}
//			group.setEmpList(emps);
//			result.add(group);
//		}
//
//		return result;
//	}
//
//	private Set<ActivityStdnt> buildActivityStdnt(List<CalendarStdntGroupBean> data, ActivityTbl act, Integer oprid)
//			throws Exception {
//
//		List<String> stdntCodeList = data.stream().flatMap(grp -> grp.getYearList().stream())
//				.collect(Collectors.toList()).stream().flatMap(yr -> yr.getOrgList().stream())
//				.collect(Collectors.toList()).stream().flatMap(og -> og.getPerson().stream()).map(p -> p.getStdntCode())
//				.collect(Collectors.toList());
//		logger.debug("Flatmap size(s): " + stdntCodeList.size());
//
//		if (!CollectionUtils.isEmpty(stdntCodeList))
//			activityStdntDAO.delNotExistByStdntCodeAndAct(stdntCodeList, act.getActivityId());
//
//		Set<ActivityStdnt> result = new HashSet<>();
//		for (CalendarStdntGroupBean ls : data) {
//			for (CalendarYear yr : ls.getYearList()) {
//				for (CalendarAcadOrg og : yr.getOrgList()) {
//					for (SearchStdntRsType stdnt : og.getPerson()) {
//						ActivityStdntId pk = new ActivityStdntId(act.getActivityId(), stdnt.getStdntCode());
//						ActivityStdnt std = new ActivityStdnt();
//						std.setId(pk);
//						// std.setActivityTbl(act);
//						std.setAcadCampusTbl(acadCampusDAO.findByPK(ls.getCampus().getId()));
//						std.setStdntLevelTbl(stdntLevelTblDAO.findByPK(yr.getYear()));
//						std.setAcadOrgTbl(acadOrgDAO.findByPK(og.getAcadOrg().getAcadOrgId()));
//						// std.setStdntInfo(stdntInfoDAO.findByPK(stdnt.getStdntCode()));
//						std.setLastUpdDttm(Calendar.getInstance().getTime());
//						std.setLastUpdOprid(oprid);
//						result.add(std);
//					}
//				}
//			}
//
//		}
//		return result;
//	}
//
//	private Set<ActivityEmp> buildActivityEmp(List<CalendarEmpGroupBean> data, ActivityTbl act, Integer oprid)
//			throws Exception {
//
//		List<String> empCodeList = data.stream().flatMap(grp -> grp.getEmpList().stream()).map(p -> p.getEmpCode())
//				.collect(Collectors.toList());
//		logger.debug("Flatmap size(s): " + empCodeList.size());
//
//		if (!CollectionUtils.isEmpty(empCodeList))
//			activityEmpDAO.delNotExistByEmpAndAct(empCodeList, act.getActivityId());
//
//		Set<ActivityEmp> result = new HashSet<>();
//		for (CalendarEmpGroupBean ls : data) {
//			for (SearchPersonalRsType pers : ls.getEmpList()) {
//				ActivityEmpId pk = new ActivityEmpId(act.getActivityId(), pers.getEmpCode());
//				ActivityEmp emp = new ActivityEmp();
//				emp.setId(pk);
//				emp.setAcadOrgTbl(acadOrgDAO.findByPK(ls.getAcadOrg().getAcadOrgId()));
//				// emp.setEmpInfo(empInfoDAO.findByPK(pers.getEmpCode()));
//				emp.setLastUpdDttm(Calendar.getInstance().getTime());
//				emp.setLastUpdOprid(oprid);
//				result.add(emp);
//			}
//		}
//		return result;
//	}
//
//	private Set<ActivityInvite> buildActivityInvite(List<ActivityInviteBean> data, ActivityTbl act, Integer oprid) {
//		Set<ActivityInvite> result = new HashSet<>();
//		for (ActivityInviteBean ls : data) {
//			ActivityInvite invited;
//			if (null != ls.getId()) {
//				invited = activityInviteDAO.findByPK(ls.getId());
//			} else {
//				invited = new ActivityInvite();
//			}
//			invited.setActivityTbl(act);
//			invited.setInviteName(ls.getInvitedName());
//			invited.setInviteEmail(ls.getEmail());
//			invited.setMobileNbr(ls.getTelNo());
//			invited.setSendEmailStatus(ls.getEmailStatus());
//			invited.setRemark(ls.getRemark());
//			invited.setLastUpdDttm(Calendar.getInstance().getTime());
//			invited.setLastUpdOprid(oprid);
//			result.add(invited);
//		}
//		return result;
//	}
//
//	private List<ActivityInviteBean> setActivityInvitedList(ActivityTbl act) {
//		List<ActivityInviteBean> result = new ArrayList<>();
//		for (ActivityInvite iv : act.getActivityInvites()) {
//			ActivityInviteBean invited = new ActivityInviteBean();
//			invited.setId(iv.getActivityInviteId());
//			invited.setInvitedName(iv.getInviteName());
//			invited.setEmail(iv.getInviteEmail());
//			invited.setEmailStatus(iv.getSendEmailStatus());
//			invited.setTelNo(iv.getMobileNbr());
//			invited.setRemark(iv.getRemark());
//			result.add(invited);
//		}
//		return result;
//	}
//	
//	public void createCalendarAndTermTbl(String calendarTitle, Integer termNumber,Integer acadCarId, Integer acadCampusId, Integer oprid) throws Exception {
//		Date now = Calendar.getInstance().getTime();
//		logger.debug("F");
//		try {
//			CalendarTbl calendar = new CalendarTbl();
//			calendar.setCalendarTitle(calendarTitle);
//			calendar.setAcadCampusTbl(acadCampusDAO.findByPK(acadCampusId));
//			calendar.setAcadCarTbl(acadCarTblDAO.findByPK(acadCarId));
//			calendar.setDescr(String.format(ConfigMapHelper.getConfigValue("CALENDAR_CONSTANTS.CALENDAR_DESCR"), calendarTitle));
//			calendar.setStatus(ConfigMapHelper.getConfigValue("STATUS_CONSTANTS.INACTIVE"));
//			calendar.setLastUpdDttm(now);
//			calendar.setLastUpdOprid(oprid);
//			
//			calendarTblDAO.persist(calendar);
//			
//			String str = ConfigMapHelper.getConfigValue("CALENDAR_CONSTANTS.STDNT_YEAR");
//			int stdntYear = Integer.parseInt(str);
//			for(int stdnty=1 ; stdnty <= stdntYear ; stdnty++){
//				for(int order=1 ; order <= termNumber ; order++){
//					TermTbl term = new TermTbl();
//					TermTblId termId = new TermTblId();
//					String id = String.format("%s%s%s%s%s", calendarTitle, acadCampusId, acadCarId, stdnty, order);
//					termId.setTermId(id);
//					termId.setAcadCarId(acadCarId);
//					term.setId(termId);
//					term.setAcadCarTbl(acadCarTblDAO.findByPK(acadCarId));
//					term.setTermOrder(String.format("%s", order));
//					term.setDescr(String.format(ConfigMapHelper.getConfigValue("CALENDAR_CONSTANTS.TERM_DESCR"), order));
//					term.setCalendarTbl(calendar);
//					term.setStdntLevelTbl(stdntLevelTblDAO.findByPK(stdnty));
//					term.setLastUpdDttm(now);
//					term.setLastUpdOprid(oprid);
//					
//					termTblDAO.persist(term);
//				}
//			}
//
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw e;
//		}
//		
//	}
//
//	public ScheduleOverviewRsType getScheduleOverviewByCalendar(Integer calendarId) throws MEDException{
//		ScheduleOverviewRsType rs = new ScheduleOverviewRsType();
//		List<String> colorList = new ArrayList<>();
//		colorList.add("#f39c12");
//		colorList.add("#dd4b39");
//		colorList.add("#00a65a");
//		colorList.add("#3c8dbc");
//		try {
//			CalendarTbl calendar = calendarTblDAO.findByPK(calendarId);
//			rs.setCalendarId(calendarId);
//			rs.setCalendarTitle(calendar.getCalendarTitle());
//			rs.setCalendarDescr(calendar.getDescr());
//			rs.setStatus(calendar.getStatus());
//			
//			AcadCarBean acadCarBean = new AcadCarBean();
//			acadCarBean.setAcadCarId(calendar.getAcadCarTbl().getAcadCarId());
//			acadCarBean.setDesc(calendar.getAcadCarTbl().getDescr());
//			rs.setAcadCar(acadCarBean);
//			
//			AcadCampusBean acadCampusBean = new AcadCampusBean();
//			acadCampusBean.setId(calendar.getAcadCampusTbl().getAcadCampusId());
//			acadCampusBean.setDesc(calendar.getAcadCampusTbl().getDescr());
//			acadCampusBean.setDescEn(calendar.getAcadCampusTbl().getDescrEn());
//			acadCampusBean.setDescShort(calendar.getAcadCampusTbl().getDescrShort());
//			acadCampusBean.setDescShortEn(calendar.getAcadCampusTbl().getDescrShortEn());
//			rs.setAcadCampus(acadCampusBean);
//			
//			List<TermTblBean> termList = new ArrayList<TermTblBean>();
//			Set<TermTbl> terms = calendar.getTermTbls();
//			for (TermTbl term : terms) {
//				TermTblBean bean = new TermTblBean();
//				bean.setTermId(term.getId().getTermId());
//				bean.setStdntLevel(term.getStdntLevelTbl().getStdntLevelTblId());
//				bean.setAcadCarId(term.getAcadCarTbl().getAcadCarId());
//				bean.setOrder(term.getTermOrder());
//				bean.setDesc(term.getDescr());
//				bean.setAcadYear(term.getAcadYear());
//				if (null != term.getStartDate()) {
//					bean.setStartDate(DateUtils.convertDateToString(term.getStartDate()));
//				}
//				if (null != term.getEndDate()) {
//					bean.setEndDate(DateUtils.convertDateToString(term.getEndDate()));
//				}
//				termList.add(bean);
//			}
//			rs.setTerm(termList);
//			
//			List<DateFullCalendarBean> events = new ArrayList<>();
//			List<EventTbl> eventQuery = eventDAO.findByCalendarId(calendarId);
//			List<DateFullCalendarBean> activities = new ArrayList<>();
//			for(EventTbl ev: eventQuery){
//				DateFullCalendarBean evnt = new DateFullCalendarBean();
//				evnt.setDateId(ev.getEventId());
//				evnt.setDateTitle(ev.getTitle());
//				evnt.setDateDescr(ev.getDescr());
//				evnt.setStart(DateUtils.convertDateToString(ev.getStartDate()));
//				evnt.setEnd(DateUtils.convertDateToString(ev.getEndDate()));
//				evnt.setAllDay(true);
//				evnt.setColor(colorList.get(0));
//				Set<ActivityTbl> actList = ev.getActivityTbls();
//				for(ActivityTbl at: actList){
//					DateFullCalendarBean actBean = new DateFullCalendarBean();
//					actBean.setDateId(at.getActivityId());
//					actBean.setDateDescr(at.getDescr());
//					actBean.setDateTitle(at.getTitle());
//					actBean.setStart(DateUtils.convertDateToString(at.getStartDate()));
//					actBean.setEnd(DateUtils.convertDateToString(at.getEndDate()));
//					actBean.setAllDay(false);
//					evnt.setColor(colorList.get(1));
//					activities.add(actBean);
//				}
//				events.add(evnt);
//			}
//			rs.setEvents(events);
//			rs.setActivities(activities);
//			
//
//			List<DateFullCalendarBean> holidays = new ArrayList<DateFullCalendarBean>();
//			for (Holiday holiday : holidayDAO.findHolidaysByCalendar(calendarId)) {
//				DateFullCalendarBean bean = new DateFullCalendarBean();
//				bean.setDateId(holiday.getHolidayId());
//				bean.setDateTitle(holiday.getHolidayTitle());
//				bean.setDateDescr(holiday.getDescr());
//				if (null != holiday.getStartDate()) {
//					bean.setStart(DateUtils.convertDateToString(holiday.getStartDate()));
//				}
//				if (null != holiday.getEndDate()) {
//					bean.setEnd(DateUtils.convertDateToString(holiday.getEndDate()));
//				}
//				bean.setAllDay(true);
//				bean.setColor(colorList.get(2));
//				holidays.add(bean);
//			}
//			rs.setHolidays(holidays);
//			
//			List<DateFullCalendarBean> schedules = new ArrayList<>();
//			List<ScheduleTopic> topicList = scheduleTopicDAO.findByCalendar(calendarId);
//			logger.debug(topicList.size());
//			for(ScheduleTopic sc: topicList){
//				DateFullCalendarBean topic = new DateFullCalendarBean();
//				topic.setDateId(sc.getScheduleTopicId());
//				if (!StringUtils.isEmpty(sc.getClassTopic().getTopicOrder())){
//					topic.setDateTitle(sc.getClassTopic().getTopicTypeTbl().getDescr() + " "
//							+ String.format("%02d", sc.getClassTopic().getTopicOrder()));
//				}else{
//					topic.setDateTitle(sc.getClassTopic().getTopicTypeTbl().getDescr());
//				}			
////				topic.setDateDescr(classService.composeCrseCode(sc.getClassTopic().getClassSection()));
//				topic.setAllDay(false);
//				topic.setStart(DateUtils.convertDateToString(sc.getStartTime()));
//				topic.setEnd(DateUtils.convertDateToString(sc.getEndTime()));
//				topic.setColor(colorList.get(3));
//				schedules.add(topic);
//			}
//			rs.setScheduleTopics(schedules);
//			
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			throw new MEDException(ErrorConstants.UNKNOW_ERROR);
//		}
//		return rs;
//	}
//	
//	public net.fortuna.ical4j.model.Calendar genCalendar () throws Exception{
//		
//		net.fortuna.ical4j.model.Calendar icsCalendar = new net.fortuna.ical4j.model.Calendar();
//		try{
//			TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry();
//			TimeZone timezone = registry.getTimeZone("Asia/Bangkok");
//	//		VTimeZone tz = timezone.getVTimeZone();
//	
//			 // Start Date is on: April 1, 2008, 9:00 am
//			Date cDate = Calendar.getInstance().getTime();
//	//		Calendar startDate = new GregorianCalendar();
//			Calendar startDate = Calendar.getInstance();
//			startDate.setTimeZone(timezone);
//	//		startDate.setTime(cDate);
//			startDate.set(java.util.Calendar.MONTH, java.util.Calendar.MAY);
//			startDate.set(java.util.Calendar.DAY_OF_MONTH, 1);
//			startDate.set(java.util.Calendar.YEAR, 2017);
//			startDate.set(java.util.Calendar.HOUR_OF_DAY, 8);
//			startDate.set(java.util.Calendar.MINUTE, 0);	
//			startDate.set(java.util.Calendar.SECOND, 0);
//			logger.debug(startDate);
//	
//			 // End Date is on: April 1, 2008, 13:00
//			Calendar endDate = Calendar.getInstance();
//			endDate.setTimeZone(timezone);
//	//		endDate.setTime(cDate);
//			endDate.set(java.util.Calendar.MONTH, java.util.Calendar.MAY);
//			endDate.set(java.util.Calendar.DAY_OF_MONTH, 1);
//			endDate.set(java.util.Calendar.YEAR, 2017);
//			endDate.set(java.util.Calendar.HOUR_OF_DAY, 16);
//			endDate.set(java.util.Calendar.MINUTE, 0);	
//			endDate.set(java.util.Calendar.SECOND, 0);
//			logger.debug(endDate);
//	
//			// Create the event
//			String eventName = "Test Event";
//			DateTime start = new DateTime(startDate.getTime());
//			DateTime end = new DateTime(endDate.getTime());
//			VEvent meeting = new VEvent(start, end, eventName);
////			VEvent meeting = new VEvent();
//			// add timezone info..
//	//		meeting.getProperties().add(tz.getTimeZoneId());
//	
//			// generate unique identifier..
//			UidGenerator ug = new UidGenerator("uidGen");
//			Uid uid = ug.generateUid();
//			meeting.getProperties().add(uid);
//	
//			// add attendees..
//			Attendee dev1 = new Attendee(URI.create("mailto:supakorn.csiedu@gmail.com"));
//			dev1.getParameters().add(Role.REQ_PARTICIPANT);
//			dev1.getParameters().add(new Cn("Developer 1"));
//			meeting.getProperties().add(dev1);
//	
//			Attendee dev2 = new Attendee(URI.create("mailto:pukapon.csiedu@gmail.com"));
//			dev2.getParameters().add(Role.OPT_PARTICIPANT);
//			dev2.getParameters().add(new Cn("Developer 2"));
//			meeting.getProperties().add(dev2);
//	
//			// Create a calendar
//			
//			icsCalendar.getProperties().add(new ProdId("-//Events Calendar//iCal4j 1.0//EN"));
//			icsCalendar.getProperties().add(CalScale.GREGORIAN);
//			icsCalendar.getProperties().add(Version.VERSION_2_0);
//			// Add the event and print
//			icsCalendar.getComponents().add(meeting);
//			logger.debug(icsCalendar);
//		}catch(Exception e){
//			logger.error(e.getMessage(),e);
//			throw e;
//		}
//		
//		return icsCalendar;
//	}
//	
//	/**
//	 * @author Teerapan V.
//	 * @return List<CalendarEventBean> 
//	 * */
//	public List<CalendarEventBean> findCalendarEventByPerson(Integer persId) throws MEDException{
//		List<CalendarEventBean> result = new ArrayList<>();
//		CalendarTbl calendar = calendarTblDAO.findActiveCalendar();
//		List<Holiday> holidays = holidayDAO.findHolidaysByCalendar(calendar.getCalendarId());
//		holidays.stream().forEach(o -> {
//			CalendarEventBean bean = new CalendarEventBean();
//			bean.setId(o.getHolidayId());
//			bean.setType("HOLIDAY");
//			bean.setTitle(o.getHolidayTitle());
//			bean.setDescr(o.getDescr());
//			bean.setStart(o.getStartDate());
//			bean.setEnd(o.getEndDate());
//			result.add(bean);
//		});
//		if (personalService.isEmp(persId)){
//			List<ActivityEmp> emps = activityEmpDAO.findEmpByPersonAndActiveCalendar(persId);
//			emps.stream().forEach(o -> {
//				CalendarEventBean bean = new CalendarEventBean();
//				bean.setId(o.getActivityTbl().getActivityId());
//				bean.setType("EVENT");
//				bean.setTitle(o.getActivityTbl().getTitle());
//				bean.setDescr(o.getActivityTbl().getDescr());
//				bean.setStart(o.getActivityTbl().getStartDate());
//				bean.setEnd(o.getActivityTbl().getEndDate());
//				result.add(bean);
//			});
//		}else{
//			List<ActivityStdnt> stdnts = activityStdntDAO.findStdntByPersonAndActiveCalendar(persId);
//			stdnts.stream().forEach(o -> {
//				CalendarEventBean bean = new CalendarEventBean();
//				bean.setId(o.getActivityTbl().getActivityId());
//				bean.setType("EVENT");
//				bean.setTitle(o.getActivityTbl().getTitle());
//				bean.setDescr(o.getActivityTbl().getDescr());
//				bean.setStart(o.getActivityTbl().getStartDate());
//				bean.setEnd(o.getActivityTbl().getEndDate());
//				result.add(bean);
//			});
//		}
//		return result;
//	}
}