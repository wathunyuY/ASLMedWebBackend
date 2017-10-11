package com.med.ws.dto.type.rq;

import java.util.List;

public class GroupingStdntProgramRqType {
	
	protected List<GroupStdntProgramBean> groupStdntProgramBeanList;
	protected List<StdntConditionBean> stdntConditionList;
	
	
	public List<GroupStdntProgramBean> getGroupStdntProgramBeanList() {
		return groupStdntProgramBeanList;
	}

	public void setGroupStdntProgramBeanList(List<GroupStdntProgramBean> groupStdntProgramBeanList) {
		this.groupStdntProgramBeanList = groupStdntProgramBeanList;
	}

	public List<StdntConditionBean> getStdntConditionList() {
		return stdntConditionList;
	}

	public void setStdntConditionList(List<StdntConditionBean> stdntConditionList) {
		this.stdntConditionList = stdntConditionList;
	}

	public static class GroupStdntProgramBean {
		
		protected List<Integer> programIdList;
		protected Integer totalGroup;
		
		public List<Integer> getProgramIdList() {
			return programIdList;
		}
		public void setProgramIdList(List<Integer> programIdList) {
			this.programIdList = programIdList;
		}
		public Integer getTotalGroup() {
			return totalGroup;
		}
		public void setTotalGroup(Integer totalGroup) {
			this.totalGroup = totalGroup;
		}
	}
	
	public static class StdntConditionBean {
		protected String stdntCode1;
		protected String stdntCode2;
		
		public String getStdntCode1() {
			return stdntCode1;
		}
		public void setStdntCode1(String stdntCode1) {
			this.stdntCode1 = stdntCode1;
		}
		public String getStdntCode2() {
			return stdntCode2;
		}
		public void setStdntCode2(String stdntCode2) {
			this.stdntCode2 = stdntCode2;
		}
		
		
	}
}
