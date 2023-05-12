package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root1 {
    @JsonProperty("receive")
    public Receive getReceive() { 
		 return this.receive; } 
    public void setReceive(Receive receive) { 
		 this.receive = receive; } 
    Receive receive;
}
