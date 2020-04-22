package shw1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.time.Duration;

public class SHW1 {
    private WebDriver driver;
    private FluentWait<WebDriver> wait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test(enabled = true, priority = 1)
    public void koelApp_ValidLoginCredentials_UserAccessGranted() {
        // Locate elements using CSS Selector
        var email = driver.findElement(By.cssSelector("[type='email']"));
        var password = driver.findElement(By.cssSelector("[type='password']"));
        var submitBtn = driver.findElement(By.cssSelector("[type='submit']"));

        email.sendKeys("testpro.user02@testpro.io");
        password.sendKeys("te$t$tudent025");
        submitBtn.click();


        try {
            Assert.assertTrue(wait.until(driver -> driver.findElement(By.cssSelector(".logout")).isDisplayed()));
        } catch (StaleElementReferenceException | TimeoutException err) {
            Assert.assertFalse(wait.until(driver -> driver.findElement(By.cssSelector("[class='login-wrapper']")).isDisplayed()));
        }
    }

    @Test(enabled = false, priority = 2)
    public void koelApp_InvalidLoginCredentials_UserAccessRejected() {
        // Locate elements using XPath
        var email = driver.findElement(By.xpath("//input[@type='email']"));
        var password = driver.findElement(By.xpath("//input[@type='password']"));
        var submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("testpro.user02@testpro.io");
        password.sendKeys("te$t$tudent026");
        submitBtn.click();

        try {
            Assert.assertTrue(wait.until(driver -> driver
                    .findElement(By.xpath("//form[@class='error']")).isDisplayed()));
        } catch (StaleElementReferenceException | TimeoutException err) {
            Assert.assertFalse(wait.until(driver -> driver
                    .findElement(By.xpath("//div[@id='main']")).isDisplayed()));
        }
    }
}
