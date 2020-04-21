import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UdemyTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://udemy.com");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void udemySearch_SearchForJavaCourse_CoursePageOpened() throws InterruptedException {
        WebElement searchField = driver.findElement(By.xpath("//*[@id='billboard-search-bar']"));
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        WebElement course = driver.findElement(By.xpath("//*[contains(@class,'course-cards-skeleton--skeleton--2jKpO')]"));
        course.click();

        Assert.assertEquals(driver.getTitle(), "Complete Java Software Developer Masterclass (for Java 10) | Udemy");

    }

}
