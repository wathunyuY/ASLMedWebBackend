package com.med.asl.ws.beans;

import java.util.Date;

import com.med.ods.entity.ResearchCategoryTbl;

public class ResearchBean {
	private Integer researchId;
	private Integer categoryId;
	private ResearchCategoryBean category;
	private String researchName;
	private String researchSymbol;
	private String researchDescr;
	private String researchHeader;
	private Integer researchRecommendStat;
	private String researchTragetPrice;
	private String researchMarketPrice;
	private Date researchCreateDate;
	private String researchPicture;
	private String researchAuthor;
	private Integer lastUpdOprid;
	private Date lastUpdDttm;
	public Integer getResearchId() {
		return researchId;
	}
	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getResearchName() {
		return researchName;
	}
	public void setResearchName(String researchName) {
		this.researchName = researchName;
	}
	public String getResearchSymbol() {
		return researchSymbol;
	}
	public void setResearchSymbol(String researchSymbol) {
		this.researchSymbol = researchSymbol;
	}
	public String getResearchDescr() {
		return researchDescr;
	}
	public void setResearchDescr(String researchDescr) {
		this.researchDescr = researchDescr;
	}
	public String getResearchHeader() {
		return researchHeader;
	}
	public void setResearchHeader(String researchHeader) {
		this.researchHeader = researchHeader;
	}
	public Integer getResearchRecommendStat() {
		return researchRecommendStat;
	}
	public void setResearchRecommendStat(Integer researchRecommendStat) {
		this.researchRecommendStat = researchRecommendStat;
	}
	public String getResearchTragetPrice() {
		return researchTragetPrice;
	}
	public void setResearchTragetPrice(String researchTragetPrice) {
		this.researchTragetPrice = researchTragetPrice;
	}
	public String getResearchMarketPrice() {
		return researchMarketPrice;
	}
	public void setResearchMarketPrice(String researchMarketPrice) {
		this.researchMarketPrice = researchMarketPrice;
	}
	public Date getResearchCreateDate() {
		return researchCreateDate;
	}
	public void setResearchCreateDate(Date researchCreateDate) {
		this.researchCreateDate = researchCreateDate;
	}
	public String getResearchPicture() {
		return researchPicture;
	}
	public void setResearchPicture(String researchPicture) {
		this.researchPicture = researchPicture;
	}
	public String getResearchAuthor() {
		return researchAuthor;
	}
	public void setResearchAuthor(String researchAuthor) {
		this.researchAuthor = researchAuthor;
	}
	public Integer getLastUpdOprid() {
		return lastUpdOprid;
	}
	public void setLastUpdOprid(Integer lastUpdOprid) {
		this.lastUpdOprid = lastUpdOprid;
	}
	public Date getLastUpdDttm() {
		return lastUpdDttm;
	}
	public void setLastUpdDttm(Date lastUpdDttm) {
		this.lastUpdDttm = lastUpdDttm;
	}
	public ResearchCategoryBean getCategory() {
		return category;
	}
	public void setCategory(ResearchCategoryBean category) {
		this.category = category;
	}
	
	
	
}
