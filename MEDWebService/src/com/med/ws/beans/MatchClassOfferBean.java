package com.med.ws.beans;

import java.util.List;

public class MatchClassOfferBean {
	
	private Integer taskId;
	private String taskStatus; 
	private List<ClassOfferAndEmp> classOfferAndEmpList;
	
	public static class ClassOfferAndEmp{
		private String crseTitle;
		private boolean classEnroll;
		private String classSection;
		private String endDate;
//		private String startDate;
		private List<Emp> empList;
		
		public static class Emp{
			private Integer persId;
			private String empCode;
			private String empName;
			private String empNid;
			private String empPstn;
			
			public Integer getPersId(){
				return this.persId;
			}
			public void setPersId(Integer persId){
				this.persId = persId;
			}
			
			public String getEmpCode(){
				return this.empCode;
			}
			public void setEmpCode(String empCode){
				this.empCode = empCode;
			}
			
			public String getEmpName(){
				return this.empName;
			}
			public void setEmpName(String empName){
				this.empName = empName;
			}
			
			public String getEmpNid(){
				return this.empNid;
			}
			public void setEmpNid(String empNid){
				this.empNid = empNid;
			}
			
			public String getEmpPstn(){
				return this.empPstn;
			}
			public void setEmpPstn(String empPstn){
				this.empPstn = empPstn;
			}
			
		}
		public String getCrseTitle(){
			return this.crseTitle;
		}
		public void setCrseTitle(String crseTitle){
			this.crseTitle = crseTitle;
		}
		public boolean getClassEnroll(){
			return this.classEnroll;
		}
		public void setClassEnroll(boolean classEnroll){
			this.classEnroll = classEnroll;
		}
		public String getClassSection(){
			return this.classSection;
		}
		public void setClassSection(String classSection){
			this.classSection = classSection;
		}
		public List<Emp> getEmpList(){
			return this.empList;
		}
		public void setEmpList(List<Emp> empList){
			this.empList = empList;
		}
//		public String getStartDate(){
//			return this.startDate;
//		}
//		public void setStartDate(String startDate){
//			this.startDate = startDate;
//		}
		public String getEndDate(){
			return this.endDate;
		}
		public void setEndDate(String endDate){
			this.endDate = endDate;
		}
	}
	
	
	public Integer getTaskId(){
		return this.taskId;
	}
	public void setTaskId(Integer taskId){
		this.taskId = taskId;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public List<ClassOfferAndEmp> getClassOfferAndEmpList(){
		return this.classOfferAndEmpList;
	}
	public void setClassOfferAndEmpList(List<ClassOfferAndEmp> classOfferAndEmpList){
		this.classOfferAndEmpList = classOfferAndEmpList;
	}
}
