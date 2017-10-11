package com.med.ws.dto.type.rq;

import java.util.Date;
import java.util.List;

public class ClassTopicDetailType {
	Integer classTopicId;
	String classSection;
	String catalogNbr;
	Integer topicTypeId;
	String topicName;
	Integer hour;
	Integer minute;
	String topicObjective;
	String topicContent;
	String tmplNbr;
//	String descr;
//	String descrShort;
	Integer topicOrder;
//	String descrOrder;
	List<ClassTextbook> textbooks;
	List<ClassWebsite> websites;
	List<Integer> delTextbooks;
	List<Integer> delWebsites;

	public static class ClassTextbook {
		String authorName;
		Integer id;
		String isbn;
		String publisher;
		String publishLocation;
		String textbookZone;
		String title;
		Integer year;
		Date lastUpdDttm;
		Integer lastUpdOprid;

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getTextbookZone() {
			return textbookZone;
		}

		public void setTextbookZone(String textbookZone) {
			this.textbookZone = textbookZone;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Date getLastUpdDttm() {
			return lastUpdDttm;
		}

		public void setLastUpdDttm(Date lastUpdDttm) {
			this.lastUpdDttm = lastUpdDttm;
		}

		public Integer getLastUpdOprid() {
			return lastUpdOprid;
		}

		public void setLastUpdOprid(Integer lastUpdOprid) {
			this.lastUpdOprid = lastUpdOprid;
		}

		public String getPublishLocation() {
			return publishLocation;
		}

		public void setPublishLocation(String publishLocation) {
			this.publishLocation = publishLocation;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
	}

	public static class ClassWebsite {
		Date accessed;
		String authorName;
		Integer id;
		String title;
		String url;
		String websiteZone;
		Integer year;
		Date lastUpdDttm;
		Integer lastUpdOrpid;

		public Date getAccessed() {
			return accessed;
		}

		public void setAccessed(Date accessed) {
			this.accessed = accessed;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getWebsiteZone() {
			return websiteZone;
		}

		public void setWebsiteZone(String websiteZone) {
			this.websiteZone = websiteZone;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Date getLastUpdDttm() {
			return lastUpdDttm;
		}

		public void setLastUpdDttm(Date lastUpdDttm) {
			this.lastUpdDttm = lastUpdDttm;
		}

		public Integer getLastUpdOrpid() {
			return lastUpdOrpid;
		}

		public void setLastUpdOrpid(Integer lastUpdOrpid) {
			this.lastUpdOrpid = lastUpdOrpid;
		}

	}

	public String getCatalogNbr() {
		return catalogNbr;
	}

	public void setCatalogNbr(String catalogNbr) {
		this.catalogNbr = catalogNbr;
	}

	public Integer getTopicTypeId() {
		return topicTypeId;
	}

	public void setTopicTypeId(Integer topicTypeId) {
		this.topicTypeId = topicTypeId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public String getTopicObjective() {
		return topicObjective;
	}

	public void setTopicObjective(String topicObjective) {
		this.topicObjective = topicObjective;
	}

	public String getTopicContent() {
		return topicContent;
	}

	public void setTopicContent(String topicContent) {
		this.topicContent = topicContent;
	}

	public Integer getClassTopicId() {
		return classTopicId;
	}

	public void setClassTopicId(Integer classTopicId) {
		this.classTopicId = classTopicId;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public Integer getTopicOrder() {
		return topicOrder;
	}

	public void setTopicOrder(Integer topicOrder) {
		this.topicOrder = topicOrder;
	}

//	public String getDescr() {
//		return descr;
//	}
//
//	public void setDescr(String descr) {
//		this.descr = descr;
//	}
//
//	public String getDescrShort() {
//		return descrShort;
//	}
//
//	public void setDescrShort(String descrShort) {
//		this.descrShort = descrShort;
//	}
//
//	public String getDescrOrder() {
//		return descrOrder;
//	}
//
//	public void setDescrOrder(String descrOrder) {
//		this.descrOrder = descrOrder;
//	}

	public List<Integer> getDelTextbooks() {
		return delTextbooks;
	}

	public List<ClassTextbook> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(List<ClassTextbook> textbooks) {
		this.textbooks = textbooks;
	}

	public List<ClassWebsite> getWebsites() {
		return websites;
	}

	public void setWebsites(List<ClassWebsite> websites) {
		this.websites = websites;
	}

	public void setDelTextbooks(List<Integer> delTextbooks) {
		this.delTextbooks = delTextbooks;
	}

	public List<Integer> getDelWebsites() {
		return delWebsites;
	}

	public void setDelWebsites(List<Integer> delWebsites) {
		this.delWebsites = delWebsites;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public String getTmplNbr() {
		return tmplNbr;
	}

	public void setTmplNbr(String tmplNbr) {
		this.tmplNbr = tmplNbr;
	}

}
