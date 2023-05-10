package com.pearson.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import com.pearson.CucumberConfig;

@CucumberContextConfiguration
@ContextConfiguration(classes = CucumberConfig.class)
public class CucumberSpringContextConfiguration {

    @Before
    public void setUp() {
    }

}
