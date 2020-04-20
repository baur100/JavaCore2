package shw5;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelLoginTest {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        fluentWait = new FluentWait<WebDriver>(driver)
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
    // Module_WhatTesting_ExpectedResult
    public void login_ValidCredentials_LoggedToApp() {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@class='home active']")).isDisplayed());
        WebElement homeButton = driver.findElement(By.xpath("//*[@class='home active']"));

        Assert.assertEquals(homeButton.getText(), "Home");
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void login_InvalidUsernameCredentials_NotLoggedToApp() {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.i");

        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        WebElement redFrame = driver.findElement(By.xpath("//*[@class='error']"));

        Assert.assertTrue(redFrame.isDisplayed());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void login_InvalidPasswordCredentials_NotLoggedToApp() {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent01");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        WebElement redFrame = driver.findElement(By.xpath("//*[@class='error']"));

        Assert.assertTrue(redFrame.isDisplayed());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void login_InvalidUsernameAndPasswordCredentials_NotLoggedToApp() {
        WebElement email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.i");

        WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent01");

        WebElement submitButton = driver.findElement(By.xpath("//*[@type='submit']"));
        submitButton.click();

        fluentWait.until(x -> x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        WebElement redFrame = driver.findElement(By.xpath("//*[@class='error']"));

        Assert.assertTrue(redFrame.isDisplayed());
    }
}
