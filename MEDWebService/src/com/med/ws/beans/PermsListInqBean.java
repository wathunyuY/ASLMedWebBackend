package com.med.ws.beans;

import java.util.List;


public class PermsListInqBean {

	String permsTblId;
	String desc;
	String listName;
	List<PermsListDetail> permsListDetail;

	public String getPermsListTblId() {
		return permsTblId;
	}

	public void setPermsListTblId(String permsTblId) {
		this.permsTblId = permsTblId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPermsTblId() {
		return permsTblId;
	}

	public void setPermsTblId(String permsTblId) {
		this.permsTblId = permsTblId;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<PermsListDetail> getPermsListDetail() {
		return permsListDetail;
	}

	public void setPermsListDetail(List<PermsListDetail> permsListDetail) {
		this.permsListDetail = permsListDetail;
	}

}
