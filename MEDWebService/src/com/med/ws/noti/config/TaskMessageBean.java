package com.med.ws.noti.config;

import java.util.Date;

import com.med.common.contants.NotificationTypeConstants;
import com.med.ws.beans.TaskBean;

public class TaskMessageBean extends AbstractMessage{
	public TaskMessageBean(Integer id, Integer owner, Date created, NotificationTypeConstants type) {
		super(id, owner, created, type);
	}
	private String title;
	private Boolean read;
	private TaskBean task;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public TaskBean getTask() {
		return task;
	}
	public void setTask(TaskBean task) {
		this.task = task;
	}
	public Boolean getRead() {
		return read;
	}
	public void setRead(Boolean read) {
		this.read = read;
	}
}