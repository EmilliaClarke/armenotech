package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sep12{

	@JsonProperty("receiver")
	private Receiver receiver;

	@JsonProperty("sender")
	private Sender sender;

	public Receiver getReceiver(){
		return receiver;
	}

	public Sender getSender(){
		return sender;
	}
}