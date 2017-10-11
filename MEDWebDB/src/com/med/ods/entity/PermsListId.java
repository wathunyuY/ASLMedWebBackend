package com.med.ods.entity;
// Generated Dec 19, 2016 4:16:39 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PermsListId generated by hbm2java
 */
@Embeddable
public class PermsListId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5603144245466526233L;
	private String permsListId;
	private String permsId;

	public PermsListId() {
	}

	public PermsListId(String permsListId, String permsId) {
		this.permsListId = permsListId;
		this.permsId = permsId;
	}

	@Column(name = "PERMS_LIST_ID", nullable = false, length = 10)
	public String getPermsListId() {
		return this.permsListId;
	}

	public void setPermsListId(String permsListId) {
		this.permsListId = permsListId;
	}

	@Column(name = "PERMS_ID", nullable = false, length = 10)
	public String getPermsId() {
		return this.permsId;
	}

	public void setPermsId(String permsId) {
		this.permsId = permsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PermsListId))
			return false;
		PermsListId castOther = (PermsListId) other;

		return ((this.getPermsListId() == castOther.getPermsListId()) || (this.getPermsListId() != null
				&& castOther.getPermsListId() != null && this.getPermsListId().equals(castOther.getPermsListId())))
				&& ((this.getPermsId() == castOther.getPermsId()) || (this.getPermsId() != null
						&& castOther.getPermsId() != null && this.getPermsId().equals(castOther.getPermsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPermsListId() == null ? 0 : this.getPermsListId().hashCode());
		result = 37 * result + (getPermsId() == null ? 0 : this.getPermsId().hashCode());
		return result;
	}

}
