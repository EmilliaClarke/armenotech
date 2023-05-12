package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToBankCard{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("validation")
	private Validation validation;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}

	public Validation getValidation(){
		return validation;
	}
}