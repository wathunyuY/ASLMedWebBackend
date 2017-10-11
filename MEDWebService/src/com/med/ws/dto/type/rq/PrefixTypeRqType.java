package com.med.ws.dto.type.rq;

import java.util.List;

public class PrefixTypeRqType {

	protected List<PrefixTypeRq> prefixTypeRqList;
	protected PrefixTypeRq prefixTypeRq;
	protected List<Integer> prefixTypeIdList;
	protected Integer prefixTypeId;
	
	public static class PrefixTypeRq{
		Integer prefixTypeId;
		String descr; //varchar(45)
		public Integer getPrefixTypeId() {
			return prefixTypeId;
		}
		public void setPrefixId(Integer prefixTypeId) {
			this.prefixTypeId = prefixTypeId;
		}
		public String getDescr() {
			return descr;
		}
		public void setDescr(String descr) {
			this.descr = descr;
		}
	}
	public List<PrefixTypeRq> getPrefixTypeRqList(){
		return this.prefixTypeRqList;
	}
	public void setPrefixTypeRqList(List<PrefixTypeRq> prefixTypeRqList){
		this.prefixTypeRqList = prefixTypeRqList;
	}
	
	public PrefixTypeRq getPrefixTypeRq(){
		return this.prefixTypeRq;
	}
	public void setPrefixTypeRq(PrefixTypeRq prefixTypeRq){
		this.prefixTypeRq = prefixTypeRq;
	}
	
	public List<Integer> getPrefixTypeIdList(){
		return this.prefixTypeIdList;
	}
	public void setPrefixTypeIdList(List<Integer> prefixTypeIdList){
		this.prefixTypeIdList = prefixTypeIdList;
	}
	public Integer getPrefixTypeId() {
		return prefixTypeId;
	}
	public void setPrefixTypeId(Integer prefixTypeId) {
		this.prefixTypeId = prefixTypeId;
	}
}
