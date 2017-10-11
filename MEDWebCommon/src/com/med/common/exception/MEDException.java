package com.med.common.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.med.common.contants.ErrorConstants;

public class MEDException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 955458245968932919L;
	private Long errorCd;
	private String errorDesc;
	private String severity;
	private String readableStackTrace;
	private String readableMessage;

	public MEDException() {
		this.setSeverity(ErrorConstants.UNKNOW_ERROR.getSeverity());
		this.setErrorCd(ErrorConstants.UNKNOW_ERROR.getErrorCd());
		this.setErrorDesc(ErrorConstants.UNKNOW_ERROR.getErrorDesc());
	}

	public MEDException(ErrorConstants errorCd, Exception e) {
		this.setErrorCd(errorCd.getErrorCd());
		this.setSeverity(errorCd.getSeverity());
		this.setErrorDesc(errorCd.getErrorDesc());
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		this.setReadableStackTrace(sw.toString());
		this.setReadableMessage(e.getMessage());
	}

	public MEDException(ErrorConstants errorCd, Object... arg) {
		this.setErrorCd(errorCd.getErrorCd());
		this.setSeverity(errorCd.getSeverity());
		this.setErrorDesc(String.format(errorCd.getErrorDesc(), arg));
	}
	
	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public long getErrorCd() {
		return errorCd;
	}

	public void setErrorCd(Long errorCd) {
		this.errorCd = errorCd;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getReadableStackTrace() {
		return readableStackTrace;
	}

	public void setReadableStackTrace(String readableStackTrace) {
		this.readableStackTrace = readableStackTrace;
	}

	public String getReadableMessage() {
		return readableMessage;
	}

	public void setReadableMessage(String readableMessage) {
		this.readableMessage = readableMessage;
	}
}
