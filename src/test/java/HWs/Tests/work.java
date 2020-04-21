package HWs.Tests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class work {
    private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;


    public boolean isExist(){
        try {
            driver.findElement(By.xpath("//*[@class='playlist playlist']/*[.='Shsmith']")).isDisplayed();
        }
        catch (NoSuchElementException err){
            return false;
        }
        return true;
    }

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://koelapp.testpro.io");

        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(12))
                .pollingEvery(Duration.ofMillis(150))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test //positive testing - Correct login with correct credentials
    public void login_CorrectCredentialsLoginForm() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.cssSelector("[type = 'submit']")).isDisplayed());
        driver.findElement(By.cssSelector("[type = 'email']")).sendKeys("testpro.user02@testpro.io");
        driver.findElement(By.cssSelector("[type = 'password']")).sendKeys("te$t$tudent02");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='playlist playlist']")).isDisplayed());

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        while (isExist()){
            WebElement hh = driver.findElement(By.xpath("//*[@class='playlist playlist']/*[.='Shsmith']"));
            //js.executeScript("arguments[0].scrollIntoView();",hh );
            hh.click();
            Thread.sleep(1000);
            WebElement active = driver.findElement(By.cssSelector("[class='active']"));
            actions.doubleClick(active).perform();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@type='text']")).sendKeys(".old",Keys.ENTER); //  //*[@type='text']  //  "//*[@class='playlist playlist editing']"
        }

        driver.findElement(By.cssSelector("[class='fa fa-plus-circle control create']")).click();
        fluentWait.until(x->x.findElement(By.xpath("//*[@placeholder='↵ to save']")).isDisplayed());
        driver.findElement(By.xpath("//*[@placeholder='↵ to save']")).sendKeys("Shsmith",Keys.ENTER);
        //driver.findElement(By.xpath("//*[@placeholder='↵ to save']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@class=\"playlist playlist\"]/*[.='Shsmith']"));
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='playlist playlist']/*[.='sh11.old']")).isDisplayed());
    }
    @Test  //negative - verifying incorrect authorization form behavior
    public void login_InCorrectCredentialsLoginForm() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.cssSelector("[type = 'submit']")).isDisplayed());
        driver.findElement(By.cssSelector("[type = 'email']")).sendKeys("testpro.user02t@estpro.io");//testpro.user02@testpro.io
        driver.findElement(By.cssSelector("[type = 'password']")).sendKeys("te$t$tudent02");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='error']")).isDisplayed());

    }



}
