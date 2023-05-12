package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Types{

	@JsonProperty("individual_sender")
	private IndividualSender individualSender;

	@JsonProperty("individual_receiver")
	private IndividualReceiver individualReceiver;

	public IndividualSender getIndividualSender(){
		return individualSender;
	}

	public IndividualReceiver getIndividualReceiver(){
		return individualReceiver;
	}
}