package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.AddrCountryBean;
import com.med.ws.beans.EduLevelBean;
import com.med.ws.beans.EmpFowBean;
import com.med.ws.beans.EmpPstnTblBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PrefixTypeBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;

@JsonInclude(Include.NON_NULL)
public class PersInfoMasterDataRsType {
	
	private List<AcadOrgBean> acadOrgList;
	private List<EduLevelBean> eduLevelList;
	private List<EmpFowBean> empFowList;
	private List<EmpPstnTblBean> empPstnList;
	private List<PrefixTypeBean> prefixTypeList;
	private List<NationalityBean> nationalityList;
	private List<RaceBean> raceList;
	private List<ReligionBean> religionList;
	private List<AddrCountryBean> countryList;

	public List<PrefixTypeBean> getPrefixTypeList() {
		return prefixTypeList;
	}

	public void setPrefixTypeList(List<PrefixTypeBean> prefixTypeList) {
		this.prefixTypeList = prefixTypeList;
	}

	public List<EmpFowBean> getEmpFowList() {
		return empFowList;
	}

	public void setEmpFowList(List<EmpFowBean> empFowList) {
		this.empFowList = empFowList;
	}

	public List<EduLevelBean> getEduLevelList() {
		return eduLevelList;
	}

	public void setEduLevelList(List<EduLevelBean> eduLevelList) {
		this.eduLevelList = eduLevelList;
	}

	public List<AcadOrgBean> getAcadOrgList() {
		return acadOrgList;
	}

	public void setAcadOrgList(List<AcadOrgBean> acadOrgList) {
		this.acadOrgList = acadOrgList;
	}

	public List<NationalityBean> getNationalityList() {
		return nationalityList;
	}

	public void setNationalityList(List<NationalityBean> nationalityList) {
		this.nationalityList = nationalityList;
	}

	public List<RaceBean> getRaceList() {
		return raceList;
	}

	public void setRaceList(List<RaceBean> raceList) {
		this.raceList = raceList;
	}

	public List<ReligionBean> getReligionList() {
		return religionList;
	}

	public void setReligionList(List<ReligionBean> religionList) {
		this.religionList = religionList;
	}

	public List<EmpPstnTblBean> getEmpPstnList() {
		return empPstnList;
	}

	public void setEmpPstnList(List<EmpPstnTblBean> empPstnList) {
		this.empPstnList = empPstnList;
	}

	public List<AddrCountryBean> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<AddrCountryBean> countryList) {
		this.countryList = countryList;
	}

	

	
	
}
