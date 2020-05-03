package HWs.BrowserFactory;

import HWs.ENUMS.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class BrowserFactory {
    public static WebDriver createWebDriver(BrowserType browserType) throws NoSuchMethodException {
        switch (browserType) {
            case CHROME:
                return getCromeDriver();
            case FIREFOX:
                return  getFirefoxDriver();
            case OPERA:
                return getOperaDriver();
            case EDGE:
                return getEdgeDriver();
            default: throw new NoSuchMethodException("Browser driver not defined");
        }
    }

    private static WebDriver getCromeDriver() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,1000");
       // options.addArguments("--headless");

        // mobile drivers settings
//        options.setExperimentalOption("androidPackage", "com.sec.android.app.sbrowser.beta");
//        options.setExperimentalOption("androidActivity", "com.sec.android.app.sbrowser.SBrowserMainActivity");
//        options.setExperimentalOption("androidDeviceSocket", "Terrace_devtools_remote");
//        options.setExperimentalOption("androidExecName", "Terrace");


        return new ChromeDriver(options);
    }

    private static WebDriver getOperaDriver() {
        System.setProperty("webdriver.opera.driver","operadriver.exe");
        OperaOptions options = new OperaOptions();
        options.addArguments("window-size=1400,1000");
//        options.addArguments("--headless");
        return new OperaDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
//        options.addArguments("--headless");
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        return new FirefoxDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");

        // options.addArguments("--headless");
        return new EdgeDriver(options);
    }
}
