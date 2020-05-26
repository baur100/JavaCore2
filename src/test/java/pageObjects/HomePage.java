package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.plusButtonXPath)));
        return driver.findElement(By.xpath(HomePageSelectors.plusButtonXPath));
    }
    private WebElement getNewPlaylistNameField(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.newPlaylistFieldXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }
    private String getPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
    }


    public String createNewPlaylist(String name) {
        getPlusButton().click();
        getNewPlaylistNameField().sendKeys(name);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
        String str =  driver.getCurrentUrl();
        return str.split("/")[5];
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

    public void renamePlayList(String oldName, String newName) {
        WebElement playlist = driver.findElement(By.xpath(getPlaylistXpath(oldName)));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement textField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        textField.sendKeys(Keys.CONTROL + "a");
        textField.sendKeys(newName);
        textField.sendKeys(Keys.ENTER);
    }
    public WebElement getAllSongsButton(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.allSongsButtonXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.allSongsButtonXpath));

    }
    public WebElement getTitleSong(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.titleOfSongXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.titleOfSongXpath));
    }

    public WebElement getAddToButton(){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.addToButtonXPath)));
        return driver.findElement(By.xpath(HomePageSelectors.addToButtonXPath));
    }
    public WebElement getCreateNewPlayListFieldXpath()
    {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.createNewPlayListFieldXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.createNewPlayListFieldXpath));
    }
    public WebElement getSaveNewPlayListButtonXpath()
    {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.saveNewPlayListButtonXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.saveNewPlayListButtonXpath));
    }

    public WebElement getDeletePlayListButton()
    {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.deletePlayListButtonXpath)));
        return driver.findElement(By.xpath(HomePageSelectors.deletePlayListButtonXpath));
    }

    public WebElement getOkForDeletePlayList()
    {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageSelectors.okForDeletePlayListXpath )));
        return driver.findElement(By.xpath(HomePageSelectors.okForDeletePlayListXpath ));
    }

    public void createNewPlayListAndAddSongToPlayList(String name){
        getAllSongsButton().click();

        Actions actions = new Actions(driver);
        actions.contextClick(getTitleSong()).perform();
        getAddToButton().click();
        getCreateNewPlayListFieldXpath().sendKeys(name);
        getSaveNewPlayListButtonXpath().click();

    }
    public void deletePlayList(String name){
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(getPlaylistXpath(name) )));
        var list = driver.findElement(By.xpath(getPlaylistXpath(name)));
        list.click();
        getDeletePlayListButton().click();
        getOkForDeletePlayList().click();



    }
}
