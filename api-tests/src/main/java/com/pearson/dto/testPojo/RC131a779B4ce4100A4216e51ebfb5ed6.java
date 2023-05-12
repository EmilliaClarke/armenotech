package com.pearson.dto.testPojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RC131a779B4ce4100A4216e51ebfb5ed6{

	@JsonProperty("delivery_digits")
	private int deliveryDigits;

	@JsonProperty("payment_group_name")
	private String paymentGroupName;

	@JsonProperty("customer_kind")
	private String customerKind;

	@JsonProperty("customer_fee_fixed")
	private int customerFeeFixed;

	@JsonProperty("fee_percent_min")
	private int feePercentMin;

	@JsonProperty("logo_url")
	private String logoUrl;

	@JsonProperty("min_amount")
	private Object minAmount;

	@JsonProperty("fee_percent_max")
	private int feePercentMax;

	@JsonProperty("asset_digits")
	private int assetDigits;

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

	@JsonProperty("fee_fixed_min")
	private int feeFixedMin;

	@JsonProperty("payment_group")
	private String paymentGroup;

	@JsonProperty("guid")
	private String guid;

	@JsonProperty("fee_fixed_max")
	private int feeFixedMax;

	@JsonProperty("max_amount")
	private Object maxAmount;

	@JsonProperty("customer_fee_percent")
	private int customerFeePercent;

	@JsonProperty("fields")
	private Fields fields;

	@JsonProperty("direction")
	private String direction;

	public int getDeliveryDigits(){
		return deliveryDigits;
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

	public int getFeePercentMin(){
		return feePercentMin;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public Object getMinAmount(){
		return minAmount;
	}

	public int getFeePercentMax(){
		return feePercentMax;
	}

	public int getAssetDigits(){
		return assetDigits;
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

	public int getFeeFixedMin(){
		return feeFixedMin;
	}

	public String getPaymentGroup(){
		return paymentGroup;
	}

	public String getGuid(){
		return guid;
	}

	public int getFeeFixedMax(){
		return feeFixedMax;
	}

	public Object getMaxAmount(){
		return maxAmount;
	}

	public int getCustomerFeePercent(){
		return customerFeePercent;
	}

	public Fields getFields(){
		return fields;
	}

	public String getDirection(){
		return direction;
	}
}