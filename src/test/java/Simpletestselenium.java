import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Simpletestselenium {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(enabled = true)
    public void googleSearch_SearchForSelenium_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name ='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.ENTER);

//        Thread.sleep(2000);
        WebElement images = driver.findElement(By.xpath("//*[text()='Images']"));
        images.click();
//        int xx=5;
//        while(xx==5){
//            xx=5+1;
//        }
//        boolean xx=true;
//        int maxTime = 10000;
//        while (xx){
//            try{
//                driver.findElement(By.xpath("//*[@alt='Web Scraping Using Selenium - Towards Data Science']"));
//                xx=false;
//            }catch(NoSuchElementException err){
//                Thread.sleep(500);
//                maxTime = maxTime-500;
//            }
//        }



        Assert.assertEquals(driver.getTitle(),"selenium - Google Search");
    }

    @Test(enabled = false)
    public void googleSearch_SearchForJava_SearchPageOpened(){
        WebElement searchField = driver.findElement(By.xpath("//*[@name ='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Java - Google Search");
    }

}
