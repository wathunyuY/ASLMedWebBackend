package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AcadOrgBean;
import com.med.ws.beans.EmpPstnTblBean;
import com.med.ws.beans.MarriageStatusBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PersEduGradBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;
import com.med.ws.beans.WorkStatusBean;

public class PersonalUpdateRsType {

	protected AcadOrgBean acadOrg;
	protected String username;
	protected String bankNo;
	protected String bloodType;
	protected String coopNo;
	protected String dateOfBirth;
	protected String effdt;
	protected EmpPstnTblBean empPstn;
	protected String fundsNo;
	protected String gpfNo;
	protected MarriageStatusBean marriageStatus;
	protected String medicCode;
	protected List<NationalityBean> nationality;
	protected String persEmailAddress;
	protected String emailAddress2;
	protected String persFirstNameEng;
	protected String persFirstNameThai;
	protected String persGender;
	protected String persLastNameEng;
	protected String persLastNameThai;
	protected String persNid;
	protected List<PrefixBean> prefixEdu;
	protected PrefixBean prefix;
	protected List<PrefixBean> prefixRank;
	protected List<RaceBean> race;
	protected String rdNo;
	protected ReligionBean religion;
	protected String startGovernDate;
	protected String startWorkDate;
	protected String transInDate;
	protected WorkStatusBean workStatus;
	protected List<PersEduGradBean> PersEduGradBeanList;
	protected String profilePic;
    protected String persAddress0;
    protected String persAddress1;
    protected GetAddrMasterDataRsType address0;
    protected GetAddrMasterDataRsType address1;
    protected String persPhoneNbr; //VARCHAR(10)
    protected String persPhoneExt; //VARCHAR(10)
    protected String persMobileNbr1; //VARCHAR(10)
    protected String persMobileNbr2; //VARCHAR(10)
	
	public String getBankNo() {
		return bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getCoopNo() {
		return coopNo;
	}
	public void setCoopNo(String coopNo) {
		this.coopNo = coopNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEffdt() {
		return effdt;
	}
	public void setEffdt(String effdt) {
		this.effdt = effdt;
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

	public String getMedicCode() {
		return medicCode;
	}
	public void setMedicCode(String medicCode) {
		this.medicCode = medicCode;
	}
	public List<NationalityBean> getNationalityList() {
		return nationality;
	}
	public void setNationalityList(List<NationalityBean> nationalityList) {
		this.nationality = nationalityList;
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
	public String getPersFirstNameEng() {
		return persFirstNameEng;
	}
	public void setPersFirstNameEng(String persFirstNameEng) {
		this.persFirstNameEng = persFirstNameEng;
	}
	public String getPersFirstNameThai() {
		return persFirstNameThai;
	}
	public void setPersFirstNameThai(String persFirstNameThai) {
		this.persFirstNameThai = persFirstNameThai;
	}
	public String getPersGender() {
		return persGender;
	}
	public void setPersGender(String persGender) {
		this.persGender = persGender;
	}
	public String getPersLastNameEng() {
		return persLastNameEng;
	}
	public void setPersLastNameEng(String persLastNameEng) {
		this.persLastNameEng = persLastNameEng;
	}
	public String getPersLastNameThai() {
		return persLastNameThai;
	}
	public void setPersLastNameThai(String persLastNameThai) {
		this.persLastNameThai = persLastNameThai;
	}
	public String getPersNid() {
		return persNid;
	}
	public void setPersNid(String persNid) {
		this.persNid = persNid;
	}
	public List<PrefixBean> getPrefixEdu() {
		return prefixEdu;
	}
	public void setPrefixEdu(List<PrefixBean> prefixEdu) {
		this.prefixEdu = prefixEdu;
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
	public List<RaceBean> getRaceList() {
		return race;
	}
	public void setRaceList(List<RaceBean> raceList) {
		this.race = raceList;
	}
	public String getRdNo() {
		return rdNo;
	}
	public void setRdNo(String rdNo) {
		this.rdNo = rdNo;
	}
	public ReligionBean getReligion() {
		return religion;
	}
	public void setReligion(ReligionBean religion) {
		this.religion = religion;
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
	public AcadOrgBean getAcadOrg() {
		return acadOrg;
	}
	public void setAcadOrg(AcadOrgBean acadOrg) {
		this.acadOrg = acadOrg;
	}
	public EmpPstnTblBean getEmpPstn() {
		return empPstn;
	}
	public void setEmpPstn(EmpPstnTblBean empPstn) {
		this.empPstn = empPstn;
	}
	public MarriageStatusBean getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(MarriageStatusBean marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public WorkStatusBean getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(WorkStatusBean workStatus) {
		this.workStatus = workStatus;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public List<NationalityBean> getNationality() {
		return nationality;
	}
	public void setNationality(List<NationalityBean> nationality) {
		this.nationality = nationality;
	}
	public List<RaceBean> getRace() {
		return race;
	}
	public void setRace(List<RaceBean> race) {
		this.race = race;
	}
	public List<PersEduGradBean> getPersEduGradBeanList() {
		return PersEduGradBeanList;
	}
	public void setPersEduGradBeanList(List<PersEduGradBean> persEduGradBeanList) {
		PersEduGradBeanList = persEduGradBeanList;
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
