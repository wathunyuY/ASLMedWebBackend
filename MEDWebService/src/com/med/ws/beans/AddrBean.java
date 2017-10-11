package com.med.ws.beans;

public class AddrBean {

	private String persAddress;
	private Integer districtId;
	private Integer amphurId;
	private Integer provinceId;
	private String zipcode;
	private Integer countryId;
	
	public String getPersAddress() {
		return persAddress;
	}
	public void setPersAddress(String persAddress) {
		this.persAddress = persAddress;
	}
	public Integer getDistrictId() {
		return districtId;
	}
	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}
	public Integer getAmphurId() {
		return amphurId;
	}
	public void setAmphurId(Integer amphurId) {
		this.amphurId = amphurId;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	
}
