import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NprTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.get("https://npr.org");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

//    @Test
//    public void UdemySearch_SearchForPython_TheModernPython3BootcampIsFound() throws InterruptedException {
//        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
//        searchField.sendKeys("python");
//        searchField.sendKeys(Keys.ENTER);
//
//        Thread.sleep(2000);
//        WebElement modern = driver.findElement(By.xpath("//*[text()='The Modern Python 3 Bootcamp']"));
//        modern.click();
//
//        Assert.assertEquals(driver.getTitle(), "The Modern Python 3 Bootcamp | Learn with 200 Unique Exercises | Udemy");
//
//    }

    @Test
    public void UdemySearch_SearchForPython_Categories_ItAndSoftwarePageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@id='navigation_dropdown-search']"));
        searchField.click();
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//*[@type='search']"));
        searchBox.sendKeys("COVID");
        searchBox.sendKeys(Keys.RETURN);

        Assert.assertEquals(driver.getTitle(), "NPR Search : NPR");


    }
}
