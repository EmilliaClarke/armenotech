package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction{

	@JsonProperty("remit_method")
	private RemitMethod remitMethod;

	@JsonProperty("deposit_method")
	private DepositMethod depositMethod;

	public RemitMethod getRemitMethod(){
		return remitMethod;
	}

	public DepositMethod getDepositMethod(){
		return depositMethod;
	}
}