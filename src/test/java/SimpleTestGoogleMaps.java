import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class SimpleTestGoogleMaps {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://maps.google.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void GoogleMaps_SearchBar_PictureByGeo() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.xpath("//*[@aria-label='Search Google Maps']"));
        searchBar.sendKeys("93QX+PC Pryp'yat', Kyiv Oblast, Ukraine");

        WebElement searchBoxEnterButton = driver.findElement(By.xpath("//*[@id='searchbox-searchbutton']"));
        searchBoxEnterButton.click();
        Thread.sleep(2000);

        WebElement changeToSatellite = driver.findElement(By.xpath("//*[@aria-labelledby='widget-minimap-caption']"));
        changeToSatellite.click();
        Thread.sleep(3000);

        WebElement photos = driver.findElement(By.xpath("//*[@class='b7bAA58T9bH__shade']"));
        photos.click();
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        WebElement interactiveMap = driver.findElement(By.xpath("//*[@aria-label='Interactive map']"));
        action.moveToElement(interactiveMap).perform();
        Thread.sleep(4000);

        WebElement expand = driver.findElement(By.xpath("//*[contains(@class,'minimap-ic-expand-')]"));
        expand.click();
        Thread.sleep(3000);

        WebElement showImages = driver.findElement(By.xpath("//*[@aria-label=' Show images ']"));
        showImages.click();
        Thread.sleep(3000);

        WebElement backButton = driver.findElement(By.xpath("//*[@data-tooltip='Back']"));
        backButton.click();
        Thread.sleep(3000);

        WebElement tooltip = driver.findElement(By.xpath("//*[contains(@data-tooltip,'Learn more')]"));
        action.moveToElement(tooltip).perform();
        tooltip.click();
        Thread.sleep(3000);

        driver.switchTo().frame("google-feedback-wizard");
        WebElement help = driver.findElement(By.id("header-title"));

        Assert.assertEquals(help.getText(), "Help");
    }
}
