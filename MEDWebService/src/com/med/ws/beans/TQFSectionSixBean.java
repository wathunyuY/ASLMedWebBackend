package com.med.ws.beans;

import java.util.List;

public class TQFSectionSixBean {
	
	private List<TqfRefBean> mainBooks;
	private List<TqfRefBean> imptBooks;
	private List<TqfRefBean> rcmdBooks;
	private List<TqfRefBean> mainWebsites;
	private List<TqfRefBean> imptWebsites;
	private List<TqfRefBean> rcmdWebsites;
	
	public static class TqfRefBean{
		private String type;
		private String key;
		private String refZone;
		private String refAuthor;
		private String refTitle;
		private String refLocation;
		private String refPublishDetail;
		private Integer refYear;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getRefZone() {
			return refZone;
		}
		public void setRefZone(String refZone) {
			this.refZone = refZone;
		}
		public String getRefAuthor() {
			return refAuthor;
		}
		public void setRefAuthor(String refAuthor) {
			this.refAuthor = refAuthor;
		}
		public String getRefTitle() {
			return refTitle;
		}
		public void setRefTitle(String refTitle) {
			this.refTitle = refTitle;
		}
		public String getRefLocation() {
			return refLocation;
		}
		public void setRefLocation(String refLocation) {
			this.refLocation = refLocation;
		}
		public String getRefPublishDetail() {
			return refPublishDetail;
		}
		public void setRefPublishDetail(String refPublishDetail) {
			this.refPublishDetail = refPublishDetail;
		}
		public Integer getRefYear() {
			return refYear;
		}
		public void setRefYear(Integer refYear) {
			this.refYear = refYear;
		}
	}

	public List<TqfRefBean> getMainBooks() {
		return mainBooks;
	}

	public void setMainBooks(List<TqfRefBean> mainBooks) {
		this.mainBooks = mainBooks;
	}

	public List<TqfRefBean> getImptBooks() {
		return imptBooks;
	}

	public void setImptBooks(List<TqfRefBean> imptBooks) {
		this.imptBooks = imptBooks;
	}

	public List<TqfRefBean> getRcmdBooks() {
		return rcmdBooks;
	}

	public void setRcmdBooks(List<TqfRefBean> rcmdBooks) {
		this.rcmdBooks = rcmdBooks;
	}

	public List<TqfRefBean> getMainWebsites() {
		return mainWebsites;
	}

	public void setMainWebsites(List<TqfRefBean> mainWebsites) {
		this.mainWebsites = mainWebsites;
	}

	public List<TqfRefBean> getImptWebsites() {
		return imptWebsites;
	}

	public void setImptWebsites(List<TqfRefBean> imptWebsites) {
		this.imptWebsites = imptWebsites;
	}

	public List<TqfRefBean> getRcmdWebsites() {
		return rcmdWebsites;
	}

	public void setRcmdWebsites(List<TqfRefBean> rcmdWebsites) {
		this.rcmdWebsites = rcmdWebsites;
	}
	
}
