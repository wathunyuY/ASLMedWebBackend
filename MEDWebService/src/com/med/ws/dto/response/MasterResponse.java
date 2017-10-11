package com.med.ws.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@XmlRootElement
@JsonInclude(Include.NON_NULL)
public class MasterResponse {
	protected Long code = 0L;
	protected String desc;
	protected String severity;
	protected ResponseBody data;


	public MasterResponse() {
		data = new ResponseBody();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public ResponseBody getData() {
		return data;
	}

	public void setData(ResponseBody body) {
		this.data = body;
	}


	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "";
		try {
			jsonInString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return (jsonInString);

	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

}
