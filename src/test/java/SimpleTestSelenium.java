import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SimpleTestSelenium {
    private WebDriver driver;
    private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        explicitWait = new WebDriverWait(driver, 10);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

        driver.get("https://koelapp.testpro.io/");
        //driver.get("https://www.udemy.com");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled = false)
    public void googleSearch_OpenGooglePage_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.RETURN);
//        WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK']"));
//        searchButton.click();
        //WebElement se = driver.findElement(new By.ByXPath("//*[@name='btnK']"));

//        int maxTime = 10000;

//        while (maxTime > 0) {
//            try{
//                driver.findElement(By.xpath("//*[@alt='Web Scraping Using Selenium - Towards Data Science']"));
//                break;
//            } catch (NoSuchElementException err) {
//                Thread.sleep(500);
//                maxTime -= 500;
//                if (maxTime < 0) {
//                    throw new NoSuchElementException("Element not found");
//                }
//            }
//        }

        driver.findElement(By.xpath("//*[@alt='Web Scraping Using Selenium - Towards Data Science']")).click();
        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");
    }

    @Test(enabled = false)
    public void googleSearch_SearchForJava_SearchPageOpened() {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);
//        WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK']"));
//        searchButton.click();
        //WebElement se = driver.findElement(new By.ByXPath("//*[@name='btnK']"));
        Assert.assertEquals(driver.getTitle(), "java - Google Search");
    }

    @Test(enabled=false)
    public void udemy_SearchForJava_SearchPageOpened() throws InterruptedException {
        //Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.cssSelector("[data-purpose*='search-box']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);
    }

    @Test(enabled = false)
    public void login_CorrectCredentialsImplicitWait_LoggedToApp() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
        loginBtn.click();
        var homeBtn = driver.findElement(By.xpath("//*[@class='home active']"));
        homeBtn.click();
    }

    @Test(enabled = false)
    public void login_CorrectCredentialsExplicitWait_LoggedToApp() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
        loginBtn.click();

        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var homeBtn = driver.findElement(By.xpath("//*[@class='home active']"));
        homeBtn.click();
    }

    @Test(enabled = true)
    public void login_CorrectCredentialsFluentWait_LoggedToApp() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginBtn = driver.findElement(By.xpath("//*[@type='submit']"));
        loginBtn.click();

        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='home active']")));
        var homeBtn = driver.findElement(By.xpath("//*[@class='home active']"));
        homeBtn.click();
    }
}