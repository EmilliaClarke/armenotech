package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToFirstName{
    @JsonProperty("description")
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("weight") 
    public int getWeight() { 
		 return this.weight; } 
    public void setWeight(int weight) { 
		 this.weight = weight; } 
    int weight;
}
