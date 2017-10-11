package com.med.ws.dto.type.rs;

import java.util.List;
import java.util.Map;

import com.med.ws.beans.ScheduleTableBean;

public class AcadCalendarRsType {

	
	protected String acadYear;
	protected List<AcadCareerDetail> acadCareerList;
	
	public String getAcadYear() {
		return acadYear;
	}

	public void setAcadYear(String acadYear) {
		this.acadYear = acadYear;
	}
	
	public List<AcadCareerDetail> getAcadCareerList() {
		return acadCareerList;
	}

	public void setAcadCareerList(List<AcadCareerDetail> acadCareerList) {
		this.acadCareerList = acadCareerList;
	}


	public static class AcadCareerDetail{
		
		protected List<AcadProgDetail> acadProgLists;

		public List<AcadProgDetail> getAcadProgLists() {
			return acadProgLists;
		}

		public void setAcadProgLists(List<AcadProgDetail> acadProgLists) {
			this.acadProgLists = acadProgLists;
		}

		
	}
	public static class AcadProgDetail{
		protected List<AcadPlanDetail> acadPlanLists;

		public List<AcadPlanDetail> getAcadPlanLists() {
			return acadPlanLists;
		}

		public void setAcadPlanLists(List<AcadPlanDetail> acadPlanLists) {
			this.acadPlanLists = acadPlanLists;
		}
		
		
	}
	
	public static class AcadPlanDetail{
		protected List<ClassLvDetail> classLvDetailLists;

		public List<ClassLvDetail> getClassLvDetailLists() {
			return classLvDetailLists;
		}

		public void setClassLvDetailLists(List<ClassLvDetail> classLvDetailLists) {
			this.classLvDetailLists = classLvDetailLists;
		}
	}
	public static class ClassLvDetail{
		protected List<Map<String,ScheduleTableBean>> classOfferDetailLists;

		public List<Map<String, ScheduleTableBean>> getClassOfferDetailLists() {
			return classOfferDetailLists;
		}

		public void setClassOfferDetailLists(List<Map<String, ScheduleTableBean>> classOfferDetailLists) {
			this.classOfferDetailLists = classOfferDetailLists;
		}

	}
	
}
