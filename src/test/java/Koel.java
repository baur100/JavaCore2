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
    public void loginKoel() throws InterruptedException {
        var email = driver.findElement(By.xpath("//*[@type='email']"));
        email.sendKeys("testpro.user02@testpro.io");

        var password = driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("te$t$tudent02");

        var loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
        loginbutton.click();

        Thread.sleep(5000);
        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@id=\"playlists\"]/h1/i")));
        var creatplaylist = driver.findElement(By.xpath("//*[@id=\"playlists\"]/h1/i"));
        creatplaylist.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys("Denis playlist");
        searchField.sendKeys(Keys.ENTER);

        var allsongs = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/section[1]/ul/li[3]/a"));
        allsongs.click();

        var choicesong = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/div/div/div[1]/table/tr[6]/td[2]"));
        choicesong.click();

        var addtoo = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/h1/div/button[2]"));
        addtoo.click();

        var addtoplaylist = driver.findElement(By.xpath("//*[@id=\"songsWrapper\"]/h1/div/div/form/input"));
        addtoplaylist.sendKeys("Denis playlist");
        addtoplaylist.sendKeys(Keys.ENTER);

//        var selectplaylist = driver.findElement(By.xpath("//*[@id=\"playlists\"]/ul/li[5]/a"));
//        selectplaylist.click();
//        Thread.sleep(5000);

        var playsong = driver.findElement(By.xpath("//*[@id=\"playerControls\"]/span/i"));
        playsong.click();
        Thread.sleep(10000);

        var playsong1 = driver.findElement(By.xpath("//*[@id=\"playerControls\"]/span/i"));
        playsong1.click();

//        Thread.sleep(2000);
        var logout = driver.findElement(By.xpath("//*[@id='userBadge']/a[2]/i"));
        logout.click();

//        Assert.assertEquals(driver.getCurrentUrl(), "https://koelapp.testpro.io/#!/home");
    }
}