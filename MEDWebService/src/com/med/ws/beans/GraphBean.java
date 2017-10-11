package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GraphBean {
	private Integer sectionId;
	private String graphName;
	private String graphType;
	private GraphData graphData;
	
	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getGraphName() {
		return graphName;
	}

	public void setGraphName(String graphName) {
		this.graphName = graphName;
	}


	public String getGraphType() {
		return graphType;
	}


	public void setGraphType(String graphType) {
		this.graphType = graphType;
	}


	public GraphData getGraphData() {
		return graphData;
	}


	public void setGraphData(GraphData graphData) {
		this.graphData = graphData;
	}


	public static class GraphData{
		private List<String> series;
		private List<String> labels;
		private List<Integer> result;
		public List<String> getLabels() {
			return labels;
		}
		public void setLabels(List<String> labels) {
			this.labels = labels;
		}
		public List<Integer> getResult() {
			return result;
		}
		public void setResult(List<Integer> result) {
			this.result = result;
		}
		public List<String> getSeries() {
			return series;
		}
		public void setSeries(List<String> series) {
			this.series = series;
		}
		
	}
}
