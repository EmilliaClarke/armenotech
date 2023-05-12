package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Types{
    @JsonProperty("individual_sender")
    public IndividualSender getIndividual_sender() { 
		 return this.individual_sender; } 
    public void setIndividual_sender(IndividualSender individual_sender) { 
		 this.individual_sender = individual_sender; } 
    IndividualSender individual_sender;
    @JsonProperty("individual_receiver") 
    public IndividualReceiver getIndividual_receiver() { 
		 return this.individual_receiver; } 
    public void setIndividual_receiver(IndividualReceiver individual_receiver) { 
		 this.individual_receiver = individual_receiver; } 
    IndividualReceiver individual_receiver;
}
