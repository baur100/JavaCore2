package browserFactory;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    public static WebDriver createWebDriver(BrowserType browserType) throws NoSuchMethodException {
        switch (browserType){
            case FIREFOX: return getFirefoxDriver();
            case CHROME: return getChromeDriver();
            default: throw new NoSuchMethodException("Browser driver not found");
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1200");
        options.addArguments("--headless");

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        options.addArguments("--headless");

        System.setProperty("webdriver.gecko.driver", "geckodriver");
        return new FirefoxDriver(options);
    }
}
