package com.pearson.stepDefs;

import com.pearson.rest.request.TestRequest;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;


public class TestScenarioStepDefs {

    @Autowired
    TestRequest testRequest;

    @Given("get payments by country: (.*) and asset: (.*) id$")
    public void get_payments_by_country_asset(String country, String asset) {
        testRequest.sendGetPaymentsByCountryAndAsset(country, asset);
    }

    @Given("send invalid post method to get payments by country: (.*) and asset: (.*) id$")
    public void post_invalid_payments_by_country_asset(String country, String asset) {
        testRequest.sendInvalidMethodToGetPaymentsByCountryAndAsset(country, asset);
    }


}
