package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sender{

	@JsonProperty("types")
	private Types types;

	public Types getTypes(){
		return types;
	}
}