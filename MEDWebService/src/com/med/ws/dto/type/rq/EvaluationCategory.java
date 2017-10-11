package com.med.ws.dto.type.rq;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.med.ws.dto.type.rs.SearchPersonalRsType;
import com.med.ws.dto.type.rs.SearchStdntRsType;

@JsonInclude(Include.NON_NULL)
public class EvaluationCategory {
	@JsonProperty("_id")
	String evaluationId;
	@JsonProperty("evaluationPersonId")
	Integer evaluationPersonId;
	@JsonProperty("title")
	String evaluationTitle;
	@JsonProperty("descr")
	String evaluationDescr;
	@JsonProperty("crseCode")
	String crseCode;
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

	public static class EvaluationSection {
		@JsonProperty("_id")
		String evaluationSectionId;
		@JsonProperty("descr")
		String evaluationDescription;
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
			@JsonProperty("answers")
			ArrayList<EvaluationAnswer> evaluationAnswers;
			@JsonProperty("answer")
			String selectedAnswer;
			@JsonProperty("answerTypeId")
			private Integer answerTypeId;

			public static class EvaluationAnswer {
				@JsonProperty("_id")
				String evaluationAnswerId;
				@JsonProperty("descr")
				String evaluationAnswerDescr;
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

			public String getSelectedAnswer() {
				return selectedAnswer;
			}

			public void setSelectedAnswer(String selectedAnswer) {
				this.selectedAnswer = selectedAnswer;
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

}