package com.med.common.contants;

public final class Constants {

	public final class JWT {
		public static final String HEADER_NAME = "Authorization";
		public static final String SECRET = "f3f66f697eb07f97cba01cd4716214475a1c9aef0025f71564581350cbf04760";
		private JWT(){}
	}
	
	public final class SEVERITY {
		public static final String SUCCESS = "success";
		public static final String WARN = "warn";
		public static final String ERROR = "error";
	}
	
	public final class EMAIL {
		public final class CONFIG {
			public static final String PROTOCOL = "mail.transport.protocol";
			public static final String HOST = "mail.smtp.host";
			public static final String AUTH = "mail.smtp.auth";
			public static final String SSL = "mail.smtp.ssl.enable";
			public static final String PORT = "mail.smtp.port";
		}
		public final class VALUE {
			public static final String PROTOCOL = "smtp";
			public static final String HOST = "smtp.gmail.com";
			public static final String AUTH = "true";
			public static final String SSL = "true";
			public static final String PORT = "465";
		}
		
	}
	public final class EDULEVEL {
		public static final int BACHELOR_ID = 1;
		public static final int MASTER_ID = 2;
		public static final int PHD_ID = 3;
		public static final int HIGHSCHOOL_ID = 4;
		
	}
	public final class ADDRTYPE {
		public static final String PERMANENT = "0";
		public static final String CURRENT = "1";
		public static final String OFFICE = "2";
	}
	public final class SYMBOLIC {
		public static final String UNDERSCORE = "_";
		public static final String STRINGEMPTY = "";
		public static final String SPACE = " ";
		public static final String SLASH = "/";
		public static final String L_PARENTHESIS = "(";
		public static final String R_PARENTHESIS = ")";
		public static final String COLON = ":";
		public static final String MINUS = "-";
		public static final String COMMA = ",";
		public static final String PIPE = "|";
	}
	public final class NUMBER {
		public static final int ZERO = 0;
		public static final int ONE = 1;
		public static final int TWO = 2;
		public static final int THREE = 3;
		public static final int FOUR = 4;
		public static final int SIX = 6;
		public static final int SEVEN = 7;
		public static final int EIGHT = 8;
		public static final String STRINGZERO = "0";
		public static final String STRINGONE = "1";
		public static final String STRINGTWO = "2";
		public static final String STRINGTHREE = "3";
		public static final String STRINGFOUR = "4";

	}
	public final class FLOATNUMBER{
		public static final float ZERO = 0;
	}
	public final class USERNAMEDEPART {
		public static final String TUMED = "0";
		public static final String TUHOS = "1";
	}
	public final class PREFIXTYPE {
		public static final int RANK = 1;
		public static final int EDU = 2;
		public static final int COMMON = 3;
	}
	public final class LANG {
		public static final String ENG = "EN";
		public static final String THAI = "TH";
	}
	public final class EFFECTIVESTATUS {
		public static final String ACTIVE = "ACTIVE";
		public static final String INACTIVE = "INACTIVE";
	}

	public final class EVALUATION {
		public final class MAP_GROUP {
			public static final int COURSE = 1;
			public static final int TOPIC = 2;
		}

		public final class TYPE {
			public static final int STDNT_TOPIC = 3;
			public static final int STDNT_TEACHER = 2;
			public static final int STDNT_COURSE = 1;
		}
		public final class PERSON{
			public static final String STDNT = "STDNT";
			public static final String TEACHER = "TEACHER";
			public static final String RESIDENT = "RESIDENT";
			public static final String EVALUATOR = "EVALUATOR";
			public static final String EVALUATED = "EVALUATED";
			
		}
	}
	
	public final class WORKFLOW {
		public static final int CONSTANT_LVL1_WORKFLOWID = 1; // OpenCrse
		public static final int CONSTANT_LVL2_WORKFLOWID = 2; // Time and Section
		public static final int CONSTANT_LVL3_WORKFLOWID = 3; // Student Group
		public static final int CONSTANT_LVL4_WORKFLOWID = 4; // Schedule Topic
		public static final int CONSTANT_LVL5_WORKFLOWID = 11; // Sub Student Group
		public static final int CONSTANT_MINOR_LVL2_WORKFLOWID = 8; // Time and Section
		public static final int CONSTANT_MINOR_LVL3_WORKFLOWID = 9; // Student Group
		public static final int CONSTANT_MINOR_LVL4_WORKFLOWID = 10; // Schedule Topic
	}
	
	public final class WORKLOAD {
		public static final int THEORY = 1;
		public static final int OPERATE = 2;
		public static final int NOWORKLOAD = 3;
	}
	
	public final class GENDER {
		public static final String MALE = "M";
		public static final String FEMALE = "F";
	}

	public final class GENERATION{
		public static final int DEFAULT_YEAR = 1985;
		public static final String PREFIX = "MD";
	}
	
	public final class FIREBASE{
		public static final String WEB_API_KEY = "AIzaSyAJ1piIzkBG78iAsfPF5LDBKcsT1wWxRuo";
		public static final String SERVER_KEY = "AAAAWhCfIEI:APA91bGkLe3HJ-KC1ajveLQn08LM8ItMonw1S16qURh83FDnM5vxdx8SCDmclqJJhe6CVoOS_RnYU_5jWpIl91ku8m65H83bdMdum_cA2M6A6KeW3YB7kuq9JRSMM8bkjg8exAVYnV6-";
		public static final String NOTI_ICO = "test";
	}
	
	public final class APPLICATIONFORM{
		public final class STATUS {
			public static final String WAIT = "WAIT";
			public static final String APPROVED = "APPR";
			public static final String REJECTED = "REJT";
			public static final String CANCEL = "CANC";
			public static final String PROGRESS = "PROG";
		}
		public final class TYPE { 
			public static final String SCHEDULE_MOVE = "SCDMT";
			public static final String SCHEDULE_SWAP = "SCDSW";
			public static final String ENROLL_CLASS = "ENRCS";
		}
		public final class RULES{
			public static final String ALL = "ALL";
			public static final String ONE = "ONE";
		}
	}
	public final class API{
		public static final String SHA56_KEY = "6835777f4d8abae0dcbc5183ca61aee68151259567db07aee31717c857064f85";
	}
	
	public final class GRAPH{
		public final class TYPE{
			public static final String DOUGHNUT = "chart-doughnut";
			public static final String VERTICAL_BAR = "chart-bar";
			public static final String HORIZONTAL_BAR = "chart-horizontal-bar";
			public static final String PIE = "chart-pie";
		}
	}
	public final class SCOPE{
		public static final String CLASSSECTION = "CLSEC";
		public static final String SCHEDULE = "SCH";
		public static final String SECTION = "SEC";
		public static final String CLASSTOPIC = "TP";
		public static final String TOPICTYPE = "TPTY";
		public static final String PROGRESS_NOTE = "PN";
		public static final String REPORT = "RP";
		public static final String SELECT = "SELECT";
		
	}
	public final class COLOR {
		public static final String RED = "red";
		public static final String GREEN = "green";
		public static final String GREY = "grey";
	}
	
	public final class MSSQL{
		public final class LOGIC{
			public static final int TRUE = 1;
			public static final int FALSE = 0;
		}
	}
	
	public final class ASL_API{
		public static final String URL = "https://api.aslsecurities.com:443/service.aspx";
		public static final String ENCRYPE_KEY = "j0t5fTgOAy7$GaBG";
		public static final String VECTORY_KEY = "tZo93cMAzEza5sk9";
		public static final String TOKEN_KEY = "ZdEOXBBAAkY01X1zJjXsDMLi";
		public static final String APP_ID = "ASLHome1";
		
		public final class SERVICE{
			public static final String LOGIN = "CHKUSRPWD";
		}
	}
	
	private Constants() {}
}