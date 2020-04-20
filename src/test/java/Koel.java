import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Koel {
    private WebDriver driver;
    private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;


    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fluentWait = new FluentWait<WebDriver>(driver)
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

    @Test(enabled = true)
    public void loginKoel() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginbutton.click();

        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        var creatplaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        creatplaylist.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys("Denisplaylist");
        searchField.sendKeys(Keys.ENTER);

        var logout = driver.findElement(By.xpath("//*[@class='fa fa-sign-out control']"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://koelapp.testpro.io/");
    }
}