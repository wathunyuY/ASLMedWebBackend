package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.AddrAmphurBean;
import com.med.ws.beans.AddrCountryBean;
import com.med.ws.beans.AddrDistricBean;
import com.med.ws.beans.AddrProvinceBean;
import com.med.ws.beans.NationalityBean;
import com.med.ws.beans.PersEduGradBean;
import com.med.ws.beans.PrefixBean;
import com.med.ws.beans.RaceBean;
import com.med.ws.beans.ReligionBean;
import com.med.ws.beans.StdtInfoBean;

public class GetPersonDetailRsType {

	private Profile profile;
	private Career career;
	private Education education;
	
	public static class Profile{
		private String nId;
//		private String persCode;
		private String name;
		private String lastName;
		private String nameEn;
		private String lastNameEn;
		private String bloodType;
		private String birthDate;
		private String dtOfDeath;
		private String phoneNumber;
		private String phoneExt;
		private String picture;
		private List<String> mobileNbr;
		private List<String> emailAddress;
		private List<PrefixBean> prefix;
		private ReligionBean religion;
		private List<RaceBean> race;
		private List<NationalityBean> nationality;
		private FullAddress address;
		
		public static class FullAddress{
			private String persAddress;
			private AddrCountryBean addCountry;
			private AddrProvinceBean addProvince;
			private AddrAmphurBean addAmphur;
			private AddrDistricBean distric;
			private String zipCode;
			public String getPersAddress() {
				return persAddress;
			}
			public void setPersAddress(String persAddress) {
				this.persAddress = persAddress;
			}
			public AddrCountryBean getAddCountry() {
				return addCountry;
			}
			public void setAddCountry(AddrCountryBean addCountry) {
				this.addCountry = addCountry;
			}
			public AddrProvinceBean getAddProvince() {
				return addProvince;
			}
			public void setAddProvince(AddrProvinceBean addProvince) {
				this.addProvince = addProvince;
			}
			public AddrAmphurBean getAddAmphur() {
				return addAmphur;
			}
			public void setAddAmphur(AddrAmphurBean addAmphur) {
				this.addAmphur = addAmphur;
			}
			public AddrDistricBean getDistric() {
				return distric;
			}
			public void setDistric(AddrDistricBean distric) {
				this.distric = distric;
			}
			public String getZipCode() {
				return zipCode;
			}
			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}
			
		}

		public String getNid() {
			return nId;
		}

		public void setNid(String nId) {
			this.nId = nId;
		}

//		public String getPersCode() {
//			return persCode;
//		}
//
//		public void setPersCode(String persCode) {
//			this.persCode = persCode;
//		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getNameEn() {
			return nameEn;
		}

		public void setNameEn(String nameEn) {
			this.nameEn = nameEn;
		}

		public String getLastNameEn() {
			return lastNameEn;
		}

		public void setLastNameEn(String lastNameEn) {
			this.lastNameEn = lastNameEn;
		}

		public String getBloodType() {
			return bloodType;
		}

		public void setBloodType(String bloodType) {
			this.bloodType = bloodType;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getDtOfDeath() {
			return dtOfDeath;
		}

		public void setDtOfDeath(String dtOfDeath) {
			this.dtOfDeath = dtOfDeath;
		}

		public List<PrefixBean> getPrefix() {
			return prefix;
		}

		public void setPrefix(List<PrefixBean> prefix) {
			this.prefix = prefix;
		}

		public ReligionBean getReligion() {
			return religion;
		}

		public void setReligion(ReligionBean religion) {
			this.religion = religion;
		}

		public List<RaceBean> getRaceList() {
			return race;
		}

		public void setRaceList(List<RaceBean> raceList) {
			this.race = raceList;
		}

		public FullAddress getAddress() {
			return address;
		}

		public void setAddress(FullAddress address) {
			this.address = address;
		}

		public String getnId() {
			return nId;
		}

		public void setnId(String nId) {
			this.nId = nId;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhoneExt() {
			return phoneExt;
		}

		public void setPhoneExt(String phoneExt) {
			this.phoneExt = phoneExt;
		}

		public List<String> getMobileNbr() {
			return mobileNbr;
		}

		public void setMobileNbr(List<String> mobileNbr) {
			this.mobileNbr = mobileNbr;
		}

		public List<String> getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(List<String> emailAddress) {
			this.emailAddress = emailAddress;
		}

		public List<NationalityBean> getNationality() {
			return nationality;
		}

		public void setNationality(List<NationalityBean> nationality) {
			this.nationality = nationality;
		}

		public String getPicture() {
			return picture;
		}

		public void setPicture(String picture) {
			this.picture = picture;
		}
		
		
	}
	public static class Education{
		List<PersEduGradBean> education;
		StdtInfoBean stdtInfo;
		
		public List<PersEduGradBean> getEducation() {
			return education;
		}
		public void setEducation(List<PersEduGradBean> education) {
			this.education = education;
		}
		public StdtInfoBean getStdtInfo() {
			return stdtInfo;
		}
		public void setStdtInfo(StdtInfoBean stdtInfo) {
			this.stdtInfo = stdtInfo;
		}
		
	}
	public static class Career{
		private String empCode;
		private String effdt;
		private String empMedCode;
		private String psStartDate;
		private String workStartDate;
		private String transferDate;
		private String cooCode;
		private String fundsCode;
		private String gpfCode;
		private String taxCode;
		private String acctCode;
		private WorkStatusShort workStatus;
		private EmpPstnShort empPstn;
		private AcadOrgShort acadOrg;
		
		public static class WorkStatusShort{
			private Integer workStatusId;
			private String workStatusDescr;
			public Integer getWorkStatusId() {
				return workStatusId;
			}
			public void setWorkStatusId(Integer workStatusId) {
				this.workStatusId = workStatusId;
			}
			public String getWorkStatusDescr() {
				return workStatusDescr;
			}
			public void setWorkStatusDescr(String workStatusDescr) {
				this.workStatusDescr = workStatusDescr;
			}
			
		}
		public static class AcadOrgShort{
			private Integer acadOrgId;
			private String effdt;
			private String acadOrgCode; //varchar(45)
			private String status;
			private String desc; //varchar(255)
			private String descEn; //varchar(255)
			private String descShort; //varchar(45)
			private String descShortEn; //varchar(45)
			public Integer getAcadOrgId() {
				return acadOrgId;
			}
			public void setAcadOrgId(Integer acadOrgId) {
				this.acadOrgId = acadOrgId;
			}
			public String getEffdt() {
				return effdt;
			}
			public void setEffdt(String effdt) {
				this.effdt = effdt;
			}
			public String getAcadOrgCode() {
				return acadOrgCode;
			}
			public void setAcadOrgCode(String acadOrgCode) {
				this.acadOrgCode = acadOrgCode;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getDesc() {
				return desc;
			}
			public void setDesc(String desc) {
				this.desc = desc;
			}
			public String getDescEn() {
				return descEn;
			}
			public void setDescEn(String descEn) {
				this.descEn = descEn;
			}
			public String getDescShort() {
				return descShort;
			}
			public void setDescShort(String descShort) {
				this.descShort = descShort;
			}
			public String getDescShortEn() {
				return descShortEn;
			}
			public void setDescShortEn(String descShortEn) {
				this.descShortEn = descShortEn;
			}
			
		}
		public static class EmpPstnShort{
			private Integer empPstnId;
			private String pstnName;
			private String pstnNameEn;
			private String pstnAbbrName;
			private String pstnAbbrNameEn;
			private String pstnFowName;
			public Integer getEmpPstnId() {
				return empPstnId;
			}
			public void setEmpPstnId(Integer empPstnId) {
				this.empPstnId = empPstnId;
			}
			public String getPstnName() {
				return pstnName;
			}
			public void setPstnName(String pstnName) {
				this.pstnName = pstnName;
			}
			public String getPstnNameEn() {
				return pstnNameEn;
			}
			public void setPstnNameEn(String pstnNameEn) {
				this.pstnNameEn = pstnNameEn;
			}
			public String getPstnAbbrName() {
				return pstnAbbrName;
			}
			public void setPstnAbbrName(String pstnAbbrName) {
				this.pstnAbbrName = pstnAbbrName;
			}
			public String getPstnAbbrNameEn() {
				return pstnAbbrNameEn;
			}
			public void setPstnAbbrNameEn(String pstnAbbrNameEn) {
				this.pstnAbbrNameEn = pstnAbbrNameEn;
			}
			public String getPstnFowName() {
				return pstnFowName;
			}
			public void setPstnFowName(String pstnFowName) {
				this.pstnFowName = pstnFowName;
			}
			
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
		public String getEmpMedCode() {
			return empMedCode;
		}
		public void setEmpMedCode(String empMedCode) {
			this.empMedCode = empMedCode;
		}
		public String getPsStartDate() {
			return psStartDate;
		}
		public void setPsStartDate(String psStartDate) {
			this.psStartDate = psStartDate;
		}
		public String getWorkStartDate() {
			return workStartDate;
		}
		public void setWorkStartDate(String workStartDate) {
			this.workStartDate = workStartDate;
		}
		public String getTransferDate() {
			return transferDate;
		}
		public void setTransferDate(String transferDate) {
			this.transferDate = transferDate;
		}
		public String getCooCode() {
			return cooCode;
		}
		public void setCooCode(String cooCode) {
			this.cooCode = cooCode;
		}
		public String getFundsCode() {
			return fundsCode;
		}
		public void setFundsCode(String fundsCode) {
			this.fundsCode = fundsCode;
		}
		public String getGpfCode() {
			return gpfCode;
		}
		public void setGpfCode(String gpfCode) {
			this.gpfCode = gpfCode;
		}
		public String getTaxCode() {
			return taxCode;
		}
		public void setTaxCode(String taxCode) {
			this.taxCode = taxCode;
		}
		public String getAcctCode() {
			return acctCode;
		}
		public void setAcctCode(String acctCode) {
			this.acctCode = acctCode;
		}
		public WorkStatusShort getWorkStatus() {
			return workStatus;
		}
		public void setWorkStatus(WorkStatusShort workStatus) {
			this.workStatus = workStatus;
		}
		public EmpPstnShort getEmpPstn() {
			return empPstn;
		}
		public void setEmpPstn(EmpPstnShort empPstn) {
			this.empPstn = empPstn;
		}
		public AcadOrgShort getAcadOrg() {
			return acadOrg;
		}
		public void setAcadOrg(AcadOrgShort acadOrg) {
			this.acadOrg = acadOrg;
		}
		
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Career getCareer() {
		return career;
	}
	public void setCareer(Career career) {
		this.career = career;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
    
	
}
