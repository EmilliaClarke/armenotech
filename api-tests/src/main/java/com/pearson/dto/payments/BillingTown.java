package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingTown{
    @JsonProperty("optional")
    public boolean getOptional() { 
		 return this.optional; } 
    public void setOptional(boolean optional) { 
		 this.optional = optional; } 
    boolean optional;
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
