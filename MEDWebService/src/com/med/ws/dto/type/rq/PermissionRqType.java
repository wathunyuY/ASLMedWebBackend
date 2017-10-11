package com.med.ws.dto.type.rq;

import com.med.ws.beans.PermsListBean;
import com.med.ws.beans.PermsPersGrpBean;

public class PermissionRqType {
	protected PermsPersGrpBean group;
	protected PermsListBean permsList;

	public PermsPersGrpBean getGroup() {
		return group;
	}

	public void setGroup(PermsPersGrpBean group) {
		this.group = group;
	}

	public PermsListBean getPermsList() {
		return permsList;
	}

	public void setPermsList(PermsListBean permsList) {
		this.permsList = permsList;
	}

}
