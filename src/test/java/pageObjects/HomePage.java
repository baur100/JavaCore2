package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

public class HomePage extends BasePage {
    Date date;
    String songName;

    public String getSongNameXpath(String titleName) {
        return "//*[@class='title' and contains(text(),'" + titleName + "')]";
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAddSongToPlaylistXpath(String playlistName) {
        return "//div[@class='song-list-wrap main-scroll-wrap allSongs']//li[@class='playlist'][contains(text(),'" + playlistName + "')]";
    }

    public String lastAddedPlaylistXpath(String lastPlaylist) {
        return "//a[contains(text(),'" + lastPlaylist + "')]";
    }

    public String findSongByTitleInPlaylistXpath(String songName) {
        return "//*[@class='song-list-wrap main-scroll-wrap playlist']//td[@class='title'][contains(text(),'" + songName + "')]";
    }

    public HomePage(WebDriver driver) {
        super(driver);
        date = java.util.Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }

    public String getNewPlaylistName() {
        return HomePageSelectors.playlitsName;
    }

    public void setPlaylistName(String name) {
        HomePageSelectors.playlitsName = name;
    }

    public WebElement getAddPlaylistButtonXpath() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.addPlaylistButtonXpath)));
//        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.addPlaylistButtonXpath)));
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

    public WebElement getAllSongsTableCSS() {
        fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.allSongsTableCSS)).isDisplayed());
        return driver.findElement(By.cssSelector(HomePageSelectors.allSongsTableCSS));
    }

    public void findSongByTitle() {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.allSongsButtonXpath)));
        getAllSongsButtonXpath().click();
        WebElement songXpath = driver.findElement(By.xpath(getSongNameXpath(getSongName())));
        fluentWait.until(x -> x.findElement(By.xpath(getSongNameXpath(getSongName()))).isDisplayed());
        Actions actions = new Actions(driver);
        actions.contextClick(songXpath).perform();
    }

    public void navigateToLastAddedPlaylist() {

        WebElement lastAddedPlaylistXpath = driver.findElement(By.xpath(lastAddedPlaylistXpath(getNewPlaylistName())));
        lastAddedPlaylistXpath.click();
    }


    public void addSongToPlaylist() {
        driver.findElement(By.xpath(HomePageSelectors.addToPlaylistXpath)).click();
        WebElement addToPlaylist = driver.findElement(By.xpath(getAddSongToPlaylistXpath(getNewPlaylistName())));
        addToPlaylist.click();
    }

    public WebElement getAllSongsButtonXpath() {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.allSongsButtonXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.allSongsButtonXpath));
    }


    public void addPlaylist() {
        WebDriverWait explicitWait = new WebDriverWait(driver, 10);
        explicitWait.until(ExpectedConditions.elementToBeClickable(getAddPlaylistButtonXpath()));
        getAddPlaylistButtonXpath().click();
        getNewPlaylistFieldXpath().sendKeys(getNewPlaylistName());
        getNewPlaylistFieldXpath().sendKeys(Keys.ENTER);
    }

    public void add5Playlist() {
        int i;
        for (i = 0; i <= 8; i++) {
            addPlaylist();
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

    public boolean isSongAdded() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(findSongByTitleInPlaylistXpath(getSongName()))));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public void leftHandScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement homepageIcon = fluentWait.until(x -> x.findElement(By.xpath(HomePageSelectors.homeButtonXpath)));
        js.executeScript("arguments[0].scrollIntoView();", getPlaylitsName());
    }

}