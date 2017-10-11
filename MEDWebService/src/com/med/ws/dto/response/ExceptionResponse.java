package com.med.ws.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.med.common.contants.Constants;
import com.med.common.contants.ErrorConstants;

@XmlRootElement
public class ExceptionResponse extends MasterResponse {
	public ExceptionResponse() {
		this.setCode(ErrorConstants.UNKNOW_ERROR.getErrorCd());
		this.setDesc(ErrorConstants.UNKNOW_ERROR.getErrorDesc());
		this.setSeverity(Constants.SEVERITY.ERROR);
	}

	public ExceptionResponse(String desc) {
		this.setCode(ErrorConstants.UNKNOW_ERROR.getErrorCd());
		this.setDesc(desc);
		this.setSeverity(Constants.SEVERITY.ERROR);
	}

	public ExceptionResponse(Long status, String desc) {
		this.setCode(status);
		this.setDesc(desc);
		this.setSeverity(Constants.SEVERITY.ERROR);
	}

	public ExceptionResponse(ErrorConstants e) {
		this.setCode(e.getErrorCd());
		this.setDesc(e.getErrorDesc());
	}
//
//	public String getData() {
//		return data;
//	}
//
//	public void setData(String data) {
//		this.data = data;
//	}
}
