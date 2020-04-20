package shw5;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        
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
    public void login_CorrectCredentialsFluent_LoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='avatar']")).isDisplayed());
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='logout']")).isDisplayed());
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='name']")).isDisplayed());

        var avatar = driver.findElement(By.xpath("//*[@class='avatar']"));
        Assert.assertTrue(avatar.isEnabled());
        System.out.println("Avatar image is displayed");

//        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='userBadge']/a[1]/span)")).getText(), "kuser02");

        var logout = driver.findElement(By.xpath("//*[@class='logout']"));
        Assert.assertTrue(logout.isEnabled());
        System.out.println("Logout button is displayed");
        logout.click();
    }
    @Test
    public void login_IncorrectCredentialsFluent_NotLoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent03");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        var error = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(error.isDisplayed());

    }
}
