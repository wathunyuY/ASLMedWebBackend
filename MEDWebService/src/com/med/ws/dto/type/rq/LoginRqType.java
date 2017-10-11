package com.med.ws.dto.type.rq;

import com.auth0.jwt.internal.com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(Include.NON_NULL)
public class LoginRqType {
	protected String name;
	protected String password;
	protected String fcmToken;

	@JsonCreator
	public LoginRqType(@JsonProperty(value = "name", required = true) String name, @JsonProperty(value = "password", required = true) String password) throws JsonMappingException {
		if(name == null){
			throw new JsonMappingException("");
		}
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFcmToken() {
		return fcmToken;
	}

	public void setFcmToken(String fcmToken) {
		this.fcmToken = fcmToken;
	}

}
