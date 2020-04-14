import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestSelenium {
    @Test

    // Module_WhatTesting_ExpectedResult
    public void googleSearch_OpenGooglePage_SearchPageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");

        searchField.sendKeys(Keys.ENTER);
        //WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK'][2]"));
        //searchButton.click();

        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");

        Thread.sleep(5000);
        driver.quit();
    }
}
