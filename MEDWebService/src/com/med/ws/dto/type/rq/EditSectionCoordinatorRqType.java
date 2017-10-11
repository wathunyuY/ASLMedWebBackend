package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.dto.type.rs.ClassDetailDTO.SectionCoordinateBean;

public class EditSectionCoordinatorRqType {
	private List<SectionCoordinateBean> sectionList;

	public List<SectionCoordinateBean> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<SectionCoordinateBean> sectionList) {
		this.sectionList = sectionList;
	}
	
}
