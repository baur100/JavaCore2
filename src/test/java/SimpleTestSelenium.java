import hWA11.SysBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestSelenium {
    @Test
    public void googleSearch_OpenGooglePage_SearchPageOpened() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");

        WebElement searchButton = driver.findElement(By.xpath("//*[@name='btnK']"));
        Thread.sleep(1000);
     //   searchButton.isDisplayed();
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");

        Thread.sleep(5000);
        driver.quit();
    }
}
