package testConfigurations;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"/Users/oxanacascaval/Desktop/AutomationJava/src/main/resources/features/Demo"},
        glue = {"StepDefinitions"},
        plugin = { "pretty", "html:/Users/oxanacascaval/Desktop/AutomationJava/target/cucumber-reports/index.html" },
        monochrome = true
)

public class DemoTest {
}