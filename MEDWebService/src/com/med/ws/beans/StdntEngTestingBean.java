package com.med.ws.beans;

import java.util.Date;

public class StdntEngTestingBean {

	protected Integer stdntEngTestingId;
	protected Integer engTestingId;
	protected String engTesting;
	protected Date dateTesting;
	protected Integer testingScore;
	
	
	
	public Integer getEngTestingId() {
		return engTestingId;
	}
	public void setEngTestingId(Integer engTestingId) {
		this.engTestingId = engTestingId;
	}
	public Integer getStdntEngTestingId() {
		return stdntEngTestingId;
	}
	public void setStdntEngTestingId(Integer stdntEngTestingId) {
		this.stdntEngTestingId = stdntEngTestingId;
	}
	public Date getDateTesting() {
		return dateTesting;
	}
	public void setDateTesting(Date dateTesting) {
		this.dateTesting = dateTesting;
	}
	public Integer getTestingScore() {
		return testingScore;
	}
	public void setTestingScore(Integer testingScore) {
		this.testingScore = testingScore;
	}
	public String getEngTesting() {
		return engTesting;
	}
	public void setEngTesting(String engTesting) {
		this.engTesting = engTesting;
	}

	
	
}
