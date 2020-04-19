package shw1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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

    @Test(priority = 1)
    public void koelApp_ValidLoginCredentials_UserAccessGranted() {
        // Locate elements using CSS Selector
        var email = driver.findElement(By.cssSelector("[type='email']"));
        var password = driver.findElement(By.cssSelector("[type='password']"));
        var submitBtn = driver.findElement(By.cssSelector("[type='submit']"));

        email.sendKeys("testpro.user02@testpro.io");
        password.sendKeys("te$t$tudent02");
        submitBtn.click();

        Assert.assertTrue(wait.until(driver -> driver.findElement(By.cssSelector(".logout")).isDisplayed()));
    }

    @Test(priority = 2)
    public void koelApp_InvalidLoginCredentials_UserAccessRejected() {
        // Locate elements using XPath
        var email = driver.findElement(By.xpath("//input[@type='email']"));
        var password = driver.findElement(By.xpath("//input[@type='password']"));
        var submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        email.sendKeys("test@testpro.io");
        password.sendKeys("test@3121312#");
        submitBtn.click();

        Assert.assertTrue(wait.until(driver -> driver.findElement(By.xpath("//form[@class='error']")).isDisplayed()));

//        wait.until(driver -> driver.findElement(By.xpath("//form[@class='error']")));
//        Assert.assertEquals(driver.findElement(By.xpath("//form[@class='error']"))
//                                  .getCssValue("border-color"), "rgb(142, 73, 71)");
    }
}
