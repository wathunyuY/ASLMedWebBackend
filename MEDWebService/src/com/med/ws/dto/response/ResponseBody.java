package com.med.ws.dto.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.med.asl.ws.bean.ChatroomBean;
import com.med.asl.ws.bean.MemberBean;
import com.med.asl.ws.bean.ResearchBean;
import com.med.asl.ws.bean.ResearchCategoryBean;
import com.med.asl.ws.bean.ResearchFilterBean;
import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadCarBean;
import com.med.ws.beans.AcadDegrBean;
import com.med.ws.beans.AcadGroupBean;
import com.med.ws.beans.AcadInstBean;
import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.AcadPlanBean;
import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.AddrGeographyBean;
import com.med.ws.beans.AddrProvinceBean;
import com.med.ws.beans.AgendaTblBean;
import com.med.ws.beans.BuildingBean;
import com.med.ws.beans.CalendarEventBean;
import com.med.ws.beans.ChatMsgBean;
import com.med.ws.beans.ClinicGroupingProgramBean;
import com.med.ws.beans.CrseTopicTmplBean;
import com.med.ws.beans.DayBean;
import com.med.ws.beans.EduLevelBean;
import com.med.ws.beans.EmpFowBean;
import com.med.ws.beans.EngLevelBean;
import com.med.ws.beans.EvaActionTypeBean;
import com.med.ws.beans.EvaAnswerTypeTblBean;
import com.med.ws.beans.EvaBean;
import com.med.ws.beans.EvaMappingBean;
import com.med.ws.beans.EvaluationTypeBean;
import com.med.ws.beans.EventBean;
import com.med.ws.beans.GrdBsBean;
import com.med.ws.beans.HolidayBean;
import com.med.ws.beans.HsPlanBean;
import com.med.ws.beans.LangCdBean;
import com.med.ws.beans.LvlGroupBean;
import com.med.ws.beans.MarriageStatusBean;
import com.med.ws.beans.MatchClassOfferBean;
import com.med.ws.beans.MonthTblBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.PrefixTypeBean;
import com.med.ws.beans.ProgramBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;
import com.med.ws.beans.RoomBean;
import com.med.ws.beans.RoomTypeBean;
import com.med.ws.beans.ScheduleTableBean;
import com.med.ws.beans.ScheduleTopicOverlapBean;
import com.med.ws.beans.ScoreBean;
import com.med.ws.beans.SubGroupStdntBean;
import com.med.ws.beans.SubjectTblBean;
import com.med.ws.beans.ValidateClassSectionBean;
import com.med.ws.beans.WorkloadTypeAndAcadProgListBean;
import com.med.ws.beans.WorkloadTypeBean;
import com.med.ws.dto.type.rq.AnswerSheetDTO;
import com.med.ws.dto.type.rq.ClassTopicDetailType;
import com.med.ws.dto.type.rq.CourseDetailType;
import com.med.ws.dto.type.rq.CourseDetailType.CourseData;
import com.med.ws.dto.type.rq.CrseOfferListType;
import com.med.ws.dto.type.rq.CrseTopicDetailType;
import com.med.ws.dto.type.rq.CrseTopicDetailType.Textbook;
import com.med.ws.dto.type.rq.EvaDTO;
import com.med.ws.dto.type.rq.EvaSummaryDTO;
import com.med.ws.dto.type.rq.EvaluationDTO;
import com.med.ws.dto.type.rq.EvaluationPersonDTO;
import com.med.ws.dto.type.rq.EvaluationPersonGroup;
import com.med.ws.dto.type.rq.EvaluationSummaryDTO;
import com.med.ws.dto.type.rq.EvaluationTime;
import com.med.ws.dto.type.rq.GradeRqType.Grade;
import com.med.ws.dto.type.rq.HomeworkReport;
import com.med.ws.dto.type.rq.OpenCrseClinicBean;
import com.med.ws.dto.type.rq.PersonEvaluationDTO;
import com.med.ws.dto.type.rq.SubGroupStdntClinicSaveRqType;
import com.med.ws.dto.type.rs.AccountDetailRsType;
import com.med.ws.dto.type.rs.ApplicationFormGetAllRsType;
import com.med.ws.dto.type.rs.ApplicationFormStepDTO;
import com.med.ws.dto.type.rs.ApplicationFormTypeDTO;
import com.med.ws.dto.type.rs.CalendarListRsType;
import com.med.ws.dto.type.rs.CalendarMasterDataRsType;
import com.med.ws.dto.type.rs.CalendarRsType;
import com.med.ws.dto.type.rs.ClassDetailDTO;
import com.med.ws.dto.type.rs.ClassListRsType;
import com.med.ws.dto.type.rs.ClassSectionDTO;
import com.med.ws.dto.type.rs.ClassTopicRsType;
import com.med.ws.dto.type.rs.ClassTopicTmplRsType;
import com.med.ws.dto.type.rs.CourseListRsType;
import com.med.ws.dto.type.rs.CreateStdntInfoRsType;
import com.med.ws.dto.type.rs.EmpInfoDetailRsType;
import com.med.ws.dto.type.rs.EmpPstnRsType;
import com.med.ws.dto.type.rs.EnrollClassApplicationFormDTO;
import com.med.ws.dto.type.rs.EvaAnswerSheetSubmitRsType;
import com.med.ws.dto.type.rs.EvaClassSummaryRsType;
import com.med.ws.dto.type.rs.EvaMappingPersonRsType;
import com.med.ws.dto.type.rs.EvaMappingTopicDataRsType;
import com.med.ws.dto.type.rs.EvaStatisticRsType;
import com.med.ws.dto.type.rs.EvaTblDescrRsType;
import com.med.ws.dto.type.rs.ExcelRsType;
import com.med.ws.dto.type.rs.FullCalendarRsType;
import com.med.ws.dto.type.rs.GetAddrMasterDataRsType;
import com.med.ws.dto.type.rs.GetCrseMasterDataRsType;
import com.med.ws.dto.type.rs.GetPersonDetailRsType;
import com.med.ws.dto.type.rs.GetPersonalParmsRsType;
import com.med.ws.dto.type.rs.GetRemainingTaskRsType;
import com.med.ws.dto.type.rs.HolidayRsType;
import com.med.ws.dto.type.rs.HolidayYearListRsType;
import com.med.ws.dto.type.rs.LoginRsType;
import com.med.ws.dto.type.rs.NationalityRsType;
import com.med.ws.dto.type.rs.NotificationLogType;
import com.med.ws.dto.type.rs.OccupiedPersonRsType;
import com.med.ws.dto.type.rs.PeopleByClassSectionRsType;
import com.med.ws.dto.type.rs.PermissionRsType;
import com.med.ws.dto.type.rs.PersInfoMasterDataRsType;
import com.med.ws.dto.type.rs.PersonalUpdateRsType;
import com.med.ws.dto.type.rs.PrefixRsType;
import com.med.ws.dto.type.rs.SchedulTopicTmplRsType;
import com.med.ws.dto.type.rs.ScheduleClassRsType;
import com.med.ws.dto.type.rs.ScheduleLessonRsType;
import com.med.ws.dto.type.rs.ScheduleMoveFormDTO;
import com.med.ws.dto.type.rs.ScheduleOverviewRsType;
import com.med.ws.dto.type.rs.ScheduleSwapFormDTO;
import com.med.ws.dto.type.rs.ScheduleTableRsType;
import com.med.ws.dto.type.rs.ScheduleTopicPersonRsType;
import com.med.ws.dto.type.rs.ScopeTblRs;
import com.med.ws.dto.type.rs.ScoreTypeRsType;
import com.med.ws.dto.type.rs.SearchCourseRsType;
import com.med.ws.dto.type.rs.SearchPersonalRsType;
import com.med.ws.dto.type.rs.SearchStdntByTimePeriodRsType;
import com.med.ws.dto.type.rs.SearchStdntRsType;
import com.med.ws.dto.type.rs.SearchTeacherByTimePeriodRsType;
import com.med.ws.dto.type.rs.SectionReportSummatyBean;
import com.med.ws.dto.type.rs.SectionRsType;
import com.med.ws.dto.type.rs.SectionStdntTempRsType;
import com.med.ws.dto.type.rs.SelectCrseCatalogType;
import com.med.ws.dto.type.rs.ServiceListRsType;
import com.med.ws.dto.type.rs.StdntClinicGroupRsType;
import com.med.ws.dto.type.rs.StdntClinicGroupToSectionRsType;
import com.med.ws.dto.type.rs.StdntDetailRsType;
import com.med.ws.dto.type.rs.StdntInfoMasterDataRsType;
import com.med.ws.dto.type.rs.StdntUpdateRsType;
import com.med.ws.dto.type.rs.SubGroupStdntClinicRsType;
import com.med.ws.dto.type.rs.SubGroupStdntClinicRsType.SubTopicForSubGroupBean;
import com.med.ws.dto.type.rs.SuggestTimeSlotRsType;
import com.med.ws.dto.type.rs.TQFSectionType;
import com.med.ws.dto.type.rs.TaskListRsType;
import com.med.ws.dto.type.rs.TopicTypeRsType;
import com.med.ws.dto.type.rs.TopicTypeRsTypeAll;
import com.med.ws.noti.config.TaskMessageBean;

@JsonInclude(Include.NON_NULL)
public class ResponseBody {

	protected LoginRsType loginRs;
	protected List<StdntClinicGroupRsType> stdntClinicGroupRsTypeList;
	protected List<ScheduleClassRsType> scheduleClassRsTypeList;
	protected List<TaskListRsType> taskRsList;
	protected List<ServiceListRsType> serviceRsList;
	protected List<SearchCourseRsType> searchCourseRsList;
	protected List<ScheduleLessonRsType> scheduleLessonRsTypeList;
	protected CreateStdntInfoRsType createStdntInfoRsType;
	protected StdntInfoMasterDataRsType stdntInfoMasterData;
	protected PermissionRsType permissionRs;
	protected PersInfoMasterDataRsType persInfoMasterDataRs;
	protected List<GetAddrMasterDataRsType> getAddrMasterData;
	protected List<SearchStdntRsType> searchStdntRsType;
	protected StdntDetailRsType stdntDetailRsType;
	protected GetPersonalParmsRsType personalParmsRsType;
	protected List<SearchPersonalRsType> searchPersonalRsType;
	protected List<StdntUpdateRsType> stdntUpdateRsType;
	protected List<PersonalUpdateRsType> personalUpdateRsTypeList;
	protected ExcelRsType excelRsType;
	protected GetCrseMasterDataRsType getCrseMasterRsType;
	protected List<RoomTypeBean> roomTypeList;
	protected List<BuildingBean> buildingList;
	protected List<RoomBean> roomList;
	protected String result;
	protected CalendarMasterDataRsType calendarMasterDataRsType;
	protected CalendarRsType calendarRsType;
	protected CalendarListRsType calendarListRsType;
	protected HolidayRsType holidaysRsType;
	protected List<CourseListRsType> courseListRsType;
	protected List<CourseDetailType> courseDetailRsListType;
	protected CourseDetailType courseDetailRsType;
	protected HolidayYearListRsType holidaysYearListRsType;
	protected ClassListRsType classListRsType;
	protected CrseTopicDetailType crseTopicType;
	protected List<CrseTopicDetailType> crseTopicList;
	protected List<CrseOfferListType> crseOfferList;
	protected OpenCrseClinicBean openCrseClinicRsType;
	protected FullCalendarRsType fullCalendarRsType;
	protected List<SectionStdntTempRsType> sectionStdntTempRsTypeList;
	@JsonProperty("topicType")
	protected List<TopicTypeRsType> topicTypeRsType;
	protected GetRemainingTaskRsType remainingTaskRsType;
	protected CourseData courseData;
	protected List<AcadOrgBean> acadOrgList;
	protected ScoreTypeRsType scoreTypeRsType;
	protected ClassTopicTmplRsType classTopicTmplRsType;
	protected List<ClassTopicRsType> classTopicRsList;
	protected List<ProgramBean> getProgramListRsType;
	protected ProgramBean getProgramRsType;
	protected List<ScoreBean> scoreTypeListRsType;
	protected StdntClinicGroupToSectionRsType stdntClinicGroupToSectionRsType;
	protected List<AcadCampusBean> acadCampusRsType;
	protected List<AcadOrgBean> acadOrgRsType;
	protected List<EvaluationDTO> evaluations;
	protected Map<Integer, List<EvaluationDTO>> evaluationsMap;
	protected EvaluationDTO evaluation;
	protected List<AcadGroupBean> acadGroupRsType;
	protected List<AcadCarBean> acadCarRsType;
	protected List<LvlGroupBean> lvlGroupRsType;
	protected List<AcadPlanBean> acadPlanRsType;
	protected List<SubjectTblBean> subjectTblRsType;
	protected List<AcadProgBean> acadProgRsType;
	protected SectionRsType sectionRsType;
	protected List<EventBean> eventListRsType;
	protected List<AgendaTblBean> agendaListRsType;
	protected EventBean eventRsType;
	protected GrdBsBean grdBsBean;
	protected List<GrdBsBean> grdBsBeanList;
	protected List<Grade> grdList;
	@JsonProperty("teacherResults")
	protected List<SearchTeacherByTimePeriodRsType> searchTeacherByTimeRsType;
	protected WorkloadTypeAndAcadProgListBean workloadTypeAndAcadProgListBean;
	protected List<PrefixBean> prefixList;
	@JsonProperty("stdntResults")
	protected List<SearchStdntByTimePeriodRsType> searchStdntByTimePeriodRsType;
	protected ClassTopicDetailType classTopicType;
	protected PrefixTypeBean prefixTypeBean;
	protected List<PrefixTypeBean> prefixTypeBeanList;
	protected RaceBean raceBean;
	protected List<RaceBean> raceBeanList;
	protected ReligionBean religionBean;
	protected List<ReligionBean> religionBeanList;
	protected TopicTypeRsTypeAll topicTypeRsTypeById;
	protected List<TopicTypeRsTypeAll> topicTypeRsTypeAll;
	protected PrefixRsType prefixRsType;
	protected List<PrefixRsType> prefixRsTypeList;
	protected NationalityRsType nationalityRsType;
	protected List<NationalityRsType> nationalityRsTypeList;
	protected SelectCrseCatalogType selectCrseCatalogRsType;
	protected List<ValidateClassSectionBean> validateClassSectionBeanList;
	protected MatchClassOfferBean matchClassOfferRsType;
	protected List<AcadDegrBean> acadDegrBeanList;
	protected List<ClinicGroupingProgramBean> clinicGroupingProgramBeanList;
	protected List<EduLevelBean> eduLevelBeanList;
	protected List<EmpFowBean> empFowBeanList;
	protected List<EmpPstnRsType> empPstnRsTypeList;
	protected List<EngLevelBean> engLevelBeanList;
	protected List<HsPlanBean> hsPlanBeanList;
	protected List<MarriageStatusBean> marriageStatusBeanList;
	protected List<AddrGeographyBean> addrGeographyBeanList;
	protected List<EvaluationTypeBean> evaluationTypeList;
	protected List<AcadInstBean> acadInstBeanRsTypeList;
	protected List<SchedulTopicTmplRsType> schedulTopicTmplRsType;
	protected List<WorkloadTypeBean> workloadTypeBeanList;
	protected List<DayBean> dayBeanList;
	protected List<LangCdBean> langCdBeanList;
	protected List<MonthTblBean> monthTblBeanList;
	protected ScheduleOverviewRsType scheduleOverviewRsType;
	@JsonProperty("answerSheet")
	protected AnswerSheetDTO answerSheetDTO;
	protected TQFSectionType tqfSectionRsType;
	protected ScheduleTableRsType scheduleTableRsType;
	protected ScheduleTopicPersonRsType scheduleTopicPersonRsType;
	protected GetPersonDetailRsType getPresonDetailRsType;
	protected Textbook textBook;
	protected String generation;
	protected SubGroupStdntClinicRsType subGroupStdntClinicRsType;
	protected List<ClassSectionDTO> classSectionList;
	protected PersonEvaluationDTO personEvaluation;
	@JsonProperty("classSection")
	protected ClassSectionDTO classSectionRs;
	@JsonProperty("evaluationSummary")
	protected EvaluationSummaryDTO evaluationSummary;
	protected List<ChatMsgBean> chatMsgListRsType;
	protected List<String> fileUploadName;
	protected List<ScheduleTopicOverlapBean> scheduleTopicOverlapBean;
	protected String id;
	protected List<CrseTopicTmplBean> crseTopicTmplRsType;
	protected List<String> classTmplNbrListRsType;
	@JsonProperty("classTopic")
	protected ClassTopicRsType classTopicRsType;
	protected List<HolidayBean> holidayListRsType;
	protected SubGroupStdntClinicSaveRqType subGroupStdntClinicSaveRqType;
	protected HomeworkReport homeworkReport;
	protected List<HomeworkReport> homeworkReports;
	protected List<TaskMessageBean> notiTaskRsType;
	protected ScheduleTableBean scheduleTopicDetail;
	protected List<NotificationLogType> notiLogRsList;
	protected List<EvaluationPersonDTO> evaluationPersons;
	protected List<EvaluationPersonGroup> evaluationPersonGroup;
	protected EvaluationTime evaluationTime;
	protected EmpInfoDetailRsType empInfoDetailRsType;
	protected OccupiedPersonRsType occupiedPersonRsType;
	protected List<CalendarEventBean> calendarEventListRsType;
	protected AccountDetailRsType accountDetailRsType;
	protected SuggestTimeSlotRsType suggestTimeSlotRsType;
	protected List<SectionReportSummatyBean> sectionReportList;
	protected ApplicationFormGetAllRsType applicationFormGetAllRsType;
	protected ScheduleSwapFormDTO scheduleSwapFormRsType;
	protected List<AddrProvinceBean> provinceList;
	protected List<HomeworkReport> homeworkReportsHistory;
	protected ScheduleMoveFormDTO scheduleMoveFormRsType;
	protected HashMap<String,List<SubTopicForSubGroupBean>> stdntSubGroupOverlapList;
	protected List<ApplicationFormTypeDTO> applicationFormTypeList;
	protected EnrollClassApplicationFormDTO enrollClassApplicationFormRsType;
	protected List<PeopleByClassSectionRsType> peopleByClassSectionRsType;
	protected List<SubGroupStdntBean> subGroupStdntBeanList;
	protected List<ApplicationFormStepDTO> applicationFormStepList;
	protected EvaMappingPersonRsType evaMappingPersonRsType;
	protected List<EvaTblDescrRsType> evaTblDescrListRsType;
	protected EvaBean evaRsType;
	protected List<EvaClassSummaryRsType> evaClassSummaryList;
	protected EvaAnswerSheetSubmitRsType evaAnswerSheetRsType;
	
	protected ClassDetailDTO classDetailRsType;
	
	protected  List<EvaAnswerTypeTblBean> evaAnswerTypeTblBeanRsType;
	protected List<EvaActionTypeBean> evaActionTypeBeanType;
	protected List<EvaDTO> evas;
	protected EvaDTO eva;
	protected EvaSummaryDTO evaSummaryRsType;
	protected List<EvaDTO> evaList;
	protected List<ScopeTblRs> scopeList;
	protected EvaMappingTopicDataRsType evaMappingTopicDataRsType;
	protected EvaMappingBean evaMappingBean;
	protected EvaStatisticRsType evaStatRsType;
	protected ChatroomBean chatroomRsType;
	protected List<ChatroomBean> chatroomRsTypes;
	protected List<MemberBean> memberRstypes;
	protected List<ResearchCategoryBean> researchCategoryRsTypes; 
	protected ResearchBean researchRsType;
	protected ResearchFilterBean researchFilterRsType;
	protected List<ResearchBean> researchRsTypes;
	
	public PersonEvaluationDTO getPersonEvaluation() {
		return personEvaluation;
	}

	public void setPersonEvaluation(PersonEvaluationDTO personEvaluation) {
		this.personEvaluation = personEvaluation;
	}

	public PermissionRsType getPermissionRs() {
		return permissionRs;
	}

	public void setPermissionRs(PermissionRsType permissionRs) {
		this.permissionRs = permissionRs;
	}

	public StdntInfoMasterDataRsType getStdntInfoMasterData() {
		return stdntInfoMasterData;
	}

	public void setStdntInfoMasterData(StdntInfoMasterDataRsType stdntInfoMasterData) {
		this.stdntInfoMasterData = stdntInfoMasterData;
	}

	public List<ScheduleClassRsType> getScheduleClassRsTypeList() {
		return scheduleClassRsTypeList;
	}

	public void setScheduleClassRsTypeList(List<ScheduleClassRsType> scheduleClassRsTypeList) {
		this.scheduleClassRsTypeList = scheduleClassRsTypeList;
	}

	public LoginRsType getLoginRs() {
		return loginRs;
	}

	public void setLoginRs(LoginRsType tokenType) {
		this.loginRs = tokenType;
	}

	public List<StdntClinicGroupRsType> getStdntClinicGroupRsTypeList() {
		return stdntClinicGroupRsTypeList;
	}

	public void setStdntClinicGroupRsTypeList(List<StdntClinicGroupRsType> stdntClinicGroupRsTypeList) {
		this.stdntClinicGroupRsTypeList = stdntClinicGroupRsTypeList;
	}

	public List<ScheduleClassRsType> getScheduleClassList() {
		return scheduleClassRsTypeList;
	}

	public void setScheduleClasList(List<ScheduleClassRsType> scheduleClassRsTypeList) {
		this.scheduleClassRsTypeList = scheduleClassRsTypeList;
	}

	public List<TaskListRsType> getTaskRsList() {
		return taskRsList;
	}

	public void setTaskRsList(List<TaskListRsType> taskRsList) {
		this.taskRsList = taskRsList;
	}

	public List<ServiceListRsType> getServiceRsList() {
		return serviceRsList;
	}

	public void setServiceRsList(List<ServiceListRsType> serviceRsList) {
		this.serviceRsList = serviceRsList;

	}

	public List<SearchCourseRsType> getSearchCourseRsList() {
		return searchCourseRsList;
	}

	public void setSearchCourseRsList(List<SearchCourseRsType> searchCourseRsList) {
		this.searchCourseRsList = searchCourseRsList;
	}

	public List<ScheduleLessonRsType> getScheduleLessonRsTypeList() {
		return scheduleLessonRsTypeList;
	}

	public void setScheduleLessonRsTypeList(List<ScheduleLessonRsType> scheduleLessonRsTypeList) {
		this.scheduleLessonRsTypeList = scheduleLessonRsTypeList;
	}

	public CreateStdntInfoRsType getCreateStdntInfoRsType() {
		return createStdntInfoRsType;
	}

	public void setCreateStdntInfoRsType(CreateStdntInfoRsType createStdntInfoRsType) {
		this.createStdntInfoRsType = createStdntInfoRsType;
	}

	public PersInfoMasterDataRsType getPersInfoMasterDataRs() {
		return persInfoMasterDataRs;
	}

	public void setPersInfoMasterDataRs(PersInfoMasterDataRsType persInfoMasterDataRs) {
		this.persInfoMasterDataRs = persInfoMasterDataRs;
	}

	public List<GetAddrMasterDataRsType> getGetAddrMasterData() {
		return getAddrMasterData;
	}

	public void setGetAddrMasterData(List<GetAddrMasterDataRsType> getAddrMasterData) {
		this.getAddrMasterData = getAddrMasterData;
	}

	public List<SearchStdntRsType> getSearchStdntRsType() {
		return searchStdntRsType;
	}

	public void setSearchStdntRsType(List<SearchStdntRsType> searchStdntRsType) {
		this.searchStdntRsType = searchStdntRsType;
	}

	public StdntDetailRsType getStdntDetailRsType() {
		return stdntDetailRsType;
	}

	public void setStdntDetailRsType(StdntDetailRsType stdntDetailRsType) {
		this.stdntDetailRsType = stdntDetailRsType;
	}

	public GetPersonalParmsRsType getPersonalParmsRsType() {
		return personalParmsRsType;
	}

	public void setPersonalParmsRsType(GetPersonalParmsRsType personalParmsRsType) {
		this.personalParmsRsType = personalParmsRsType;
	}

	public List<SearchPersonalRsType> getSearchPersonalRsType() {
		return searchPersonalRsType;
	}

	public void setSearchPersonalRsType(List<SearchPersonalRsType> searchPersonalRsType) {
		this.searchPersonalRsType = searchPersonalRsType;
	}

	public List<StdntUpdateRsType> getStdntUpdateRsType() {
		return stdntUpdateRsType;
	}

	public void setStdntUpdateRsType(List<StdntUpdateRsType> stdntUpdateRsType) {
		this.stdntUpdateRsType = stdntUpdateRsType;
	}

	public List<PersonalUpdateRsType> getPersonalUpdateRsTypeList() {
		return personalUpdateRsTypeList;
	}

	public void setPersonalUpdateRsTypeList(List<PersonalUpdateRsType> personalUpdateRsTypeList) {
		this.personalUpdateRsTypeList = personalUpdateRsTypeList;
	}

	public ExcelRsType getExcelRsType() {
		return excelRsType;
	}

	public void setExcelRsType(ExcelRsType excelRsType) {
		this.excelRsType = excelRsType;
	}

	public GetCrseMasterDataRsType getGetCrseMasterRsType() {
		return getCrseMasterRsType;
	}

	public void setGetCrseMasterRsType(GetCrseMasterDataRsType getCrseMasterRsType) {
		this.getCrseMasterRsType = getCrseMasterRsType;
	}

	public List<RoomTypeBean> getRoomTypeList() {
		return roomTypeList;
	}

	public void setRoomTypeList(List<RoomTypeBean> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}

	public List<BuildingBean> getBuildingList() {
		return buildingList;
	}

	public void setBuildingList(List<BuildingBean> buildingList) {
		this.buildingList = buildingList;
	}

	public List<RoomBean> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<RoomBean> roomList) {
		this.roomList = roomList;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public CalendarMasterDataRsType getCalendarMasterDataRsType() {
		return calendarMasterDataRsType;
	}

	public void setCalendarMasterDataRsType(CalendarMasterDataRsType calendarMasterDataRsType) {
		this.calendarMasterDataRsType = calendarMasterDataRsType;
	}

	public CalendarRsType getCalendarRsType() {
		return calendarRsType;
	}

	public void setCalendarRsType(CalendarRsType calendarRsType) {
		this.calendarRsType = calendarRsType;
	}

	public CalendarListRsType getCalendarListRsType() {
		return calendarListRsType;
	}

	public void setCalendarListRsType(CalendarListRsType calendarListRsType) {
		this.calendarListRsType = calendarListRsType;
	}

	public HolidayRsType getHolidaysRsType() {
		return holidaysRsType;
	}

	public void setHolidaysRsType(HolidayRsType holidaysRsType) {
		this.holidaysRsType = holidaysRsType;
	}

	public List<CourseListRsType> getCourseListRsType() {
		return courseListRsType;
	}

	public void setCourseListRsType(List<CourseListRsType> courseListRsType) {
		this.courseListRsType = courseListRsType;
	}

	public HolidayYearListRsType getHolidaysYearListRsType() {
		return holidaysYearListRsType;
	}

	public void setHolidaysYearListRsType(HolidayYearListRsType holidaysYearListRsType) {
		this.holidaysYearListRsType = holidaysYearListRsType;
	}

	public ClassListRsType getClassListRsType() {
		return classListRsType;
	}

	public void setClassListRsType(ClassListRsType classListRsType) {
		this.classListRsType = classListRsType;
	}

	public List<CourseDetailType> getCourseDetailRsListType() {
		return courseDetailRsListType;
	}

	public void setCourseDetailRsListType(List<CourseDetailType> courseDetailRsListType) {
		this.courseDetailRsListType = courseDetailRsListType;
	}

	public CrseTopicDetailType getCrseTopicType() {
		return crseTopicType;
	}

	public void setCrseTopicType(CrseTopicDetailType crseTopicType) {
		this.crseTopicType = crseTopicType;
	}

	public List<CrseTopicDetailType> getCrseTopicList() {
		return crseTopicList;
	}

	public void setCrseTopicList(List<CrseTopicDetailType> crseTopicList) {
		this.crseTopicList = crseTopicList;
	}

	public List<CrseOfferListType> getCrseOfferList() {
		return crseOfferList;
	}

	public void setCrseOfferList(List<CrseOfferListType> crseOfferList) {
		this.crseOfferList = crseOfferList;
	}

	public OpenCrseClinicBean getOpenCrseClinicRsType() {
		return openCrseClinicRsType;
	}

	public void setOpenCrseClinicRsType(OpenCrseClinicBean openCrseClinicRsType) {
		this.openCrseClinicRsType = openCrseClinicRsType;
	}

	public CourseDetailType getCourseDetailRsType() {
		return courseDetailRsType;
	}

	public void setCourseDetailRsType(CourseDetailType courseDetailRsType) {
		this.courseDetailRsType = courseDetailRsType;
	}

	public FullCalendarRsType getFullCalendarRsType() {
		return fullCalendarRsType;
	}

	public void setFullCalendarRsType(FullCalendarRsType fullCalendarRsType) {
		this.fullCalendarRsType = fullCalendarRsType;
	}

	public List<SectionStdntTempRsType> getSectionStdntTempRsTypeList() {
		return sectionStdntTempRsTypeList;
	}

	public void setSectionStdntTempRsTypeList(List<SectionStdntTempRsType> sectionStdntTempRsTypeList) {
		this.sectionStdntTempRsTypeList = sectionStdntTempRsTypeList;
	}

	public List<TopicTypeRsType> getTopicTypeRsType() {
		return topicTypeRsType;
	}

	public void setTopicTypeRsType(List<TopicTypeRsType> topicTypeListRsType) {
		this.topicTypeRsType = topicTypeListRsType;
	}

	public GetRemainingTaskRsType getRemainingTaskRsType() {
		return remainingTaskRsType;
	}

	public void setRemainingTaskRsType(GetRemainingTaskRsType remainingTaskRsType) {
		this.remainingTaskRsType = remainingTaskRsType;
	}

	public CourseData getCourseData() {
		return courseData;
	}

	public void setCourseData(CourseData courseData) {
		this.courseData = courseData;
	}

	public List<AcadOrgBean> getAcadOrgList() {
		return acadOrgList;
	}

	public void setAcadOrgList(List<AcadOrgBean> acadOrgList) {
		this.acadOrgList = acadOrgList;
	}

	public ScoreTypeRsType getScoreTypeRsType() {
		return scoreTypeRsType;
	}

	public void setScoreTypeRsType(ScoreTypeRsType scoreTypeRsType) {
		this.scoreTypeRsType = scoreTypeRsType;
	}

	public ClassTopicTmplRsType getClassTopicTmplRsType() {
		return classTopicTmplRsType;
	}

	public void setClassTopicTmplRsType(ClassTopicTmplRsType classTopicTmplRsType) {
		this.classTopicTmplRsType = classTopicTmplRsType;
	}

	public List<ClassTopicRsType> getClassTopicRsList() {
		return classTopicRsList;
	}

	public void setClassTopicRsList(List<ClassTopicRsType> classTopicRsList) {
		this.classTopicRsList = classTopicRsList;
	}

	public List<ProgramBean> getGetProgramListRsType() {
		return getProgramListRsType;
	}

	public void setGetProgramListRsType(List<ProgramBean> getProgramListRsType) {
		this.getProgramListRsType = getProgramListRsType;
	}

	public ProgramBean getGetProgramRsType() {
		return getProgramRsType;
	}

	public void setGetProgramRsType(ProgramBean getProgramRsType) {
		this.getProgramRsType = getProgramRsType;
	}

	public List<ScoreBean> getScoreTypeListRsType() {
		return scoreTypeListRsType;
	}

	public void setScoreTypeListRsType(List<ScoreBean> scoreTypeListRsType) {
		this.scoreTypeListRsType = scoreTypeListRsType;
	}

	public StdntClinicGroupToSectionRsType getStdntClinicGroupToSectionRsType() {
		return stdntClinicGroupToSectionRsType;
	}

	public void setStdntClinicGroupToSectionRsType(StdntClinicGroupToSectionRsType stdntClinicGroupToSectionRsType) {
		this.stdntClinicGroupToSectionRsType = stdntClinicGroupToSectionRsType;
	}

	public List<AcadCampusBean> getAcadCampusRsType() {
		return acadCampusRsType;
	}

	public void setAcadCampusRsType(List<AcadCampusBean> acadCampusRsType) {
		this.acadCampusRsType = acadCampusRsType;
	}

	public List<AcadOrgBean> getAcadOrgRsType() {
		return acadOrgRsType;
	}

	public void setAcadOrgRsType(List<AcadOrgBean> acadOrgRsType) {
		this.acadOrgRsType = acadOrgRsType;
	}

	public List<AcadGroupBean> getAcadGroupRsType() {
		return acadGroupRsType;
	}

	public void setAcadGroupRsType(List<AcadGroupBean> acadGroupRsType) {
		this.acadGroupRsType = acadGroupRsType;
	}

	public List<AcadCarBean> getAcadCarRsType() {
		return acadCarRsType;
	}

	public void setAcadCarRsType(List<AcadCarBean> acadCarRsType) {
		this.acadCarRsType = acadCarRsType;
	}

	public List<LvlGroupBean> getLvlGroupRsType() {
		return lvlGroupRsType;
	}

	public void setLvlGroupRsType(List<LvlGroupBean> lvlGroupRsType) {
		this.lvlGroupRsType = lvlGroupRsType;
	}

	public List<AcadPlanBean> getAcadPlanRsType() {
		return acadPlanRsType;
	}

	public void setAcadPlanRsType(List<AcadPlanBean> acadPlanRsType) {
		this.acadPlanRsType = acadPlanRsType;
	}

	public List<SubjectTblBean> getSubjectTblRsType() {
		return subjectTblRsType;
	}

	public void setSubjectTblRsType(List<SubjectTblBean> subjectTblRsType) {
		this.subjectTblRsType = subjectTblRsType;
	}

	public List<AcadProgBean> getAcadProgRsType() {
		return acadProgRsType;
	}

	public void setAcadProgRsType(List<AcadProgBean> acadProgRsType) {
		this.acadProgRsType = acadProgRsType;
	}

	public SectionRsType getSectionRsType() {
		return sectionRsType;
	}

	public void setSectionRsType(SectionRsType sectionRsType) {
		this.sectionRsType = sectionRsType;
	}

	public List<EventBean> getEventListRsType() {
		return eventListRsType;
	}

	public void setEventListRsType(List<EventBean> eventListRsType) {
		this.eventListRsType = eventListRsType;
	}

	public EventBean getEventRsType() {
		return eventRsType;
	}

	public void setEventRsType(EventBean eventRsType) {
		this.eventRsType = eventRsType;
	}

	public List<AgendaTblBean> getAgendaListRsType() {
		return agendaListRsType;
	}

	public void setAgendaListRsType(List<AgendaTblBean> agendaListRsType) {
		this.agendaListRsType = agendaListRsType;
	}

	public EvaluationDTO getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(EvaluationDTO evaluation) {
		this.evaluation = evaluation;
	}

	public GrdBsBean getGrdBsBean() {
		return this.grdBsBean;
	}

	public void setGrdBsBean(GrdBsBean grdBsBean) {
		this.grdBsBean = grdBsBean;
	}

	public List<GrdBsBean> getGrdBsBeanList() {
		return this.grdBsBeanList;
	}

	public void setGrdBsBeanList(List<GrdBsBean> grdBsBeanList) {
		this.grdBsBeanList = grdBsBeanList;
	}

	public void setGrdList(List<Grade> grade) {
		this.grdList = grade;
	}

	public List<Grade> getGrdList() {
		return this.grdList;
	}

	public List<EvaluationDTO> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<EvaluationDTO> evaluations) {
		this.evaluations = evaluations;
	}

	public List<SearchTeacherByTimePeriodRsType> getSearchTeacherByTimeRsType() {
		return searchTeacherByTimeRsType;
	}

	public void setSearchTeacherByTimeRsType(List<SearchTeacherByTimePeriodRsType> searchTeacherByTimeRsType) {
		this.searchTeacherByTimeRsType = searchTeacherByTimeRsType;
	}

	public WorkloadTypeAndAcadProgListBean getWorkloadTypeAndAcadProgListBean() {
		return this.workloadTypeAndAcadProgListBean;
	}

	public void setWorkloadTypeAndAcadProgListBean(WorkloadTypeAndAcadProgListBean t) {
		this.workloadTypeAndAcadProgListBean = t;
	}

	public List<PrefixBean> getPrefixList() {
		return this.prefixList;
	}

	public void setPrefixList(List<PrefixBean> prefixList) {
		this.prefixList = prefixList;
	}

	public List<SearchStdntByTimePeriodRsType> getSearchStdntByTimePeriodRsType() {
		return searchStdntByTimePeriodRsType;
	}

	public void setSearchStdntByTimePeriodRsType(List<SearchStdntByTimePeriodRsType> searchStdntByTimePeriodRsType) {
		this.searchStdntByTimePeriodRsType = searchStdntByTimePeriodRsType;
	}

	public ClassTopicDetailType getClassTopicType() {
		return classTopicType;
	}

	public void setClassTopicType(ClassTopicDetailType classTopicType) {
		this.classTopicType = classTopicType;
	}

	public PrefixTypeBean getPrefixTypeBean() {
		return this.prefixTypeBean;
	}

	public void setPrefixTypeBean(PrefixTypeBean prefixTypeBean) {
		this.prefixTypeBean = prefixTypeBean;
	}

	public List<PrefixTypeBean> getPrefixTypeBeanList() {
		return this.prefixTypeBeanList;
	}

	public void setPrefixTypeBeanList(List<PrefixTypeBean> prefixTypeBeanList) {
		this.prefixTypeBeanList = prefixTypeBeanList;
	}

	public RaceBean getRaceBean() {
		return this.raceBean;
	}

	public void setRaceBean(RaceBean raceBean) {
		this.raceBean = raceBean;
	}

	public List<RaceBean> getRaceBeanList() {
		return this.raceBeanList;
	}

	public void setRaceBeanList(List<RaceBean> raceBeanList) {
		this.raceBeanList = raceBeanList;
	}

	public ReligionBean getReligionBean() {
		return this.religionBean;
	}

	public void setReligionBean(ReligionBean religionBean) {
		this.religionBean = religionBean;
	}

	public List<ReligionBean> getReligionBeanList() {
		return this.religionBeanList;
	}

	public void setReligionBeanList(List<ReligionBean> religionBeanList) {
		this.religionBeanList = religionBeanList;
	}

	public void setTopicTypeRsTypeAll(List<TopicTypeRsTypeAll> topicTypeRsTypeAll) {
		this.topicTypeRsTypeAll = topicTypeRsTypeAll;
	}

	public TopicTypeRsTypeAll getTopTypeRsTypeById() {
		return this.topicTypeRsTypeById;
	}

	public void setTopicTypeRsTypeById(TopicTypeRsTypeAll topicTypeRsTypeById) {
		this.topicTypeRsTypeById = topicTypeRsTypeById;
	}

	public PrefixRsType getPrefixRsType() {
		return this.prefixRsType;
	}

	public void setsetPrefixRsType(PrefixRsType prefixRsType) {
		this.prefixRsType = prefixRsType;
	}

	public List<PrefixRsType> getPrefixRsTypeList() {
		return this.prefixRsTypeList;
	}

	public void setsetPrefixRsTypeList(List<PrefixRsType> prefixRsTypeList) {
		this.prefixRsTypeList = prefixRsTypeList;
	}

	public NationalityRsType getNationalityRsType() {
		return this.nationalityRsType;
	}

	public void setNationalityRsType(NationalityRsType nationalityRsType) {
		this.nationalityRsType = nationalityRsType;
	}

	public List<NationalityRsType> getNationalityRsTypeList() {
		return this.nationalityRsTypeList;
	}

	public void setNationalityRsTypeList(List<NationalityRsType> nationalityRsTypeList) {
		this.nationalityRsTypeList = nationalityRsTypeList;
	}

	public TopicTypeRsTypeAll getTopicTypeRsTypeById() {
		return topicTypeRsTypeById;
	}

	public List<TopicTypeRsTypeAll> getTopicTypeRsTypeAll() {
		return topicTypeRsTypeAll;
	}

	public void setPrefixRsType(PrefixRsType prefixRsType) {
		this.prefixRsType = prefixRsType;
	}

	public void setPrefixRsTypeList(List<PrefixRsType> prefixRsTypeList) {
		this.prefixRsTypeList = prefixRsTypeList;
	}

	public SelectCrseCatalogType getSelectCrseCatalogRsType() {
		return selectCrseCatalogRsType;
	}

	public void setSelectCrseCatalogRsType(SelectCrseCatalogType selectCrseCatalogRsType) {
		this.selectCrseCatalogRsType = selectCrseCatalogRsType;
	}

	public List<ValidateClassSectionBean> getValidateClassSectionBeanList() {
		return validateClassSectionBeanList;
	}

	public void setValidateClassSectionBeanList(List<ValidateClassSectionBean> validateClassSectionBeanList) {
		this.validateClassSectionBeanList = validateClassSectionBeanList;
	}

	public List<AcadDegrBean> getAcadDegrBeanList() {
		return this.acadDegrBeanList;
	}

	public void setAcadDegrBeanList(List<AcadDegrBean> acadDegrBeanList) {
		this.acadDegrBeanList = acadDegrBeanList;
	}

	public List<ClinicGroupingProgramBean> getClinicGroupingProgramBeanList() {
		return this.clinicGroupingProgramBeanList;
	}

	public void setClinicGroupingProgramBeanList(List<ClinicGroupingProgramBean> clinicGroupingProgramBeanList) {
		this.clinicGroupingProgramBeanList = clinicGroupingProgramBeanList;
	}

	public List<EduLevelBean> getEduLevelBeanList() {
		return this.eduLevelBeanList;
	}

	public void setEduLevelBeanList(List<EduLevelBean> eduLevelBeanList) {
		this.eduLevelBeanList = eduLevelBeanList;
	}

	public List<EmpFowBean> getEmpFowBeanList() {
		return this.empFowBeanList;
	}

	public void setEmpFowBeanList(List<EmpFowBean> empFowBeanList) {
		this.empFowBeanList = empFowBeanList;
	}

	public List<EmpPstnRsType> getEmpPstnRsTypeList() {
		return this.empPstnRsTypeList;
	}

	public void setEmpPstnRsTypeList(List<EmpPstnRsType> empPstnRsTypeList) {
		this.empPstnRsTypeList = empPstnRsTypeList;
	}

	public List<EngLevelBean> getEngLevelBeanList() {
		return this.engLevelBeanList;
	}

	public void setEngLevelBeanList(List<EngLevelBean> engLevelBeanList) {
		this.engLevelBeanList = engLevelBeanList;
	}

	public List<HsPlanBean> getHsPlanBeanList() {
		return this.hsPlanBeanList;
	}

	public void setHsPlanBeanList(List<HsPlanBean> hsPlanBeanList) {
		this.hsPlanBeanList = hsPlanBeanList;
	}

	public List<MarriageStatusBean> getMarriageStatusBeanList() {
		return this.marriageStatusBeanList;
	}

	public void setMarriageStatusBeanList(List<MarriageStatusBean> marriageStatusBeanList) {
		this.marriageStatusBeanList = marriageStatusBeanList;
	}

	public List<AddrGeographyBean> getAddrGeographyBeanList() {
		return this.addrGeographyBeanList;
	}

	public void setAddrGeographyBeanList(List<AddrGeographyBean> addrGeographyBeanList) {
		this.addrGeographyBeanList = addrGeographyBeanList;
	}

	public List<AcadInstBean> getAcadInstBeanRsTypeList() {
		return this.acadInstBeanRsTypeList;
	}

	public void setAcadInstBeanRsTypeList(List<AcadInstBean> acadInstBeanRsTypeList) {
		this.acadInstBeanRsTypeList = acadInstBeanRsTypeList;
	}

	public MatchClassOfferBean getMatchClassOfferRsType() {
		return matchClassOfferRsType;
	}

	public void setMatchClassOfferRsType(MatchClassOfferBean matchClassOfferRsType) {
		this.matchClassOfferRsType = matchClassOfferRsType;
	}

	public List<EvaluationTypeBean> getEvaluationTypeList() {
		return evaluationTypeList;
	}

	public void setEvaluationTypeList(List<EvaluationTypeBean> evaluationTypeList) {
		this.evaluationTypeList = evaluationTypeList;
	}

	public List<WorkloadTypeBean> getWorkloadTypeBeanList() {
		return this.workloadTypeBeanList;
	}

	public void setWorkloadTypeBeanList(List<WorkloadTypeBean> workloadTypeBeanList) {
		this.workloadTypeBeanList = workloadTypeBeanList;
	}

	public List<DayBean> getDayBeanList() {
		return dayBeanList;
	}

	public List<SchedulTopicTmplRsType> getSchedulTopicTmplRsType() {
		return schedulTopicTmplRsType;
	}

	public void setDayBeanList(List<DayBean> dayBeanList) {
		this.dayBeanList = dayBeanList;
	}

	public List<LangCdBean> getLangCdBeanList() {
		return langCdBeanList;
	}

	public void setSchedulTopicTmplRsType(List<SchedulTopicTmplRsType> schedulTopicTmplRsType) {
		this.schedulTopicTmplRsType = schedulTopicTmplRsType;
	}

	public void setLangCdBeanList(List<LangCdBean> langCdBeanList) {
		this.langCdBeanList = langCdBeanList;
	}

	public List<MonthTblBean> getMonthTblBeanList() {
		return monthTblBeanList;
	}

	public void setMonthTblBeanList(List<MonthTblBean> monthTblBeanList) {
		this.monthTblBeanList = monthTblBeanList;
	}

	public ScheduleOverviewRsType getScheduleOverviewRsType() {
		return scheduleOverviewRsType;
	}

	public void setScheduleOverviewRsType(ScheduleOverviewRsType scheduleOverviewRsType) {
		this.scheduleOverviewRsType = scheduleOverviewRsType;
	}

	public ScheduleTableRsType getScheduleTableRsType() {
		return scheduleTableRsType;
	}

	public void setScheduleTableRsType(ScheduleTableRsType scheduleTableRsType) {
		this.scheduleTableRsType = scheduleTableRsType;
	}

	public AnswerSheetDTO getAnswerSheetDTO() {
		return answerSheetDTO;
	}

	public void setAnswerSheetDTO(AnswerSheetDTO answerSheetDTO) {
		this.answerSheetDTO = answerSheetDTO;
	}

	public ScheduleTopicPersonRsType getScheduleTopicPersonRsType() {
		return scheduleTopicPersonRsType;
	}

	public void setScheduleTopicPersonRsType(ScheduleTopicPersonRsType scheduleTopicPersonRsType) {
		this.scheduleTopicPersonRsType = scheduleTopicPersonRsType;
	}

	public TQFSectionType getTqfSectionRsType() {
		return tqfSectionRsType;
	}

	public void setTqfSectionRsType(TQFSectionType tqfSectionRsType) {
		this.tqfSectionRsType = tqfSectionRsType;
	}

	public GetPersonDetailRsType getGetPresonDetailRsType() {
		return getPresonDetailRsType;
	}

	public void setGetPresonDetailRsType(GetPersonDetailRsType getPresonDetailRsType) {
		this.getPresonDetailRsType = getPresonDetailRsType;
	}

	public Textbook getTextBook() {
		return textBook;
	}

	public void setTextBook(Textbook textBook) {
		this.textBook = textBook;
	}

	public Map<Integer, List<EvaluationDTO>> getEvaluationsMap() {
		return evaluationsMap;
	}

	public void setEvaluationsMap(Map<Integer, List<EvaluationDTO>> evaluationsMap) {
		this.evaluationsMap = evaluationsMap;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public SubGroupStdntClinicRsType getSubGroupStdntClinicRsType() {
		return subGroupStdntClinicRsType;
	}

	public void setSubGroupStdntClinicRsType(SubGroupStdntClinicRsType subGroupStdntClinicRsType) {
		this.subGroupStdntClinicRsType = subGroupStdntClinicRsType;
	}

	public List<ClassSectionDTO> getClassSectionList() {
		return classSectionList;
	}

	public void setClassSectionList(List<ClassSectionDTO> classSectionList) {
		this.classSectionList = classSectionList;
	}

	public ClassSectionDTO getClassSectionRs() {
		return classSectionRs;
	}

	public void setClassSectionRs(ClassSectionDTO classSectionRs) {
		this.classSectionRs = classSectionRs;
	}

	public EvaluationSummaryDTO getEvaluationSummary() {
		return evaluationSummary;
	}

	public void setEvaluationSummary(EvaluationSummaryDTO evaluationSummaryDTO) {
		this.evaluationSummary = evaluationSummaryDTO;
	}

	public List<ChatMsgBean> getChatMsgListRsType() {
		return chatMsgListRsType;
	}

	public void setChatMsgListRsType(List<ChatMsgBean> chatMsgListRsType) {
		this.chatMsgListRsType = chatMsgListRsType;
	}

	public List<String> getFileUploadName() {
		return fileUploadName;
	}

	public void setFileUploadName(List<String> fileUploadName) {
		this.fileUploadName = fileUploadName;
	}

	public List<ScheduleTopicOverlapBean> getScheduleTopicOverlapBean() {
		return scheduleTopicOverlapBean;
	}

	public void setScheduleTopicOverlapBean(List<ScheduleTopicOverlapBean> scheduleTopicOverlapBean) {
		this.scheduleTopicOverlapBean = scheduleTopicOverlapBean;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<CrseTopicTmplBean> getCrseTopicTmplRsType() {
		return crseTopicTmplRsType;
	}

	public void setCrseTopicTmplRsType(List<CrseTopicTmplBean> crseTopicTmplRsType) {
		this.crseTopicTmplRsType = crseTopicTmplRsType;
	}

	public List<String> getClassTmplNbrListRsType() {
		return classTmplNbrListRsType;
	}

	public void setClassTmplNbrListRsType(List<String> classTmplNbrListRsType) {
		this.classTmplNbrListRsType = classTmplNbrListRsType;
	}

	public ClassTopicRsType getClassTopicRsType() {
		return classTopicRsType;
	}

	public void setClassTopicRsType(ClassTopicRsType classTopicRsType) {
		this.classTopicRsType = classTopicRsType;
	}

	public SubGroupStdntClinicSaveRqType getSubGroupStdntClinicSaveRqType() {
		return subGroupStdntClinicSaveRqType;
	}

	public void setSubGroupStdntClinicSaveRqType(SubGroupStdntClinicSaveRqType subGroupStdntClinicSaveRqType) {
		this.subGroupStdntClinicSaveRqType = subGroupStdntClinicSaveRqType;
	}

	public HomeworkReport getHomeworkReport() {
		return homeworkReport;
	}

	public void setHomeworkReport(HomeworkReport homeworkReport) {
		this.homeworkReport = homeworkReport;
	}

	public List<HomeworkReport> getHomeworkReports() {
		return homeworkReports;
	}

	public void setHomeworkReports(List<HomeworkReport> homeworkReports) {
		this.homeworkReports = homeworkReports;
	}

	public List<HolidayBean> getHolidayListRsType() {
		return holidayListRsType;
	}

	public void setHolidayListRsType(List<HolidayBean> holidayListRsType) {
		this.holidayListRsType = holidayListRsType;
	}

	public List<TaskMessageBean> getNotiTaskRsType() {
		return notiTaskRsType;
	}

	public void setNotiTaskRsType(List<TaskMessageBean> notiTaskRsType) {
		this.notiTaskRsType = notiTaskRsType;
	}

	public ScheduleTableBean getScheduleTopicDetail() {
		return scheduleTopicDetail;
	}

	public void setScheduleTopicDetail(ScheduleTableBean scheduleTopicDetail) {
		this.scheduleTopicDetail = scheduleTopicDetail;
	}

	public List<NotificationLogType> getNotiLogRsList() {
		return notiLogRsList;
	}

	public void setNotiLogRsList(List<NotificationLogType> notiLogRsList) {
		this.notiLogRsList = notiLogRsList;
	}

	public List<EvaluationPersonDTO> getEvaluationPersons() {
		return evaluationPersons;
	}

	public void setEvaluationPersons(List<EvaluationPersonDTO> evaluationPersons) {
		this.evaluationPersons = evaluationPersons;
	}

	public List<EvaluationPersonGroup> getEvaluationPersonGroup() {
		return evaluationPersonGroup;
	}

	public void setEvaluationPersonGroup(List<EvaluationPersonGroup> evaluationPersonGroup) {
		this.evaluationPersonGroup = evaluationPersonGroup;
	}

	public EvaluationTime getEvaluationTime() {
		return evaluationTime;
	}

	public void setEvaluationTime(EvaluationTime evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	public EmpInfoDetailRsType getEmpInfoDetailRsType() {
		return empInfoDetailRsType;
	}

	public void setEmpInfoDetailRsType(EmpInfoDetailRsType empInfoDetailRsType) {
		this.empInfoDetailRsType = empInfoDetailRsType;
	}

	public OccupiedPersonRsType getOccupiedPersonRsType() {
		return occupiedPersonRsType;
	}

	public void setOccupiedPersonRsType(OccupiedPersonRsType occupiedPersonRsType) {
		this.occupiedPersonRsType = occupiedPersonRsType;
	}

	public List<CalendarEventBean> getCalendarEventListRsType() {
		return calendarEventListRsType;
	}

	public void setCalendarEventListRsType(List<CalendarEventBean> calendarEventListRsType) {
		this.calendarEventListRsType = calendarEventListRsType;
	}

	public AccountDetailRsType getAccountDetailRsType() {
		return accountDetailRsType;
	}

	public void setAccountDetailRsType(AccountDetailRsType accountDetailRsType) {
		this.accountDetailRsType = accountDetailRsType;
	}

	public SuggestTimeSlotRsType getSuggestTimeSlotRsType() {
		return suggestTimeSlotRsType;
	}

	public void setSuggestTimeSlotRsType(SuggestTimeSlotRsType suggestTimeSlotRsType) {
		this.suggestTimeSlotRsType = suggestTimeSlotRsType;
	}

	public List<SectionReportSummatyBean> getSectionReportList() {
		return sectionReportList;
	}

	public void setSectionReportList(List<SectionReportSummatyBean> sectionReportList) {
		this.sectionReportList = sectionReportList;
	}

	public ApplicationFormGetAllRsType getApplicationFormGetAllRsType() {
		return applicationFormGetAllRsType;
	}

	public void setApplicationFormGetAllRsType(ApplicationFormGetAllRsType applicationFormGetAllRsType) {
		this.applicationFormGetAllRsType = applicationFormGetAllRsType;
	}

	public ScheduleSwapFormDTO getScheduleSwapFormRsType() {
		return scheduleSwapFormRsType;
	}

	public void setScheduleSwapFormRsType(ScheduleSwapFormDTO scheduleSwapFormRsType) {
		this.scheduleSwapFormRsType = scheduleSwapFormRsType;
	}

	public List<HomeworkReport> getHomeworkReportsHistory() {
		return homeworkReportsHistory;
	}

	public void setHomeworkReportsHistory(List<HomeworkReport> homeworkReportsHistory) {
		this.homeworkReportsHistory = homeworkReportsHistory;
	}

	public ScheduleMoveFormDTO getScheduleMoveFormRsType() {
		return scheduleMoveFormRsType;
	}

	public void setScheduleMoveFormRsType(ScheduleMoveFormDTO scheduleMoveFormRsType) {
		this.scheduleMoveFormRsType = scheduleMoveFormRsType;
	}

	public List<AddrProvinceBean> getProvinceList() {
		return provinceList;
	}

	public void setProvinceList(List<AddrProvinceBean> provinceList) {
		this.provinceList = provinceList;
	}


	public HashMap<String, List<SubTopicForSubGroupBean>> getStdntSubGroupOverlapList() {
		return stdntSubGroupOverlapList;
	}

	public void setStdntSubGroupOverlapList(HashMap<String, List<SubTopicForSubGroupBean>> stdntSubGroupOverlapList) {
		this.stdntSubGroupOverlapList = stdntSubGroupOverlapList;
	}
	

	public List<ApplicationFormTypeDTO> getApplicationFormTypeList() {
		return applicationFormTypeList;
	}

	public void setApplicationFormTypeList(List<ApplicationFormTypeDTO> applicationFormTypeList) {
		this.applicationFormTypeList = applicationFormTypeList;
	}

	public EnrollClassApplicationFormDTO getEnrollClassApplicationFormRsType() {
		return enrollClassApplicationFormRsType;
	}

	public void setEnrollClassApplicationFormRsType(EnrollClassApplicationFormDTO enrollClassApplicationFormRsType) {
		this.enrollClassApplicationFormRsType = enrollClassApplicationFormRsType;
	}

	public List<PeopleByClassSectionRsType> getPeopleByClassSectionRsType() {
		return peopleByClassSectionRsType;
	}

	public void setPeopleByClassSectionRsType(List<PeopleByClassSectionRsType> peopleByClassSectionRsType) {
		this.peopleByClassSectionRsType = peopleByClassSectionRsType;
	}

	public List<SubGroupStdntBean> getSubGroupStdntBeanList() {
		return subGroupStdntBeanList;
	}

	public void setSubGroupStdntBeanList(List<SubGroupStdntBean> subGroupStdntBeanList) {
		this.subGroupStdntBeanList = subGroupStdntBeanList;
	}

	public ClassDetailDTO getClassDetailRsType() {
		return classDetailRsType;
	}

	public void setClassDetailRsType(ClassDetailDTO classDetailRsType) {
		this.classDetailRsType = classDetailRsType;
	}

	public List<ApplicationFormStepDTO> getApplicationFormStepList() {
		return applicationFormStepList;
	}

	public void setApplicationFormStepList(List<ApplicationFormStepDTO> applicationFormStepList) {
		this.applicationFormStepList = applicationFormStepList;
	}
	
	public List<EvaAnswerTypeTblBean> getEvaAnswerTypeTblBeanRsType() {
		return evaAnswerTypeTblBeanRsType;
	}

	public void setEvaAnswerTypeTblBeanRsType(List<EvaAnswerTypeTblBean> evaAnswerTypeTblBeanRsType) {
		this.evaAnswerTypeTblBeanRsType = evaAnswerTypeTblBeanRsType;
	}
	
	public EvaMappingPersonRsType getEvaMappingPersonRsType() {
		return evaMappingPersonRsType;
	}

	public void setEvaMappingPersonRsType(EvaMappingPersonRsType evaMappingPersonRsType) {
		this.evaMappingPersonRsType = evaMappingPersonRsType;
	}

	public List<EvaTblDescrRsType> getEvaTblDescrListRsType() {
		return evaTblDescrListRsType;
	}

	public void setEvaTblDescrListRsType(List<EvaTblDescrRsType> evaTblDescrListRsType) {
		this.evaTblDescrListRsType = evaTblDescrListRsType;
	}
	public EvaBean getEvaRsType() {
		return evaRsType;
	}

	public void setEvaRsType(EvaBean evaRsType) {
		this.evaRsType = evaRsType;
	}

	public List<EvaActionTypeBean> getEvaActionTypeBeanType() {
		return evaActionTypeBeanType;
	}

	public void setEvaActionTypeBeanType(List<EvaActionTypeBean> evaActionTypeBeanType) {
		this.evaActionTypeBeanType = evaActionTypeBeanType;
	}
	
	public List<EvaClassSummaryRsType> getEvaClassSummaryList() {
		return evaClassSummaryList;
	}

	public void setEvaClassSummaryList(List<EvaClassSummaryRsType> evaClassSummaryList) {
		this.evaClassSummaryList = evaClassSummaryList;
	}

	public List<EvaDTO> getEvas() {
		return evas;
	}

	public void setEvas(List<EvaDTO> evas) {
		this.evas = evas;
	}

	public EvaDTO getEva() {
		return eva;
	}

	public void setEva(EvaDTO eva) {
		this.eva = eva;
	}

	public EvaAnswerSheetSubmitRsType getEvaAnswerSheetRsType() {
		return evaAnswerSheetRsType;
	}

	public void setEvaAnswerSheetRsType(EvaAnswerSheetSubmitRsType evaAnswerSheetRsType) {
		this.evaAnswerSheetRsType = evaAnswerSheetRsType;
	}

	public List<EvaDTO> getEvaList() {
		return evaList;
	}

	public void setEvaList(List<EvaDTO> evaList) {
		this.evaList = evaList;
	}

	public List<ScopeTblRs> getScopeList() {
		return scopeList;
	}

	public void setScopeList(List<ScopeTblRs> scopeList) {
		this.scopeList = scopeList;
	}


	public EvaMappingBean getEvaMappingBean() {
		return evaMappingBean;
	}

	public void setEvaMappingBean(EvaMappingBean evaMappingBean) {
		this.evaMappingBean = evaMappingBean;
	}
	

	public EvaSummaryDTO getEvaSummaryRsType() {
		return evaSummaryRsType;
	}

	public void setEvaSummaryRsType(EvaSummaryDTO evaSummaryRsType) {
		this.evaSummaryRsType = evaSummaryRsType;
	}

	public EvaMappingTopicDataRsType getEvaMappingTopicDataRsType() {
		return evaMappingTopicDataRsType;
	}

	public void setEvaMappingTopicDataRsType(EvaMappingTopicDataRsType evaMappingTopicDataRsType) {
		this.evaMappingTopicDataRsType = evaMappingTopicDataRsType;
	}

	public EvaStatisticRsType getEvaStatRsType() {
		return evaStatRsType;
	}

	public void setEvaStatRsType(EvaStatisticRsType evaStatRsType) {
		this.evaStatRsType = evaStatRsType;
	}

	public ChatroomBean getChatroomRsType() {
		return chatroomRsType;
	}

	public void setChatroomRsType(ChatroomBean chatroomRsType) {
		this.chatroomRsType = chatroomRsType;
	}

	public List<ChatroomBean> getChatroomRsTypes() {
		return chatroomRsTypes;
	}

	public void setChatroomRsTypes(List<ChatroomBean> chatroomRsTypes) {
		this.chatroomRsTypes = chatroomRsTypes;
	}

	public List<MemberBean> getMemberRstypes() {
		return memberRstypes;
	}

	public void setMemberRstypes(List<MemberBean> memberRstypes) {
		this.memberRstypes = memberRstypes;
	}

	public List<ResearchCategoryBean> getResearchCategoryRsTypes() {
		return researchCategoryRsTypes;
	}

	public void setResearchCategoryRsTypes(List<ResearchCategoryBean> researchCategoryRsTypes) {
		this.researchCategoryRsTypes = researchCategoryRsTypes;
	}

	public ResearchBean getResearchRsType() {
		return researchRsType;
	}

	public void setResearchRsType(ResearchBean researchRsType) {
		this.researchRsType = researchRsType;
	}

	public ResearchFilterBean getResearchFilterRsType() {
		return researchFilterRsType;
	}

	public void setResearchFilterRsType(ResearchFilterBean researchFilterRsType) {
		this.researchFilterRsType = researchFilterRsType;
	}

	public List<ResearchBean> getResearchRsTypes() {
		return researchRsTypes;
	}

	public void setResearchRsTypes(List<ResearchBean> researchRsTypes) {
		this.researchRsTypes = researchRsTypes;
	}

	

}