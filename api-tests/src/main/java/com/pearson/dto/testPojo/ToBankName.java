package com.pearson.dto.testPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ToBankName{

	@JsonProperty("description")
	private String description;

	@JsonProperty("choices")
	private List<String> choices;

	@JsonProperty("weight")
	private int weight;

	public String getDescription(){
		return description;
	}

	public List<String> getChoices(){
		return choices;
	}

	public int getWeight(){
		return weight;
	}
}