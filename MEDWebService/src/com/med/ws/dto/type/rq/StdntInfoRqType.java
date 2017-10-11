package com.med.ws.dto.type.rq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.med.ws.beans.AddrBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.ScoreBean;

@JsonInclude(Include.NON_NULL)
public class StdntInfoRqType {
	
	protected String stdntCode; //VARCHAR(10)
	protected Integer persId; //INT(10)
	protected Integer stdntId;  //INT(10)
	protected String dateOfBirth; //DATE
	protected String persNid; //INT(10)
	protected String flag;
	protected String bloodType; //VARCHAR(45)
	protected PrefixBean prefix;
	protected List<PrefixBean> prefixRank;
	protected List<PrefixBean> prefixEdu;
    protected String effdt; //DATETIME
    protected String persFirstName; //VARCHAR(100)
    protected String persLastName;  //VARCHAR(100)
    protected String gender; //VARCHAR(1)
    protected Integer programId; //INT(10)
    protected String programEffdt; //DATETIME
    protected Integer acadProgId; //INT(10)
    protected Integer acadPlanId; //INT(10)
    protected String acadProgEffdt; //DATETIME
    protected String stdntGpa; // FLOAT
    protected String stdntAdmissionYear; //INT(4)
    protected String stdntGradProgYear; //INT(4)
    protected String stdntGradYear; //INT(4)
    protected Integer stdntEngLevelId; //INT(10)
    protected String stdntEngLevelEffdt; //DATETIME
    protected String stdntOnetPoint; //FLOAT
    protected String stdntOnetEngPoint; //FLOAT
    protected String stdntQuitDate; //DATE
    protected String stdntRemark; //TEXT
    protected String profilePic; //TEXT
    protected String persPhoneNbr; //VARCHAR(10)
    protected String persPhoneExt; //VARCHAR(10)
    protected String persMobileNbr1; //VARCHAR(10)
    protected String persMobileNbr2; //VARCHAR(10)
    protected String persMobileNbr3; //VARCHAR(10)
    protected String persMobileNbr4; //VARCHAR(10)
    protected String persMobileNbr5; //VARCHAR(10)
	protected String persEmailAddress1; //VARCHAR(255)
	protected String persEmailAddress2; //VARCHAR(255)
	protected List<AddrBean> addressTypeList;
	protected AddrBean fatherAddress; //VARCHAR(255)
	protected String persFatherAddress; //VARCHAR(255)
	protected String persFatherLstName; //VARCHAR(10)
	protected String persFatherMobileNbr; //VARCHAR(10)
	protected String persFatherStName; //VARCHAR(100)
	protected AddrBean motherAddress; //VARCHAR(255)
	protected String persMotherAddress; //VARCHAR(255)
	protected String persMotherLstName; //VARCHAR(100)
	protected String persMotherMobileNbr; //VARCHAR(10)
	protected String persMotherStName; //VARCHAR(100)
	protected AddrBean parentAddress; //VARCHAR(255)
	protected String persParentAddress; //VARCHAR(255)
	protected String persParentLstName; //VARCHAR(100)
	protected String persParentMobileNbr; //VARCHAR(10)
	protected String persParentStName; //VARCHAR(100)
	protected Integer eduStatus; //VARCHAR(45)
	protected Integer histPlan; 
	protected List<ScoreBean> scoreFields;
	protected Integer acadCampusId; //INT(10)
	protected String persFirstNameEng; //VARCHAR(100)
	protected String persLastNameEng; //VARCHAR(100)
	

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

	public String getStdntCode() {
		return stdntCode;
	}
	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}
	public Integer getPersId() {
		return persId;
	}
	public void setPersId(Integer persId) {
		this.persId = persId;
	}
	public Integer getStdntId() {
		return stdntId;
	}
	public void setStdntId(Integer stdntId) {
		this.stdntId = stdntId;
	}
	public String getPersNid() {
		return persNid;
	}
	public void setPersNid(String persNid) {
		this.persNid = persNid;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
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
	public Integer getProgramId() {
		return programId;
	}
	public void setProgramId(Integer programId) {
		this.programId = programId;
	}
	public String getProgramEffdt() {
		return programEffdt;
	}
	public void setProgramEffdt(String programEffdt) {
		this.programEffdt = programEffdt;
	}
	public Integer getAcadProgId() {
		return acadProgId;
	}
	public void setAcadProgId(Integer acadProgId) {
		this.acadProgId = acadProgId;
	}
	public String getAcadProgEffdt() {
		return acadProgEffdt;
	}
	public void setAcadProgEffdt(String acadProgEffdt) {
		this.acadProgEffdt = acadProgEffdt;
	}
	public String getStdntGpa() {
		return stdntGpa;
	}
	public void setStdntGpa(String stdntGpa) {
		this.stdntGpa = stdntGpa;
	}
	public String getStdntAdmissionYear() {
		return stdntAdmissionYear;
	}
	public void setStdntAdmissionYear(String stdntAdmissionYear) {
		this.stdntAdmissionYear = stdntAdmissionYear;
	}
	public String getStdntGradProgYear() {
		return stdntGradProgYear;
	}
	public void setStdntGradProgYear(String stdntGradProgYear) {
		this.stdntGradProgYear = stdntGradProgYear;
	}
	public String getStdntGradYear() {
		return stdntGradYear;
	}
	public void setStdntGradYear(String stdntGradYear) {
		this.stdntGradYear = stdntGradYear;
	}
	public Integer getStdntEngLevelId() {
		return stdntEngLevelId;
	}
	public void setStdntEngLevelId(Integer stdntEngLevelId) {
		this.stdntEngLevelId = stdntEngLevelId;
	}
	public String getStdntEngLevelEffdt() {
		return stdntEngLevelEffdt;
	}
	public void setStdntEngLevelEffdt(String stdntEngLevelEffdt) {
		this.stdntEngLevelEffdt = stdntEngLevelEffdt;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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

	public Integer getAcadPlanId() {
		return acadPlanId;
	}

	public void setAcadPlanId(Integer acadPlanId) {
		this.acadPlanId = acadPlanId;
	}

	public List<AddrBean> getAddressTypeList() {
		return addressTypeList;
	}

	public void setAddressTypeList(List<AddrBean> addressTypeList) {
		this.addressTypeList = addressTypeList;
	}

	public AddrBean getFatherAddress() {
		return fatherAddress;
	}

	public void setFatherAddress(AddrBean fatherAddress) {
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

	public AddrBean getMotherAddress() {
		return motherAddress;
	}

	public void setMotherAddress(AddrBean motherAddress) {
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

	public AddrBean getParentAddress() {
		return parentAddress;
	}

	public void setParentAddress(AddrBean parentAddress) {
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

	public Integer getHistPlan() {
		return histPlan;
	}

	public void setHistPlan(Integer histPlan) {
		this.histPlan = histPlan;
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

	public Integer getAcadCampusId() {
		return acadCampusId;
	}

	public void setAcadCampusId(Integer acadCampusId) {
		this.acadCampusId = acadCampusId;
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
