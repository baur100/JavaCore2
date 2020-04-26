package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
