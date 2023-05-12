package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction{
    @JsonProperty("remit_method")
    public RemitMethod getRemit_method() { 
		 return this.remit_method; } 
    public void setRemit_method(RemitMethod remit_method) { 
		 this.remit_method = remit_method; } 
    RemitMethod remit_method;
    @JsonProperty("deposit_method") 
    public DepositMethod getDeposit_method() { 
		 return this.deposit_method; } 
    public void setDeposit_method(DepositMethod deposit_method) { 
		 this.deposit_method = deposit_method; } 
    DepositMethod deposit_method;
}
