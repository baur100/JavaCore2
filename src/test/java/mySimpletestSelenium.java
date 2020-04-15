import hw11.SysBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class mySimpletestSelenium {
    @Test
    public void googlrSearch_OpenGooglePage_SeaerchPageOpened() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searhField= driver.findElement(By.xpath("//*[@name='q']"));
        searhField.sendKeys("selenium");

        WebElement searchButton= driver.findElement(By.xpath("//*[@name='btnK']"));
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");

        Thread.sleep(5000);
        driver.quit();
    }
}
