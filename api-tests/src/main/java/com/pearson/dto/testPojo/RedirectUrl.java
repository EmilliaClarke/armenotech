package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedirectUrl{

	@JsonProperty("hidden")
	private boolean hidden;

	@JsonProperty("description")
	private String description;

	@JsonProperty("hint")
	private String hint;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("optional")
	private boolean optional;

	@JsonProperty("choices")
	private List<String> choices;

	public boolean isHidden(){
		return hidden;
	}

	public String getDescription(){
		return description;
	}

	public String getHint(){
		return hint;
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