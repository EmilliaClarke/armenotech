package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATBRL{
    @JsonProperty("fields")
    public Fields getFields() { 
		 return this.fields; } 
    public void setFields(Fields fields) { 
		 this.fields = fields; } 
    Fields fields;
    @JsonProperty("sep12") 
    public Sep12 getSep12() { 
		 return this.sep12; } 
    public void setSep12(Sep12 sep12) { 
		 this.sep12 = sep12; } 
    Sep12 sep12;
    @JsonProperty("enabled") 
    public boolean getEnabled() { 
		 return this.enabled; } 
    public void setEnabled(boolean enabled) { 
		 this.enabled = enabled; } 
    boolean enabled;
    @JsonProperty("authentication_required") 
    public boolean getAuthentication_required() { 
		 return this.authentication_required; } 
    public void setAuthentication_required(boolean authentication_required) { 
		 this.authentication_required = authentication_required; } 
    boolean authentication_required;
}
