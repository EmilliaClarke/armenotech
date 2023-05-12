package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sep12{
    @JsonProperty("sender")
    public Sender getSender() { 
		 return this.sender; } 
    public void setSender(Sender sender) { 
		 this.sender = sender; } 
    Sender sender;
    @JsonProperty("receiver") 
    public Receiver getReceiver() { 
		 return this.receiver; } 
    public void setReceiver(Receiver receiver) { 
		 this.receiver = receiver; } 
    Receiver receiver;
}
