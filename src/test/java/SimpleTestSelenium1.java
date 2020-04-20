import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestSelenium1 {
    @Test
    public void googleSearch_OpenGooglePage_SearchPageOpened() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys("selenium");

        WebElement searchButton = driver.findElement(By.xpath("//input[@name='btnK']"));
        searchButton.click();
        Assert.assertEquals(driver.getTitle(),"selenium - Google Search");
                Thread.sleep(5000);
        driver.quit();
    }
}
