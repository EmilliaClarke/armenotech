package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember285622c6Fd834cb681eaD78727acba6e2d498a8cF28c416a90092aec42492f2b{

	@JsonProperty("fee_fixed")
	private int feeFixed;

	@JsonProperty("payment_group_name")
	private String paymentGroupName;

	@JsonProperty("customer_kind")
	private String customerKind;

	@JsonProperty("customer_fee_fixed")
	private int customerFeeFixed;

	@JsonProperty("logo_url")
	private String logoUrl;

	@JsonProperty("min_amount")
	private int minAmount;

	@JsonProperty("label")
	private String label;

	@JsonProperty("mobile_logo_url")
	private String mobileLogoUrl;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("rate")
	private int rate;

	@JsonProperty("delivery_currency")
	private String deliveryCurrency;

	@JsonProperty("digits_delivery")
	private int digitsDelivery;

	@JsonProperty("payment_group")
	private String paymentGroup;

	@JsonProperty("guid")
	private String guid;

	@JsonProperty("digits_asset")
	private int digitsAsset;

	@JsonProperty("max_amount")
	private int maxAmount;

	@JsonProperty("fields")
	private Fields fields;

	@JsonProperty("fee_percent")
	private Object feePercent;

	@JsonProperty("customer_fee_percent")
	private int customerFeePercent;

	@JsonProperty("direction")
	private String direction;

	public int getFeeFixed(){
		return feeFixed;
	}

	public String getPaymentGroupName(){
		return paymentGroupName;
	}

	public String getCustomerKind(){
		return customerKind;
	}

	public int getCustomerFeeFixed(){
		return customerFeeFixed;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public int getMinAmount(){
		return minAmount;
	}

	public String getLabel(){
		return label;
	}

	public String getMobileLogoUrl(){
		return mobileLogoUrl;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public int getRate(){
		return rate;
	}

	public String getDeliveryCurrency(){
		return deliveryCurrency;
	}

	public int getDigitsDelivery(){
		return digitsDelivery;
	}

	public String getPaymentGroup(){
		return paymentGroup;
	}

	public String getGuid(){
		return guid;
	}

	public int getDigitsAsset(){
		return digitsAsset;
	}

	public int getMaxAmount(){
		return maxAmount;
	}

	public Fields getFields(){
		return fields;
	}

	public Object getFeePercent(){
		return feePercent;
	}

	public int getCustomerFeePercent(){
		return customerFeePercent;
	}

	public String getDirection(){
		return direction;
	}
}