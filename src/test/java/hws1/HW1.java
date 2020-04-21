package hws1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW1 {
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

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.get("https://koelapp.testpro.io/");
        driver.get("https://java.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

//    @Test
//    public void login_CorrectCredentials_LoggedToApp() {
//        var email = driver.findElement(By.xpath("//*[@type='email']"));
//        email.sendKeys("testpro.user02@testpro.io");
//
//        var password = driver.findElement(By.xpath("//*[@type='password']"));
//        password.sendKeys("te$t$tudent02");
//
//        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
//        loginButton.click();
//        Assert.assertEquals(driver.getTitle(), "Java - Google Search");
////        var homeButton = driver.findElement(By.xpath("//*[@input type=\"search\"]"));
////        homeButton.click();

@Test
    public void googleSearch_SearchForJava_SearchPageOpened() {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN); 

        Assert.assertEquals(driver.getTitle(), "Java - Google Search");
    }
}
