package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

import com.med.ws.beans.SectionBean;
import com.med.ws.dto.type.rq.CourseDetailType.GradingBasis;

public class ClassDetailDTO {
	private String classSection;
	private String acadYear;
	private Integer stdntLevel;
	private String term;
	private List<AcadCampus> campusList;
	private List<AcadCar> acadCarList;
	private ClassDetail classDetail;
	private List<SectionCoordinateBean> sectionList;
	
	public static class SectionCoordinateBean {
		SectionBean section;
		List<SearchPersonalRsType> coordinators;
		public SectionBean getSection() {
			return section;
		}
		public void setSection(SectionBean section) {
			this.section = section;
		}
		public List<SearchPersonalRsType> getCoordinators() {
			return coordinators;
		}
		public void setCoordinators(List<SearchPersonalRsType> coordinators) {
			this.coordinators = coordinators;
		}
	}
	
	public static class AcadCar{
		private Integer id;
		private Date effdt;
		private String descr;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Date getEffdt() {
			return effdt;
		}
		public void setEffdt(Date effdt) {
			this.effdt = effdt;
		}
		public String getDescr() {
			return descr;
		}
		public void setDescr(String descr) {
			this.descr = descr;
		}
	}
	
	public static class AcadCampus{
		private Integer id;
		private Date effdt;
		private String descr;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Date getEffdt() {
			return effdt;
		}
		public void setEffdt(Date effdt) {
			this.effdt = effdt;
		}
		public String getDescr() {
			return descr;
		}
		public void setDescr(String descr) {
			this.descr = descr;
		}
	}
	
	public static class ClassDetail{
		private Date start;
		private Date end;
		private GradingBasis gradeBasic;
		private String creditDetail;
		private String crseTitle;
		private String crseCode;
		private Boolean classEnroll;
		public Date getStart() {
			return start;
		}
		public void setStart(Date start) {
			this.start = start;
		}
		public Date getEnd() {
			return end;
		}
		public void setEnd(Date end) {
			this.end = end;
		}
		public GradingBasis getGradeBasic() {
			return gradeBasic;
		}
		public void setGradeBasic(GradingBasis gradeBasic) {
			this.gradeBasic = gradeBasic;
		}
		public String getCreditDetail() {
			return creditDetail;
		}
		public void setCreditDetail(String creditDetail) {
			this.creditDetail = creditDetail;
		}
		public String getCrseTitle() {
			return crseTitle;
		}
		public void setCrseTitle(String crseTitle) {
			this.crseTitle = crseTitle;
		}
		public Boolean getClassEnroll() {
			return classEnroll;
		}
		public void setClassEnroll(Boolean classEnroll) {
			this.classEnroll = classEnroll;
		}
		public String getCrseCode() {
			return crseCode;
		}
		public void setCrseCode(String crseCode) {
			this.crseCode = crseCode;
		}
	}
	
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getAcadYear() {
		return acadYear;
	}
	public void setAcadYear(String acadYear) {
		this.acadYear = acadYear;
	}
	public Integer getStdntLevel() {
		return stdntLevel;
	}
	public void setStdntLevel(Integer stdntLevel) {
		this.stdntLevel = stdntLevel;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public List<AcadCampus> getCampusList() {
		return campusList;
	}
	public void setCampusList(List<AcadCampus> campusList) {
		this.campusList = campusList;
	}
	public List<AcadCar> getAcadCarList() {
		return acadCarList;
	}
	public void setAcadCarList(List<AcadCar> acadCarList) {
		this.acadCarList = acadCarList;
	}
	public ClassDetail getClassDetail() {
		return classDetail;
	}
	public void setClassDetail(ClassDetail classDetail) {
		this.classDetail = classDetail;
	}
	public List<SectionCoordinateBean> getSectionList() {
		return sectionList;
	}
	public void setSectionList(List<SectionCoordinateBean> sectionList) {
		this.sectionList = sectionList;
	}
	
}
