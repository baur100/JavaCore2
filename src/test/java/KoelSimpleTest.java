import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
=======
>>>>>>> 0e3a573... S5
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
<<<<<<< HEAD
import org.testng.Assert;
=======
>>>>>>> 0e3a573... S5
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 0e3a573... S5
import java.util.concurrent.TimeUnit;

public class KoelSimpleTest {
    private WebDriver driver;
<<<<<<< HEAD
    //private WebDriverWait explicitWait;
=======
    private WebDriverWait explicitWait;
>>>>>>> 0e3a573... S5
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

<<<<<<< HEAD
        // explicitWait = new WebDriverWait(driver, 10);
=======
        explicitWait = new WebDriverWait(driver, 10);
>>>>>>> 0e3a573... S5
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
<<<<<<< HEAD
=======

>>>>>>> 0e3a573... S5
        driver.get("https://koelapp.testpro.io/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
<<<<<<< HEAD

    @Test(enabled = false)
    public void login_CorrectCredentials_LoggedToApp() {
=======
    @Test
    public void login_CorrectCredentials_LoggedToApp(){
>>>>>>> 0e3a573... S5
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }
<<<<<<< HEAD

    @Test(enabled = false)
    public void login_CorrectCredentialsExplicitWait_LoggedToApp() {
=======
    @Test
    public void login_CorrectCredentialsExplicitWait_LoggedToApp(){
>>>>>>> 0e3a573... S5
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

<<<<<<< HEAD
        //explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
=======
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
>>>>>>> 0e3a573... S5
        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }

<<<<<<< HEAD
    @Test(enabled = true)
    public void login_IncorrectCredentialsFluent_CantLogin() {
=======
    @Test
    public void login_CorrectCredentialsFluent_LoggedToApp(){
>>>>>>> 0e3a573... S5
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
<<<<<<< HEAD
        password.sendKeys("*************");
=======
        password.sendKeys("te$t$tudent02");
>>>>>>> 0e3a573... S5

        var loginButton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginButton.click();

<<<<<<< HEAD
        fluentWait.until(x -> x.findElement(By.className("error")));
        List<WebElement> error = driver.findElements(By.xpath("//*[@class='error']"));

        Assert.assertEquals(error.size(), 1, "Element not found");
        Assert.assertTrue(true);

    }
}
=======
        fluentWait.until(x->x.findElement(By.xpath("//*[@class='home active']")).isDisplayed());
//        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='home active']")));
        var homeButton = driver.findElement(By.xpath("//*[@class='home active']"));
        homeButton.click();
    }
}
>>>>>>> 0e3a573... S5
