package browserFactory;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class BrowserFactory {
    public static WebDriver createWebDriver(BrowserType browserType) throws NoSuchMethodException {
        WebDriver driver;
        switch (browserType) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case OPERA:
                return getOperaDriver();
            default:
                throw new NoSuchMethodException("Browser driver not found");
        }
    }

    private static WebDriver getOperaDriver() {
        OperaOptions options = new OperaOptions();
        options.addArguments("window-size=1400,1000");
//        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "operadriver.exe");
        return new OperaDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
//        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
        return new FirefoxDriver(options);
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver(options);
    }

//    private static WebDriver getEdgeDriver() {
//        EdgeOptions options = new EdgeOptions();
//        options.("window-size=1400,1000");
////        options.addArguments("--headless");
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        return new ChromeDriver(options);
//    }
}
