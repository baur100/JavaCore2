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
import java.util.concurrent.TimeUnit;

public class KoelSimpleTest {
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
                .pollingEvery(Duration.ofMillis(700))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled = true)
    public void loginKoel() throws InterruptedException {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginbutton.click();

//        Thread.sleep(2000);
        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed());


//        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
//        Thread.sleep(2000);
        var creatplaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        creatplaylist.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys("Denisplaylist");
        searchField.sendKeys(Keys.ENTER);

        var logout = driver.findElement(By.xpath("//*[@class='fa fa-sign-out control']"));

        Assert.assertEquals(driver.getCurrentUrl(), "https://koelapp.testpro.io/");
    }

    @Test(enabled = false)
    public void login_CorrectCredentials_LoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }
    @Test(enabled = false)
    public void login_CorrectCredentialsExplicitWait_LoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }

    @Test(enabled = false)
    public void login_CorrectCredentialsFluent_LoggedToApp(){
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='home active']")).isDisplayed());
//        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }
}
