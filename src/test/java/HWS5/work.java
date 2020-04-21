package HWS5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class work {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io");
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(80))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test //positive testing - Correct login with correct credentials
    public void login_CorrectCredentialsLoginForm() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.cssSelector("[type = 'submit']")).isDisplayed());
        driver.findElement(By.cssSelector("[type = 'email']")).sendKeys("testpro.user02@testpro.io");
        driver.findElement(By.cssSelector("[type = 'password']")).sendKeys("te$t$tudent02");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='logout']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='logout']")).isDisplayed());
    }
    @Test  //negative - verifying incorrect authorization form behavior
    public void login_InCorrectCredentialsLoginForm() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.cssSelector("[type = 'submit']")).isDisplayed());
        driver.findElement(By.cssSelector("[type = 'email']")).sendKeys("testpro.user02t@estpro.io");//testpro.user02@testpro.io
        driver.findElement(By.cssSelector("[type = 'password']")).sendKeys("te$t$tudent02");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='error']")).isDisplayed());

    }



}
