package testCases;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import Pages.LoginPage;

public class LoginDemoTest {
    @Test

    public static void main(String[] args) throws InterruptedException {
        WebDriver browser;

        //Initiating your chromedriver
        browser = new ChromeDriver();

        // Navigate to URL
        browser.get(LoginPage.LoginiURL);

        Thread.sleep(5000);

        WebElement header = browser.findElement(By.xpath(LoginPage.LoginButton));
        assertTrue((header.isDisplayed()));
        header.click();
        Thread.sleep(5000);

        browser.close();    }
}