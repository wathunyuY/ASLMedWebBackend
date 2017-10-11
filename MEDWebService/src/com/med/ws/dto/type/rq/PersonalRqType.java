package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.AddrBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PersEduGradBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;

public class PersonalRqType {

	protected String persNid ;
	protected String empCode; //varchar(13)
	protected String effdt; //date
	protected String flag;
	protected String persFirstNameThai  ; //varchar(100)
	protected String persLastNameThai ; //varchar(100)
	protected String persFirstNameEng ; //varchar(100)
	protected String persLastNameEng ; //varchar(100)
	protected String medicCode ; //varchar(45)
	protected String dateOfBirth ; //date
	protected String persGender ; //varchar(1)
	protected String bloodType ; //varchar(45)
	protected List<NationalityBean> nationality;
	protected List<RaceBean> race;
	protected ReligionBean religion;
	protected Integer marriageStatus ; //tinyint(1)
	protected List<AddrBean> addressTypeList;
	
	protected String startGovernDate ; //date
	protected String startWorkDate ; //date
	protected String transInDate ; //date
	protected String section ;
	protected String coopNo ; //varchar(45)
	protected String fundsNo ; //varchar(45)
	protected String gpfNo ; //varchar(45)
	protected String rdNo ; //varchar(45)
	protected String bankNo ; //varchar(45)
	protected String workStatus ; //int(10) unsigned zerofill
	protected String persEmailAddress ; //varchar(255)
    protected String persPhoneNbr; //VARCHAR(10)
    protected String persPhoneExt; //VARCHAR(10)
    protected String persMobileNbr1; //VARCHAR(10)
    protected String persMobileNbr2; //VARCHAR(10)
	protected String emailAddress2;
	protected Integer empPstnId;
	protected Integer acadOrgId;
	protected String acadOrgEffdt; //datetime
	protected String profilePic; //text
	protected PrefixBean prefix;
	protected List<PrefixBean> prefixEdu;
	protected List<PrefixBean> prefixRank;
	protected List<PersEduGradBean> persEduGradBeanList;

	
	public String getPersNid() {
		return persNid;
	}
	public void setPersNid(String persNid) {
		this.persNid = persNid;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPersFirstNameThai() {
		return persFirstNameThai;
	}
	public void setPersFirstNameThai(String persFirstNameThai) {
		this.persFirstNameThai = persFirstNameThai;
	}
	public String getPersLastNameThai() {
		return persLastNameThai;
	}
	public void setPersLastNameThai(String persLastNameThai) {
		this.persLastNameThai = persLastNameThai;
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
	public String getMedicCode() {
		return medicCode;
	}
	public void setMedicCode(String medicCode) {
		this.medicCode = medicCode;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPersGender() {
		return persGender;
	}
	public void setPersGender(String persGender) {
		this.persGender = persGender;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public Integer getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(Integer marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public String getStartGovernDate() {
		return startGovernDate;
	}
	public void setStartGovernDate(String startGovernDate) {
		this.startGovernDate = startGovernDate;
	}
	public String getStartWorkDate() {
		return startWorkDate;
	}
	public void setStartWorkDate(String startWorkDate) {
		this.startWorkDate = startWorkDate;
	}
	public String getTransInDate() {
		return transInDate;
	}
	public void setTransInDate(String transInDate) {
		this.transInDate = transInDate;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCoopNo() {
		return coopNo;
	}
	public void setCoopNo(String coopNo) {
		this.coopNo = coopNo;
	}
	public String getFundsNo() {
		return fundsNo;
	}
	public void setFundsNo(String fundsNo) {
		this.fundsNo = fundsNo;
	}
	public String getGpfNo() {
		return gpfNo;
	}
	public void setGpfNo(String gpfNo) {
		this.gpfNo = gpfNo;
	}
	public String getRdNo() {
		return rdNo;
	}
	public void setRdNo(String rdNo) {
		this.rdNo = rdNo;
	}
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	
	public String getPersEmailAddress() {
		return persEmailAddress;
	}
	public void setPersEmailAddress(String persEmailAddress) {
		this.persEmailAddress = persEmailAddress;
	}
	public String getEmailAddress2() {
		return emailAddress2;
	}
	public void setEmailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}
	public Integer getEmpPstnId() {
		return empPstnId;
	}
	public void setEmpPstnId(Integer empPstnId) {
		this.empPstnId = empPstnId;
	}
	public Integer getAcadOrgId() {
		return acadOrgId;
	}
	public void setAcadOrgId(Integer acadOrgId) {
		this.acadOrgId = acadOrgId;
	}
	public String getAcadOrgEffdt() {
		return acadOrgEffdt;
	}
	public void setAcadOrgEffdt(String acadOrgEffdt) {
		this.acadOrgEffdt = acadOrgEffdt;
	}
	public List<NationalityBean> getNationalityList() {
		return nationality;
	}
	public void setNationalityList(List<NationalityBean> nationalityList) {
		this.nationality = nationalityList;
	}
	public List<RaceBean> getRaceList() {
		return race;
	}
	public void setRaceList(List<RaceBean> raceList) {
		this.race = raceList;
	}
	public ReligionBean getReligion() {
		return religion;
	}
	public void setReligionBeanList(ReligionBean religion) {
		this.religion = religion;
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
	public List<PrefixBean> getPrefixEdu() {
		return prefixEdu;
	}
	public void setPrefixEdu(List<PrefixBean> prefixEdu) {
		this.prefixEdu = prefixEdu;
	}
	public List<PrefixBean> getPrefixRank() {
		return prefixRank;
	}
	public void setPrefixRank(List<PrefixBean> prefixRank) {
		this.prefixRank = prefixRank;
	}
	public List<PersEduGradBean> getPersEduGradBeanList() {
		return persEduGradBeanList;
	}
	public void setPersEduGradBeanList(List<PersEduGradBean> persEduGradBeanList) {
		this.persEduGradBeanList = persEduGradBeanList;
	}
	public List<AddrBean> getAddressTypeList() {
		return addressTypeList;
	}
	public void setAddressTypeList(List<AddrBean> addressTypeList) {
		this.addressTypeList = addressTypeList;
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
	
}
