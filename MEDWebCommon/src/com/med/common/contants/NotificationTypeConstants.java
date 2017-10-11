package com.med.common.contants;

import java.util.HashMap;
import java.util.Map;

public enum NotificationTypeConstants {
	CHAT("CHAT", "CHAT", "New Message"),
	TASK("TASK", "TASK", "Task Incoming"),
	EVALUATION("EVALT", "EVALUATION", "Evaluation Due Date"),
	EVALUATION_REPORT("EVARP", "EVALUATION_REPORT", "Report"),
	EVALUATION_REJECTED("EVARJ","EVALUATION_REJECT","reject evaluation"),
	REPORT_REJECTED("RPRJ","REPORT_REJECT","reject report"),
	SCHEDULE_TRANSFER("SCDMT", "MOVE SCHEDULE", "Application Form Incoming"),
	ENROLL_REQUEST("ENRCS", "ENROLL REQUEST", ""),
	APPLICATIONFORM("APPFM", "APPLICATIONFORM", "")
	;
	
	private final String code;
	private final String value;
	private final String default_title;

	private static final Map<String, NotificationTypeConstants> lookup = new HashMap<String, NotificationTypeConstants>();
	
	static {
		for (NotificationTypeConstants type: NotificationTypeConstants.values()){
			lookup.put(type.getCode(), type);
		}
	}
	
	NotificationTypeConstants(String code, String value, String default_title) {
		this.code = code;
		this.value = value;
		this.default_title = default_title;
	}

	public String getCode(){
		return code;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getDefaultTitle(){
		return default_title; 
	}
	
	public static NotificationTypeConstants get(String code) {
        return lookup.get(code);
	}
}
