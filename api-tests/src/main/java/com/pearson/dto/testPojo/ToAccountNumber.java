package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToAccountNumber{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("hint")
	private String hint;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}

	public String getHint(){
		return hint;
	}
}