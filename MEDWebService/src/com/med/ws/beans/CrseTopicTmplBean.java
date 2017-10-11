package com.med.ws.beans;

import java.util.List;

import com.med.ws.dto.type.rq.CrseTopicDetailType;

public class CrseTopicTmplBean {
	private String tmplNbr;
	private List<CrseTopicDetailType> tmpl;
	
	public String getTmplNbr() {
		return tmplNbr;
	}

	public void setTmplNbr(String tmplNbr) {
		this.tmplNbr = tmplNbr;
	}

	public List<CrseTopicDetailType> getTmpl() {
		return tmpl;
	}

	public void setTmpl(List<CrseTopicDetailType> tmpl) {
		this.tmpl = tmpl;
	}
	
}
