package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATCLP{

	@JsonProperty("sep12")
	private Sep12 sep12;

	@JsonProperty("fields")
	private Fields fields;

	@JsonProperty("enabled")
	private boolean enabled;

	@JsonProperty("authentication_required")
	private boolean authenticationRequired;

	public Sep12 getSep12(){
		return sep12;
	}

	public Fields getFields(){
		return fields;
	}

	public boolean isEnabled(){
		return enabled;
	}

	public boolean isAuthenticationRequired(){
		return authenticationRequired;
	}
}