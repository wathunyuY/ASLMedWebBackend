package com.med.ws.dto.type.rq;

import java.util.Date;
import java.util.Map;

public class HomeworkReport {
	String fullReportId;
	Map<String, Object> header;
	Map<String, Object> rpHeader;
	String empCode;
	String empName;
	String stdntCode;
	String classSection;
	String status;
	String stdntName;
	Integer sectionId;
	Integer rpId;
	Integer seq;
	Long totalReport;
	String picPath;
	Date recieveDate;
	Date evaluateDate;
	Date submitDate;
	String remark;
	Date date;

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public Map<String, Object> getHeader() {
		return header;
	}

	public void setHeader(Map<String, Object> header) {
		this.header = header;
	}

	public String getStdntCode() {
		return stdntCode;
	}

	public void setStdntCode(String stdntCode) {
		this.stdntCode = stdntCode;
	}

	public Integer getRpId() {
		return rpId;
	}

	public void setRpId(Integer rpId) {
		this.rpId = rpId;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStdntName() {
		return stdntName;
	}

	public void setStdntName(String stdntName) {
		this.stdntName = stdntName;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public Date getRecieveDate() {
		return recieveDate;
	}

	public void setRecieveDate(Date recieveDate) {
		this.recieveDate = recieveDate;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getEvaluateDate() {
		return evaluateDate;
	}

	public void setEvaluateDate(Date evaluateDate) {
		this.evaluateDate = evaluateDate;
	}

	public String getFullReportId() {
		return fullReportId;
	}

	public void setFullReportId(String fullReportId) {
		this.fullReportId = fullReportId;
	}

	public Map<String, Object> getRpHeader() {
		return rpHeader;
	}

	public void setRpHeader(Map<String, Object> rpHeader) {
		this.rpHeader = rpHeader;
	}

	public Long getTotalReport() {
		return totalReport;
	}

	public void setTotalReport(Long totalReport) {
		this.totalReport = totalReport;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


}
