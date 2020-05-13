import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Koelsimpletest {
    private WebDriver driver;
    private WebDriverWait explicitWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        explicitWait = new WebDriverWait(driver,10);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled = false)
    public void loginKoel(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginbutton.click();

        var home = driver.findElement(By.xpath("//*[@class='home active']"));
        home.click();
    }
    @Test
    public void waitexplicent(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginbutton.click();


        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var home = driver.findElement(By.xpath("//*[@class='home active']"));
        home.click();
    }
}