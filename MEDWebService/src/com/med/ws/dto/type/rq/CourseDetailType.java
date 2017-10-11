package com.med.ws.dto.type.rq;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CourseDetailType {
	Effdt effdt; //datetime
	AcadProg acadProg;
	AcadPlan acadPlan;
	Subject subject;
	String crseTitleLong; //varchar(255)
	Integer crseLevel; //int(10) unsigned zerofill
	GradingBasis gradingBasis;
	CourseData courseData;
	Boolean isOverlap;
	String color;
	List<CourseData> courseDataOtn;
	List<Integer> courseDataDelete;

	public static class GradingBasis {
		@JsonProperty("id")
		Integer gradingBasisId;
		@JsonProperty("desc")
		String gradingBasisDescr; //varchar(255)
		@JsonProperty("descShort")
		String gradingBasisDescrShort; //varchar(45)

		public Integer getGradingBasisId() {
			return gradingBasisId;
		}

		public void setGradingBasisId(Integer gradingBasisId) {
			this.gradingBasisId = gradingBasisId;
		}

		public String getGradingBasisDescr() {
			return gradingBasisDescr;
		}

		public void setGradingBasisDescr(String gradingBasisDescr) {
			this.gradingBasisDescr = gradingBasisDescr;
		}

		public String getGradingBasisDescrShort() {
			return gradingBasisDescrShort;
		}

		public void setGradingBasisDescrShort(String gradingBasisDescrShort) {
			this.gradingBasisDescrShort = gradingBasisDescrShort;
		}
	}

	public static class Effdt {
		String crseId;
		Date crseEffdt;

		public String getCrseId() {
			return crseId;
		}

		public void setCrseId(String crseId) {
			this.crseId = crseId;
		}

		public Date getCrseEffdt() {
			return crseEffdt;
		}

		public void setCrseEffdt(Date crseEffdt) {
			this.crseEffdt = crseEffdt;
		}
	}

	public static class AcadProg {
		Integer acadProgId;
		@JsonProperty("effdt")
		Date acadProgEffdt;
		@JsonProperty("desc")
		String acadProgDesc; //varchar(255)

		public Integer getAcadProgId() {
			return acadProgId;
		}

		public void setAcadProgId(Integer acadProgId) {
			this.acadProgId = acadProgId;
		}

		public Date getAcadProgEffdt() {
			return acadProgEffdt;
		}

		public void setAcadProgEffdt(Date acadProgEffdt) {
			this.acadProgEffdt = acadProgEffdt;
		}

		public String getAcadProgDesc() {
			return acadProgDesc;
		}

		public void setAcadProgDesc(String acadProgDesc) {
			this.acadProgDesc = acadProgDesc;
		}
	}

	public static class AcadPlan {
		Integer acadPlanId;
		@JsonProperty("effdt")
		Date acadPlanEffdt;
		@JsonProperty("desc")
		String acadPlanDesc; //varchar(255)

		public Date getAcadPlanEffdt() {
			return acadPlanEffdt;
		}

		public void setAcadPlanEffdt(Date acadPlanEffdt) {
			this.acadPlanEffdt = acadPlanEffdt;
		}

		public Integer getAcadPlanId() {
			return acadPlanId;
		}

		public void setAcadPlanId(Integer acadPlanId) {
			this.acadPlanId = acadPlanId;
		}

		public String getAcadPlanDesc() {
			return acadPlanDesc;
		}

		public void setAcadPlanDesc(String acadPlanDesc) {
			this.acadPlanDesc = acadPlanDesc;
		}
	}

	public static class Subject {
		@JsonProperty("id")
		Integer subjectId;
		@JsonProperty("effdt")
		Date subjectEffdt;
		@JsonProperty("desc")
		String subjectDescr; //varchar(255)

		public Integer getSubjectId() {
			return subjectId;
		}

		public void setSubjectId(Integer subjectId) {
			this.subjectId = subjectId;
		}

		public Date getSubjectEffdt() {
			return subjectEffdt;
		}

		public void setSubjectEffdt(Date subjectEffdt) {
			this.subjectEffdt = subjectEffdt;
		}

		public String getSubjectDescr() {
			return subjectDescr;
		}

		public void setSubjectDescr(String subjectDescr) {
			this.subjectDescr = subjectDescr;
		}
	}

	public static class CourseData {
		Integer crseOfferNbr;
		String preCatalogNbr; //varchar(45)
		String preCatalogNbrEN; //varchar(45)
		CrseOfferOwnerAcadOrg crseOfferOwnerAcadOrg;
		String catalogNbr; //varchar(5)
		String crseTitle; //varchar(255)
		String crseTitleEn; //varchar(255)
		Boolean classEnroll; //tinyint(1)
		Integer credit; //int(2)
		String creditDetail; //varchar(45)
		String crseDescrTH; //text
		String crseDescrEN; //text
		CrseOfferAcadOrg crseOfferAcadOrg;
		Integer crseWeek; //int(2)
		Integer crseGroup; //int(2)
		List<CrsePreRqs> crsePreRqs;
		List<CrseCoRqs> crseCoRqs;

		public static class CrseOfferOwnerAcadOrg {
			Integer crseOfferOwnerAcadOrgId;
			Date crseOfferOwnerAcadOrgEffdt;
			@JsonProperty("desc")
			String crseOfferOwnerAcadOrgDescr; //varchar(255)

			public Integer getCrseOfferOwnerAcadOrgId() {
				return crseOfferOwnerAcadOrgId;
			}

			public void setCrseOfferOwnerAcadOrgId(Integer crseOfferOwnerAcadOrgId) {
				this.crseOfferOwnerAcadOrgId = crseOfferOwnerAcadOrgId;
			}

			public Date getCrseOfferOwnerAcadOrgEffdt() {
				return crseOfferOwnerAcadOrgEffdt;
			}

			public void setCrseOfferOwnerAcadOrgEffdt(Date crseOfferOwnerAcadOrgEffdt) {
				this.crseOfferOwnerAcadOrgEffdt = crseOfferOwnerAcadOrgEffdt;
			}

			public String getCrseOfferOwnerAcadOrgDescr() {
				return crseOfferOwnerAcadOrgDescr;
			}

			public void setCrseOfferOwnerAcadOrgDescr(String crseOfferOwnerAcadOrgDescr) {
				this.crseOfferOwnerAcadOrgDescr = crseOfferOwnerAcadOrgDescr;
			}
		}

		public static class CrseOfferAcadOrg {
			Integer crseOfferAcadOrgId;
			Date crseOfferAcadOrgEffdt;
			@JsonProperty("desc")
			String crseOfferAcadOrgDescr;

			public Integer getCrseOfferAcadOrgId() {
				return crseOfferAcadOrgId;
			}

			public void setCrseOfferAcadOrgId(Integer crseOfferAcadOrgId) {
				this.crseOfferAcadOrgId = crseOfferAcadOrgId;
			}

			public Date getCrseOfferAcadOrgEffdt() {
				return crseOfferAcadOrgEffdt;
			}

			public void setCrseOfferAcadOrgEffdt(Date crseOfferAcadOrgEffdt) {
				this.crseOfferAcadOrgEffdt = crseOfferAcadOrgEffdt;
			}

			public String getCrseOfferAcadOrgDescr() {
				return crseOfferAcadOrgDescr;
			}

			public void setCrseOfferAcadOrgDescr(String crseOfferAcadOrgDescr) {
				this.crseOfferAcadOrgDescr = crseOfferAcadOrgDescr;
			}
		}

		public static class CrsePreRqs {
			String crsePreRqsMainCrseId;
			String crsePreRqsPreCrseId;
			Date crsePreRqsEffdt;
			String crsePreRqsTitle;
		
			public String getCrsePreRqsMainCrseId() {
				return crsePreRqsMainCrseId;
			}

			public void setCrsePreRqsMainCrseId(String crsePreRqsMainCrseId) {
				this.crsePreRqsMainCrseId = crsePreRqsMainCrseId;
			}

			public String getCrsePreRqsPreCrseId() {
				return crsePreRqsPreCrseId;
			}

			public void setCrsePreRqsPreCrseId(String crsePreRqsPreCrseId) {
				this.crsePreRqsPreCrseId = crsePreRqsPreCrseId;
			}

			public Date getCrsePreRqsEffdt() {
				return crsePreRqsEffdt;
			}

			public void setCrsePreRqsEffdt(Date crsePreRqsEffdt) {
				this.crsePreRqsEffdt = crsePreRqsEffdt;
			}

			public String getCrsePreRqsTitle() {
				return crsePreRqsTitle;
			}

			public void setCrsePreRqsTitle(String crsePreRqsTitle) {
				this.crsePreRqsTitle = crsePreRqsTitle;
			}

		}

		public static class CrseCoRqs {
			String crseCoRqsMainCrseId;
			String crseCoRqsCoCrseId;
			Date crseCoRqsEffdt;
			String crseCoRqsTitle;

			
			public String getCrseCoRqsMainCrseId() {
				return crseCoRqsMainCrseId;
			}

			public void setCrseCoRqsMainCrseId(String crseCoRqsMainCrseId) {
				this.crseCoRqsMainCrseId = crseCoRqsMainCrseId;
			}

			public String getCrseCoRqsCoCrseId() {
				return crseCoRqsCoCrseId;
			}

			public void setCrseCoRqsCoCrseId(String crseCoRqsCoCrseId) {
				this.crseCoRqsCoCrseId = crseCoRqsCoCrseId;
			}

			public Date getCrseCoRqsEffdt() {
				return crseCoRqsEffdt;
			}

			public void setCrseCoRqsEffdt(Date crseCoRqsEffdt) {
				this.crseCoRqsEffdt = crseCoRqsEffdt;
			}

			public String getCrseCoRqsTitle() {
				return crseCoRqsTitle;
			}

			public void setCrseCoRqsTitle(String crseCoRqsTitle) {
				this.crseCoRqsTitle = crseCoRqsTitle;
			}

		}


		public String getCatalogNbr() {
			return catalogNbr;
		}

		public void setCatalogNbr(String catalogNbr) {
			this.catalogNbr = catalogNbr;
		}

		public String getCrseTitle() {
			return crseTitle;
		}

		public void setCrseTitle(String crseTitle) {
			this.crseTitle = crseTitle;
		}

		public String getCrseTitleEn() {
			return crseTitleEn;
		}

		public void setCrseTitleEn(String crseTitleEn) {
			this.crseTitleEn = crseTitleEn;
		}

		public Boolean getClassEnroll() {
			return classEnroll;
		}

		public void setClassEnroll(Boolean classEnroll) {
			this.classEnroll = classEnroll;
		}

		public Integer getCredit() {
			return credit;
		}

		public void setCredit(Integer credit) {
			this.credit = credit;
		}

		public String getCreditDetail() {
			return creditDetail;
		}

		public void setCreditDetail(String creditDetail) {
			this.creditDetail = creditDetail;
		}

		public String getCrseDescrTH() {
			return crseDescrTH;
		}

		public void setCrseDescrTH(String crseDescrTH) {
			this.crseDescrTH = crseDescrTH;
		}

		public String getCrseDescrEN() {
			return crseDescrEN;
		}

		public void setCrseDescrEN(String crseDescrEN) {
			this.crseDescrEN = crseDescrEN;
		}

		public Integer getCrseWeek() {
			return crseWeek;
		}

		public void setCrseWeek(Integer crseWeek) {
			this.crseWeek = crseWeek;
		}

		public Integer getCrseGroup() {
			return crseGroup;
		}

		public void setCrseGroup(Integer crseGroup) {
			this.crseGroup = crseGroup;
		}

		public CrseOfferOwnerAcadOrg getCrseOfferOwnerAcadOrg() {
			return crseOfferOwnerAcadOrg;
		}

		public void setCrseOfferOwnerAcadOrg(CrseOfferOwnerAcadOrg crseOfferOwnerAcadOrg) {
			this.crseOfferOwnerAcadOrg = crseOfferOwnerAcadOrg;
		}

		public CrseOfferAcadOrg getCrseOfferAcadOrg() {
			return crseOfferAcadOrg;
		}

		public void setCrseOfferAcadOrg(CrseOfferAcadOrg crseOfferAcadOrg) {
			this.crseOfferAcadOrg = crseOfferAcadOrg;
		}

		public List<CrsePreRqs> getCrsePreRqs() {
			return crsePreRqs;
		}

		public void setCrsePreRqs(List<CrsePreRqs> crsePreRqs) {
			this.crsePreRqs = crsePreRqs;
		}

		public List<CrseCoRqs> getCrseCoRqs() {
			return crseCoRqs;
		}

		public void setCrseCoRqs(List<CrseCoRqs> crseCoRqs) {
			this.crseCoRqs = crseCoRqs;
		}

		public Integer getCrseOfferNbr() {
			return crseOfferNbr;
		}

		public void setCrseOfferNbr(Integer crseOfferNbr) {
			this.crseOfferNbr = crseOfferNbr;
		}

		public String getPreCatalogNbr() {
			return preCatalogNbr;
		}

		public void setPreCatalogNbr(String preCatalogNbr) {
			this.preCatalogNbr = preCatalogNbr;
		}

		public String getPreCatalogNbrEN() {
			return preCatalogNbrEN;
		}

		public void setPreCatalogNbrEN(String preCatalogNbrEN) {
			this.preCatalogNbrEN = preCatalogNbrEN;
		}

	}

	public Effdt getEffdt() {
		return effdt;
	}

	public void setEffdt(Effdt effdt) {
		this.effdt = effdt;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getCrseTitleLong() {
		return crseTitleLong;
	}

	public void setCrseTitleLong(String crseTitleLong) {
		this.crseTitleLong = crseTitleLong;
	}

	public CourseData getCourseData() {
		return courseData;
	}

	public void setCourseData(CourseData courseData) {
		this.courseData = courseData;
	}

	public GradingBasis getGradingBasis() {
		return gradingBasis;
	}

	public void setGradingBasis(GradingBasis gradingBasis) {
		this.gradingBasis = gradingBasis;
	}

	public AcadProg getAcadProg() {
		return acadProg;
	}

	public void setAcadProg(AcadProg acadProg) {
		this.acadProg = acadProg;
	}

	public Integer getCrseLevel() {
		return crseLevel;
	}

	public void setCrseLevel(Integer crseLevel) {
		this.crseLevel = crseLevel;
	}

	public List<CourseData> getCourseDataOtn() {
		return courseDataOtn;
	}

	public void setCourseDataOtn(List<CourseData> courseDataOtn) {
		this.courseDataOtn = courseDataOtn;
	}

	public List<Integer> getCourseDataDelete() {
		return courseDataDelete;
	}

	public void setCourseDataDelete(List<Integer> courseDataDelete) {
		this.courseDataDelete = courseDataDelete;
	}

	public AcadPlan getAcadPlan() {
		return acadPlan;
	}

	public void setAcadPlan(AcadPlan acadPlan) {
		this.acadPlan = acadPlan;
	}

	public Boolean getIsOverlap() {
		return isOverlap;
	}

	public void setIsOverlap(Boolean isOverlap) {
		this.isOverlap = isOverlap;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public AcadProgBean getAcadProg() {
//		return acadProg;
//	}
//
//	public void setAcadProg(AcadProgBean acadProg) {
//		this.acadProg = acadProg;
//	}
//
//	public AcadPlanBean getAcadPlan() {
//		return acadPlan;
//	}
//
//	public void setAcadPlan(AcadPlanBean acadPlan) {
//		this.acadPlan = acadPlan;
//	}
//
//	public SubjectTblBean getSubject() {
//		return subject;
//	}
//
//	public void setSubject(SubjectTblBean subject) {
//		this.subject = subject;
//	}
//
//	public GrdBsBean getGradingBasis() {
//		return gradingBasis;
//	}
//
//	public void setGradingBasis(GrdBsBean gradingBasis) {
//		this.gradingBasis = gradingBasis;
//	}

}
