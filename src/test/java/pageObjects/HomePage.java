package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

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
        fluentWait.until(x-> x.findElement(By.xpath(HomePageSelectors.plusButtonXPath)).isDisplayed());
        return driver.findElement(By.xpath(HomePageSelectors.plusButtonXPath));
    }
    private WebElement getNewPlaylistNameField(){
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }
    private String getPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
    }

    private WebElement getRenameField(){
        fluentWait.until(x-> x.findElement(By.xpath(HomePageSelectors.renameFieldXpath)).isEnabled());
        return driver.findElement(By.xpath(HomePageSelectors.renameFieldXpath));
    }

    public void createNewPlaylist(String name){
        getPlusButton().click();
        getNewPlaylistNameField().sendKeys(name);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
    }
    public boolean isPlaylistCreated(String name){
        var list = driver.findElements(By.xpath(getPlaylistXpath(name)));
        return list.size()>0;
    }

    public void scroll(String name) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Find element by link text and store in variable "Element"
        WebElement pL = driver.findElement(By.xpath("(//a[text()='"+name+"'])[1]"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", pL);
    }
    public void rename(String name, String name2) throws InterruptedException {
        Actions actions = new Actions(driver);
        var playList = driver.findElement(By.xpath("(//a[text()='"+name+"'])[1]"));
        actions.doubleClick(playList).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '';", getRenameField());
        getRenameField().sendKeys(name2);
        getRenameField().sendKeys(Keys.RETURN);
    }
    public boolean isPlaylistRenamed(String name){
        var list = driver.findElements(By.xpath(getPlaylistXpath(name)));
        return list.size()>0;
    }
}
