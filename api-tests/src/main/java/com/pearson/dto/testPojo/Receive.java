package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Receive{

	@JsonProperty("ATBRL")
	private ATBRL aTBRL;

	@JsonProperty("ATUAH")
	private ATUAH aTUAH;

	@JsonProperty("ATVND")
	private ATVND aTVND;

	@JsonProperty("ATXOF")
	private ATXOF aTXOF;

	@JsonProperty("ATUSD")
	private ATUSD aTUSD;

	@JsonProperty("ATKZT")
	private ATKZT aTKZT;

	@JsonProperty("PURPLE")
	private PURPLE pURPLE;

	@JsonProperty("ATPEN")
	private ATPEN aTPEN;

	@JsonProperty("ATCLP")
	private ATCLP aTCLP;

	public ATBRL getATBRL(){
		return aTBRL;
	}

	public ATUAH getATUAH(){
		return aTUAH;
	}

	public ATVND getATVND(){
		return aTVND;
	}

	public ATXOF getATXOF(){
		return aTXOF;
	}

	public ATUSD getATUSD(){
		return aTUSD;
	}

	public ATKZT getATKZT(){
		return aTKZT;
	}

	public PURPLE getPURPLE(){
		return pURPLE;
	}

	public ATPEN getATPEN(){
		return aTPEN;
	}

	public ATCLP getATCLP(){
		return aTCLP;
	}
}