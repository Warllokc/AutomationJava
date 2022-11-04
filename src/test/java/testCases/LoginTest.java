package testCases;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = {"/Users/alexandrpetricenco/Desktop/AutomationJava/src/main/resources/features"},
        glue = {"StepDefinitions"},
        plugin = { "pretty", "html:/Users/alexandrpetricenco/Desktop/AutomationJava/target/cucumber-reports/index.html" },
        monochrome = true
)
    public class LoginTest {

    }