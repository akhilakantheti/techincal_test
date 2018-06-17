package com.amazon.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/html-output","json:target/cucumber.json"},
        features = "classpath:featurefiles",
        tags="@automated")
public class CucumberRunTest {
}
