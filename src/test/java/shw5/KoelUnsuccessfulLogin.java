package shw5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoelUnsuccessfulLogin {
    private WebDriver driver;
   private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);

        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void koelLogin_WrongEmail_UserUnableToLogin() throws InterruptedException {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.i");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();


        fluentWait.until(driver->driver.findElement(By.xpath("//*[@class='error']")));
        var error = driver.findElement(By.xpath("//*[@class='error']"));
        var borderColor=error.getCssValue("border-color");
        Assert.assertEquals(borderColor,"rgb(142, 73, 71)");
    }
}
