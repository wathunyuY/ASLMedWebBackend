package com.med.ws.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermsPersGrpBean {
	String grpId; // Group ID
	String grpName;
	String grpDesc;
	List<Integer> personIdInsert;
	List<Integer> personIdDelete;
	String permsListTblId;
	String type;

	@JsonCreator
	public PermsPersGrpBean(@JsonProperty(value = "grpId", required = true) String grpId) {
		this.grpId = grpId;
	}
	
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

	public List<Integer> getPersonIdInsert() {
		return personIdInsert;
	}

	public void setPersonIdInsert(List<Integer> personIdInsert) {
		this.personIdInsert = personIdInsert;
	}

	public List<Integer> getPersonIdDelete() {
		return personIdDelete;
	}

	public void setPersonIdDelete(List<Integer> personIdDelete) {
		this.personIdDelete = personIdDelete;
	}

	public String getPermsListTblId() {
		return permsListTblId;
	}

	public void setPermsListTblId(String permsListTblId) {
		this.permsListTblId = permsListTblId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
