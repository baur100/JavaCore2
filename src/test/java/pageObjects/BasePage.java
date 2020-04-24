package pageObjects;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public void windowMaximize() {
        driver.manage().window().maximize();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}
