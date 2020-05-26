package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import helpers.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    @Parameters({"browser"})
    @BeforeMethod
    public void startUp(String browserName) throws NoSuchMethodException {
        BrowserType browser;
        switch (browserName){
            case "CHROME": browser=BrowserType.CHROME;
                break;
            case "FIREFOX": browser = BrowserType.FIREFOX;
                break;
            default: throw new NoSuchMethodException("Browser not defined");
        }

        driver = BrowserFactory.createWebDriver(browser);
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if(iTestResult.getStatus() == ITestResult.FAILURE) {
            GetScreenshot.capture(driver, iTestResult.getName());
        }
        driver.quit();
    }
}
