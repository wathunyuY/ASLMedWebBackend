package com.med.ws.dto.type.rq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class GradeRqType {
	protected int id;
	protected List<Grade> gradeListCreateAndUpdate;
	protected Grade gradeRq;
	protected List<Integer> gradeListDelete;
	
	public static class Grade{
		Integer gId;
		String descr; //varchar(255)
		String descrShot; //varchar(45)
		public void setId(Integer gId) {
			this.gId = gId;
		}
		public void setDescr(String descr){
			this.descr = descr;
		}
		public void setDescrShot(String descrShot){
			this.descrShot = descrShot;
		}
		
		public Integer getId() {
			return this.gId;
		}
		public String getDescr(){
			return this.descr;
		}
		public String getDescrShot(){
			return this.descrShot;
		}
//		public int getLastUpdtOprId(){
//			return this.lastUpdtOprId;
//		}
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}

	public void setGradeListCreateAndUpdate(List<Grade> gradeList){
		this.gradeListCreateAndUpdate = gradeList;
	}
	public List<Grade> getGradeListCreateAndUpdate(){
		return gradeListCreateAndUpdate;
	}
	
	public Grade getGradeRq(){
		return this.gradeRq;
	}
	public void setGradeRq(Grade gradeRq){
		this.gradeRq = gradeRq;
	}
	
	public List<Integer> getGradeListDelete(){
		return this.gradeListDelete;
	}
	public void setGradeListDelete(List<Integer> gradeListDelete){
		this.gradeListDelete = gradeListDelete;
	}
	
}
