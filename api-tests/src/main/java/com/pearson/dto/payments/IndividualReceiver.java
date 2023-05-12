package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualReceiver{
    @JsonProperty("description")
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
}
