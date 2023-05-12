package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Receiver{

	@JsonProperty("receive")
	private Receive receive;

	@JsonProperty("types")
	private Types types;

	public Receive getReceive(){
		return receive;
	}

	public Types getTypes(){
		return types;
	}
}