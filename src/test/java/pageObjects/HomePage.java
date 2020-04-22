package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver> fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String isPlayListCreated = "//*[@type='text'][1]";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public boolean isHomepage() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public void addPlaylist(String nick_playlist) {
        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        var creatplaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        creatplaylist.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys("Nick playlist");
        searchField.sendKeys(Keys.ENTER);
    }


    public boolean isPlayListCreated(String nick_playlist) {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(isPlayListCreated)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}

