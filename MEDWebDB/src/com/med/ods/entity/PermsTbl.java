package com.med.ods.entity;
// Generated Mar 23, 2017 4:05:48 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PermsTbl generated by hbm2java
 */
@Entity
@Table(name = "PERMS_TBL")
public class PermsTbl implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3573132711210894685L;
	private String permsId;
	private Boolean actStatus;
	private String descr;
	private String menuParent;
	private String menuType;
	private Date lastUpdDttm;
	private Integer lastUpdOprid;
	private Set<PermsMapPermsEndpoint> permsMapPermsEndpoints = new HashSet<PermsMapPermsEndpoint>(0);
	private Set<PermsList> permsLists = new HashSet<PermsList>(0);

	public PermsTbl() {
	}

	public PermsTbl(String permsId) {
		this.permsId = permsId;
	}

	public PermsTbl(String permsId, Boolean actStatus, String descr, String menuParent, String menuType,
			Date lastUpdDttm, Integer lastUpdOprid, Set<PermsMapPermsEndpoint> permsMapPermsEndpoints,
			Set<PermsList> permsLists) {
		this.permsId = permsId;
		this.actStatus = actStatus;
		this.descr = descr;
		this.menuParent = menuParent;
		this.menuType = menuType;
		this.lastUpdDttm = lastUpdDttm;
		this.lastUpdOprid = lastUpdOprid;
		this.permsMapPermsEndpoints = permsMapPermsEndpoints;
		this.permsLists = permsLists;
	}

	@Id

	@Column(name = "PERMS_ID", unique = true, nullable = false, length = 10)
	public String getPermsId() {
		return this.permsId;
	}

	public void setPermsId(String permsId) {
		this.permsId = permsId;
	}

	@Column(name = "ACT_STATUS")
	public Boolean getActStatus() {
		return this.actStatus;
	}

	public void setActStatus(Boolean actStatus) {
		this.actStatus = actStatus;
	}

	@Column(name = "DESCR")
	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Column(name = "MENU_PARENT", length = 10)
	public String getMenuParent() {
		return this.menuParent;
	}

	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}

	@Column(name = "MENU_TYPE", length = 10)
	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPD_DTTM", length = 19)
	public Date getLastUpdDttm() {
		return this.lastUpdDttm;
	}

	public void setLastUpdDttm(Date lastUpdDttm) {
		this.lastUpdDttm = lastUpdDttm;
	}

	@Column(name = "LAST_UPD_OPRID")
	public Integer getLastUpdOprid() {
		return this.lastUpdOprid;
	}

	public void setLastUpdOprid(Integer lastUpdOprid) {
		this.lastUpdOprid = lastUpdOprid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permsTbl")
	public Set<PermsMapPermsEndpoint> getPermsMapPermsEndpoints() {
		return this.permsMapPermsEndpoints;
	}

	public void setPermsMapPermsEndpoints(Set<PermsMapPermsEndpoint> permsMapPermsEndpoints) {
		this.permsMapPermsEndpoints = permsMapPermsEndpoints;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permsTbl")
	public Set<PermsList> getPermsLists() {
		return this.permsLists;
	}

	public void setPermsLists(Set<PermsList> permsLists) {
		this.permsLists = permsLists;
	}

}