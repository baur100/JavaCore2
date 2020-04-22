package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class hw5 {
    private WebDriver driver;
    private WebDriverWait explicitWait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp (){
        System.setProperty("webdriver.chrome.driver","chromedriver");
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
    public void positive_logIn_Correct_Credetials() throws InterruptedException {

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        emailField.sendKeys("testpro.user02@testpro.io");
        WebElement passwordField = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        passwordField.sendKeys("te$t$tudent02");
        var logInButton = driver.findElement(By.xpath("//*[@type='submit']"));
        logInButton.click();


        fluentWait.until(x->x.findElement(By.xpath("//*[@class='music']")).isDisplayed());

        WebElement logOutButton = driver.findElement(By.xpath("//*[@class='logout']"));
        logOutButton.isDisplayed();
        Assert.assertEquals(false,logOutButton.isDisplayed());

        String expectedURL = "https://koelapp.testpro.io/#!/home";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(actualURL,expectedURL);






    }

    @Test
    public void positive_logIn_Incorrect_Credetials() throws InterruptedException {

        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
//        Добавил 1 в конец login
        emailField.sendKeys("testpro.user02@testpro.io1");
        WebElement passwordField = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        passwordField.sendKeys("te$t$tudent02");
        var logInButton = driver.findElement(By.xpath("//*[@type='submit']"));
        logInButton.click();


        fluentWait.until(x -> x.findElement(By.xpath("//*[@class='error']")).isDisplayed());

        logInButton.isDisplayed();

        var error = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(true,"");
        error.isDisplayed();

    }
}
