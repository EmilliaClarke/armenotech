package com.pearson.rest.endpoints;

import lombok.experimental.UtilityClass;


@UtilityClass
public class Endpoints {
    public static String GET_USER = "/api/users/%s";
    public static String GET_PAYMENTS_INFO = "/api/v2/payments/edeab824-178e-4fd7-9bf0-bd88a6fd114a/sep0031/info?countries=%s&asset=%s";

}