package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingTown{

	@JsonProperty("description")
	private String description;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("optional")
	private boolean optional;

	public String getDescription(){
		return description;
	}

	public int getWeight(){
		return weight;
	}

	public boolean isOptional(){
		return optional;
	}
}