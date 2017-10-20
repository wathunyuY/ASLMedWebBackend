package com.med.ods.entity;
// Generated Aug 24, 2017 6:22:56 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NotiLog generated by hbm2java
 */
@Entity
@Table(name = "NOTI_LOG")
public class NotiLog implements java.io.Serializable {

	private NotiLogId id;
	private Boolean reads;

	public NotiLog() {
	}

	public NotiLog(NotiLogId id) {
		this.id = id;
	}

	public NotiLog(NotiLogId id, Boolean reads) {
		this.id = id;
		this.reads = reads;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "persId", column = @Column(name = "PERS_ID", nullable = false)),
			@AttributeOverride(name = "notiId", column = @Column(name = "NOTI_ID", nullable = false)) })
	public NotiLogId getId() {
		return this.id;
	}

	public void setId(NotiLogId id) {
		this.id = id;
	}

	@Column(name = "READS")
	public Boolean getRead() {
		return this.reads;
	}

	public void setRead(Boolean reads) {
		this.reads = reads;
	}

}
