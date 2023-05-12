package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalId{

	@JsonProperty("hidden")
	private boolean hidden;

	@JsonProperty("description")
	private String description;

	@JsonProperty("optional")
	private boolean optional;

	public boolean isHidden(){
		return hidden;
	}

	public String getDescription(){
		return description;
	}

	public boolean isOptional(){
		return optional;
	}
}