package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
import java.util.List;

import static org.testng.Assert.*;

public class KoelTestLogin {
    private WebDriver driver;
//    private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

//        explicitWait = new WebDriverWait(driver, 20);
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
    @Test
    public void login_CorrectCredentials_LoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var yourMusic = driver.findElement(By.xpath("//*[@class='music']"));
        assertTrue(yourMusic.isDisplayed());
//        WebElement Search = driver.findElement(By.xpath("//*[@id='searchForm']"));
//        Assert.assertTrue(Search.isDisplayed());

//        Assert.assertEquals(driver.findElements(By.xpath("//*[@type='search']")), "[]");
    }

    @Test
    public void login_WithIncorrectCredentials_CantLogin(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent024");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();
        fluentWait.until(x->x.findElement(By.className("error")));
//        boolean isDisplayed = driver.findElement(By.xpath("//*[@class='error']")).isDisplayed();
//        if (isDisplayed){
//            System.out.println("Exist");
//        }else{
//            System.out.println("Not exist");
//        }

        List<WebElement> error = driver.findElements(By.xpath("//*[@class='error']"));
        Assert.assertEquals(error.size(),1);


    }
}
