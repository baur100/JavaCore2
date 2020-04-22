package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver> fluentWait;
    FluentWait<WebDriver> fluentWaitWithHigherPolling;
    private String homeButtonXpath = "//*[@class='home active']";
    private String playlistCreatedSuccessMessage = "//*[@class='success show']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
        this.fluentWaitWithHigherPolling = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(1000))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class);
    }

    public boolean isHomepage() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public void addPlaylist(String playlist) {
        var creatplaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        boolean clickSuccessful = false;
        while(clickSuccessful == false) try {
            fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));
            creatplaylist.click();
            break;
        } catch (ElementClickInterceptedException err) {
            clickSuccessful = false;
        }
        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys(playlist);
        searchField.sendKeys(Keys.ENTER);
    }


    public boolean isPlayListCreated(String playlist) {
        String playlistHeader = "//span[contains(text(),\""+playlist+"\")]";
        try {
            fluentWait.until(x -> x.findElement(By.xpath(playlistCreatedSuccessMessage)).isDisplayed());
            fluentWait.until(x -> x.findElement(By.xpath(playlistHeader)).isDisplayed());

        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}

