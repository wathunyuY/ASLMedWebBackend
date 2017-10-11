package com.med.ws.dto.type.rq;

import java.util.List;



public class RaceRqType {

	protected List<RaceRq> raceRqList;
	protected RaceRq raceRq;
	protected List<Integer> raceIdList;
	protected Integer raceId;
	
	public static class RaceRq{
		Integer raceId;
		String descr; //varchar(45)
		String descrEn; //varchar(45)
		
		public Integer getRaceId() {
			return raceId;
		}
		public void setRaceId(Integer raceId) {
			this.raceId = raceId;
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
	public List<RaceRq> getRaceRqList(){
		return this.raceRqList;
	}
	public void setRaceRqType(List<RaceRq> raceRqList){
		this.raceRqList = raceRqList;
	}
	
	public RaceRq getRaceRq(){
		return this.raceRq;
	}
	public void setRaceRq(RaceRq raceRq){
		this.raceRq = raceRq;
	}
	
	public List<Integer> getRaceIdList(){
		return this.raceIdList;
	}
	public void setRaceIdList(List<Integer> raceIdList){
		this.raceIdList = raceIdList;
	}
	public Integer getRaceId(){
		return this.raceId;
	}
	public void setRaceId(Integer raceId){
		this.raceId = raceId;
	}
}
