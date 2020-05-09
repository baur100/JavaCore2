package tests;

import driverFactory.DriverFactory;
import enums.DriverType;
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
        DriverType browser;
        switch (browserName) {
            case "CHROME" : browser = DriverType.CHROME;
            break;
            case "FIREFOX" : browser = DriverType.FIREFOX;
            break;
            default: throw new NoSuchMethodException("Driver not defined");
        }
        driver = DriverFactory.summonWebDriver(browser);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            GetScreenshot.capture(driver, result.getName());
        }
        driver.quit();
    }
}
