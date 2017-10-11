package com.med.ws.beans;

import java.util.List;

public class PrefixTypeBean {
	private Integer prefixTypeId;
	private String desc;
	private List<PrefixBean> prefixCdList;
	public Integer getPrefixTypeId() {
		return prefixTypeId;
	}
	public void setPrefixTypeId(Integer prefixTypeId) {
		this.prefixTypeId = prefixTypeId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<PrefixBean> getPrefixCdList() {
		return prefixCdList;
	}
	public void setPrefixCdList(List<PrefixBean> prefixCdList) {
		this.prefixCdList = prefixCdList;
	}
	
}
