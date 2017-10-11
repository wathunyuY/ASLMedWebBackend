package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ReportSummaryBean {
	String stdntName;
	String stdntCode;
	String teacherName;
	Integer reportRecieved = 0;
	Integer reportTeacherEvaluated = 0;
	Integer progressNoteRecieved = 0;
	Integer progressNoteTeacherEvaluated = 0;
	List<ReportDetail> reportDetail;
	List<ReportDetail> progressNoteDetail;

	@JsonInclude(Include.NON_NULL)
	public static class ReportDetail {
		String teacherName;
		String stdntName;
		String reportId;
		Boolean status;
		String tel;

		public String getTeacherName() {
			return teacherName;
		}

		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}

		public String getReportId() {
			return reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		@Override
		public String toString() {
			return "ReportDetail [teacherName=" + teacherName + ", reportId=" + reportId + ", status=" + status + "]";
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getStdntName() {
			return stdntName;
		}

		public void setStdntName(String stdntName) {
			this.stdntName = stdntName;
		}
	}

	public String getStdntName() {
		return stdntName;
	}

	public void setStdntName(String stdntName) {
		this.stdntName = stdntName;
	}

	public String getStdntCode() {
		return stdntCode;
	}

	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}

	public Integer getReportRecieved() {
		return reportRecieved;
	}

	public void setReportRecieved(Integer reportRecieved) {
		this.reportRecieved = reportRecieved;
	}

	public Integer getReportTeacherEvaluated() {
		return reportTeacherEvaluated;
	}

	public void setReportTeacherEvaluated(Integer reportTeacherEvaluated) {
		this.reportTeacherEvaluated = reportTeacherEvaluated;
	}

	public Integer getProgressNoteRecieved() {
		return progressNoteRecieved;
	}

	public void setProgressNoteRecieved(Integer progressNoteRecieved) {
		this.progressNoteRecieved = progressNoteRecieved;
	}

	public Integer getProgressNoteTeacherEvaluated() {
		return progressNoteTeacherEvaluated;
	}

	public void setProgressNoteTeacherEvaluated(Integer progressNoteTeacherEvaluated) {
		this.progressNoteTeacherEvaluated = progressNoteTeacherEvaluated;
	}

	public List<ReportDetail> getReportDetail() {
		return reportDetail;
	}

	public void setReportDetail(List<ReportDetail> reportDetail) {
		this.reportDetail = reportDetail;
	}

	public List<ReportDetail> getProgressNoteDetail() {
		return progressNoteDetail;
	}

	public void setProgressNoteDetail(List<ReportDetail> progressNoteDetail) {
		this.progressNoteDetail = progressNoteDetail;
	}

	@Override
	public String toString() {
		return "ReportBean [stdntName=" + stdntName + ", stdntCode=" + stdntCode + ", reportRecieved=" + reportRecieved + ", reportTeacherEvaluated=" + reportTeacherEvaluated
				+ ", progressNoteRecieved=" + progressNoteRecieved + ", progressNoteTeacherEvaluated=" + progressNoteTeacherEvaluated + ", reportDetail=" + reportDetail + ", progressNoteDetail="
				+ progressNoteDetail + "]";
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}