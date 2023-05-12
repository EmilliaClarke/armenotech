package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sender{
    @JsonProperty("types")
    public Types getTypes() { 
		 return this.types; } 
    public void setTypes(Types types) { 
		 this.types = types; } 
    Types types;
}
