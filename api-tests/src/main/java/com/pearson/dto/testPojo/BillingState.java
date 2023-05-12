package com.pearson.dto.testPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingState{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("choices")
	private List<String> choices;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}

	public List<String> getChoices(){
		return choices;
	}
}