package com.med.ods.entity;
// Generated Oct 18, 2017 1:50:37 PM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ResearchCategoryTbl generated by hbm2java
 */
@Entity
@Table(name = "RESEARCH_CATEGORY_TBL")
public class ResearchCategoryTbl implements java.io.Serializable {

	private int categoryId;
	private String categoryName;
	private String categoryNameEn;
	private Set<ResearchTbl> researchTbls = new HashSet<ResearchTbl>(0);

	public ResearchCategoryTbl() {
	}

	public ResearchCategoryTbl(int categoryId) {
		this.categoryId = categoryId;
	}

	public ResearchCategoryTbl(int categoryId, String categoryName, String categoryNameEn,
			Set<ResearchTbl> researchTbls) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryNameEn = categoryNameEn;
		this.researchTbls = researchTbls;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "CATEGORY_NAME")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "CATEGORY_NAME_EN")
	public String getCategoryNameEn() {
		return this.categoryNameEn;
	}

	public void setCategoryNameEn(String categoryNameEn) {
		this.categoryNameEn = categoryNameEn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "researchCategoryTbl")
	public Set<ResearchTbl> getResearchTbls() {
		return this.researchTbls;
	}

	public void setResearchTbls(Set<ResearchTbl> researchTbls) {
		this.researchTbls = researchTbls;
	}

}
