import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class hw_5 {

    private WebDriver driver;

    @BeforeMethod
    public void myTestKoelapp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void successfulLogin() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertEquals(homeButton.getText(), "Home");

    }

    @Test
    public void incorrectLoginWithWrongPassword() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("qwe");
        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var redAlert = driver.findElement(By.xpath("//*[@ class='error']"));
        Assert.assertTrue(redAlert.isDisplayed());

    }

    @Test
    public void incorrectLoginWithWrongEmail() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.usr02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();
        var redAlert = driver.findElement(By.xpath("//*[@ class='error']"));
        Assert.assertTrue(redAlert.isDisplayed());
    }

    @Test
    public void successfulLogin2() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");
        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");
        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var logoutButton = driver.findElement(By.xpath("//*[@ class='fa fa-sign-out control']"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}
