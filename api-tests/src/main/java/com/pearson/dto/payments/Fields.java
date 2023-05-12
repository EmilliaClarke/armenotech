package com.pearson.dto.payments;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Fields{
    @JsonProperty("r:c131a779-b4ce-4100-a421-6e51ebfb5ed6")
    RC131a779B4ce4100A4216e51ebfb5ed6 a;
    /*

     */
    @JsonProperty("06360618-e442-41e4-8140-e95b051b333b:5d40cd5a-f57c-410e-a4ed-ef5f51286f04")
    RC131a779B4ce4100A4216e51ebfb5ed6 d;
    @JsonProperty("transaction")
    public Transaction getTransaction() { 
		 return this.transaction; } 
    public void setTransaction(Transaction transaction) { 
		 this.transaction = transaction; } 
    Transaction transaction;
    @JsonProperty("external_id") 
    public ExternalId getExternal_id() { 
		 return this.external_id; } 
    public void setExternal_id(ExternalId external_id) { 
		 this.external_id = external_id; } 
    ExternalId external_id;
    @JsonProperty("status_callback_url") 
    public StatusCallbackUrl getStatus_callback_url() { 
		 return this.status_callback_url; } 
    public void setStatus_callback_url(StatusCallbackUrl status_callback_url) { 
		 this.status_callback_url = status_callback_url; } 
    StatusCallbackUrl status_callback_url;
    @JsonProperty("to_bank_card") 
    public ToBankCard getTo_bank_card() { 
		 return this.to_bank_card; } 
    public void setTo_bank_card(ToBankCard to_bank_card) { 
		 this.to_bank_card = to_bank_card; } 
    ToBankCard to_bank_card;
    @JsonProperty("to_first_name") 
    public ToFirstName getTo_first_name() { 
		 return this.to_first_name; } 
    public void setTo_first_name(ToFirstName to_first_name) { 
		 this.to_first_name = to_first_name; } 
    ToFirstName to_first_name;
    @JsonProperty("to_last_name") 
    public ToLastName getTo_last_name() { 
		 return this.to_last_name; } 
    public void setTo_last_name(ToLastName to_last_name) { 
		 this.to_last_name = to_last_name; } 
    ToLastName to_last_name;
    @JsonProperty("r:88ade726-91d6-4331-b78a-45f54e488f29") 
    R88ade72691d64331B78a45f54e488f29 b;
    @JsonProperty("r:a9ec404b-f76b-4538-8dbb-11a2cd1659c2") 
    RA9ec404bF76b45388dbb11a2cd1659c2 c;
    @JsonProperty("billing_post_code") 
    public BillingPostCode getBilling_post_code() { 
		 return this.billing_post_code; } 
    public void setBilling_post_code(BillingPostCode billing_post_code) { 
		 this.billing_post_code = billing_post_code; } 
    BillingPostCode billing_post_code;
    @JsonProperty("billing_street") 
    public BillingStreet getBilling_street() { 
		 return this.billing_street; } 
    public void setBilling_street(BillingStreet billing_street) { 
		 this.billing_street = billing_street; } 
    BillingStreet billing_street;
    @JsonProperty("billing_town") 
    public BillingTown getBilling_town() { 
		 return this.billing_town; } 
    public void setBilling_town(BillingTown billing_town) { 
		 this.billing_town = billing_town; } 
    BillingTown billing_town;
    @JsonProperty("from_country") 
    public FromCountry getFrom_country() { 
		 return this.from_country; } 
    public void setFrom_country(FromCountry from_country) { 
		 this.from_country = from_country; } 
    FromCountry from_country;
    @JsonProperty("from_email") 
    public FromEmail getFrom_email() { 
		 return this.from_email; } 
    public void setFrom_email(FromEmail from_email) { 
		 this.from_email = from_email; } 
    FromEmail from_email;
    @JsonProperty("redirect_url") 
    public RedirectUrl getRedirect_url() { 
		 return this.redirect_url; } 
    public void setRedirect_url(RedirectUrl redirect_url) { 
		 this.redirect_url = redirect_url; } 
    RedirectUrl redirect_url;

}
