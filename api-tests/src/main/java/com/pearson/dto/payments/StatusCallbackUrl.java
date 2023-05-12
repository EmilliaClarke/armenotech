package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusCallbackUrl{
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
    @JsonProperty("hidden") 
    public boolean getHidden() { 
		 return this.hidden; } 
    public void setHidden(boolean hidden) { 
		 this.hidden = hidden; } 
    boolean hidden;
}
