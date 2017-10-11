package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.ErPersonBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PersEduGradBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;

public class StdntInfoAdditionalRqType {

	protected Integer persId; //INT(10)
	protected String stdntCode; //VARCHAR(10)
	protected String effdt; //DATETIME
	protected List<ErPersonBean> erPersonList;
	protected String medicalProblem; //VARCHAR(45)
	protected String medicalProblemDescr; //TEXT
	protected List<NationalityBean> nationalityList;
	protected List<RaceBean> raceList;
	protected ReligionBean religion;
	protected String histAcadName;
	protected Integer histAcadProv;
	protected List<PersEduGradBean> reAdmisList;
	protected List<Integer> delReAdmis;

	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	
	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	public List<ErPersonBean> getErPersonList() {
		return erPersonList;
	}
	public void setErPersonList(List<ErPersonBean> erPersonList) {
		this.erPersonList = erPersonList;
	}
	public String getMedicalProblem() {
		return medicalProblem;
	}
	public void setMedicalProblem(String medicalProblem) {
		this.medicalProblem = medicalProblem;
	}
	public String getMedicalProblemDescr() {
		return medicalProblemDescr;
	}
	public void setMedicalProblemDescr(String medicalProblemDescr) {
		this.medicalProblemDescr = medicalProblemDescr;
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
	public ReligionBean getReligion() {
		return religion;
	}
	public void setReligion(ReligionBean religion) {
		this.religion = religion;
	}

	public String getHistAcadName() {
		return histAcadName;
	}
	public void setHistAcadName(String histAcadName) {
		this.histAcadName = histAcadName;
	}
	public Integer getHistAcadProv() {
		return histAcadProv;
	}
	public void setHistAcadProv(Integer histAcadProv) {
		this.histAcadProv = histAcadProv;
	}
	public List<PersEduGradBean> getReAdmisList() {
		return reAdmisList;
	}
	public void setReAdmisList(List<PersEduGradBean> reAdmisList) {
		this.reAdmisList = reAdmisList;
	}
	public List<Integer> getDelReAdmis() {
		return delReAdmis;
	}
	public void setDelReAdmis(List<Integer> delReAdmis) {
		this.delReAdmis = delReAdmis;
	}
	

}
