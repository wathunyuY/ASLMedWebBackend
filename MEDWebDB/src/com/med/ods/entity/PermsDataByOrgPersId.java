package com.med.ods.entity;
// Generated May 17, 2017 1:35:16 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PermsDataByOrgPersId generated by hbm2java
 */
@Embeddable
public class PermsDataByOrgPersId implements java.io.Serializable {

	private int permsDataByOrgId;
	private int persId;

	public PermsDataByOrgPersId() {
	}

	public PermsDataByOrgPersId(int permsDataByOrgId, int persId) {
		this.permsDataByOrgId = permsDataByOrgId;
		this.persId = persId;
	}

	@Column(name = "PERMS_DATA_BY_ORG_ID", nullable = false)
	public int getPermsDataByOrgId() {
		return this.permsDataByOrgId;
	}

	public void setPermsDataByOrgId(int permsDataByOrgId) {
		this.permsDataByOrgId = permsDataByOrgId;
	}

	@Column(name = "PERS_ID", nullable = false)
	public int getPersId() {
		return this.persId;
	}

	public void setPersId(int persId) {
		this.persId = persId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PermsDataByOrgPersId))
			return false;
		PermsDataByOrgPersId castOther = (PermsDataByOrgPersId) other;

		return (this.getPermsDataByOrgId() == castOther.getPermsDataByOrgId())
				&& (this.getPersId() == castOther.getPersId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPermsDataByOrgId();
		result = 37 * result + this.getPersId();
		return result;
	}

}
