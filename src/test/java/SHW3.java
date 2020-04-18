import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;


public class SHW3 {

    WebDriver driver;
    @BeforeMethod
    public void startUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void yahooSearch_SearchForCoronavirus_SearchSuccesfull() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.xpath("//*[@id='header-search-input']"));
        searchBar.sendKeys("coronavirus");
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='header-desktop-search-button']"));
        searchButton.click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.getTitle(),"coronavirus - Yahoo Search Results");

        WebElement newsButton = driver.findElement(By.xpath("//*[@name='p']"));
        newsButton.sendKeys(Keys.ENTER);


    }

}
