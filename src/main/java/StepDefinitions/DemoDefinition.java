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

public class DemoDefinition {
    @Given("I have open the amazon web app")
    public void iHaveOpenAmazonTheWebApp() throws InterruptedException {
        //Initiating your chromedriver
        browser = new ChromeDriver();
        // Navigate to URL
        browser.get("https://amazon.com");
        Thread.sleep(5000);
    }

    @And("I see Amazon Page")
    public void ISeeAmazonPAge () throws InterruptedException{
        WebElement BrandBannerIcon = browser.findElement(By.xpath(DemoPage.BrandBannerIcon));
        assertTrue((BrandBannerIcon.isDisplayed()));
        Thread.sleep(1000);
    }

    @Then("I Close the browser")
    public void ICloseTheBrowser () throws InterruptedException {

        Thread.sleep(1000);

        browser.close();
    }


    WebDriver browser;


}
