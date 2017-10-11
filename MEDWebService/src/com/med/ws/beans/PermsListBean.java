package com.med.ws.beans;

import java.util.List;

public class PermsListBean {

	String permsListTblId;
	String desc;
	String listName;
	List<String> permsIdList;
	List<String> permsIdIns;
	List<String> permsIdDel;
	
	public String getPermsListTblId() {
		return permsListTblId;
	}

	public void setPermsListTblId(String permsTblId) {
		this.permsListTblId = permsTblId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPermsTblId() {
		return permsListTblId;
	}

	public void setPermsTblId(String permsTblId) {
		this.permsListTblId = permsTblId;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<String> getPermsIdList() {
		return permsIdList;
	}

	public void setPermsIdList(List<String> permsIdList) {
		this.permsIdList = permsIdList;
	}

	public List<String> getPermsIdIns() {
		return permsIdIns;
	}

	public void setPermsIdIns(List<String> permsIdIns) {
		this.permsIdIns = permsIdIns;
	}

	public List<String> getPermsIdDel() {
		return permsIdDel;
	}

	public void setPermsIdDel(List<String> permsIdDel) {
		this.permsIdDel = permsIdDel;
	}
}
