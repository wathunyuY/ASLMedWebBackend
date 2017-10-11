package com.med.ws.dto.type.rs;

import java.util.List;

public class ApplicationFormGetAllRsType {
	List<ApplicationFormRsType> recent;
	List<ApplicationFormRsType> history;
	public List<ApplicationFormRsType> getRecent() {
		return recent;
	}
	public void setRecent(List<ApplicationFormRsType> recent) {
		this.recent = recent;
	}
	public List<ApplicationFormRsType> getHistory() {
		return history;
	}
	public void setHistory(List<ApplicationFormRsType> history) {
		this.history = history;
	}
	
}
