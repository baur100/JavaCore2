package pageObjects;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;
    protected final String url = "https://koelapp.testpro.io/";
    protected WebDriverWait explicitWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        explicitWait = new WebDriverWait(driver, 15);
        this.fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);
    }
}
