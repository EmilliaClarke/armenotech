package com.pearson.dto.testPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RemitMethod{

	@JsonProperty("description")
	private String description;

	@JsonProperty("choices")
	private List<String> choices;

	public String getDescription(){
		return description;
	}

	public List<String> getChoices(){
		return choices;
	}
}