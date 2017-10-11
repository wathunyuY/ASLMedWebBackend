package com.med.ws.noti.config;

import java.util.Date;

import com.med.common.contants.NotificationTypeConstants;

public abstract class AbstractMessage {
	private Integer id;
	private Integer owner;
	private Date created_at;
	private NotificationTypeConstants type;
	public AbstractMessage(Integer id, Integer owner, Date created, NotificationTypeConstants type){
		this.id = id;
		this.owner = owner;
		this.created_at = created;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOwner() {
		return owner;
	}
	public void setOwner(Integer owner) {
		this.owner = owner;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public NotificationTypeConstants getType() {
		return type;
	}
	public void setType(NotificationTypeConstants type) {
		this.type = type;
	}
	
}
