package Tests;

import browserFactory.DriverFactory;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startUp() throws NoSuchMethodException {
        driver = DriverFactory.summonWebDriver(DriverType.CHROME);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(5000);
        //driver.quit();
    }
}
