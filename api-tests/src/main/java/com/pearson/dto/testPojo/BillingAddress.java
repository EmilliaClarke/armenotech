package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingAddress{

	@JsonProperty("hint")
	private String hint;

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	public String getHint(){
		return hint;
	}

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}
}