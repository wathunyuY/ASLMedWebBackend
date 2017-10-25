package com.med.ws.beans;

import java.util.Date;

import com.med.common.contants.NotificationTypeConstants;
import com.med.ws.noti.config.AbstractMessage;

public class ChatMsgBean extends AbstractMessage {

	public ChatMsgBean(Integer id, Integer owner, Date created, NotificationTypeConstants type) {
		super(id, owner, created, type);
	}
	private SenderDetail sender;
	private String msg;
	private Integer scheduleTopic;
	private String imagePath;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getScheduleTopic() {
		return scheduleTopic;
	}
	public void setScheduleTopic(Integer scheduleTopic) {
		this.scheduleTopic = scheduleTopic;
	}
	public SenderDetail getSender() {
		return sender;
	}
	public void setSender(SenderDetail sender) {
		this.sender = sender;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public static class SenderDetail{
		String name;
		String picpath;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPicpath() {
			return picpath;
		}

		public void setPicpath(String picpath) {
			this.picpath = picpath;
		}
		
	}
	
}
