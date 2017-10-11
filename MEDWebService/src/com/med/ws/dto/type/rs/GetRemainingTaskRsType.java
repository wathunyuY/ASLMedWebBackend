package com.med.ws.dto.type.rs;

import java.util.List;

import com.med.ws.beans.TaskBean;

public class GetRemainingTaskRsType {
	private List<TaskBean> taskList;

	public List<TaskBean> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<TaskBean> taskList) {
		this.taskList = taskList;
	}
	
}
