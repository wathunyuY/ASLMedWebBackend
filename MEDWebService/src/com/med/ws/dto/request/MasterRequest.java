package com.med.ws.dto.request;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.asl.ws.bean.ChatroomBean;
import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadCarBean;
import com.med.ws.beans.AcadGroupBean;
import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.AcadPlanBean;
import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.AddrGeographyBean;
import com.med.ws.beans.AgendaTblBean;
import com.med.ws.beans.ChangeEmailBean;
import com.med.ws.beans.ChangePasswordBean;
import com.med.ws.beans.ClinicGroupingProgramBean;
import com.med.ws.beans.DayBean;
import com.med.ws.beans.EduLevelBean;
import com.med.ws.beans.EmpFowBean;
import com.med.ws.beans.EngLevelBean;
import com.med.ws.beans.EventBean;
import com.med.ws.beans.HsPlanBean;
import com.med.ws.beans.LangCdBean;
import com.med.ws.beans.MarriageStatusBean;
import com.med.ws.beans.MatchClassOfferBean;
import com.med.ws.beans.MonthTblBean;
import com.med.ws.beans.SubjectTblBean;
import com.med.ws.dto.type.rq.AcadDegrRqType;
import com.med.ws.dto.type.rq.AcadInstRqType;
import com.med.ws.dto.type.rq.ApplicationFormEnrollClassRqType;
import com.med.ws.dto.type.rq.ApplicationFormRqType;
import com.med.ws.dto.type.rq.BuildingServiceRqType;
import com.med.ws.dto.type.rq.CalendarRqType;
import com.med.ws.dto.type.rq.ChangeEffStatusRqType;
import com.med.ws.dto.type.rq.ChatMessageRqType;
import com.med.ws.dto.type.rq.ClassTopicDetailType;
import com.med.ws.dto.type.rq.CourseDetailType;
import com.med.ws.dto.type.rq.CreateCalendarRqType;
import com.med.ws.dto.type.rq.CreateClassOfferRqType;
import com.med.ws.dto.type.rq.CrseTopicDetailType;
import com.med.ws.dto.type.rq.EditSectionCoordinatorRqType;
import com.med.ws.dto.type.rq.EmpPstnRqType;
import com.med.ws.dto.type.rq.EvaDTO;
import com.med.ws.dto.type.rq.EvaInitRqType;
import com.med.ws.dto.type.rq.EvaMappingRejectedRqType;
import com.med.ws.dto.type.rq.EvaluationDTO;
import com.med.ws.dto.type.rq.EvaluationPersonDTO;
import com.med.ws.dto.type.rq.EvaluationPersonGroup;
import com.med.ws.dto.type.rq.EvaluationTime;
import com.med.ws.dto.type.rq.FcmTokenRqType;
import com.med.ws.dto.type.rq.GradeRqType;
import com.med.ws.dto.type.rq.GroupingStdntProgramRqType;
import com.med.ws.dto.type.rq.HolidayRqType;
import com.med.ws.dto.type.rq.HomeworkReport;
import com.med.ws.dto.type.rq.LoginRqType;
import com.med.ws.dto.type.rq.MoveScheduleDTO;
import com.med.ws.dto.type.rq.NationalityRqType;
import com.med.ws.dto.type.rq.OpenCrseClinicBean;
import com.med.ws.dto.type.rq.PermissionRqType;
import com.med.ws.dto.type.rq.PersonEvaluationDTO;
import com.med.ws.dto.type.rq.PersonalParmsRqType;
import com.med.ws.dto.type.rq.PersonalRqType;
import com.med.ws.dto.type.rq.PrefixRqType;
import com.med.ws.dto.type.rq.PrefixTypeRqType;
import com.med.ws.dto.type.rq.ProgramRqType;
import com.med.ws.dto.type.rq.RaceRqType;
import com.med.ws.dto.type.rq.ReligionRqType;
import com.med.ws.dto.type.rq.RoomServiceRqType;
import com.med.ws.dto.type.rq.RoomTypeServiceRqType;
import com.med.ws.dto.type.rq.SaveCrseTopicTmplNbrRqType;
import com.med.ws.dto.type.rq.ScoreTypeRqType;
import com.med.ws.dto.type.rq.SearchEmpByCalendarEmpGroupRqType;
import com.med.ws.dto.type.rq.SearchPersonByTimePeriodRqType;
import com.med.ws.dto.type.rq.SearchStdntByCalendarStdntGroupRqType;
import com.med.ws.dto.type.rq.ServiceRegRqType;
import com.med.ws.dto.type.rq.ServiceUpdateRqType;
import com.med.ws.dto.type.rq.StdntClinicGroupSaveRqType;
import com.med.ws.dto.type.rq.StdntClinicGroupSectionRqType;
import com.med.ws.dto.type.rq.StdntClinicGroupToSectionSaveRqType;
import com.med.ws.dto.type.rq.StdntClinicSubGroupEditByAppFormRqType;
import com.med.ws.dto.type.rq.StdntClinicSubGroupSaveEnrollClassRqType;
import com.med.ws.dto.type.rq.StdntInfoAdditionalRqType;
import com.med.ws.dto.type.rq.StdntInfoRqType;
import com.med.ws.dto.type.rq.StdntSubGroupClinicSaveRqType;
import com.med.ws.dto.type.rq.SubGroupStdntClinicSaveRqType;
import com.med.ws.dto.type.rq.SubGroupStdntClinicWorkflowSaveRqType;
import com.med.ws.dto.type.rq.SubmitEvaRqType;
import com.med.ws.dto.type.rq.TaskRegRqType;
import com.med.ws.dto.type.rq.TaskUpdateRqTye;
import com.med.ws.dto.type.rq.TermRqType;
import com.med.ws.dto.type.rq.TopicTypeRqType;
import com.med.ws.dto.type.rq.UpdateHolidayRqType;
import com.med.ws.dto.type.rq.WorkloadTypeRqType;
import com.med.ws.dto.type.rs.ClassSectionDTO;
import com.med.ws.dto.type.rs.ClassTopicRsType;
import com.med.ws.dto.type.rs.ClassTopicTmplRsType;
import com.med.ws.dto.type.rs.ScheduleSwapFormDTO;
import com.med.ws.dto.type.rs.SelectCrseCatalogType;
import com.med.ws.dto.type.rs.TQFSectionType;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class MasterRequest {
	protected LoginRqType loginRq;
	protected TaskRegRqType taskRegRqType;
	protected ServiceRegRqType serviceRegRqType;
	protected TaskUpdateRqTye taskUpdateRqType;
	protected ServiceUpdateRqType serviceUpdateRqType;
	protected StdntInfoRqType stdntInfoRqType;
	protected PermissionRqType permissionRq;
	protected PersonalRqType personalRqType;
	protected PersonalParmsRqType persParmsRqType;
	protected List<StdntInfoRqType> stdntInfoRqTypeList;
	protected CourseDetailType createCourseRqType;
	protected List<CourseDetailType> courseEditData;
	protected List<PersonalRqType> personalRqTypeList;
	protected BuildingServiceRqType buildingServiceRqType;
	protected RoomTypeServiceRqType roomTypeServiceRqType;
	protected RoomServiceRqType roomServiceRqType; 
	protected CalendarRqType calendarRqType;
	protected TermRqType termRqType;
	protected HolidayRqType holidayRqType;
	protected UpdateHolidayRqType updateHolidaysRqType;
	protected CrseTopicDetailType crseTopicRqType;
	protected StdntInfoAdditionalRqType stdntInfoAdditionalRqType;
	protected OpenCrseClinicBean openCrseClinicRqType;
	protected List<Date> courseCatalogDelete;
	protected ProgramRqType programRqType;
	protected ScoreTypeRqType scoreTypeRqType;
	protected ClassTopicTmplRsType classTopicTmplRqType;
	protected StdntClinicGroupSaveRqType stdntClinicGroupSaveRqType;
	protected StdntClinicGroupSectionRqType stdntClinicGroupSectionRqType;
	protected StdntClinicGroupToSectionSaveRqType stdntClinicGroupToSectionSaveRqType;
	protected AcadOrgBean acadOrgRqType;
	protected GradeRqType gradeRqType;
	protected EvaluationDTO createEvaluationRq;	
	protected AcadGroupBean acadGroupRqType;
	protected AcadCarBean acadCarRqType;
	protected AcadPlanBean acadPlanRqType;
	protected SubjectTblBean subjectTblRqType;
	protected AcadProgBean acadProgRqType;
	protected AcadCampusBean acadCampusRqType;
	protected ChangeEffStatusRqType changeEffStatusRqType;
	protected AgendaTblBean agendaRqType;
	protected SearchPersonByTimePeriodRqType searchPersonByTimePeriodRqType;
	protected TopicTypeRqType topicTypeRq;
	protected PrefixRqType prefixRqType;
	protected SearchStdntByCalendarStdntGroupRqType searchStdntByCalendarStdntGroupRqType; 
	protected SearchEmpByCalendarEmpGroupRqType searchEmpByCalendarEmpGroupRqType;
	protected ClassTopicDetailType classTopicType;
	protected PrefixTypeRqType prefixTypeRqType;
	protected RaceRqType raceRqType;
	protected ReligionRqType religionRqType;
	protected EventBean eventRqType;
	protected NationalityRqType nationalityRqType;
	protected CreateClassOfferRqType createClassOfferRqType;
	protected SelectCrseCatalogType selectCrseCatalogRqType;
	protected MatchClassOfferBean matchClassOfferRqType;
	protected List<ClinicGroupingProgramBean> clinicGroupingProgramRqType;
	protected EduLevelBean eduLevelBeanRqType;
	protected EmpFowBean empFowBeanRqType;
	protected EmpPstnRqType empPstnRqType;
	protected EngLevelBean engLevelBeanRqType;
	protected HsPlanBean hsPlanBean;
	protected MarriageStatusBean marriageStatusBeanRqType;
	protected WorkloadTypeRqType workloadTypeRqType;
	protected AddrGeographyBean addrGeographyBeanRqType;
	protected AcadDegrRqType acadDegrRqType;
	protected AcadInstRqType acadInstRqType;
	protected DayBean dayBeanRqType;
	protected LangCdBean langCdBeanRqType;
	protected MonthTblBean monthTblBeanRqType;
	protected CreateCalendarRqType createCalendarRqType;
	protected TQFSectionType tqfSectionRqType;
	protected SubGroupStdntClinicWorkflowSaveRqType subGroupStdntClinicWorkflowSaveRqType;
	@JsonProperty("classSection")
	protected ClassSectionDTO classSectionDTO;
	@JsonProperty("evaluation")
	protected EvaluationDTO evaluationDTO;	
	@JsonProperty("evaluationTeacher")
	protected EvaluationDTO evaluationTeacher;	
	@JsonProperty("personEvaluation")
	protected PersonEvaluationDTO personEvaluationDTO;	
	@JsonProperty("evaluationTime")
	protected EvaluationTime evaluationTime;	
	@JsonProperty("classTopic")
	protected ClassTopicRsType classTopic; 
	@JsonProperty("homeworkReport")
	protected HomeworkReport homeworkReport; 

	protected SaveCrseTopicTmplNbrRqType saveCrseTopicTmplNbrRqType;
	protected SubGroupStdntClinicSaveRqType subGroupStdntClinicSaveRqType;
	protected GroupingStdntProgramRqType groupingStdntProgramRqType;
	protected FcmTokenRqType fcmTokenRqType;
	protected ChatMessageRqType chatRqType;
	protected EvaluationPersonDTO evaluationPersonDTO;
	protected List<EvaluationPersonGroup> evaluationPersonGroup;
	protected MoveScheduleDTO moveScheduleRq;
	protected ChangePasswordBean changePasswordRqType;
	protected ChangeEmailBean changeEmailRqType;
	protected ScheduleSwapFormDTO scheduleSwapFormRqType;
	protected ApplicationFormEnrollClassRqType applicationFormEnrollClassRqType;
	protected ApplicationFormRqType applicationFormRqType;
	protected StdntClinicSubGroupEditByAppFormRqType stdntClinicSubGroupEditByAppFormRqType;
	protected StdntClinicSubGroupSaveEnrollClassRqType stdntClinicSubGroupSaveEnrollClassRqType;
	protected StdntSubGroupClinicSaveRqType stdntSubGroupClinicSaveRqType;
	protected EditSectionCoordinatorRqType editSectionCoordinatorRqType;
	protected SubmitEvaRqType submitEvaRqType;
	protected EvaDTO createEvaRq;
	protected EvaMappingRejectedRqType evaMappingRejectedRqType;
	protected EvaInitRqType evaInitRqType;
	
	protected ChatroomBean chatroomBeanRqType;
	public ServiceUpdateRqType getServiceUpdateRq() {
		return serviceUpdateRqType;
	}

	public void setServiceUpdateRq(ServiceUpdateRqType serviceUpdateRqType) {
		this.serviceUpdateRqType = serviceUpdateRqType;
	}

	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";
		try {
			jsonInString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return (jsonInString);
	}

	public LoginRqType getLoginRq() {
		return loginRq;
	}

	public void setLoginRq(LoginRqType loginRq) {
		this.loginRq = loginRq;
	}

	public TaskRegRqType getTaskRegRq() {
		return taskRegRqType;
	}

	public void setTaskRegRq(TaskRegRqType taskRegRqType) {
		this.taskRegRqType = taskRegRqType;
	}

	public ServiceRegRqType getServiceRegRq() {
		return serviceRegRqType;
	}

	public void setServiceRegRq(ServiceRegRqType serviceRegRqType) {
		this.serviceRegRqType = serviceRegRqType;
	}

	public TaskUpdateRqTye getTaskUpdateRq() {
		return taskUpdateRqType;
	}

	public void setTaskUpdateRq(TaskUpdateRqTye taskUpdateRqType) {
		this.taskUpdateRqType = taskUpdateRqType;
	}

	public StdntInfoRqType getStdntInfoRqType() {
		return stdntInfoRqType;
	}

	public void setStdntInfoRqType(StdntInfoRqType stdntInfoRqType) {
		this.stdntInfoRqType = stdntInfoRqType;
	}

	public PermissionRqType getPermissionRq() {
		return permissionRq;
	}

	public void setPermissionRq(PermissionRqType permissionRq) {
		this.permissionRq = permissionRq;
	}

	public PersonalRqType getPersonalRqType() {
		return personalRqType;
	}

	public void setPersonalRqType(PersonalRqType personalRqType) {
		this.personalRqType = personalRqType;
	}

	public TaskRegRqType getTaskRegRqType() {
		return taskRegRqType;
	}

	public void setTaskRegRqType(TaskRegRqType taskRegRqType) {
		this.taskRegRqType = taskRegRqType;
	}

	public ServiceRegRqType getServiceRegRqType() {
		return serviceRegRqType;
	}

	public void setServiceRegRqType(ServiceRegRqType serviceRegRqType) {
		this.serviceRegRqType = serviceRegRqType;
	}

	public TaskUpdateRqTye getTaskUpdateRqType() {
		return taskUpdateRqType;
	}

	public void setTaskUpdateRqType(TaskUpdateRqTye taskUpdateRqType) {
		this.taskUpdateRqType = taskUpdateRqType;
	}

	public ServiceUpdateRqType getServiceUpdateRqType() {
		return serviceUpdateRqType;
	}

	public void setServiceUpdateRqType(ServiceUpdateRqType serviceUpdateRqType) {
		this.serviceUpdateRqType = serviceUpdateRqType;
	}

	public PersonalParmsRqType getPersParmsRqType() {
		return persParmsRqType;
	}

	public void setPersParmsRqType(PersonalParmsRqType persParmsRqType) {
		this.persParmsRqType = persParmsRqType;
	}

	public List<StdntInfoRqType> getStdntInfoRqTypeList() {
		return stdntInfoRqTypeList;
	}

	public void setStdntInfoRqTypeList(List<StdntInfoRqType> stdntInfoRqTypeList) {
		this.stdntInfoRqTypeList = stdntInfoRqTypeList;
	}

	public CourseDetailType getCreateCourseRqType() {
		return createCourseRqType;
	}

	public void setCreateCourseRqType(CourseDetailType createCourseRqType) {
		this.createCourseRqType = createCourseRqType;
	}

	public List<PersonalRqType> getPersonalRqTypeList() {
		return personalRqTypeList;
	}

	public void setPersonalRqTypeList(List<PersonalRqType> personalRqTypeList) {
		this.personalRqTypeList = personalRqTypeList;
	}

	public BuildingServiceRqType getBuildingServiceRqType() {
		return buildingServiceRqType;
	}

	public void setBuildingServiceRqType(BuildingServiceRqType buildingServiceRqType) {
		this.buildingServiceRqType = buildingServiceRqType;
	}

	public RoomTypeServiceRqType getRoomTypeServiceRqType() {
		return roomTypeServiceRqType;
	}

	public void setRoomTypeServiceRqType(RoomTypeServiceRqType roomTypeServiceRqType) {
		this.roomTypeServiceRqType = roomTypeServiceRqType;
	}

	public RoomServiceRqType getRoomServiceRqType() {
		return roomServiceRqType;
	}

	public void setRoomServiceRqType(RoomServiceRqType roomServiceRqType) {
		this.roomServiceRqType = roomServiceRqType;
	}

	public CalendarRqType getCalendarRqType() {
		return calendarRqType;
	}

	public void setCalendarRqType(CalendarRqType calendarRqType) {
		this.calendarRqType = calendarRqType;
	}

	public TermRqType getTermRqType() {
		return termRqType;
	}

	public void setTermRqType(TermRqType termRqType) {
		this.termRqType = termRqType;
	}
	public HolidayRqType getHolidayRqType() {
		return holidayRqType;
	}

	public void setHolidayRqType(HolidayRqType holidayRqType) {
		this.holidayRqType = holidayRqType;
	}

	public UpdateHolidayRqType getUpdateHolidaysRqType() {
		return updateHolidaysRqType;
	}

	public void setUpdateHolidaysRqType(UpdateHolidayRqType updateHolidaysRqType) {
		this.updateHolidaysRqType = updateHolidaysRqType;
	}

	public CrseTopicDetailType getCrseTopicRqType() {
		return crseTopicRqType;
	}

	public void setCrseTopicRqType(CrseTopicDetailType crseTopicRqType) {
		this.crseTopicRqType = crseTopicRqType;
	}

	public StdntInfoAdditionalRqType getStdntInfoAdditionalRqType() {
		return stdntInfoAdditionalRqType;
	}

	public void setStdntInfoAdditionalRqType(StdntInfoAdditionalRqType stdntInfoAdditionalRqType) {
		this.stdntInfoAdditionalRqType = stdntInfoAdditionalRqType;
	}

	public OpenCrseClinicBean getOpenCrseClinicRqType() {
		return openCrseClinicRqType;
	}

	public void setOpenCrseClinicRqType(OpenCrseClinicBean openCrseClinicRqType) {
		this.openCrseClinicRqType = openCrseClinicRqType;
	}

	public List<Date> getCourseCatalogDelete() {
		return courseCatalogDelete;
	}

	public void setCourseCatalogDelete(List<Date> courseCatalogDelete) {
		this.courseCatalogDelete = courseCatalogDelete;
	}

	public List<CourseDetailType> getCourseEditData() {
		return courseEditData;
	}

	public void setCourseEditData(List<CourseDetailType> courseEditData) {
		this.courseEditData = courseEditData;
	}

	public ProgramRqType getProgramRqType() {
		return programRqType;
	}

	public void setProgramRqType(ProgramRqType programRqType) {
		this.programRqType = programRqType;
	}

	public ScoreTypeRqType getScoreTypeRqType() {
		return scoreTypeRqType;
	}

	public void setScoreTypeRqType(ScoreTypeRqType scoreTypeRqType) {
		this.scoreTypeRqType = scoreTypeRqType;
	}

	public ClassTopicTmplRsType getClassTopicTmplRqType() {
		return classTopicTmplRqType;
	}

	public void setClassTopicTmplRqType(ClassTopicTmplRsType classTopicTmplRqType) {
		this.classTopicTmplRqType = classTopicTmplRqType;
	}

	public MatchClassOfferBean getMatchClassOfferRqType() {
		return matchClassOfferRqType;
	}

	public void setMatchClassOfferRqType(MatchClassOfferBean matchClassOfferRqType) {
		this.matchClassOfferRqType = matchClassOfferRqType;
	}

	public StdntClinicGroupSaveRqType getStdntClinicGroupSaveRqType() {
		return stdntClinicGroupSaveRqType;
	}

	public void setStdntClinicGroupSaveRqTypeList(StdntClinicGroupSaveRqType stdntClinicGroupSaveRqType) {
		this.stdntClinicGroupSaveRqType = stdntClinicGroupSaveRqType;
	}

	public StdntClinicGroupSectionRqType getStdntClinicGroupSectionRqType() {
		return stdntClinicGroupSectionRqType;
	}

	public void setStdntClinicGroupSectionRqType(StdntClinicGroupSectionRqType stdntClinicGroupSectionRqType) {
		this.stdntClinicGroupSectionRqType = stdntClinicGroupSectionRqType;
	}

	public void setStdntClinicGroupSaveRqType(StdntClinicGroupSaveRqType stdntClinicGroupSaveRqType) {
		this.stdntClinicGroupSaveRqType = stdntClinicGroupSaveRqType;
	}

	public StdntClinicGroupToSectionSaveRqType getStdntClinicGroupToSectionSaveRqType() {
		return stdntClinicGroupToSectionSaveRqType;
	}

	public void setStdntClinicGroupToSectionSaveRqType(
			StdntClinicGroupToSectionSaveRqType stdntClinicGroupToSectionSaveRqType) {
		this.stdntClinicGroupToSectionSaveRqType = stdntClinicGroupToSectionSaveRqType;
	}
	public AcadOrgBean getAcadOrgRqType() {
		return acadOrgRqType;
	}

	public void setAcadOrgRqType(AcadOrgBean acadOrgRqType) {
		this.acadOrgRqType = acadOrgRqType;
	}

	public EvaluationDTO getCreateEvaluationRq() {
		return createEvaluationRq;
	}

	public void setCreateEvaluationRq(EvaluationDTO createEvaluationRq) {
		this.createEvaluationRq = createEvaluationRq;
	}
	
	public AcadGroupBean getAcadGroupRqType() {
		return acadGroupRqType;
	}

	public void setAcadGroupRqType(AcadGroupBean acadGroupRqType) {
		this.acadGroupRqType = acadGroupRqType;
	}

	public AcadCarBean getAcadCarRqType() {
		return acadCarRqType;
	}

	public void setAcadCarRqType(AcadCarBean acadCarRqType) {
		this.acadCarRqType = acadCarRqType;
	}

	public AcadPlanBean getAcadPlanRqType() {
		return acadPlanRqType;
	}

	public void setAcadPlanRqType(AcadPlanBean acadPlanRqType) {
		this.acadPlanRqType = acadPlanRqType;
	}

	public SubjectTblBean getSubjectTblRqType() {
		return subjectTblRqType;
	}

	public void setSubjectTblRqType(SubjectTblBean subjectTblRqType) {
		this.subjectTblRqType = subjectTblRqType;
	}

	public AcadProgBean getAcadProgRqType() {
		return acadProgRqType;
	}

	public void setAcadProgRqType(AcadProgBean acadProgRqType) {
		this.acadProgRqType = acadProgRqType;
	}

	public AcadCampusBean getAcadCampusRqType() {
		return acadCampusRqType;
	}

	public void setAcadCampusRqType(AcadCampusBean acadCampusRqType) {
		this.acadCampusRqType = acadCampusRqType;
	}

	public ChangeEffStatusRqType getChangeEffStatusRqType() {
		return changeEffStatusRqType;
	}

	public void setChangeEffStatusRqType(ChangeEffStatusRqType changeEffStatusRqType) {
		this.changeEffStatusRqType = changeEffStatusRqType;
	}

	public AgendaTblBean getAgendaRqType() {
		return agendaRqType;
	}

	public void setAgendaRqType(AgendaTblBean agendaRqType) {
		this.agendaRqType = agendaRqType;
	}
	
	public GradeRqType getGradeRqType(){
		return this.gradeRqType;
	}
	public void setGradeRqType(GradeRqType gradeRqType){
		this.gradeRqType = gradeRqType;
	}

	public SearchPersonByTimePeriodRqType getSearchPersonByTimePeriodRqType() {
		return searchPersonByTimePeriodRqType;
	}

	public void setSearchPersonByTimePeriodRqType(SearchPersonByTimePeriodRqType searchPersonByTimePeriodRqType) {
		this.searchPersonByTimePeriodRqType = searchPersonByTimePeriodRqType;
	}

	public TopicTypeRqType getTopicTypeRq(){
		return this.topicTypeRq;
	}
	public void setTopicTypeRq(TopicTypeRqType topicTypeRq){
		this.topicTypeRq = topicTypeRq;

	}
	public PrefixRqType getPrefixRqType(){
		return this.prefixRqType;
	}
	
	public void setPrefixRqType(PrefixRqType prefixRqType){
		this.prefixRqType = prefixRqType;
	}

	public SearchStdntByCalendarStdntGroupRqType getSearchStdntByCalendarStdntGroupRqType() {
		return searchStdntByCalendarStdntGroupRqType;
	}

	public void setSearchStdntByCalendarStdntGroupRqType(
			SearchStdntByCalendarStdntGroupRqType searchStdntByCalendarStdntGroupRqType) {
		this.searchStdntByCalendarStdntGroupRqType = searchStdntByCalendarStdntGroupRqType;
	}

	public SearchEmpByCalendarEmpGroupRqType getSearchEmpByCalendarEmpGroupRqType() {
		return searchEmpByCalendarEmpGroupRqType;
	}

	public void setSearchEmpByCalendarEmpGroupRqType(SearchEmpByCalendarEmpGroupRqType searchEmpByCalendarEmpGroupRqType) {
		this.searchEmpByCalendarEmpGroupRqType = searchEmpByCalendarEmpGroupRqType;
	}

	public ClassTopicDetailType getClassTopicType() {
		return classTopicType;
	}

	public void setClassTopicType(ClassTopicDetailType classTopicType) {
		this.classTopicType = classTopicType;
	}
	
	public PrefixTypeRqType getPrefixTypeRqType(){
		return this.prefixTypeRqType;
	}
	public void setPrefixTypeRqType(PrefixTypeRqType prefixTypeRqType){
		this.prefixTypeRqType = prefixTypeRqType;
	}
	
	public RaceRqType getRaceRqType(){
		return this.raceRqType;
	}
	public void setRaceRqType(RaceRqType raceRqType){
		this.raceRqType = raceRqType;
	}
	
	public ReligionRqType getReligionRqType(){
		return this.religionRqType;
	}
	public void setReligionRqType(ReligionRqType religionRqType){
		this.religionRqType = religionRqType;
	}

	public EventBean getEventRqType() {
		return eventRqType;
	}

	public void setEventRqType(EventBean eventRqType) {
		this.eventRqType = eventRqType;
	}

	public NationalityRqType getNationalityRqType(){
		return this.nationalityRqType;
	}
	public void setNationalityRqType(NationalityRqType nationalityRqType){
		this.nationalityRqType = nationalityRqType;
	}


	public CreateClassOfferRqType getCreateClassOfferRqType() {
		return createClassOfferRqType;
	}

	public void setCreateClassOfferRqType(CreateClassOfferRqType createClassOfferRqType) {
		this.createClassOfferRqType = createClassOfferRqType;
	}

	public SelectCrseCatalogType getSelectCrseCatalogRqType() {
		return selectCrseCatalogRqType;
	}

	public void setSelectCrseCatalogRqType(SelectCrseCatalogType selectCrseCatalogRqType) {
		this.selectCrseCatalogRqType = selectCrseCatalogRqType;
	}
	public List<ClinicGroupingProgramBean> getClinicGroupingProgramRqType(){
		return this.clinicGroupingProgramRqType;
	}
	public void setClinicGroupingProgramRqType(List<ClinicGroupingProgramBean> clinicGroupingProgramRqType){
		this.clinicGroupingProgramRqType = clinicGroupingProgramRqType;
	}
	public EduLevelBean getEduLevelBeanRqType(){
		return this.eduLevelBeanRqType;
	}
	public void setEduLevelBeanRqType(EduLevelBean eduLevelBeanRqType){
		this.eduLevelBeanRqType = eduLevelBeanRqType;
	}
	public EmpFowBean getEmpFowBeanRqType(){
		return this.empFowBeanRqType;
	}
	public void setEmpFowBeanRqType(EmpFowBean empFowBeanRqType){
		this.empFowBeanRqType = empFowBeanRqType;
	}
	public EmpPstnRqType getEmpPstnRqType(){
		return this.empPstnRqType;
	}
	public void setEmpPstnRqType(EmpPstnRqType empPstnRqType){
		this.empPstnRqType = empPstnRqType;
	}
	public EngLevelBean getEngLevelBeanRqType(){
		return this.engLevelBeanRqType;
	}
	public void setEngLevelBeanRqType(EngLevelBean engLevelBeanRqType){
		this.engLevelBeanRqType = engLevelBeanRqType;
	}
	public HsPlanBean getHsPlanBean(){
		return this.hsPlanBean;
	}
	public void setHsPlanBean(HsPlanBean hsPlanBean){
		this.hsPlanBean = hsPlanBean;
	}
	public MarriageStatusBean getMarriageStatusBeanRqType(){
		return this.marriageStatusBeanRqType;
	}
	public void setMarriageStatusBeanRqType(MarriageStatusBean marriageStatusBeanRqType){
		this.marriageStatusBeanRqType = marriageStatusBeanRqType;
	}
	public AddrGeographyBean getAddrGeographyBeanRqType(){
		return this.addrGeographyBeanRqType;
	}
	public void setAddrGeographyBeanRqType(AddrGeographyBean addrGeographyBeanRqType){
		this.addrGeographyBeanRqType = addrGeographyBeanRqType;
	}
	public AcadDegrRqType getAcadDegrRqType(){
		return this.acadDegrRqType;
	}
	public void setAcadDegrRqType(AcadDegrRqType acadDegrRqType){
		this.acadDegrRqType = acadDegrRqType;
	}
	public AcadInstRqType getAcadInstRqType(){
		return this.acadInstRqType;
	}
	public void setAadInstRqType(AcadInstRqType acadInstRqType){
		this.acadInstRqType = acadInstRqType;
	}
	public WorkloadTypeRqType getWorkloadTypeRqType(){
		return this.workloadTypeRqType;
	}
	public void setWorkloadTypeBeanRqType(WorkloadTypeRqType workloadTypeRqType){
		this.workloadTypeRqType = workloadTypeRqType;
	}
	public DayBean getDayBeanRqType() {
		return dayBeanRqType;
	}
	public void setDayBeanRqType(DayBean dayBeanRqType) {
		this.dayBeanRqType = dayBeanRqType;
	}
	public LangCdBean getLangCdBeanRqType() {
		return langCdBeanRqType;
	}

	public void setLangCdBeanRqType(LangCdBean langCdBeanRqType) {
		this.langCdBeanRqType = langCdBeanRqType;
	}
	public MonthTblBean getMonthTblBeanRqType() {
		return monthTblBeanRqType;
	}

	public void setMonthTblBeanRqType(MonthTblBean monthTblBeanRqType) {
		this.monthTblBeanRqType = monthTblBeanRqType;
	}

	public CreateCalendarRqType getCreateCalendarRqType() {
		return createCalendarRqType;
	}

	public void setCreateCalendarRqType(CreateCalendarRqType createCalendarRqType) {
		this.createCalendarRqType = createCalendarRqType;
	}

	public TQFSectionType getTqfSectionRqType() {
		return tqfSectionRqType;
	}

	public void setTqfSectionRqType(TQFSectionType tqfSectionRqType) {
		this.tqfSectionRqType = tqfSectionRqType;
	}

	public void setWorkloadTypeRqType(WorkloadTypeRqType workloadTypeRqType) {
		this.workloadTypeRqType = workloadTypeRqType;
	}

	public void setAcadInstRqType(AcadInstRqType acadInstRqType) {
		this.acadInstRqType = acadInstRqType;
	}

	public SaveCrseTopicTmplNbrRqType getSaveCrseTopicTmplNbrRqType() {
		return saveCrseTopicTmplNbrRqType;
	}

	public void setSaveCrseTopicTmplNbrRqType(SaveCrseTopicTmplNbrRqType saveCrseTopicTmplNbrRqType) {
		this.saveCrseTopicTmplNbrRqType = saveCrseTopicTmplNbrRqType;
	}

	public FcmTokenRqType getFcmTokenRqType() {
		return fcmTokenRqType;
	}

	public void setFcmTokenRqType(FcmTokenRqType fcmTokenRqType) {
		this.fcmTokenRqType = fcmTokenRqType;
	}

	public ChatMessageRqType getChatRqType() {
		return chatRqType;
	}

	public void setChatRqType(ChatMessageRqType chatRqType) {
		this.chatRqType = chatRqType;
	}

	public ChangePasswordBean getChangePasswordRqType() {
		return changePasswordRqType;
	}

	public void setChangePasswordRqType(ChangePasswordBean changePasswordRqType) {
		this.changePasswordRqType = changePasswordRqType;
	}

	public ChangeEmailBean getChangeEmailRqType() {
		return changeEmailRqType;
	}

	public void setChangeEmailRqType(ChangeEmailBean changeEmailRqType) {
		this.changeEmailRqType = changeEmailRqType;
	}

	public ScheduleSwapFormDTO getScheduleSwapFormRqType() {
		return scheduleSwapFormRqType;
	}

	public void setScheduleSwapFormRqType(ScheduleSwapFormDTO scheduleSwapFormRqType) {
		this.scheduleSwapFormRqType = scheduleSwapFormRqType;
	}

	public ApplicationFormEnrollClassRqType getApplicationFormEnrollClassRqType() {
		return applicationFormEnrollClassRqType;
	}

	public void setApplicationFormEnrollClassRqType(ApplicationFormEnrollClassRqType applicationFormEnrollClassRqType) {
		this.applicationFormEnrollClassRqType = applicationFormEnrollClassRqType;
	}

	public EditSectionCoordinatorRqType getEditSectionCoordinatorRqType() {
		return editSectionCoordinatorRqType;
	}

	public void setEditSectionCoordinatorRqType(EditSectionCoordinatorRqType editSectionCoordinatorRqType) {
		this.editSectionCoordinatorRqType = editSectionCoordinatorRqType;
	}

	public ClassSectionDTO getClassSectionDTO() {
		return classSectionDTO;
	}

	public void setClassSectionDTO(ClassSectionDTO classSectionDTO) {
		this.classSectionDTO = classSectionDTO;
	}

	public EvaluationDTO getEvaluationDTO() {
		return evaluationDTO;
	}

	public void setEvaluationDTO(EvaluationDTO evaluationDTO) {
		this.evaluationDTO = evaluationDTO;
	}

	public PersonEvaluationDTO getPersonEvaluationDTO() {
		return personEvaluationDTO;
	}

	public void setPersonEvaluationDTO(PersonEvaluationDTO personEvaluationDTO) {
		this.personEvaluationDTO = personEvaluationDTO;
	}

	public EvaluationTime getEvaluationTime() {
		return evaluationTime;
	}

	public void setEvaluationTime(EvaluationTime evaluationTime) {
		this.evaluationTime = evaluationTime;
	}

	public ClassTopicRsType getClassTopic() {
		return classTopic;
	}

	public void setClassTopic(ClassTopicRsType classTopic) {
		this.classTopic = classTopic;
	}

	public EvaluationDTO getEvaluationTeacher() {
		return evaluationTeacher;
	}

	public void setEvaluationTeacher(EvaluationDTO evaluationTeacher) {
		this.evaluationTeacher = evaluationTeacher;
	}

	public HomeworkReport getHomeworkReport() {
		return homeworkReport;
	}

	public void setHomeworkReport(HomeworkReport homeworkReport) {
		this.homeworkReport = homeworkReport;
	}

	public SubGroupStdntClinicWorkflowSaveRqType getSubGroupStdntClinicWorkflowSaveRqType() {
		return subGroupStdntClinicWorkflowSaveRqType;
	}

	public void setSubGroupStdntClinicWorkflowSaveRqType(
			SubGroupStdntClinicWorkflowSaveRqType subGroupStdntClinicWorkflowSaveRqType) {
		this.subGroupStdntClinicWorkflowSaveRqType = subGroupStdntClinicWorkflowSaveRqType;
	}

	public SubGroupStdntClinicSaveRqType getSubGroupStdntClinicSaveRqType() {
		return subGroupStdntClinicSaveRqType;
	}

	public void setSubGroupStdntClinicSaveRqType(SubGroupStdntClinicSaveRqType subGroupStdntClinicSaveRqType) {
		this.subGroupStdntClinicSaveRqType = subGroupStdntClinicSaveRqType;
	}

	public GroupingStdntProgramRqType getGroupingStdntProgramRqType() {
		return groupingStdntProgramRqType;
	}

	public void setGroupingStdntProgramRqType(GroupingStdntProgramRqType groupingStdntProgramRqType) {
		this.groupingStdntProgramRqType = groupingStdntProgramRqType;
	}

	public EvaluationPersonDTO getEvaluationPersonDTO() {
		return evaluationPersonDTO;
	}

	public void setEvaluationPersonDTO(EvaluationPersonDTO evaluationPersonDTO) {
		this.evaluationPersonDTO = evaluationPersonDTO;
	}

	public List<EvaluationPersonGroup> getEvaluationPersonGroup() {
		return evaluationPersonGroup;
	}

	public void setEvaluationPersonGroup(List<EvaluationPersonGroup> evaluationPersonGroup) {
		this.evaluationPersonGroup = evaluationPersonGroup;
	}

	public MoveScheduleDTO getMoveScheduleRq() {
		return moveScheduleRq;
	}

	public void setMoveScheduleRq(MoveScheduleDTO moveScheduleRq) {
		this.moveScheduleRq = moveScheduleRq;
	}

	public ApplicationFormRqType getApplicationFormRqType() {
		return applicationFormRqType;
	}

	public void setApplicationFormRqType(ApplicationFormRqType applicationFormRqType) {
		this.applicationFormRqType = applicationFormRqType;
	}

	public StdntClinicSubGroupEditByAppFormRqType getStdntClinicSubGroupEditByAppFormRqType() {
		return stdntClinicSubGroupEditByAppFormRqType;
	}

	public void setStdntClinicSubGroupEditByAppFormRqType(
			StdntClinicSubGroupEditByAppFormRqType stdntClinicSubGroupEditByAppFormRqType) {
		this.stdntClinicSubGroupEditByAppFormRqType = stdntClinicSubGroupEditByAppFormRqType;
	}

	public StdntClinicSubGroupSaveEnrollClassRqType getStdntClinicSubGroupSaveEnrollClassRqType() {
		return stdntClinicSubGroupSaveEnrollClassRqType;
	}

	public void setStdntClinicSubGroupSaveEnrollClassRqType(
			StdntClinicSubGroupSaveEnrollClassRqType stdntClinicSubGroupSaveEnrollClassRqType) {
		this.stdntClinicSubGroupSaveEnrollClassRqType = stdntClinicSubGroupSaveEnrollClassRqType;
	}

	public StdntSubGroupClinicSaveRqType getStdntSubGroupClinicSaveRqType() {
		return stdntSubGroupClinicSaveRqType;
	}

	public void setStdntSubGroupClinicSaveRqType(StdntSubGroupClinicSaveRqType stdntSubGroupClinicSaveRqType) {
		this.stdntSubGroupClinicSaveRqType = stdntSubGroupClinicSaveRqType;
	}

	public SubmitEvaRqType getSubmitEvaRqType() {
		return submitEvaRqType;
	}

	public void setSubmitEvaRqType(SubmitEvaRqType submitEvaRqType) {
		this.submitEvaRqType = submitEvaRqType;
	}

	public EvaDTO getCreateEvaRq() {
		return createEvaRq;
	}

	public void setCreateEvaRq(EvaDTO createEvaRq) {
		this.createEvaRq = createEvaRq;
	}

	public EvaMappingRejectedRqType getEvaMappingRejectedRqType() {
		return evaMappingRejectedRqType;
	}

	public void setEvaMappingRejectedRqType(EvaMappingRejectedRqType evaMappingRejectedRqType) {
		this.evaMappingRejectedRqType = evaMappingRejectedRqType;
	}

	public EvaInitRqType getEvaInitRqType() {
		return evaInitRqType;
	}

	public void setEvaInitRqType(EvaInitRqType evaInitRqType) {
		this.evaInitRqType = evaInitRqType;
	}

	public ChatroomBean getChatroomBeanRqType() {
		return chatroomBeanRqType;
	}

	public void setChatroomBeanRqType(ChatroomBean chatroomBeanRqType) {
		this.chatroomBeanRqType = chatroomBeanRqType;
	}
	
	

}
