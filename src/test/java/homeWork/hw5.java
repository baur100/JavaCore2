package homeWork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.security.Key;
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
        Assert.assertEquals(true,logOutButton.isDisplayed());

        String expectedURL = "https://koelapp.testpro.io/#!/home";
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertEquals(actualURL,expectedURL);

        WebElement add_Playlist_button = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        add_Playlist_button.click();

        WebElement playlist_inputname_field = driver.findElement(By.xpath("//*[@type='text'][1]"));
        playlist_inputname_field.sendKeys("danila");
        playlist_inputname_field.sendKeys(Keys.RETURN);

        fluentWait.until(z->z.findElement(By.xpath("//*[@title='Delete this playlist']")).isEnabled());
        WebElement remove_PlayList_button = driver.findElement(By.xpath("//*[@title='Delete this playlist']"));
        remove_PlayList_button.click();










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
