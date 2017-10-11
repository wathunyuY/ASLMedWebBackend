package com.med.ws.beans;

import java.util.List;

public class ProgramBean {
	private Integer programId;
	private String programName; //varchar(255)
	private String programShortName; //varchar(45)
	private String programNameEn; //varchar(255)
	private String programShortNameEn; //varchar(45)
	private List<ScoreBean> scoreList;
	public Integer getProgramId() {
		return programId;
	}
	public void setProgramId(Integer programId) {
		this.programId = programId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramShortName() {
		return programShortName;
	}
	public void setProgramShortName(String programShortName) {
		this.programShortName = programShortName;
	}
	public List<ScoreBean> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<ScoreBean> scoreList) {
		this.scoreList = scoreList;
	}
	public String getProgramNameEn() {
		return programNameEn;
	}
	public void setProgramNameEn(String programNameEn) {
		this.programNameEn = programNameEn;
	}
	public String getProgramShortNameEn() {
		return programShortNameEn;
	}
	public void setProgramShortNameEn(String programShortNameEn) {
		this.programShortNameEn = programShortNameEn;
	}
	

}
