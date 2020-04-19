import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTestSelenium {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://udemy.com");
//        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled=false)
    public void googleSearch_SearchForSelenium_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.ENTER);

        WebElement images = driver.findElement(By.xpath("//*[text()='Images']"));
        images.click();

//        boolean xx= true;
//        int maxTime = 10000;
//        while(xx){
//            try{
//                driver.findElement(By.xpath("//*[@alt='Web Scraping Using Selenium - Towards Data Science']"));
//                xx=false;
//            } catch (NoSuchElementException err){
//                Thread.sleep(500);
//                maxTime=maxTime-500;
//                if(maxTime<0){
//                    throw new NoSuchElementException("Element not found");
//                }
//            }
//        }

    }

    @Test(enabled=false)
    public void googleSearch_SearchForJava_SearchPageOpened() {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);

        Assert.assertEquals(driver.getTitle(), "Java - Google Search");
    }

    @Test(enabled = true)
    public void udemy_SearchForJava_SearchPageOpened() throws InterruptedException {
//        Thread.sleep(10000);
        WebElement searchField = driver.findElement(By.cssSelector("[data-purpose*='search-box']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);


    }

}
