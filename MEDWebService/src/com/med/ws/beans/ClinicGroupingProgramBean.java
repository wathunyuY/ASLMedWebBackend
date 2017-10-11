package com.med.ws.beans;

import java.util.List;

public class ClinicGroupingProgramBean {

//	private int clinicGroupingProgramId;
	private List<Program> programList;
	private StdntLevel stdntLevel;
	private List<Integer> delProgram;
	
	public static class Program{
		private Integer clinicGroupingProgramId;
		private Integer programId;
		private String programName;
		private String programShortName;
		private String programNameEn;
		private String programShortNameEn;
		
		public Integer getClinicGroupingProgramId() {
			return this.clinicGroupingProgramId;
		}
	
		public void setClinicGroupingProgramId(Integer clinicGroupingProgramId) {
			this.clinicGroupingProgramId = clinicGroupingProgramId;
		}
		public Integer getProgramId() {
			return this.programId;
		}

		public void setProgramId(Integer programId) {
			this.programId = programId;
		}

		public String getProgramName() {
			return this.programName;
		}

		public void setProgramName(String programName) {
			this.programName = programName;
		}

		public String getProgramShortName() {
			return this.programShortName;
		}

		public void setProgramShortName(String programShortName) {
			this.programShortName = programShortName;
		}

		public String getProgramNameEn() {
			return this.programNameEn;
		}

		public void setProgramNameEn(String programNameEn) {
			this.programNameEn = programNameEn;
		}

		public String getProgramShortNameEn() {
			return this.programShortNameEn;
		}

		public void setProgramShortNameEn(String programShortNameEn) {
			this.programShortNameEn = programShortNameEn;
		}
	}
	public static class StdntLevel{
		private Integer stdntLevelId;
		private String descr;
		
		public Integer getStdntLevelId() {
			return this.stdntLevelId;
		}

		public void setStdntLevelId(Integer stdntLevelId) {
			this.stdntLevelId = stdntLevelId;
		}

		public String getDescr() {
			return this.descr;
		}

		public void setDescr(String descr) {
			this.descr = descr;
		}
	}
	
	
//	public int getClinicGroupingProgramId() {
//		return this.clinicGroupingProgramId;
//	}
//
//	public void setClinicGroupingProgramId(int clinicGroupingProgramId) {
//		this.clinicGroupingProgramId = clinicGroupingProgramId;
//	}

	public List<Program> getProgramList() {
		return this.programList;
	}

	public void setProgramList(List<Program> programList) {
		this.programList = programList;
	}

	public StdntLevel getStdntLevel() {
		return this.stdntLevel;
	}

	public void setStdntLevel(StdntLevel stdntLevel) {
		this.stdntLevel = stdntLevel;
	}

	public List<Integer> getDelProgram() {
		return delProgram;
	}

	public void setDelProgram(List<Integer> delProgram) {
		this.delProgram = delProgram;
	}


	
	
}
