package com.med.ws.dto.type.rs;

import com.med.ws.beans.AddrAmphurBean;
import com.med.ws.beans.AddrCountryBean;
import com.med.ws.beans.AddrProvinceBean;

public class GetAddrMasterDataRsType {
	private Integer districtId;
	private String districtName;
	private AddrAmphurBean amphur;
	private AddrProvinceBean province;
	private String zipcode;
	private AddrCountryBean country;
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public AddrAmphurBean getAmphur() {
		return amphur;
	}
	public void setAmphur(AddrAmphurBean amphur) {
		this.amphur = amphur;
	}
	public AddrProvinceBean getProvince() {
		return province;
	}
	public void setProvince(AddrProvinceBean province) {
		this.province = province;
	}
	public AddrCountryBean getCountry() {
		return country;
	}
	public void setCountry(AddrCountryBean country) {
		this.country = country;
	}
	
}
