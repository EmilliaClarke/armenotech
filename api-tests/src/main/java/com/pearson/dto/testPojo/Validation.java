package com.pearson.dto.testPojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Validation{

	@JsonProperty("kind")
	private String kind;

	@JsonProperty("rule")
	private List<String> rule;

	public String getKind(){
		return kind;
	}

	public List<String> getRule(){
		return rule;
	}
}