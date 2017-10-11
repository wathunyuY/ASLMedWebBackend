package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.AddrCountryBean;
import com.med.ws.beans.AddrProvinceBean;
import com.med.ws.beans.EduLevelBean;
import com.med.ws.beans.EngLevelBean;
import com.med.ws.beans.HsPlanBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PrefixTypeBean;
import com.med.ws.beans.ProgramBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;

@JsonInclude(Include.NON_NULL)
public class StdntInfoMasterDataRsType {
	private List<ProgramBean> programList;
	private List<EngLevelBean> engLevelList;
	private List<PrefixTypeBean> prefixTypeList;
	private List<AcadProgBean> acadProgList;
	private List<NationalityBean> nationalityList;
	private List<RaceBean> raceList;
	private List<ReligionBean> religionList;
	private List<AddrProvinceBean> provinceList;
	private List<HsPlanBean> hsPlanList;
	private List<AcadCampusBean> acadCampusList;
	private List<EduLevelBean> eduLevelList;
	private List<AddrCountryBean> addrCountryList;

	public List<ProgramBean> getProgramList() {
		return programList;
	}
	public void setProgramList(List<ProgramBean> programList) {
		this.programList = programList;
	}
	public List<EngLevelBean> getEngLevelList() {
		return engLevelList;
	}
	public void setEngLevelList(List<EngLevelBean> engLevelList) {
		this.engLevelList = engLevelList;
	}
	public List<AcadProgBean> getAcadProgList() {
		return acadProgList;
	}
	public void setAcadProgList(List<AcadProgBean> acadProgList) {
		this.acadProgList = acadProgList;
	}
	public List<PrefixTypeBean> getPrefixTypeList() {
		return prefixTypeList;
	}
	public void setPrefixTypeList(List<PrefixTypeBean> prefixTypeList) {
		this.prefixTypeList = prefixTypeList;
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
	public List<AddrProvinceBean> getProvinceList() {
		return provinceList;
	}
	public void setProvinceList(List<AddrProvinceBean> provinceList) {
		this.provinceList = provinceList;
	}
	public List<HsPlanBean> getHsPlanList() {
		return hsPlanList;
	}
	public void setHsPlanList(List<HsPlanBean> hsPlanList) {
		this.hsPlanList = hsPlanList;
	}
	public List<AcadCampusBean> getAcadCampusList() {
		return acadCampusList;
	}
	public void setAcadCampusList(List<AcadCampusBean> acadCampusList) {
		this.acadCampusList = acadCampusList;
	}
	public List<EduLevelBean> getEduLevelList() {
		return eduLevelList;
	}
	public void setEduLevelList(List<EduLevelBean> eduLevelList) {
		this.eduLevelList = eduLevelList;
	}
	public List<AddrCountryBean> getAddrCountryList() {
		return addrCountryList;
	}
	public void setAddrCountryList(List<AddrCountryBean> addrCountryList) {
		this.addrCountryList = addrCountryList;
	}
	
	
}
