package com.med.ws.dto.type.rs;

import java.util.List;


public class SectionReportSummatyBean {
	String sectionOrder;
	List<ReportSummaryBean> reportSummaryList;
	String evaluationReportName;
	String evaluationProgressNoteName;
	String desc;
	
	public String getSectionOrder() {
		return sectionOrder;
	}
	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}
	public List<ReportSummaryBean> getReportSummaryList() {
		return reportSummaryList;
	}
	public void setReportSummaryList(List<ReportSummaryBean> reportSummaryList) {
		this.reportSummaryList = reportSummaryList;
	}
	public String getEvaluationReportName() {
		return evaluationReportName;
	}
	public void setEvaluationReportName(String evaluationReportName) {
		this.evaluationReportName = evaluationReportName;
	}
	public String getEvaluationProgressNoteName() {
		return evaluationProgressNoteName;
	}
	public void setEvaluationProgressNoteName(String evaluationProgressNoteName) {
		this.evaluationProgressNoteName = evaluationProgressNoteName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}