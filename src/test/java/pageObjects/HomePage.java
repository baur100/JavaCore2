package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean isHomepage(){
        try{
            fluentWait.until(x->x.findElement(By.xpath(HomePageSelectors.homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
    public WebElement getPlusButton(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(HomePageSelectors.plusButtonCssSelector)));
        return driver.findElement(By.cssSelector(HomePageSelectors.plusButtonCssSelector));
    }
    private WebElement getNewPlaylistNameField(){
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }
    private String getPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
    }
    private WebElement getAllSongsLinkXpath(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.allSongsLinkXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.allSongsLinkXpath));
    }
    private String getSongXpath(String name){
        return "//*[@class='song-item item']/td[text()='"+name+"']";
    }
    private String getPlaylistInTheListXpath(String pName){
        return "//*[@id='songsWrapper']//*[@class='add-to']//*[@class='playlist' and text()='"+pName+"']";
    }
    private WebElement getAddToButtonXpath() {
        return driver.findElement(By.xpath(HomePageSelectors.addToButtonXpath));
    }
    public void createNewPlaylist(String name) {
        getPlusButton().click();
        getNewPlaylistNameField().sendKeys(name);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
    }
    public boolean isPlaylistCreated(String name){
        var list = driver.findElements(By.xpath(getPlaylistXpath(name)));
        return list.size()>0;
    }

    public void leftHandScrollDown(String name) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath(getPlaylistXpath(name)));
        js.executeScript("arguments[0].scrollIntoView();", playlist);

//        Actions actions = new Actions(driver);
//        actions.moveToElement(playlist);
//        actions.perform();
    }
    public void scrollAllSongsDown(String name) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement song = driver.findElement(By.xpath(getSongXpath(name)));
            js.executeScript("arguments[0].scrollIntoView();", song);
        }

    public void renamePlayList(String oldName, String newName) {
        WebElement playlist = driver.findElement(By.xpath(getPlaylistXpath(oldName)));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement textField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        textField.sendKeys(Keys.COMMAND + "a");
        textField.sendKeys(newName);
        textField.sendKeys(Keys.ENTER);
    }
    public void addSongToPlaylist_byMenuButton(String name, String pName) {
        getAllSongsLinkXpath().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement song = driver.findElement(By.xpath(getSongXpath(name)));
//        js.executeScript("arguments[0].scrollIntoView();", song);
        song.click();
        getAddToButtonXpath().click();
        WebElement playlist_list = driver.findElement(By.xpath(getPlaylistInTheListXpath(pName)));
        js.executeScript("arguments[0].scrollIntoView();", playlist_list);
        Actions action = new Actions(driver);
//        action.click(getAddToButtonXpath()).moveToElement(driver.findElement(By.xpath(getPlaylistInTheListXpath(pName)))).click().build().perform();
        action.moveToElement(playlist_list).build().perform();
//        System.out.println(playlist_list.isEnabled());
        playlist_list.click();


    }
    public void addSongToPlaylist_byRightClick(String name, String pName) {
        getAllSongsLinkXpath().click();
        WebElement song = driver.findElement(By.xpath(getSongXpath(name)));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", song);
        song.click();
        Actions actions = new Actions(driver);
        actions.contextClick(song).perform();
        WebElement contextMenuAddTo = driver.findElement(By.xpath("//*[@id='songsWrapper']//*[@class='has-sub']"));
        actions.moveToElement(contextMenuAddTo).build().perform();
        WebElement nextContextMenuAddTo = driver.findElement(By.xpath("//*[@id='songsWrapper']//*[@class='has-sub']//*[@class='playlist' and text()='"+pName+"']"));
        actions.moveToElement(nextContextMenuAddTo).build().perform();
        System.out.println(nextContextMenuAddTo.isEnabled());
        nextContextMenuAddTo.click();
    }
    public void allSongs_playSong_byDoubleClick(String name){
        getAllSongsLinkXpath().click();
        WebElement song = driver.findElement(By.xpath(getSongXpath(name)));
        Actions actions = new Actions(driver);
        actions.doubleClick(song).perform();
    }
    public boolean isMusicPlaying(){
        WebElement playControl = driver.findElement(By.xpath("//*[@class='pause control']/*[@class='fa fa-pause']"));
        return playControl.isDisplayed();
    }
}

