package com.med.ws.dto.type.rs;

public class PrefixRsType {
	private Integer prefixId;
	private String descr;
	private String descrEn;
	private String descrShot;
	private String descrShotEn;
	private PrefixTypeObj prefixType;
	
	public static class PrefixTypeObj{
		private Integer prefixTypeId;
		private String desc;
		public Integer getPrefixTypeId() {
			return prefixTypeId;
		}
		public void setPrefixTypeId(Integer prefixTypeId) {
			this.prefixTypeId = prefixTypeId;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	public Integer getPrefixId() {
		return prefixId;
	}
	public void setPrefixId(Integer prefixId) {
		this.prefixId = prefixId;
	}
	
	public PrefixTypeObj getPrefixType() {
		return prefixType;
	}
	public void setPrefixType(PrefixTypeObj prefixType) {
		this.prefixType = prefixType;
	}
	
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDescrEn() {
		return descrEn;
	}
	public void setDescrEn(String descrEn) {
		this.descrEn = descrEn;
	}
	public String getDescrShort(){
		return this.descrShot;
	}
	public void setDescrShort(String descrShort){
		this.descrShot = descrShort;
	}
	public String getDescrShortEn(){
		return this.descrShotEn;
	}
	public void setDescrShortEn(String descrShortEn){
		this.descrShotEn = descrShortEn;
	}
}
