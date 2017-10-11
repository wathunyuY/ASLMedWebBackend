package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.GraphBean;
import com.med.ws.beans.SectionBean;

public class EvaClassSummaryRsType {
	private String crseCode;
	private String crseName;
	private String dotStatus;
	private List<GraphBean> graph;
	private List<SectionBean> sections;
	public String getCrseCode() {
		return crseCode;
	}
	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}
	public String getCrseName() {
		return crseName;
	}
	public void setCrseName(String crseName) {
		this.crseName = crseName;
	}
	public List<GraphBean> getGraph() {
		return graph;
	}
	public void setGraph(List<GraphBean> graph) {
		this.graph = graph;
	}
	public List<SectionBean> getSections() {
		return sections;
	}
	public void setSections(List<SectionBean> sections) {
		this.sections = sections;
	}
	public String getDotStatus() {
		return dotStatus;
	}
	public void setDotStatus(String dotStatus) {
		this.dotStatus = dotStatus;
	}
}
