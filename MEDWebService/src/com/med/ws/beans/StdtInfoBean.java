package com.med.ws.beans;

public class StdtInfoBean {
	private String stdtnCode;
	private String effdt;
	private ProgramBean program;
	private AcadPlanBeanShort acadPlan;
	private AcadProgBeanShort acadProg;
	private AcadCampusBean acadCamPus;
	private Float stdntHsGpa;
	private HsPlanBean hsPlan;
	private Integer stdntAdmissionYear;
	private Integer stdntGradProgYear;
	private Integer stdntGradYear;
	private String stdntQuitDate;
	private Float stdntOnetPoint;
	private Float stdntOnetEngPoint;
	private EngLevelBean engLevel;
	private String stdntRemark;
	private Integer stdntStatus;
	
	public static class AcadPlanBeanShort{
		private Integer acadPlanId;
		private String effdt;
		private String desc;
		private String descEn;
		public Integer getAcadPlanId() {
			return acadPlanId;
		}
		public void setAcadPlanId(Integer acadPlanId) {
			this.acadPlanId = acadPlanId;
		}
		public String getEffdt() {
			return effdt;
		}
		public void setEffdt(String effdt) {
			this.effdt = effdt;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getDescEn() {
			return descEn;
		}
		public void setDescEn(String descEn) {
			this.descEn = descEn;
		}
		
	}
	public static class AcadProgBeanShort{
		protected Integer acadProgId;
		protected String effdt;
		protected String effStatus;
		protected String desc; //varchar(255)
		private String descEn; //varchar(255)
		private String descShort; //varchar(255)
		private String descShortEn; //varchar(45)
		private String startYear; //date
		private String endYear; //date
		public Integer getAcadProgId() {
			return acadProgId;
		}
		public void setAcadProgId(Integer acadProgId) {
			this.acadProgId = acadProgId;
		}
		public String getEffdt() {
			return effdt;
		}
		public void setEffdt(String effdt) {
			this.effdt = effdt;
		}
		public String getEffStatus() {
			return effStatus;
		}
		public void setEffStatus(String effStatus) {
			this.effStatus = effStatus;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getDescEn() {
			return descEn;
		}
		public void setDescEn(String descEn) {
			this.descEn = descEn;
		}
		public String getDescShort() {
			return descShort;
		}
		public void setDescShort(String descShort) {
			this.descShort = descShort;
		}
		public String getDescShortEn() {
			return descShortEn;
		}
		public void setDescShortEn(String descShortEn) {
			this.descShortEn = descShortEn;
		}
		public String getStartYear() {
			return startYear;
		}
		public void setStartYear(String startYear) {
			this.startYear = startYear;
		}
		public String getEndYear() {
			return endYear;
		}
		public void setEndYear(String endYear) {
			this.endYear = endYear;
		}
		
	}
	public String getStdtnCode() {
		return stdtnCode;
	}
	public void setStdtnCode(String stdtnCode) {
		this.stdtnCode = stdtnCode;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public ProgramBean getProgram() {
		return program;
	}
	public void setProgram(ProgramBean program) {
		this.program = program;
	}
	public AcadPlanBeanShort getAcadPlan() {
		return acadPlan;
	}
	public void setAcadPlan(AcadPlanBeanShort acadPlan) {
		this.acadPlan = acadPlan;
	}
	public AcadProgBeanShort getAcadProg() {
		return acadProg;
	}
	public void setAcadProg(AcadProgBeanShort acadProg) {
		this.acadProg = acadProg;
	}
	public AcadCampusBean getAcadCamPus() {
		return acadCamPus;
	}
	public void setAcadCamPus(AcadCampusBean acadCamPus) {
		this.acadCamPus = acadCamPus;
	}
	public Float getStdntHsGpa() {
		return stdntHsGpa;
	}
	public void setStdntHsGpa(Float stdntHsGpa) {
		this.stdntHsGpa = stdntHsGpa;
	}
	public HsPlanBean getHsPlan() {
		return hsPlan;
	}
	public void setHsPlan(HsPlanBean hsPlan) {
		this.hsPlan = hsPlan;
	}
	public Integer getStdntAdmissionYear() {
		return stdntAdmissionYear;
	}
	public void setStdntAdmissionYear(Integer stdntAdmissionYear) {
		this.stdntAdmissionYear = stdntAdmissionYear;
	}
	public Integer getStdntGradProgYear() {
		return stdntGradProgYear;
	}
	public void setStdntGradProgYear(Integer stdntGradProgYear) {
		this.stdntGradProgYear = stdntGradProgYear;
	}
	public Integer getStdntGradYear() {
		return stdntGradYear;
	}
	public void setStdntGradYear(Integer stdntGradYear) {
		this.stdntGradYear = stdntGradYear;
	}
	public String getStdntQuitDate() {
		return stdntQuitDate;
	}
	public void setStdntQuitDate(String stdntQuitDate) {
		this.stdntQuitDate = stdntQuitDate;
	}
	public Float getStdntOnetPoint() {
		return stdntOnetPoint;
	}
	public void setStdntOnetPoint(Float stdntOnetPoint) {
		this.stdntOnetPoint = stdntOnetPoint;
	}
	public Float getStdntOnetEngPoint() {
		return stdntOnetEngPoint;
	}
	public void setStdntOnetEngPoint(Float stdntOnetEngPoint) {
		this.stdntOnetEngPoint = stdntOnetEngPoint;
	}
	public EngLevelBean getEngLevel() {
		return engLevel;
	}
	public void setEngLevel(EngLevelBean engLevel) {
		this.engLevel = engLevel;
	}
	public String getStdntRemark() {
		return stdntRemark;
	}
	public void setStdntRemark(String stdntRemark) {
		this.stdntRemark = stdntRemark;
	}
	public Integer getStdntStatus() {
		return stdntStatus;
	}
	public void setStdntStatus(Integer stdntStatus) {
		this.stdntStatus = stdntStatus;
	}
	
	
	
}
