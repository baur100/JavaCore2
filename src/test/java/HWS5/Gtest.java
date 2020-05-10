package HWS5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Gtest {

    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;


    @BeforeMethod
    public void StartUp() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("http://google.com");

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(12))
                .pollingEvery(Duration.ofMillis(150))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

    }
    @AfterMethod
    public void Close() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
    @Parameters({"Search-query"})
    @Test
    public void googleSearchTest(String sQuery){
        fluentWait.until(x->x.findElement(By.cssSelector("[name='q']")).isDisplayed());
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(sQuery, Keys.ENTER);


        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='hdtb-mitem hdtb-msel hdtb-imb']")).isDisplayed());

    }


}
