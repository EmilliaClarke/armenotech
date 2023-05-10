package com.pearson.stepDefs;

import com.pearson.rest.request.TestRequest;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;


public class TestScenarioStepDefs {

    @Autowired
    TestRequest testRequest;

    @Given("get user test scenario by (.*) id$")
    public void get_users_test_scenario(String userId) {
        testRequest.sendGetUserById(userId);
    }
}
