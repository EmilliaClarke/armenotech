package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Receive{
    @JsonProperty("ATBRL")
    public ATBRL getATBRL() { 
		 return this.aTBRL; } 
    public void setATBRL(ATBRL aTBRL) { 
		 this.aTBRL = aTBRL; } 
    ATBRL aTBRL;
    @JsonProperty("ATUAH") 
    public ATUAH getATUAH() { 
		 return this.aTUAH; } 
    public void setATUAH(ATUAH aTUAH) { 
		 this.aTUAH = aTUAH; } 
    ATUAH aTUAH;
    @JsonProperty("ATUSD") 
    public ATUSD getATUSD() { 
		 return this.aTUSD; } 
    public void setATUSD(ATUSD aTUSD) { 
		 this.aTUSD = aTUSD; } 
    ATUSD aTUSD;
    @JsonProperty("PURPLE") 
    public PURPLE getPURPLE() { 
		 return this.pURPLE; } 
    public void setPURPLE(PURPLE pURPLE) { 
		 this.pURPLE = pURPLE; } 
    PURPLE pURPLE;
}
