package com.med.ws.dto.type.rs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.med.ws.beans.CrseBean;
import com.med.ws.beans.TQFSectionFiveBean;
import com.med.ws.beans.TQFSectionFourBean;
import com.med.ws.beans.TQFSectionSevenBean;
import com.med.ws.beans.TQFSectionSixBean;
import com.med.ws.beans.TQFSectionThreeBean;
import com.med.ws.beans.TQFSectionTwoBean;

@JsonInclude(Include.NON_NULL)
public class TQFSectionType {
	// PK
	private Integer crseOfferNbr;
	private String classSection;
	// Section
	private CrseBean sectionOne;
	private TQFSectionTwoBean sectionTwo;
	private TQFSectionThreeBean sectionThree;
	private TQFSectionFourBean sectionFour;
	private TQFSectionFiveBean sectionFive;
	private TQFSectionSixBean sectionSix;
	private TQFSectionSevenBean sectionSeven;
	public Integer getCrseOfferNbr() {
		return crseOfferNbr;
	}
	public void setCrseOfferNbr(Integer crseOfferNbr) {
		this.crseOfferNbr = crseOfferNbr;
	}
	public CrseBean getSectionOne() {
		return sectionOne;
	}
	public void setSectionOne(CrseBean sectionOne) {
		this.sectionOne = sectionOne;
	}
	public TQFSectionTwoBean getSectionTwo() {
		return sectionTwo;
	}
	public void setSectionTwo(TQFSectionTwoBean sectionTwo) {
		this.sectionTwo = sectionTwo;
	}
	public TQFSectionThreeBean getSectionThree() {
		return sectionThree;
	}
	public void setSectionThree(TQFSectionThreeBean sectionThree) {
		this.sectionThree = sectionThree;
	}
	public TQFSectionFourBean getSectionFour() {
		return sectionFour;
	}
	public void setSectionFour(TQFSectionFourBean sectionFour) {
		this.sectionFour = sectionFour;
	}
	public TQFSectionFiveBean getSectionFive() {
		return sectionFive;
	}
	public void setSectionFive(TQFSectionFiveBean sectionFive) {
		this.sectionFive = sectionFive;
	}
	public TQFSectionSixBean getSectionSix() {
		return sectionSix;
	}
	public void setSectionSix(TQFSectionSixBean sectionSix) {
		this.sectionSix = sectionSix;
	}
	public TQFSectionSevenBean getSectionSeven() {
		return sectionSeven;
	}
	public void setSectionSeven(TQFSectionSevenBean sectionSeven) {
		this.sectionSeven = sectionSeven;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

}
