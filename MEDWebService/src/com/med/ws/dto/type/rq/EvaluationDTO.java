package com.med.ws.dto.type.rq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.med.ws.dto.type.rs.ClassTopicRsType;
import com.med.ws.dto.type.rs.ClassTopicRsTypeShort;
import com.med.ws.dto.type.rs.CourseListRsType;
import com.med.ws.dto.type.rs.SearchPersonalRsType;
import com.med.ws.dto.type.rs.SearchStdntRsType;

@JsonInclude(Include.NON_NULL)
public class EvaluationDTO {
	@JsonProperty("_id")
	String evaluationId;
	@JsonProperty("evaluationPersonId")
	Integer evaluationPersonId;
	@JsonProperty("title")
	String evaluationTitle;
	@JsonProperty("titleEn")
	String evaluationTitleEn;
	@JsonProperty("evaluationIdForTeacher")
	String evaluationIdForTeacher;
	@JsonProperty("evaluationTitleForTeacher")
	String evaluationTitleForTeacher;
	@JsonProperty("descr")
	String evaluationDescr;
	@JsonProperty("descrEn")
	String evaluationDescrEn;
	@JsonProperty("crseCode")
	String crseCode;
	@JsonProperty("sectionOrder")
	String sectionOrder;
	@JsonProperty("sectionId")
	Integer sectionId;
	@JsonProperty("sections")
	ArrayList<EvaluationSection> evaluationSections;
	@JsonProperty("lastUpdate")
	Date lastUpdDttm;
	@JsonProperty("evaluationTypeId")
	Integer evaluationTypeId;
	@JsonProperty("stdntInfo")
	SearchStdntRsType searchStdntRsType;
	@JsonProperty("empInfo")
	SearchPersonalRsType searchPersonalRsType;
	@JsonProperty("isDone")
	Boolean isDone;
	@JsonProperty("topicName")
	String topicName;
	@JsonProperty("topicType")
	String topicType;
	@JsonProperty("isMappedClassTopic")
	Boolean isMappedClassTopic;
	@JsonProperty("haveStudent")
	Boolean haveStudent;
	@JsonProperty("isMappedPerson")
	Boolean isMappedPerson;
	@JsonProperty("crseList")
	List<CourseListRsType> crseList;
	@JsonProperty("classTopicId")
	Integer classTopicId;
	@JsonProperty("classTopicList")
	List<ClassTopicRsTypeShort> classTopicList;
	@JsonProperty("mapTopicFlag")
	Boolean mapTopicFlag;
	@JsonProperty("newFlag")
	Boolean newFlag = false;
	@JsonProperty("selectTeacherFlag")
	Boolean selectTeacherFlag;
	@JsonProperty("scheduleDate")
	Date scheduleDate;
	@JsonProperty("scheduleId")
	Integer scheduleId;
	@JsonProperty("classSection")
	String classSection;
	@JsonProperty("homeworkReport")
	HomeworkReport homeworkReport;

	public static class EvaluationSection {
		@JsonProperty("_id")
		String evaluationSectionId;
		@JsonProperty("descr")
		String evaluationDescription;
		@JsonProperty("descrEn")
		String evaluationDescriptionEn;
		@JsonProperty("haveRemark")
		Boolean haveRemarkFlag;
		@JsonProperty("remarkText")
		String remarkText;

		Double scoreScale;
		@JsonProperty("questions")
		ArrayList<EvaluationQuestion> evaluationQuestions;

		public static class EvaluationQuestion {
			@JsonProperty("_id")
			String evaluationQuestionId;
			@JsonProperty("title")
			String evaluationQuestionTitle;
			@JsonProperty("titleEn")
			String evaluationQuestionTitleEn;
			@JsonProperty("answers")
			ArrayList<EvaluationAnswer> evaluationAnswers;
			@JsonProperty("answer")
			String selectedAnswer;
			@JsonProperty("answerDetail")
			EvaluationAnswer answerDetail;
			@JsonProperty("answerTypeId")
			private Integer answerTypeId;
			@JsonProperty("maxScore")
			private Double maxScore;

			public static class EvaluationAnswer {
				@JsonProperty("_id")
				String evaluationAnswerId;
				@JsonProperty("descr")
				String evaluationAnswerDescr;
				@JsonProperty("descrEn")
				String evaluationAnswerDescrEn;
				@JsonProperty("answerType")
				String evaluationAnswerTypeId;
				@JsonProperty("score")
				Double evaluationAnswerScore;

				public String getEvaluationAnswerDescr() {
					return evaluationAnswerDescr;
				}

				public void setEvaluationAnswerDescr(String evaluationAnswerDescr) {
					this.evaluationAnswerDescr = evaluationAnswerDescr;
				}

				public String getEvaluationAnswerTypeId() {
					return evaluationAnswerTypeId;
				}

				public void setEvaluationAnswerTypeId(String evaluationAnswerTypeId) {
					this.evaluationAnswerTypeId = evaluationAnswerTypeId;
				}

				public Double getEvaluationAnswerScore() {
					return evaluationAnswerScore;
				}

				public void setEvaluationAnswerScore(Double evaluationAnswerScore) {
					this.evaluationAnswerScore = evaluationAnswerScore;
				}

				public String getEvaluationAnswerId() {
					return evaluationAnswerId;
				}

				public void setEvaluationAnswerId(String evaluationAnswerId) {
					this.evaluationAnswerId = evaluationAnswerId;
				}

				public String getEvaluationAnswerDescrEn() {
					return evaluationAnswerDescrEn;
				}

				public void setEvaluationAnswerDescrEn(String evaluationAnswerDescrEn) {
					this.evaluationAnswerDescrEn = evaluationAnswerDescrEn;
				}
			}

			public String getEvaluationQuestionTitle() {
				return evaluationQuestionTitle;
			}

			public void setEvaluationQuestionTitle(String evaluationQuestionTitle) {
				this.evaluationQuestionTitle = evaluationQuestionTitle;
			}

			public ArrayList<EvaluationAnswer> getEvaluationAnswers() {
				return evaluationAnswers;
			}

			public void setEvaluationAnswers(ArrayList<EvaluationAnswer> evaluationAnswers) {
				this.evaluationAnswers = evaluationAnswers;
			}

			public Integer getAnswerTypeId() {
				return answerTypeId;
			}

			public void setAnswerTypeId(Integer answerTypeId) {
				this.answerTypeId = answerTypeId;
			}

			public String getEvaluationQuestionId() {
				return evaluationQuestionId;
			}

			public void setEvaluationQuestionId(String evaluationQuestionId) {
				this.evaluationQuestionId = evaluationQuestionId;
			}

			public String getEvaluationQuestionTitleEn() {
				return evaluationQuestionTitleEn;
			}

			public void setEvaluationQuestionTitleEn(String evaluationQuestionTitleEn) {
				this.evaluationQuestionTitleEn = evaluationQuestionTitleEn;
			}

			public String getSelectedAnswer() {
				return selectedAnswer;
			}

			public void setSelectedAnswer(String selectedAnswer) {
				this.selectedAnswer = selectedAnswer;
			}

			public EvaluationAnswer getAnswerDetail() {
				return answerDetail;
			}

			public void setAnswerDetail(EvaluationAnswer answerDetail) {
				this.answerDetail = answerDetail;
			}

			public Double getMaxScore() {
				return maxScore;
			}

			public void setMaxScore(Double maxScore) {
				this.maxScore = maxScore;
			}
		}

		public Double getScoreScale() {
			return scoreScale;
		}

		public void setScoreScale(Double scoreScale) {
			this.scoreScale = scoreScale;
		}

		public ArrayList<EvaluationQuestion> getEvaluationQuestions() {
			return evaluationQuestions;
		}

		public void setEvaluationQuestions(ArrayList<EvaluationQuestion> evaluationQuestions) {
			this.evaluationQuestions = evaluationQuestions;
		}

		public String getEvaluationDescription() {
			return evaluationDescription;
		}

		public void setEvaluationDescription(String evaluationDescription) {
			this.evaluationDescription = evaluationDescription;
		}

		public String getEvaluationSectionId() {
			return evaluationSectionId;
		}

		public void setEvaluationSectionId(String evaluationSectionId) {
			this.evaluationSectionId = evaluationSectionId;
		}

		public Boolean getHaveRemarkFlag() {
			return haveRemarkFlag;
		}

		public void setHaveRemarkFlag(Boolean haveRemarkFlag) {
			this.haveRemarkFlag = haveRemarkFlag;
		}

		public String getRemarkText() {
			return remarkText;
		}

		public void setRemarkText(String remarkText) {
			this.remarkText = remarkText;
		}

		public String getEvaluationDescriptionEn() {
			return evaluationDescriptionEn;
		}

		public void setEvaluationDescriptionEn(String evaluationDescriptionEn) {
			this.evaluationDescriptionEn = evaluationDescriptionEn;
		}

	}

	public String getEvaluationTitle() {
		return evaluationTitle;
	}

	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}

	public String getEvaluationDescr() {
		return evaluationDescr;
	}

	public void setEvaluationDescr(String evaluationDescr) {
		this.evaluationDescr = evaluationDescr;
	}

	public List<EvaluationSection> getEvaluationSections() {
		return evaluationSections;
	}

	public void setEvaluationSections(ArrayList<EvaluationSection> evaluationSections) {
		this.evaluationSections = evaluationSections;
	}

	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public Date getLastUpdDttm() {
		return lastUpdDttm;
	}

	public void setLastUpdDttm(Date lastUpdDttm) {
		this.lastUpdDttm = lastUpdDttm;
	}

	public Integer getEvaluationTypeId() {
		return evaluationTypeId;
	}

	public void setEvaluationTypeId(Integer evaluationTypeId) {
		this.evaluationTypeId = evaluationTypeId;
	}

	public String getCrseCode() {
		return crseCode;
	}

	public void setCrseCode(String crseCode) {
		this.crseCode = crseCode;
	}

	public SearchStdntRsType getSearchStdntRsType() {
		return searchStdntRsType;
	}

	public void setSearchStdntRsType(SearchStdntRsType searchStdntRsType) {
		this.searchStdntRsType = searchStdntRsType;
	}

	public Integer getEvaluationPersonId() {
		return evaluationPersonId;
	}

	public void setEvaluationPersonId(Integer evaluationPersonId) {
		this.evaluationPersonId = evaluationPersonId;
	}

	public SearchPersonalRsType getSearchPersonalRsType() {
		return searchPersonalRsType;
	}

	public void setSearchPersonalRsType(SearchPersonalRsType searchPersonalRsType) {
		this.searchPersonalRsType = searchPersonalRsType;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicType() {
		return topicType;
	}

	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}

	public String getEvaluationIdForTeacher() {
		return evaluationIdForTeacher;
	}

	public void setEvaluationIdForTeacher(String evaluationIdForTeacher) {
		this.evaluationIdForTeacher = evaluationIdForTeacher;
	}

	public String getEvaluationTitleForTeacher() {
		return evaluationTitleForTeacher;
	}

	public void setEvaluationTitleForTeacher(String evaluationTitleForTeacher) {
		this.evaluationTitleForTeacher = evaluationTitleForTeacher;
	}

	public void setCrseList(List<CourseListRsType> crseList) {
		this.crseList = crseList;
	}

	public List<CourseListRsType> getCrseList() {
		return crseList;
	}

	public Boolean getIsMappedClassTopic() {
		return isMappedClassTopic;
	}

	public void setIsMappedClassTopic(Boolean isMappedClassTopic) {
		this.isMappedClassTopic = isMappedClassTopic;
	}

	public Boolean getIsMappedPerson() {
		return isMappedPerson;
	}

	public void setIsMappedPerson(Boolean isMappedPerson) {
		this.isMappedPerson = isMappedPerson;
	}

	public Integer getClassTopicId() {
		return classTopicId;
	}

	public void setClassTopicId(Integer classTopicId) {
		this.classTopicId = classTopicId;
	}

	public Boolean getHaveStudent() {
		return haveStudent;
	}

	public void setHaveStudent(Boolean haveStudent) {
		this.haveStudent = haveStudent;
	}

	public String getSectionOrder() {
		return sectionOrder;
	}

	public void setSectionOrder(String sectionOrder) {
		this.sectionOrder = sectionOrder;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public List<ClassTopicRsTypeShort> getClassTopicList() {
		return classTopicList;
	}

	public void setClassTopicList(List<ClassTopicRsTypeShort> classTopicList) {
		this.classTopicList = classTopicList;
	}

	public Boolean getMapTopicFlag() {
		return mapTopicFlag;
	}

	public void setMapTopicFlag(Boolean mapTopicFlag) {
		this.mapTopicFlag = mapTopicFlag;
	}

	public Boolean getNewFlag() {
		return newFlag;
	}

	public void setNewFlag(Boolean newFlag) {
		this.newFlag = newFlag;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public Boolean getSelectTeacherFlag() {
		return selectTeacherFlag;
	}

	public void setSelectTeacherFlag(Boolean selectTeacherFlag) {
		this.selectTeacherFlag = selectTeacherFlag;
	}

	public HomeworkReport getHomeworkReport() {
		return homeworkReport;
	}

	public void setHomeworkReport(HomeworkReport homeworkReport) {
		this.homeworkReport = homeworkReport;
	}

	public String getEvaluationTitleEn() {
		return evaluationTitleEn;
	}

	public void setEvaluationTitleEn(String evaluationTitleEn) {
		this.evaluationTitleEn = evaluationTitleEn;
	}

	public String getEvaluationDescrEn() {
		return evaluationDescrEn;
	}

	public void setEvaluationDescrEn(String evaluationDescrEn) {
		this.evaluationDescrEn = evaluationDescrEn;
	}

}