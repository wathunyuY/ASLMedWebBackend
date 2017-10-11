package com.med.ws.dto.type.rq;

import java.util.List;

public class PrefixRqType {

	protected List<PrefixRq> prefixRqList;
	protected PrefixRq prefixRq;
	protected List<Integer> prefixIdList;
	protected Integer prefixId;
	
	public static class PrefixRq{
		Integer prefixId;
		String descr; //varchar(150)
		String descrEn; //varchar(150)
		String descrShort; //varchar(45)
		String descrShortEn; //varchar(45)
		Integer prefixTypeId;
		
		public Integer getPrefixId() {
			return prefixId;
		}
		public void setPrefixId(Integer prefixId) {
			this.prefixId = prefixId;
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
		public String getDescrShort() {
			return descrShort;
		}
		public void setDescrShort(String descrShort) {
			this.descrShort = descrShort;
		}
		public String getDescrShortEn() {
			return descrShortEn;
		}
		public void setDescrShortEn(String descrShortEn) {
			this.descrShortEn = descrShortEn;
		}
		public Integer getPrefixTypeId(){
			return this.prefixTypeId;
		}
		public void setPrefixTypeId(Integer prefixTypeId){
			this.prefixTypeId = prefixTypeId;
		}
	}
	public List<PrefixRq> getPrefixRqList(){
		return this.prefixRqList;
	}
	public void setPrefixRqList(List<PrefixRq> prefixRqList){
		this.prefixRqList = prefixRqList;
	}
	
	public List<Integer> getPrefixIdList(){
		return this.prefixIdList;
	}
	public void setPrefixIdList(List<Integer> prefixIdList){
		this.prefixIdList = prefixIdList;
	}
	public Integer getPrefixId() {
		return prefixId;
	}
	public void setPrefixId(Integer prefixId) {
		this.prefixId = prefixId;
	}
	public PrefixRq getPrefixRq(){
		return this.prefixRq;
	}
	public void setPrefixRq(PrefixRq prefixRq){
		this.prefixRq = prefixRq;
	}

	
}
