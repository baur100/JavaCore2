package driverFactory;

import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver summonWebDriver(DriverType driverType) throws NoSuchMethodException {
        switch (driverType) {
            case CHROME: return getChromeDriver(driverType);
            case FIREFOX: return getFireFoxDriver(driverType);
            default: throw new NoSuchMethodException("No such driver exists");
        }
    }

    private static WebDriver getChromeDriver(DriverType driverType) {
        var options = new ChromeOptions();
        options.setHeadless(true);
        System.setProperty(driverType.getChromeClass(), driverType.getChromeFile());
        return new ChromeDriver(options);
    }

    private static WebDriver getFireFoxDriver(DriverType driverType) {
        var options = new FirefoxOptions();
        options.setHeadless(true);
        System.setProperty(driverType.getFireFoxClass(), driverType.getFireFoxFile());
        return new FirefoxDriver(options);
    }
}
