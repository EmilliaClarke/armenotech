package com.pearson.dto.testPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FromCountry{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("optional")
	private boolean optional;

	@JsonProperty("choices")
	private List<String> choices;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}

	public boolean isOptional(){
		return optional;
	}

	public List<String> getChoices(){
		return choices;
	}
}