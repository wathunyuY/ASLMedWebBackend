package com.med.ods.criteria.bean;

public class StdntSearchCriteria {
	
	protected Integer acadCarId;
	protected Integer stdntYear;
	protected Integer stdntGpaS;
	protected Integer stdntGpaE;
	protected String stdntCodeOrName;
	
	public Integer getAcadCarId() {
		return acadCarId;
	}
	public void setAcadCarId(Integer acadCarId) {
		this.acadCarId = acadCarId;
	}
	public Integer getStdntYear() {
		return stdntYear;
	}
	public void setStdntYear(Integer stdntYear) {
		this.stdntYear = stdntYear;
	}
	
	public Integer getStdntGpaS() {
		return stdntGpaS;
	}
	public void setStdntGpaS(Integer stdntGpaS) {
		this.stdntGpaS = stdntGpaS;
	}
	public Integer getStdntGpaE() {
		return stdntGpaE;
	}
	public void setStdntGpaE(Integer stdntGpaE) {
		this.stdntGpaE = stdntGpaE;
	}
	public String getStdntCodeOrName() {
		return stdntCodeOrName;
	}
	public void setStdntCodeOrName(String stdntCodeOrName) {
		this.stdntCodeOrName = stdntCodeOrName;
	}
}
