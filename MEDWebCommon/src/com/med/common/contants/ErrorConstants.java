package com.med.common.contants;

public enum ErrorConstants {
	SUCCESS("SUCCESS", 0L, "Success"),

	/* UNHANDLED ERROR 8x */
	UNKNOW_ERROR("ERROR", 80000L, "An error has occured"),
	MISSING_REQUIRED_FIELD("ERROR", 80001L, "Missing required creator property"),
	FLUSH_WORKFLOW_ERROR("ERROR", 80003L, "Error during flush workflow"),
	FIELD_TYPE_ERROR("ERROR", 80004L, "Wrong Field Type"),
	FIELD_NOT_FOUND("ERROR", 80005L, "Field not found"),
	FIELD_NULL_ERROR("ERROR", 80006L, "Field in Selected Table has null value"),
	UNKNOW_BLOB_ERROR("ERROR", 80007L, "Blob object generation error"),
	
	/* WORKFLOW AND CONTROLLER 200xx */
	WORKFLOW_NOT_FOUND("ERROR", 20001L, "Workflow not found in database [%s]"),
	SERVICE_NOT_FOUND("ERROR", 20002L, "Service not found in project [%s]"),
	TASK_NOT_FOUND("ERROR", 20003L, "Task not found in database [%s]"),
	PATH_NOT_FOUND("ERROR", 20004L, "This endpoint required path variable"),
	ACCOUNT_DOES_NOT_EXISTS("ERROR",21007L,"Account does not exists"),
	UNAUTHORIZED("ERROR", 20005L, "UNAUTHORIZED [%s]"),
	INVALID_VERSION("ERROR", 20006L, "INVALID_VERSION [%s]"),

	/* COMMON BUSINESS ERROR 21xxx */
	TYPE_OF_NOT_FOUND("ERROR", 21002L, "Type of [%s] not found"),
	LOGIN_ERROR("ERROR", 21003L, "login failed"),
	INCORRECT_PASSWORD("WARNING", 21002L, "Incorrect Password"),
	FOREIGN_KEY_CONSTRAINT_FAILS("ERROR", 21004L, "Cannot delete or update a parent row"),
	DUPLICATE_KEY("ERROR", 21005L, "Duplicate Key [%s]"),
	DELETE_PRIMARY_CRSE_OFFFER("ERROR", 21006L, "Cannot delete primary CRSE_OFFER id: [%s]"),
	NOT_RELATED_ENTITY("ERROR", 21006L, "Try to delete not related entity"),
	INELIGIBLE_DATE("ERROR", 21006L, "Improper Datetime: [%s]"),
	USER_NOT_ALLOW("ERROR", 21007L, "You are not allow to perform this action"),
	ACTION_NOT_ALLOW("ERROR", 21008L, "This action can not be done"),
	SCOPE_ERROR("ERROR", 21009L, "Invalid scope [%s]"),
	
	SCHEDULE_NOT_ALLOW("ERROR", 22001L, "Not allowed in SCHEDULE_TOPIC [%s]"),
	TIMESLOT_NOT_AVAILABLE("ERROR", 22002L, "Selected Time Slot is not available"),
	CANNOT_SWAP_SCHEDULE("ERROR", 22004L, "Schedule can not be swap"),
	CAN_SWAP_SCHEDULE("WARNING", 22003L, "Schedule can be Swap"),
	
	REQUIRED_PRE_RQS("ERROR", 23001L, "Pre Requisite is required"),
	EXCEL_ERROR("ERROR", 23002L, "Excel format error [%s]"),
	
	
	UNKNOW_DATABASE_ERROR("ERROR", 30000L, "A database error has occured"),
	OBJECT_NOT_FOUND("ERROR", 31000L, "Object not found"),
	OBJECT_NOT_FOUND_PARAMS("ERROR", 31000L, "Object not found [%s]"),
	MISSING_REQUIRED_FIELDS("ERROR",32000L,"Missing required fields"),
	MISSING_REQUIRED_FIELDS_PARAMS("ERROR",32000L,"Missing required fields [%s]"),
	CLONE_OBJECT_ERROR("ERROR",33000L,"Cannot clone object :[%s]"),
	FCM_TOKEN_NOT_FOUND("ERROR", 34000L, "Firebase Token not found, [%s]"),
	COULD_NOT_DELETE("ERROR", 35000L, "Could not delete: [%s]"),
	TRANS_TASK_NOT_FOUND("ERROR", 36000L, "transtask not found : classsection = [%s],sectionId = [%s]"),
	
	FORMAT_ERROR("ERROR", 41000L, "Error format [%s]"),
	UNKNOW_HTTP_ERROR("ERROR", 40000L, "Unknown HTTP Request Error"),
	
	EMPTY_FILE_ERROR("ERROR",51000L,"Empty File"),
	TIME_OVERLAP_ERROR("ERROR",61000L,"Time Overlap"),
	;

	private final Long errorCd;
	private final String errorDesc;
	private final String severity;

	ErrorConstants(String severity, Long errorCd, String errorDesc) {
		this.severity = severity;
		this.errorCd = errorCd;
		this.errorDesc = errorDesc;
	}

	public String getSeverity() {
		return severity;
	}

	public Long getErrorCd() {
		return errorCd;
	}

	public String getErrorDesc() {
		return errorDesc;
	}
}
