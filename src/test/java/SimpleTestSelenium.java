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
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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

    @Test(enabled = false)
    // Module_WhatTesting_ExpectedResult
    public void googleSearch_SearchForSelenium_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.RETURN);


        Thread.sleep(2000);
        WebElement images = driver.findElement(By.xpath("//*[text()='Images']"));
        images.click();

//        boolean xx = true;
//        int maxTime = 10000;
//        while(xx){
//            try {
//                driver.findElement(By.xpath("//*[@alt='▷Selenium Training & (3.0) Certification Course Online']"));
//                xx = false;
//            }catch (NoSuchElementException err){
//                Thread.sleep(500);
//                maxTime = maxTime -500;
//                if(maxTime<0){
//                    throw new NoSuchElementException("Element not found");
//                }
//            }
//        }

        driver.findElement(By.xpath("//*[@alt='▷Selenium Training & (3.0) Certification Course Online']")).click();

        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");

    }

    @Test(enabled = false)
    // Module_WhatTesting_ExpectedResult
    public void googleSearch_SearchForJava_SearchPageOpened() {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);


        Assert.assertEquals(driver.getTitle(), "java - Google Search");

    }

    @Test(enabled = true)
    // Module_WhatTesting_ExpectedResult
    public void udemySearch_SearchForJava_SearchPageOpened() throws InterruptedException {
//        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.cssSelector("[data-purpose*='search-box']"));
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);


//        Assert.assertEquals(driver.getTitle(), "java - Google Search");
    }
}
