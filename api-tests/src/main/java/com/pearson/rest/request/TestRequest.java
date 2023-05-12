package com.pearson.rest.request;

import com.kratos.core.helpers.Context;
import com.kratos.core.rest.request.BaseAPIRequest;
import com.pearson.rest.endpoints.Endpoints;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.kratos.core.constans.Constants.REST_RESPONSE;

@Component
public class TestRequest extends BaseAPIRequest {

    public void sendGetPaymentsByCountryAndAsset(String country, String asset) {
        Response response = getRequest(String.format(Endpoints.GET_PAYMENTS_INFO, country, asset), HttpStatus.SC_OK);
        Context.saveSharedParameter(REST_RESPONSE, response);
    }

    public void sendInvalidMethodToGetPaymentsByCountryAndAsset(String country, String asset) {
        Response response = postRequest(String.format(Endpoints.GET_PAYMENTS_INFO, country, asset),
                            HttpStatus.SC_METHOD_NOT_ALLOWED, "");
        Context.saveSharedParameter(REST_RESPONSE, response);
    }
}