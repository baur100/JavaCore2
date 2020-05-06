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
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(HomePageSelectors.plusButtonCssSelector)));
        return driver.findElement(By.cssSelector(HomePageSelectors.plusButtonCssSelector));
    }
    private WebElement getNewPlaylistNameField(){
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }
    private String getPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
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

    public void renamePlayList(String oldName, String newName) {
        WebElement playlist = driver.findElement(By.xpath(getPlaylistXpath(oldName)));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement textField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
        textField.sendKeys(Keys.CONTROL + "a");
        textField.sendKeys(newName);
        textField.sendKeys(Keys.ENTER);
    }

}
