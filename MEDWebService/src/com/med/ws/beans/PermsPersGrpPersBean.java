package com.med.ws.beans;

import java.util.List;

public class PermsPersGrpPersBean {
	String grpId;
	String grpName;
	String grpDesc;
	String type;

	List<PermGrpDetail> listPerson;


	public String getGrpId() {
		return grpId;
	}

	public void setGrpId(String grpId) {
		this.grpId = grpId;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getGrpDesc() {
		return grpDesc;
	}

	public void setGrpDesc(String grpDesc) {
		this.grpDesc = grpDesc;
	}

	public List<PermGrpDetail> getListPerson() {
		return listPerson;
	}

	public void setListPerson(List<PermGrpDetail> listPerson) {
		this.listPerson = listPerson;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
