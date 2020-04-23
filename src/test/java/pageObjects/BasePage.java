package pageObjects;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        this.driver = driver;
        this.fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public BasePage(WebDriver driver) {

    }
}
