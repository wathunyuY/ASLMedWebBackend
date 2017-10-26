package com.med.ods.entity;
// Generated Oct 23, 2017 6:41:17 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotiPersonSubscrId generated by hbm2java
 */
@Embeddable
public class NotiPersonSubscrId implements java.io.Serializable {

	private int subscrId;
	private int persId;

	public NotiPersonSubscrId() {
	}

	public NotiPersonSubscrId(int subscrId, int persId) {
		this.subscrId = subscrId;
		this.persId = persId;
	}

	@Column(name = "SUBSCR_ID", nullable = false)
	public int getSubscrId() {
		return this.subscrId;
	}

	public void setSubscrId(int subscrId) {
		this.subscrId = subscrId;
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
		if (!(other instanceof NotiPersonSubscrId))
			return false;
		NotiPersonSubscrId castOther = (NotiPersonSubscrId) other;

		return (this.getSubscrId() == castOther.getSubscrId()) && (this.getPersId() == castOther.getPersId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSubscrId();
		result = 37 * result + this.getPersId();
		return result;
	}

}