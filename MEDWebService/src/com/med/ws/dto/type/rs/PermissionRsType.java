package com.med.ws.dto.type.rs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.PermsBean;
import com.med.ws.beans.PermsListInqBean;
import com.med.ws.beans.PermsPersBean;
import com.med.ws.beans.PermsPersGrpInqBean;
import com.med.ws.beans.PermsPersGrpPersBean;

@JsonInclude(Include.NON_NULL)
public class PermissionRsType {
	private List<PermsPersBean> personList;
	private List<PermsListInqBean> permsLists;
	private List<PermsBean> perms;
	private List<PermsPersGrpInqBean> permsPerGrp;
	private PermsListInqBean permsList;
	private PermsPersGrpPersBean permsPerGrpPers;
	
	public PermsPersGrpPersBean getPermsPerGrpPers() {
		return permsPerGrpPers;
	}

	public void setPermsPerGrpPers(PermsPersGrpPersBean permsPerGrpPers) {
		this.permsPerGrpPers = permsPerGrpPers;
	}

	public List<PermsPersBean> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PermsPersBean> personList) {
		this.personList = personList;
	}

	public List<PermsListInqBean> getPermsLists() {
		return permsLists;
	}

	public void setPermsLists(List<PermsListInqBean> permsLists) {
		this.permsLists = permsLists;
	}

	public List<PermsBean> getPerms() {
		return perms;
	}

	public void setPerms(List<PermsBean> perms) {
		this.perms = perms;
	}

	public List<PermsPersGrpInqBean> getPermsPerGrp() {
		return permsPerGrp;
	}

	public void setPermsPerGrp(List<PermsPersGrpInqBean> permsPerGrp) {
		this.permsPerGrp = permsPerGrp;
	}

	public PermsListInqBean getPermsList() {
		return permsList;
	}

	public void setPermsList(PermsListInqBean permsList) {
		this.permsList = permsList;
	}


}
