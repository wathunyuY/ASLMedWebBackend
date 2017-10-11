package com.med.ws.dto.type.rs;

public class ScheduleLessonRsType {

	private Integer scheduleLessonId;
	private String title;
	private String subSectionCode;
	private String subSectionNumCode;
	private String start;
	private String end;
	private String color;
	
	public Integer getScheduleLessonId() {
		return scheduleLessonId;
	}
	public void setScheduleLessonId(Integer scheduleLessonId) {
		this.scheduleLessonId = scheduleLessonId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubSectionCode() {
		return subSectionCode;
	}
	public void setSubSectionCode(String subSectionCode) {
		this.subSectionCode = subSectionCode;
	}
	public String getSubSectionNumCode() {
		return subSectionNumCode;
	}
	public void setSubSectionNumCode(String subSectionNumCode) {
		this.subSectionNumCode = subSectionNumCode;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
