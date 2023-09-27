package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features",
        plugin = {"pretty", "html:out.html"},
        tags = "@edit",
        glue = "/src/test/java/org/example/saucedemo/SaucePageObjectSteps.java")

public class TestRunner {
}
