package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedirectUrl{
    @JsonProperty("description")
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("hidden") 
    public boolean getHidden() { 
		 return this.hidden; } 
    public void setHidden(boolean hidden) { 
		 this.hidden = hidden; } 
    boolean hidden;
    @JsonProperty("weight") 
    public int getWeight() { 
		 return this.weight; } 
    public void setWeight(int weight) { 
		 this.weight = weight; } 
    int weight;
}
