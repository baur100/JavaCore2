import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HWTest1 {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();

        driver.get("https://google.com");
    }

    @AfterMethod
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void udemySearch_SearchForSelenium_SearchPageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@name ='q']"));
        searchField.sendKeys("Udemy");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement udemySearch = driver.findElement(By.xpath("//*[@class='LC20lb DKV0Md']"));
        udemySearch.click();

        WebElement udemySearchTest = driver.findElement(By.xpath("//*[@id='billboard-search-bar']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);
//        Thread.sleep(2000);
//        WebElement images = driver.findElement(By.xpath("//*[text()='Images']"));
//        images.click();
//
//
//        Assert.assertEquals(driver.getTitle(),"selenium - Google Search");
    }
}
