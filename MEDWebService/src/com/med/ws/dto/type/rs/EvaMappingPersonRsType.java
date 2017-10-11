package com.med.ws.dto.type.rs;

import java.util.List;

public class EvaMappingPersonRsType {

	protected String title;
	protected String titleEn;
	protected List<EvaMappingPersonBean> evaMappingPersonBeanList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEn() {
		return titleEn;
	}

	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}

	public List<EvaMappingPersonBean> getEvaMappingPersonBeanList() {
		return evaMappingPersonBeanList;
	}

	public void setEvaMappingPersonBeanList(List<EvaMappingPersonBean> evaMappingPersonBeanList) {
		this.evaMappingPersonBeanList = evaMappingPersonBeanList;
	}

	public static class EvaMappingPersonBean {
		protected String name;
		protected Integer persId;
		protected String photo;
		protected String empCode;
		protected String empPstn;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getPersId() {
			return persId;
		}
		public void setPersId(Integer persId) {
			this.persId = persId;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getEmpCode() {
			return empCode;
		}
		public void setEmpCode(String empCode) {
			this.empCode = empCode;
		}
		public String getEmpPstn() {
			return empPstn;
		}
		public void setEmpPstn(String empPstn) {
			this.empPstn = empPstn;
		}
	}
}
