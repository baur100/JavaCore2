import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class KoelSimpleTest {
    private WebDriver driver;
    //private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        // explicitWait = new WebDriverWait(driver, 10);
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
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled = false)
    public void login_CorrectCredentials_LoggedToApp() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
        WebElement addButton = driver.findElement(By.cssSelector(".fa.fa-plus-circle"));
        addButton.click();
        WebElement newNameField = driver.findElement(By.xpath("//*[@class='create']/input"));
        newNameField.sendKeys("hey");
        newNameField.sendKeys(Keys.ENTER);


    }

    @Test(enabled = false)
    public void login_CorrectCredentialsExplicitWait_LoggedToApp() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        //explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }

    @Test(enabled = true)
    public void login_IncorrectCredentialsFluent_CantLogin() {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("*************");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        fluentWait.until(x -> x.findElement(By.className("error")));
        List<WebElement> error = driver.findElements(By.xpath("//*[@class='error']"));

        Assert.assertEquals(error.size(), 1, "Element not found");
        Assert.assertTrue(true);

    }
}