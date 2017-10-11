package com.med.ws.dto.type.rq;

import java.util.List;

import com.med.ws.beans.EvaQnaQuestionBean;
import com.med.ws.beans.SearchStdntBean;

public class SubmitEvaRqType {
	private Integer evaMappingId;
	private List<EvaAnswerSheetSectionSubmit> sections;
	private SearchStdntBean evaluated; 
	
	public static class EvaAnswerSheetSectionSubmit{
		private Integer evaQnaSectionId;
		private String remark;
		private List<AnswerSubmit> answers; 
		public static class AnswerSubmit{
			private Integer evaQnaQuestionId;
			private Integer answerTypeId; 
			private List<Integer> evaQnaAnswerIds;
			private Double score;
			public Integer getEvaQnaQuestionId() {
				return evaQnaQuestionId;
			}
			public void setEvaQnaQuestionId(Integer evaQnaQuestionId) {
				this.evaQnaQuestionId = evaQnaQuestionId;
			}
			public Integer getAnswerTypeId() {
				return answerTypeId;
			}
			public void setAnswerTypeId(Integer answerTypeId) {
				this.answerTypeId = answerTypeId;
			}
			public List<Integer> getEvaQnaAnswerIds() {
				return evaQnaAnswerIds;
			}
			public void setEvaQnaAnswerIds(List<Integer> evaQnaAnswerIds) {
				this.evaQnaAnswerIds = evaQnaAnswerIds;
			}
			public Double getScore() {
				return score;
			}
			public void setScore(Double score) {
				this.score = score;
			}
			
		}

		public Integer getEvaQnaSectionId() {
			return evaQnaSectionId;
		}

		public void setEvaQnaSectionId(Integer evaQnaSectionId) {
			this.evaQnaSectionId = evaQnaSectionId;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public List<AnswerSubmit> getAnswers() {
			return answers;
		}

		public void setAnswers(List<AnswerSubmit> answers) {
			this.answers = answers;
		}
	}

	public Integer getEvaMappingId() {
		return evaMappingId;
	}

	public void setEvaMappingId(Integer evaMappingId) {
		this.evaMappingId = evaMappingId;
	}

	public List<EvaAnswerSheetSectionSubmit> getSections() {
		return sections;
	}

	public void setSections(List<EvaAnswerSheetSectionSubmit> sections) {
		this.sections = sections;
	}

	public SearchStdntBean getEvaluated() {
		return evaluated;
	}

	public void setEvaluated(SearchStdntBean evaluated) {
		this.evaluated = evaluated;
	}
	
}
