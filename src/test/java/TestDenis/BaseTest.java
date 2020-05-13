package TestDenis;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import helpers.Getscreenshop;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.awt.image.PixelGrabber;

public class BaseTest {
    protected WebDriver driver;

@Parameters({"browser"})
    @BeforeMethod
    public void startUp(String browserName) throws NoSuchMethodException {
    BrowserType browser;
    switch (browserName){
        case "CHROME": browser=BrowserType.CHROME;
        break;
        case "FIREFOX": browser=BrowserType.FIREFOX;
        break;
        default: throw new NoSuchMethodException("Browser not defined");
    }
        driver = BrowserFactory.createWebDriver(browser);
////        System.setProperty("webdriver.chrome.driver", "chromedriver");
////        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "geckodriver");
//        driver = new FirefoxDriver();
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) {
        if(iTestResult.getStatus() == ITestResult.FAILURE){
            Getscreenshop.capture(driver,iTestResult.getName());
        }
        driver.quit();
    }
}
