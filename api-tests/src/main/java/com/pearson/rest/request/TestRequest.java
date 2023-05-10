package com.pearson.rest.request;

import com.kratos.core.helpers.Context;
import com.kratos.core.rest.request.BaseAPIRequest;
import com.pearson.dto.Data;
import com.pearson.rest.endpoints.Endpoints;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import static com.kratos.core.constans.Constants.REST_RESPONSE;
import static com.pearson.constants.Constants.USER;

@Component
public class TestRequest extends BaseAPIRequest {

    public void sendGetUserById(String userID) {
        Response response = getRequest(String.format(Endpoints.GET_USER, userID), HttpStatus.SC_OK);
        Context.saveSharedParameter(REST_RESPONSE, response);
        Data payment = response.as(Data.class);
        Context.saveSharedParameter(USER, payment);
    }
}