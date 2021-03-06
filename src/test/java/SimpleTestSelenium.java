import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTestSelenium {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test(enabled = true)
    public void googleSearch_SearchForSelenium_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("selenium");
        searchField.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement images = driver.findElement(By.xpath("//*[text()='Images']"));
        images.click();
        driver.findElement(By.xpath("//div[contains(text(),'Web Scraping Using Selenium - Towards ...')]")).click();

        Assert.assertEquals(driver.getTitle(), "selenium - Google Search");

    }

    @Test(enabled = false)
    public void googleSearch_SearchForJava_SearchPageOpened() {
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);
        Assert.assertEquals(driver.getTitle(), "Java - Google Search");

    }

    @Test(enabled = false)
    public void udemy_SearchForJava_SearchPageOpened() throws InterruptedException {
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.cssSelector("[data-purpose*='search-box']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);
    }
}