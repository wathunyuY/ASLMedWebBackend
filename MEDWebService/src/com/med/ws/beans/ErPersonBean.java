package com.med.ws.beans;

import com.med.ws.dto.type.rs.GetAddrMasterDataRsType;

public class ErPersonBean {

	private String erFirstName;
	private String erLastName;
	private String erMobile;
	private Integer erPrefix;
	private String erRelation;
	private AddrBean erAddress;
	private GetAddrMasterDataRsType erAddressRs;
	private String persErAddress;
	private Integer persErId;
	
	public String getErFirstName() {
		return erFirstName;
	}
	public void setErFirstName(String erFirstName) {
		this.erFirstName = erFirstName;
	}
	public String getErLastName() {
		return erLastName;
	}
	public void setErLastName(String erLastName) {
		this.erLastName = erLastName;
	}
	public String getErMobile() {
		return erMobile;
	}
	public void setErMobile(String erMobile) {
		this.erMobile = erMobile;
	}
	public Integer getErPrefix() {
		return erPrefix;
	}
	public void setErPrefix(Integer erPrefix) {
		this.erPrefix = erPrefix;
	}
	public String getErRelation() {
		return erRelation;
	}
	public void setErRelation(String erRelation) {
		this.erRelation = erRelation;
	}
	public AddrBean getErAddress() {
		return erAddress;
	}
	public void setErAddress(AddrBean erAddress) {
		this.erAddress = erAddress;
	}
	public GetAddrMasterDataRsType getErAddressRs() {
		return erAddressRs;
	}
	public void setErAddressRs(GetAddrMasterDataRsType erAddressRs) {
		this.erAddressRs = erAddressRs;
	}
	public String getPersErAddress() {
		return persErAddress;
	}
	public void setPersErAddress(String persErAddress) {
		this.persErAddress = persErAddress;
	}
	public Integer getPersErId() {
		return persErId;
	}
	public void setPersErId(Integer persErId) {
		this.persErId = persErId;
	}
	
	
}
