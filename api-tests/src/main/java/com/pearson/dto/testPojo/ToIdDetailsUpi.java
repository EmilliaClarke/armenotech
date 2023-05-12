package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToIdDetailsUpi{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}
}