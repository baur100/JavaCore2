package homework5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.*;

public class KoelappTests {
    private WebDriver driver;
    private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        explicitWait = new WebDriverWait(driver, 10);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io/");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
   @Test
    public void Koelapp_LogIn_UserLoggedIn(){
       WebElement emailField = driver.findElement(xpath("//*[@id=\"app\"]/div/form/input[1]"));
       emailField.sendKeys("testpro.user02@testpro.io");
       emailField.sendKeys(Keys.ENTER);

       WebElement passwordField = driver.findElement(xpath("//*[@id=\"app\"]/div/form/input[2]"));
       passwordField.sendKeys("te$t$tudent02");

       WebElement loginBtn = driver.findElement(xpath("//*[@id=\"app\"]/div/form/button"));
       loginBtn.click();

       WebElement homeBtn = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/section[1]/ul/li[1]/a"));
       Assert.assertEquals(true, homeBtn.isDisplayed());
       }
       @Test
        public void Koelapp_UnsuccessfullLogIn_UserisnotLoggedIn(){
        WebElement emailField = driver.findElement(xpath("//*[@id=\"app\"]/div/form/input[1]"));
        emailField.sendKeys("testpro.user02@testpro.io");
        emailField.sendKeys(Keys.ENTER);

        WebElement loginBtn = driver.findElement(xpath("//*[@id=\"app\"]/div/form/button"));
        loginBtn.click();

        WebElement loginModal = driver.findElement(By.xpath("//*[@id=\"app\"]/div/form"));
        Assert.assertEquals(true, loginModal.isDisplayed());


       }
   }

