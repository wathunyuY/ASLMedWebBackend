package com.med.ws.dto.type.rs;

import java.util.Date;
import java.util.List;

public class SuggestTimeSlotRsType {
	private List<SlotBean> slots;
	
	public static class SlotBean{
		Date date;
		Date start;
		Date end;
		Integer studentCount;
		Integer teacherCount;
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Date getStart() {
			return start;
		}
		public void setStart(Date start) {
			this.start = start;
		}
		public Date getEnd() {
			return end;
		}
		public void setEnd(Date end) {
			this.end = end;
		}
		public Integer getStudentCount() {
			return studentCount;
		}
		public void setStudentCount(Integer studentCount) {
			this.studentCount = studentCount;
		}
		public Integer getTeacherCount() {
			return teacherCount;
		}
		public void setTeacherCount(Integer teacherCount) {
			this.teacherCount = teacherCount;
		}
		
	}

	public List<SlotBean> getSlots() {
		return slots;
	}

	public void setSlots(List<SlotBean> slots) {
		this.slots = slots;
	}
	
}
