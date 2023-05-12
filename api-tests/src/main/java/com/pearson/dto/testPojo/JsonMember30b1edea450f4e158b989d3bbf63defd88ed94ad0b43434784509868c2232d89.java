package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember30b1edea450f4e158b989d3bbf63defd88ed94ad0b43434784509868c2232d89{

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
	private Object minAmount;

	@JsonProperty("label")
	private String label;

	@JsonProperty("mobile_logo_url")
	private String mobileLogoUrl;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("rate")
	private Object rate;

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
	private Object maxAmount;

	@JsonProperty("fields")
	private Fields fields;

	@JsonProperty("fee_percent")
	private int feePercent;

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

	public Object getMinAmount(){
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

	public Object getRate(){
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

	public Object getMaxAmount(){
		return maxAmount;
	}

	public Fields getFields(){
		return fields;
	}

	public int getFeePercent(){
		return feePercent;
	}

	public int getCustomerFeePercent(){
		return customerFeePercent;
	}

	public String getDirection(){
		return direction;
	}
}