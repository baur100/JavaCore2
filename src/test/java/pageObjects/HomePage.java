package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;

public class HomePage extends BasePage {
    Date date;

    public HomePage(WebDriver driver) {
        super(driver);
        date = java.util.Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public WebElement getAddPlaylistButtonXpath() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.addPlaylistButtonXpath)).isEnabled());
        return driver.findElement(By.xpath(HomePageSelectors.addPlaylistButtonXpath));
    }

    public WebElement getNewPlaylistFieldXpath() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }

    public WebElement getFindPlaylistXpath() {
        return driver.findElement(By.xpath(HomePageSelectors.findPlaylistXpath));
    }

    public WebElement getDeletePlaylistButtonXpath() {
        return driver.findElement(By.xpath(HomePageSelectors.deletePlaylistButtonXpath));
    }

    public WebElement getSuccessShowAlertXpath() {
        return driver.findElement(By.xpath(HomePageSelectors.successShowAlertXpath));
    }

    public WebElement getLastPlaylistXpath() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.lastPlaylistXpath)).isEnabled());
        return driver.findElement(By.xpath(HomePageSelectors.lastPlaylistXpath));
    }

    public WebElement getActivePlaylistXpaty() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.activePlaylistXpath)).isEnabled());
        return driver.findElement(By.xpath(HomePageSelectors.activePlaylistXpath));
    }

    public WebElement getPlaylitsName() {
        return driver.findElement(By.xpath(HomePageSelectors.playlitsNameXpath));
    }

    public void addPlaylist(String playlistName) {
        getAddPlaylistButtonXpath().click();
        getNewPlaylistFieldXpath().sendKeys(playlistName);
        getNewPlaylistFieldXpath().sendKeys(Keys.ENTER);
    }

    public void add5Playlist(String playlistName) {
        int i;
        for (i = 0; i <= 8; i++) {
            addPlaylist(playlistName);
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.successShowAlertXpath)));
            getSuccessShowAlertXpath().click();
            i++;
        }
    }

    public void deletePlaylistsSimilarNames() {
        boolean elementIsDisplays = false;
        while (elementIsDisplays == false) try {
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.findPlaylistXpath)));
            getFindPlaylistXpath().click();
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.deletePlaylistButtonXpath)));
            getDeletePlaylistButtonXpath().click();
            driver.navigate().refresh();
        } catch (TimeoutException err) {
            elementIsDisplays = true;
        }
    }

    public void findLastPlaylistAndEdit() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.lastPlaylistXpath)).isDisplayed());
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", getLastPlaylistXpath());
        Actions actions = new Actions(driver);
        actions.moveToElement(getLastPlaylistXpath()).perform();
        actions.doubleClick(getLastPlaylistXpath()).perform();
        getActivePlaylistXpaty().sendKeys(Keys.CONTROL + "a");
        HomePageSelectors.playlitsName = "ag20 " + date;
        getActivePlaylistXpaty().sendKeys(HomePageSelectors.playlitsName);
        getActivePlaylistXpaty().sendKeys(Keys.ENTER);
        System.out.println(HomePageSelectors.playlitsName);

    }

    public boolean isHomePage() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public boolean isSimilarPlaylistsCreated() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.findPlaylistXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public boolean isPlayListCreated() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.deletePlaylistButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public boolean isPlayListRenamed() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.playlitsNameXpath)));
        } catch (TimeoutException err) {
            return true;
        }
        return false;
    }

}