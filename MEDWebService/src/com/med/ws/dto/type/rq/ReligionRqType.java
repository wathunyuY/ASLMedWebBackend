package com.med.ws.dto.type.rq;

import java.util.List;


public class ReligionRqType {

	protected List<ReligionRq> religionRqList;
	protected ReligionRq religionRq;
	protected List<Integer> religionIdList;
	protected Integer religionId;
	
	public static class ReligionRq{
		Integer religionId;
		String descr;//varchar(45)
		String descrEn;//varchar(45)
		
		public Integer getReligionId() {
			return religionId;
		}
		public void setReligionId(Integer religionId) {
			this.religionId = religionId;
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
	}
	public List<ReligionRq> getReligionRqList(){
		return this.religionRqList;
	}
	public void setReligionRqList(List<ReligionRq> religionRqList){
		this.religionRqList = religionRqList;
	}
	public ReligionRq getReligionRq(){
		return this.religionRq;
	}
	public void setReligionRq(ReligionRq religionRq){
		this.religionRq = religionRq;
	}
	public List<Integer> getRiligionIdList(){
		return this.religionIdList;
	}
	public void setReligionIdList(List<Integer> religionIdList){
		this.religionIdList = religionIdList;
	}
	public Integer getRiligionId(){
		return this.religionId;
	}
	public void setReligionId(Integer religionId){
		this.religionId = religionId;
	}
	
}
