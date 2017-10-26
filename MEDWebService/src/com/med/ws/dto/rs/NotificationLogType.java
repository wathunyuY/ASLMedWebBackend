package com.med.ws.dto.rs;

import java.util.Date;

import com.med.asl.ws.beans.NotificationDataParamBean;

public class NotificationLogType {
	private Integer id;
	private Integer owner;
	private Boolean read;
	private String notificationTitle;
	private String notificationBody;
	private String type;
	private NotificationDataParamBean dataDetail;
	private Date created_at;
	
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
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
	public String getNotificationTitle() {
		return notificationTitle;
	}
	public void setNotificationTitle(String notificationTitle) {
		this.notificationTitle = notificationTitle;
	}
	public String getNotificationBody() {
		return notificationBody;
	}
	public void setNotificationBody(String notificationBody) {
		this.notificationBody = notificationBody;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public NotificationDataParamBean getDataDetail() {
		return dataDetail;
	}
	public void setDataDetail(NotificationDataParamBean dataDetail) {
		this.dataDetail = dataDetail;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
}
