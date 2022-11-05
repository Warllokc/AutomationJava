package StepDefinitions;

import Pages.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import Pages.DemoPage;
import static org.junit.Assert.assertTrue;

public class DemoSecondDefinition {
    @Given("I have open the Google page")
    public void IHaveOpenTheGooglePage() throws InterruptedException {
        //Initiating your chromedriver
        browser = new ChromeDriver();
        // Navigate to URL
        browser.get(DemoPage.GoogleURL);
        Thread.sleep(3000);
    }

    @And("I see Google Page")
    public void ISeeGooglePage () throws InterruptedException{
        WebElement GoogleSearchBar = browser.findElement(By.xpath(DemoPage.GoogleSearchBar));
        assertTrue((GoogleSearchBar.isDisplayed()));
        Thread.sleep(1000);
    }
    @Then("I Close the Chrome browser")
    public void ICloseTheCromeBrowser () throws InterruptedException {
        Thread.sleep(1000);
        browser.close();
    }
    WebDriver browser;
}
