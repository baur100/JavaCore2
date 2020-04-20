package shw5;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelSuccessfulLogin {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginKoel_SuccessfulLogin_userAbleToLogin() {
        var emailField = driver.findElement(By.cssSelector("[type='email']"));
        emailField.sendKeys("testpro.user02@testpro.io");

        var passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.cssSelector("[type='submit']"));
        loginButton.click();

        Assert.assertTrue(fluentWait.until(driver -> driver.findElement(By.xpath("//*[@id='sidebar']")).isDisplayed()));
    }



}
