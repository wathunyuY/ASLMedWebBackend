package com.med.ws.dto.type.rq;

import java.util.Date;

/**
 * <pre>
 *  data: {
 *       crseOfferNbr: "String",
 *       crseTitle: "String",
 *       crseTitleLong: "String",
 *       topicCount: Integer
 *   }
 * </pre>
 */
public class CrseOfferListType {
	Integer crseOfferNbr;
	String crseTitle;
	String crseTitleLong;
	String acadProgDescr;
	Integer topicCount;
	String catalogNbr;
	String crseEffDt;

	public Integer getCrseOfferNbr() {
		return crseOfferNbr;
	}

	public void setCrseOfferNbr(Integer crseOfferNbr) {
		this.crseOfferNbr = crseOfferNbr;
	}

	public String getCrseTitle() {
		return crseTitle;
	}

	public void setCrseTitle(String crseTitle) {
		this.crseTitle = crseTitle;
	}

	public String getCrseTitleLong() {
		return crseTitleLong;
	}

	public void setCrseTitleLong(String crseTitleLong) {
		this.crseTitleLong = crseTitleLong;
	}

	public Integer getTopicCount() {
		return topicCount;
	}

	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	public String getCatalogNbr() {
		return catalogNbr;
	}

	public void setCatalogNbr(String catalogNbr) {
		this.catalogNbr = catalogNbr;
	}

	public String getCrseEffDt() {
		return crseEffDt;
	}

	public void setCrseEffDt(String crseEffDt) {
		this.crseEffDt = crseEffDt;
	}

	public String getAcadProgDescr() {
		return acadProgDescr;
	}

	public void setAcadProgDescr(String acadProgDescr) {
		this.acadProgDescr = acadProgDescr;
	}

}
