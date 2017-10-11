package com.med.ws.dto.type.rq;

import java.util.Date;
import java.util.List;

public class CrseTopicDetailType implements Cloneable {
	Integer crseTopicId;
	Integer crseOfferNbr;
	String catalogNbr;
	Integer topicTypeId;
	String topicName;
	Integer hour;
	Integer minute;
	String topicObjective;
	String topicContent;
	String descr;
	String descrShort;
	Integer topicOrder;
	String descrOrder;
	// for Front-end
	Boolean haveTmpl;	
	Integer sequence;
	List<Textbook> textbooks;
	List<Website> websites;
	List<Integer> delTextbooks;
	List<Integer> delWebsites;
	CrseTopicTmpls topicTmpl;

	public static class CrseTopicTmpls {
		private Integer crseTopicTmplId;
		private Integer dayId;
		private Long endTime;
		private Long startTime;
		private Integer weekId;
		private Boolean groupFlag;
		// private RoomBean room;
		// private List<EvaluationDTO> evaluationList;
		// private List<SearchPersonalRsType> teachers;
		private Integer order;

		public Integer getCrseTopicTmplId() {
			return crseTopicTmplId;
		}

		public void setCrseTopicTmplId(Integer crseTopicTmplId) {
			this.crseTopicTmplId = crseTopicTmplId;
		}

		public Integer getDayId() {
			return dayId;
		}

		public void setDayId(Integer dayId) {
			this.dayId = dayId;
		}

		public Long getEndTime() {
			return endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getWeekId() {
			return weekId;
		}

		public void setWeekId(Integer weekId) {
			this.weekId = weekId;
		}

		public Boolean getGroupFlag() {
			return groupFlag;
		}

		public void setGroupFlag(Boolean groupFlag) {
			this.groupFlag = groupFlag;
		}

		public Integer getOrder() {
			return order;
		}

		public void setOrder(Integer order) {
			this.order = order;
		}
	}
	
	public static class Textbook {
		String isbn;
		String authorName;
//		Integer crseTopicTextbookId;
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

//		public Integer getCrseTopicTextbookId() {
//			return crseTopicTextbookId;
//		}
//
//		public void setCrseTopicTextbookId(Integer crseTopicTextbookId) {
//			this.crseTopicTextbookId = crseTopicTextbookId;
//		}

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

	public static class Website {
		Date accessed;
		String authorName;
		Integer crseTopicWebsiteId;
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

		public Integer getCrseTopicWebsiteId() {
			return crseTopicWebsiteId;
		}

		public void setCrseTopicWebsiteId(Integer crseTopicWebsiteId) {
			this.crseTopicWebsiteId = crseTopicWebsiteId;
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
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
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

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
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

	public Integer getCrseOfferNbr() {
		return crseOfferNbr;
	}

	public void setCrseOfferNbr(Integer crseOfferNbr) {
		this.crseOfferNbr = crseOfferNbr;
	}

	public Integer getCrseTopicId() {
		return crseTopicId;
	}

	public void setCrseTopicId(Integer crseTopicId) {
		this.crseTopicId = crseTopicId;
	}

	public Integer getTopicOrder() {
		return topicOrder;
	}

	public void setTopicOrder(Integer topicOrder) {
		this.topicOrder = topicOrder;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDescrShort() {
		return descrShort;
	}

	public void setDescrShort(String descrShort) {
		this.descrShort = descrShort;
	}

	public String getDescrOrder() {
		return descrOrder;
	}

	public void setDescrOrder(String descrOrder) {
		this.descrOrder = descrOrder;
	}

	public List<Textbook> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(List<Textbook> textbooks) {
		this.textbooks = textbooks;
	}

	public List<Website> getWebsites() {
		return websites;
	}

	public void setWebsites(List<Website> websites) {
		this.websites = websites;
	}

	public List<Integer> getDelTextbooks() {
		return delTextbooks;
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

	public CrseTopicTmpls getTopicTmpl() {
		return topicTmpl;
	}

	public void setTopicTmpl(CrseTopicTmpls topicTmpl) {
		this.topicTmpl = topicTmpl;
	}

	
	public Boolean getHaveTmpl() {
		return haveTmpl;
	}

	public void setHaveTmpl(Boolean haveTmpl) {
		this.haveTmpl = haveTmpl;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	
}
