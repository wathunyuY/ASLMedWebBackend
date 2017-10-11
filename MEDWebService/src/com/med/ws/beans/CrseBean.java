package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.dto.type.rs.SearchPersonalRsType;

@JsonInclude(Include.NON_NULL)
public class CrseBean {
		protected String classSection;
		protected String crseId;
		protected String effdt;
		protected Integer crseOfferNo;
		protected String crseCode;
		protected String crseCodeEn;
		protected String crseTitle;
		protected String crseTitleEn;
		protected Integer credit;
		protected String creditDetail;
		protected String acadProgDesc;
		protected String subjectTblDesc;
		protected List<SearchPersonalRsType> teacherList;
		protected String termTblDesc;
		protected Integer crseLvl;
		protected List<CrseBean> preRequisite;
		protected List<CrseBean> coRequisite;
		
		protected String lastUpdt;

		
		public String getClassSection() {
			return classSection;
		}

		public void setClassSection(String classSection) {
			this.classSection = classSection;
		}

		public String getCrseId() {
			return crseId;
		}

		public void setCrseId(String crseId) {
			this.crseId = crseId;
		}

		public String getEffdt() {
			return effdt;
		}

		public void setEffdt(String effdt) {
			this.effdt = effdt;
		}

		public Integer getCrseOfferNo() {
			return crseOfferNo;
		}

		public void setCrseOfferNo(Integer crseOfferNo) {
			this.crseOfferNo = crseOfferNo;
		}

		public String getCrseCode() {
			return crseCode;
		}

		public void setCrseCode(String crseCode) {
			this.crseCode = crseCode;
		}

		public String getCrseCodeEn() {
			return crseCodeEn;
		}

		public void setCrseCodeEn(String crseCodeEn) {
			this.crseCodeEn = crseCodeEn;
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

		public String getAcadProgDesc() {
			return acadProgDesc;
		}

		public void setAcadProgDesc(String acadProgDesc) {
			this.acadProgDesc = acadProgDesc;
		}

		public String getSubjectTblDesc() {
			return subjectTblDesc;
		}

		public void setSubjectTblDesc(String subjectTblDesc) {
			this.subjectTblDesc = subjectTblDesc;
		}

		public List<SearchPersonalRsType> getTeacherList() {
			return teacherList;
		}

		public void setTeacherList(List<SearchPersonalRsType> teacherList) {
			this.teacherList = teacherList;
		}

		public String getTermTblDesc() {
			return termTblDesc;
		}

		public void setTermTblDesc(String termTblDesc) {
			this.termTblDesc = termTblDesc;
		}

		public Integer getCrseLvl() {
			return crseLvl;
		}

		public void setCrseLvl(Integer crseLvl) {
			this.crseLvl = crseLvl;
		}

		public String getLastUpdt() {
			return lastUpdt;
		}

		public void setLastUpdt(String lastUpdt) {
			this.lastUpdt = lastUpdt;
		}

		public List<CrseBean> getPreRequisite() {
			return preRequisite;
		}

		public void setPreRequisite(List<CrseBean> preRequisite) {
			this.preRequisite = preRequisite;
		}

		public List<CrseBean> getCoRequisite() {
			return coRequisite;
		}

		public void setCoRequisite(List<CrseBean> coRequisite) {
			this.coRequisite = coRequisite;
		}

		
		
}
