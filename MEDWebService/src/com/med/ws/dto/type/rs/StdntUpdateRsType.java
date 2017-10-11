package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadCampusBean;
import com.med.ws.beans.AcadPlanBean;
import com.med.ws.beans.AcadProgBean;
import com.med.ws.beans.AddrProvinceBean;
import com.med.ws.beans.EngLevelBean;
import com.med.ws.beans.ErPersonBean;
import com.med.ws.beans.HsPlanBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PersEduGradBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.ProgramBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;
import com.med.ws.beans.ScoreBean;

public class StdntUpdateRsType {

	protected Integer persId;
	protected String username;
	protected String stdntCode;
	protected String persNid;
	protected String effdt;
    protected PrefixBean prefix;
    protected List<PrefixBean> prefixRank;
    protected List<PrefixBean> prefixEdu;
    protected String persFirstName;
    protected String persLastName;
    protected String persFirstNameEng;
    protected String persLastNameEng;
    protected String gender;
    protected String persAddress0;
    protected String persAddress1;
    protected GetAddrMasterDataRsType address0;
    protected GetAddrMasterDataRsType address1;
    protected String persPhoneNbr;
    protected String persPhoneExt;
    protected String persMobileNbr1;
    protected String persMobileNbr2;
    protected String persMobileNbr3;
    protected String persMobileNbr4;
    protected String persMobileNbr5;
	protected String persEmailAddress1;
	protected String persEmailAddress2;
    protected AcadProgBean acadProg;
	protected EngLevelBean engLevel;
    protected ProgramBean program;
    protected String stdntGpa;
    protected Integer stdntAdmissionYear;
    protected Integer stdntGradProgYear;
    protected Integer stdntGradYear;
    protected String stdntOnetPoint;
    protected String stdntOnetEngPoint;
    protected String stdntQuitDate;
    protected String stdntRemark;
    protected String profilePic;
    protected AcadPlanBean acadPlan;
    protected String bloodType;
    protected String dateOfBirth;
    
    protected ReligionBean religion;
    protected List<RaceBean> raceList;
    protected List<NationalityBean> nationalityList;
    protected List<ErPersonBean> erPersonList;
    protected String medicalProblem;
	protected String medicalProblemDescr;
	
	protected GetAddrMasterDataRsType fatherAddress;
	protected String persFatherAddress;
	protected String persFatherLstName;
	protected String persFatherMobileNbr;
	protected String persFatherStName;
	protected GetAddrMasterDataRsType motherAddress;
	protected String persMotherAddress;
	protected String persMotherLstName;
	protected String persMotherMobileNbr;
	protected String persMotherStName;
	protected GetAddrMasterDataRsType parentAddress;
	protected String persParentAddress;
	protected String persParentLstName;
	protected String persParentMobileNbr;
	protected String persParentStName;
	
	protected Integer eduStatus;
	protected HsPlanBean histPlan;
	protected String histAcadName;
	protected AddrProvinceBean histAcadProv;
	protected List<ScoreBean> scoreFields;
	
	protected AcadCampusBean acadCampusBean;
	protected List<PersEduGradBean> reAdmisList;
    
    
    public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	public String getPersNid() {
		return persNid;
	}
	public void setPersNid(String persNid) {
		this.persNid = persNid;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getPersFirstName() {
		return persFirstName;
	}
	public void setPersFirstName(String persFirstName) {
		this.persFirstName = persFirstName;
	}
	public String getPersLastName() {
		return persLastName;
	}
	public void setPersLastName(String persLastName) {
		this.persLastName = persLastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersAddress0() {
		return persAddress0;
	}
	public void setPersAddress0(String persAddress0) {
		this.persAddress0 = persAddress0;
	}
	public String getPersAddress1() {
		return persAddress1;
	}
	public void setPersAddress1(String persAddress1) {
		this.persAddress1 = persAddress1;
	}
	public String getStdntGpa() {
		return stdntGpa;
	}
	public void setStdntGpa(String stdntGpa) {
		this.stdntGpa = stdntGpa;
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
	public String getStdntOnetPoint() {
		return stdntOnetPoint;
	}
	public void setStdntOnetPoint(String stdntOnetPoint) {
		this.stdntOnetPoint = stdntOnetPoint;
	}
	public String getStdntOnetEngPoint() {
		return stdntOnetEngPoint;
	}
	public void setStdntOnetEngPoint(String stdntOnetEngPoint) {
		this.stdntOnetEngPoint = stdntOnetEngPoint;
	}
	public String getStdntQuitDate() {
		return stdntQuitDate;
	}
	public void setStdntQuitDate(String stdntQuitDate) {
		this.stdntQuitDate = stdntQuitDate;
	}
	public String getStdntRemark() {
		return stdntRemark;
	}
	public void setStdntRemark(String stdntRemark) {
		this.stdntRemark = stdntRemark;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
    public PrefixBean getPrefix() {
		return prefix;
	}
	public void setPrefix(PrefixBean prefix) {
		this.prefix = prefix;
	}
	public List<PrefixBean> getPrefixRank() {
		return prefixRank;
	}
	public void setPrefixRank(List<PrefixBean> prefixRank) {
		this.prefixRank = prefixRank;
	}
	public List<PrefixBean> getPrefixEdu() {
		return prefixEdu;
	}
	public void setPrefixEdu(List<PrefixBean> prefixEdu) {
		this.prefixEdu = prefixEdu;
	}
	public AcadProgBean getAcadProg() {
		return acadProg;
	}
	public void setAcadProg(AcadProgBean acadProg) {
		this.acadProg = acadProg;
	}
	public ProgramBean getProgram() {
		return program;
	}
	public void setProgram(ProgramBean program) {
		this.program = program;
	}
	public EngLevelBean getEngLevel() {
		return engLevel;
	}
	public void setEngLevel(EngLevelBean engLevel) {
		this.engLevel = engLevel;
	}
	public String getPersPhoneNbr() {
		return persPhoneNbr;
	}
	public void setPersPhoneNbr(String persPhoneNbr) {
		this.persPhoneNbr = persPhoneNbr;
	}
	public String getPersPhoneExt() {
		return persPhoneExt;
	}
	public void setPersPhoneExt(String persPhoneExt) {
		this.persPhoneExt = persPhoneExt;
	}
	public String getPersMobileNbr1() {
		return persMobileNbr1;
	}
	public void setPersMobileNbr1(String persMobileNbr1) {
		this.persMobileNbr1 = persMobileNbr1;
	}
	public String getPersMobileNbr2() {
		return persMobileNbr2;
	}
	public void setPersMobileNbr2(String persMobileNbr2) {
		this.persMobileNbr2 = persMobileNbr2;
	}
	public String getPersMobileNbr3() {
		return persMobileNbr3;
	}
	public void setPersMobileNbr3(String persMobileNbr3) {
		this.persMobileNbr3 = persMobileNbr3;
	}
	public String getPersMobileNbr4() {
		return persMobileNbr4;
	}
	public void setPersMobileNbr4(String persMobileNbr4) {
		this.persMobileNbr4 = persMobileNbr4;
	}
	public String getPersMobileNbr5() {
		return persMobileNbr5;
	}
	public void setPersMobileNbr5(String persMobileNbr5) {
		this.persMobileNbr5 = persMobileNbr5;
	}
	public String getPersEmailAddress1() {
		return persEmailAddress1;
	}
	public void setPersEmailAddress1(String persEmailAddress1) {
		this.persEmailAddress1 = persEmailAddress1;
	}
	public String getPersEmailAddress2() {
		return persEmailAddress2;
	}
	public void setPersEmailAddress2(String persEmailAddress2) {
		this.persEmailAddress2 = persEmailAddress2;
	}
	public AcadPlanBean getAcadPlan() {
		return acadPlan;
	}
	public void setAcadPlan(AcadPlanBean acadPlan) {
		this.acadPlan = acadPlan;
	}
	public GetAddrMasterDataRsType getAddress0() {
		return address0;
	}
	public void setAddress0(GetAddrMasterDataRsType address0) {
		this.address0 = address0;
	}
	public GetAddrMasterDataRsType getAddress1() {
		return address1;
	}
	public void setAddress1(GetAddrMasterDataRsType address1) {
		this.address1 = address1;
	}
	public ReligionBean getReligion() {
		return religion;
	}
	public void setReligion(ReligionBean religion) {
		this.religion = religion;
	}
	public List<RaceBean> getRaceList() {
		return raceList;
	}
	public void setRaceList(List<RaceBean> raceList) {
		this.raceList = raceList;
	}
	public List<NationalityBean> getNationalityList() {
		return nationalityList;
	}
	public void setNationalityList(List<NationalityBean> nationalityList) {
		this.nationalityList = nationalityList;
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
	public GetAddrMasterDataRsType getFatherAddress() {
		return fatherAddress;
	}
	public void setFatherAddress(GetAddrMasterDataRsType fatherAddress) {
		this.fatherAddress = fatherAddress;
	}
	public String getPersFatherAddress() {
		return persFatherAddress;
	}
	public void setPersFatherAddress(String persFatherAddress) {
		this.persFatherAddress = persFatherAddress;
	}
	public String getPersFatherLstName() {
		return persFatherLstName;
	}
	public void setPersFatherLstName(String persFatherLstName) {
		this.persFatherLstName = persFatherLstName;
	}
	public String getPersFatherMobileNbr() {
		return persFatherMobileNbr;
	}
	public void setPersFatherMobileNbr(String persFatherMobileNbr) {
		this.persFatherMobileNbr = persFatherMobileNbr;
	}
	public String getPersFatherStName() {
		return persFatherStName;
	}
	public void setPersFatherStName(String persFatherStName) {
		this.persFatherStName = persFatherStName;
	}
	public GetAddrMasterDataRsType getMotherAddress() {
		return motherAddress;
	}
	public void setMotherAddress(GetAddrMasterDataRsType motherAddress) {
		this.motherAddress = motherAddress;
	}
	public String getPersMotherAddress() {
		return persMotherAddress;
	}
	public void setPersMotherAddress(String persMotherAddress) {
		this.persMotherAddress = persMotherAddress;
	}
	public String getPersMotherLstName() {
		return persMotherLstName;
	}
	public void setPersMotherLstName(String persMotherLstName) {
		this.persMotherLstName = persMotherLstName;
	}
	public String getPersMotherMobileNbr() {
		return persMotherMobileNbr;
	}
	public void setPersMotherMobileNbr(String persMotherMobileNbr) {
		this.persMotherMobileNbr = persMotherMobileNbr;
	}
	public String getPersMotherStName() {
		return persMotherStName;
	}
	public void setPersMotherStName(String persMotherStName) {
		this.persMotherStName = persMotherStName;
	}
	public GetAddrMasterDataRsType getParentAddress() {
		return parentAddress;
	}
	public void setParentAddress(GetAddrMasterDataRsType parentAddress) {
		this.parentAddress = parentAddress;
	}
	public String getPersParentAddress() {
		return persParentAddress;
	}
	public void setPersParentAddress(String persParentAddress) {
		this.persParentAddress = persParentAddress;
	}
	public String getPersParentLstName() {
		return persParentLstName;
	}
	public void setPersParentLstName(String persParentLstName) {
		this.persParentLstName = persParentLstName;
	}
	public String getPersParentMobileNbr() {
		return persParentMobileNbr;
	}
	public void setPersParentMobileNbr(String persParentMobileNbr) {
		this.persParentMobileNbr = persParentMobileNbr;
	}
	public String getPersParentStName() {
		return persParentStName;
	}
	public void setPersParentStName(String persParentStName) {
		this.persParentStName = persParentStName;
	}
	public Integer getEduStatus() {
		return eduStatus;
	}
	public void setEduStatus(Integer eduStatus) {
		this.eduStatus = eduStatus;
	}
	public String getHistAcadName() {
		return histAcadName;
	}
	public void setHistAcadName(String histAcadName) {
		this.histAcadName = histAcadName;
	}
	public HsPlanBean getHistPlan() {
		return histPlan;
	}
	public void setHistPlan(HsPlanBean histPlan) {
		this.histPlan = histPlan;
	}
	public AddrProvinceBean getHistAcadProv() {
		return histAcadProv;
	}
	public void setHistAcadProv(AddrProvinceBean histAcadProv) {
		this.histAcadProv = histAcadProv;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<ScoreBean> getScoreFields() {
		return scoreFields;
	}
	public void setScoreFields(List<ScoreBean> scoreFields) {
		this.scoreFields = scoreFields;
	}
	public AcadCampusBean getAcadCampusBean() {
		return acadCampusBean;
	}
	public void setAcadCampusBean(AcadCampusBean acadCampusBean) {
		this.acadCampusBean = acadCampusBean;
	}
	public List<PersEduGradBean> getReAdmisList() {
		return reAdmisList;
	}
	public void setReAdmisList(List<PersEduGradBean> reAdmisList) {
		this.reAdmisList = reAdmisList;
	}
	public String getPersFirstNameEng() {
		return persFirstNameEng;
	}
	public void setPersFirstNameEng(String persFirstNameEng) {
		this.persFirstNameEng = persFirstNameEng;
	}
	public String getPersLastNameEng() {
		return persLastNameEng;
	}
	public void setPersLastNameEng(String persLastNameEng) {
		this.persLastNameEng = persLastNameEng;
	}
	
}
