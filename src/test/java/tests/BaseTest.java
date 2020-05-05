package tests;

import browserFactory.BrowserFactory;
import enums.BrowserType;
import helpers.GetScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = BrowserFactory.createWebDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if(iTestResult.getStatus() == ITestResult.FAILURE) {
            GetScreenshot.capture(driver, iTestResult.getName());
        }
        driver.quit();
    }
}
