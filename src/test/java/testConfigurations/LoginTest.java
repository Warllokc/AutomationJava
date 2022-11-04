package testConfigurations;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"/Users/alexandrpetricenco/Desktop/AutomationJava/src/main/resources/features/Login"},
        glue = {"StepDefinitions"},
        plugin = { "pretty", "html:/Users/alexandrpetricenco/Desktop/AutomationJava/target/cucumber-reports/index.html" },
        monochrome = true
)
    public class LoginTest {

    }