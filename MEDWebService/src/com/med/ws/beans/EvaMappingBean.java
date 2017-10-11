package com.med.ws.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaMappingBean {

	protected List<EvaMappingBeanFilter> filter;
	protected List<EvaMappingBeanDetails> recent;
	protected List<EvaMappingBeanDetails> history;
	protected Boolean addEvaFlag;
	protected Boolean minMaxFlag;
	protected Boolean rejectedFlag;
	
	
	public List<EvaMappingBeanFilter> getFilter() {
		return filter;
	}

	public void setFilter(List<EvaMappingBeanFilter> filter) {
		this.filter = filter;
	}

	public List<EvaMappingBeanDetails> getRecent() {
		return recent;
	}

	public void setRecent(List<EvaMappingBeanDetails> recent) {
		this.recent = recent;
	}

	public List<EvaMappingBeanDetails> getHistory() {
		return history;
	}

	public void setHistory(List<EvaMappingBeanDetails> history) {
		this.history = history;
	}
	
	public Boolean getAddEvaFlag() {
		return addEvaFlag;
	}

	public void setAddEvaFlag(Boolean addEvaFlag) {
		this.addEvaFlag = addEvaFlag;
	}
	public Boolean getMinMaxFlag() {
		return minMaxFlag;
	}

	public void setMinMaxFlag(Boolean minMaxFlag) {
		this.minMaxFlag = minMaxFlag;
	}
	
	public Boolean getRejectedFlag() {
		return rejectedFlag;
	}

	public void setRejectedFlag(Boolean rejectedFlag) {
		this.rejectedFlag = rejectedFlag;
	}


	public static class EvaMappingBeanDetails {
		protected Integer evaMappingId;
		protected Integer order;
		protected String title;
		protected String detail;
		protected String other;
		protected Date create;
		protected String template;
		protected String photo;
		protected Boolean isLated;
		protected String name;
		protected String code;
		protected String topicName;
		protected String topicType;
		protected String crseCode;
		protected String sectionOrder;
		protected String rpId;
		protected String patientCode;
		protected String patientName;
		protected Date p_date;
		protected Date receiveDate;
		protected Boolean isRejected;
		protected Boolean rejected;
		public String getPatientCode() {
			return patientCode;
		}
		public void setPatientCode(String patientCode) {
			this.patientCode = patientCode;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public Date getP_date() {
			return p_date;
		}
		public void setP_date(Date p_date) {
			this.p_date = p_date;
		}
		public Date getReceiveDate() {
			return receiveDate;
		}
		public void setReceiveDate(Date receiveDate) {
			this.receiveDate = receiveDate;
		}
		protected Map<String, String> filters;
		
		
		public Integer getEvaMappingId() {
			return evaMappingId;
		}
		public void setEvaMappingId(Integer evaMappingId) {
			this.evaMappingId = evaMappingId;
		}
		public Integer getOrder() {
			return order;
		}
		public void setOrder(Integer order) {
			this.order = order;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getOther() {
			return other;
		}
		public void setOther(String other) {
			this.other = other;
		}
		public Date getCreate() {
			return create;
		}
		public void setCreate(Date create) {
			this.create = create;
		}
		
		public String getTemplate() {
			return template;
		}
		public void setTemplate(String template) {
			this.template = template;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		
		public Boolean getIsLated() {
			return isLated;
		}
		public void setIsLated(Boolean isLated) {
			this.isLated = isLated;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}	
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public Map<String, String> getFilters() {
			return filters;
		}
		public void setFilters(Map<String, String> filters) {
			this.filters = filters;
		}
		
		public String getTopicType() {
			return topicType;
		}
		public void setTopicType(String topicType) {
			this.topicType = topicType;
		}
		public String getTopicName() {
			return topicName;
		}
		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}
		public String getCrseCode() {
			return crseCode;
		}
		public void setCrseCode(String crseCode) {
			this.crseCode = crseCode;
		}
		public String getSectionOrder() {
			return sectionOrder;
		}
		public void setSectionOrder(String sectionOrder) {
			this.sectionOrder = sectionOrder;
		}
		
		public String getRpId() {
			return rpId;
		}
		public void setRpId(String rpId) {
			this.rpId = rpId;
		}
		public Boolean getIsRejected() {
			return isRejected;
		}
		public void setIsRejected(Boolean isRejected) {
			this.isRejected = isRejected;
		}
		public Boolean getRejected() {
			return rejected;
		}
		public void setRejected(Boolean rejected) {
			this.rejected = rejected;
		}
		
	}
	
	public static class EvaMappingBeanFilter {
		
		protected String id;
		protected String des;
		protected List<EvaMappingBeanFilterChild> child;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDes() {
			return des;
		}
		public void setDes(String des) {
			this.des = des;
		}
		public List<EvaMappingBeanFilterChild> getChild() {
			return child;
		}
		public void setChild(List<EvaMappingBeanFilterChild> child) {
			this.child = child;
		}
		
		
		
	}
	public static class EvaMappingBeanFilterChild {
		protected String id;
		protected String desc;
		protected String photo;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		
	}
}
