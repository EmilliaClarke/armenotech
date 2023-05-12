package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualReceiver{

	@JsonProperty("description")
	private String description;

	public String getDescription(){
		return description;
	}
}