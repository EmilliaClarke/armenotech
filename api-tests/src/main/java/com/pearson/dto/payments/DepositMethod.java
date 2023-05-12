package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DepositMethod{
    @JsonProperty("description")
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
    @JsonProperty("choices") 
    public ArrayList<String> getChoices() {
		 return this.choices; } 
    public void setChoices(ArrayList<String> choices) { 
		 this.choices = choices; } 
    ArrayList<String> choices;
}
