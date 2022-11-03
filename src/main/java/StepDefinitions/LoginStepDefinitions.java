package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import Pages.LandingPage;
import io.cucumber.java.en.Given;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitions {
    @Given("I have open the web app")
    public void iHaveOpenTheWebApp() throws InterruptedException {
        //Initiating your chromedriver
        browser = new ChromeDriver();
        // Navigate to URL
        browser.get(LoginPage.LoginiURL);
        Thread.sleep(5000);
    }
    @And("I insert Username into the Username text field")
    public void IinsertUsernameIntoTheUsernameTextField () throws InterruptedException {
        WebElement UsernameTextField = browser.findElement(By.xpath(LoginPage.UsernameTextField));
        assertTrue((UsernameTextField.isDisplayed()));
        UsernameTextField.click();
        Thread.sleep(1000);
        UsernameTextField.sendKeys(LoginPage.Username);
        Thread.sleep(1000);
    }
    @And("I insert Password into the Password text field")
    public void IinsertUsernameIntoThePasswordTextField () throws InterruptedException {
        WebElement PasswordTextField = browser.findElement(By.xpath(LoginPage.PasswordTextField));
        assertTrue((PasswordTextField.isDisplayed()));
        PasswordTextField.click();
        Thread.sleep(1000);
        PasswordTextField.sendKeys(LoginPage.Password);
        Thread.sleep(1000);
    }

    @And("I Click Login button")
    public void IClickLoginButton () throws InterruptedException {
        WebElement LoginButton = browser.findElement(By.xpath(LoginPage.LoginButton));
        assertTrue((LoginButton.isDisplayed()));
        LoginButton.click();
        Thread.sleep(5000);
    }
    @Then("I should See Landing Page of the web app")
    public void IShouldSeeLandingPageOfTheWebApp () throws InterruptedException {
        WebElement BrandBannerIcon = browser.findElement(By.xpath(LandingPage.BrandBannerIcon));
        assertTrue((BrandBannerIcon.isDisplayed()));
        Thread.sleep(1000);

        browser.close();
}
    WebDriver browser;
}
