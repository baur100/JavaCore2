package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Date;

public class HomePage {
    private WebDriver driver;
    private final String homeButtonXpath = "//*[@class='home active']";
    private final String addPlaylistButtonXpath = "//i[@class='fa fa-plus-circle control create']";
    private final String newPlaylistFieldXpath = "//*[@placeholder='↵ to save']";
    private final String deletePlaylistButtonXpath = "//button[@class='del btn btn-red btn-delete-playlist']";
    private final String findPlaylistXpath = "//a[contains(text(),'ag20')]";
    private final String successShowAlertXpath = "//div[@class='success show']";

    FluentWait<WebDriver> fluentWait;
    Date date;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
        date = java.util.Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public WebElement getAddPlaylistButtonXpath() {
        return driver.findElement(By.xpath(addPlaylistButtonXpath));
    }

    public WebElement getNewPlaylistFieldXpath() {
        return driver.findElement(By.xpath(newPlaylistFieldXpath));
    }

    public WebElement getFindPlaylistXpath() {
        return driver.findElement(By.xpath(findPlaylistXpath));
    }

    public WebElement getDeletePlaylistButtonXpath() {
        return driver.findElement(By.xpath(deletePlaylistButtonXpath));
    }

    public WebElement getSuccessShowAlertXpath() {
        return driver.findElement(By.xpath(successShowAlertXpath));
    }

    public boolean isHomePage() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public void addPlaylist(String playlistName) {
        fluentWait.until(x -> x.findElement(By.xpath(addPlaylistButtonXpath)));
        getAddPlaylistButtonXpath().click();
        getNewPlaylistFieldXpath().sendKeys(playlistName);
        getNewPlaylistFieldXpath().submit();
    }

    public void add5Playlist(String playlistName) {
        int i;
        for (i = 0; i <= 8; i++) {
            addPlaylist(playlistName);
            fluentWait.until(x -> x.findElement(By.xpath(successShowAlertXpath)));
            getSuccessShowAlertXpath().click();
            i++;
        }
    }

    public void deletePlaylistsSimilarNames() {
        boolean elementIsDisplays = false;
        while (elementIsDisplays == false) try {
            fluentWait.until(x -> x.findElement(By.xpath(findPlaylistXpath)));
            getFindPlaylistXpath().click();
            fluentWait.until(x -> x.findElement(By.xpath(deletePlaylistButtonXpath)));
            getDeletePlaylistButtonXpath().click();
            driver.navigate().refresh();
        } catch (TimeoutException err) {
            elementIsDisplays = true;
        }
    }

    public boolean isSimilarPlaylistsCreated() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(findPlaylistXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public boolean isPlayListCreated() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(deletePlaylistButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}