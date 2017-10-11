package com.med.ods.entity;
// Generated Aug 31, 2017 2:07:20 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotiSubscrPersonId generated by hbm2java
 */
@Embeddable
public class NotiSubscrPersonId implements java.io.Serializable {

	private String subscrId;
	private int persLoginDevice;

	public NotiSubscrPersonId() {
	}

	public NotiSubscrPersonId(String subscrId, int persLoginDevice) {
		this.subscrId = subscrId;
		this.persLoginDevice = persLoginDevice;
	}

	@Column(name = "SUBSCR_ID", nullable = false)
	public String getSubscrId() {
		return this.subscrId;
	}

	public void setSubscrId(String subscrId) {
		this.subscrId = subscrId;
	}

	@Column(name = "PERS_LOGIN_DEVICE", nullable = false)
	public int getPersLoginDevice() {
		return this.persLoginDevice;
	}

	public void setPersLoginDevice(int persLoginDevice) {
		this.persLoginDevice = persLoginDevice;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NotiSubscrPersonId))
			return false;
		NotiSubscrPersonId castOther = (NotiSubscrPersonId) other;

		return ((this.getSubscrId() == castOther.getSubscrId()) || (this.getSubscrId() != null
				&& castOther.getSubscrId() != null && this.getSubscrId().equals(castOther.getSubscrId())))
				&& (this.getPersLoginDevice() == castOther.getPersLoginDevice());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSubscrId() == null ? 0 : this.getSubscrId().hashCode());
		result = 37 * result + this.getPersLoginDevice();
		return result;
	}

}
