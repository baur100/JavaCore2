package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver>fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String plusButtonXpath="//*[@class='fa fa-plus-circle control create']";
    private String listNameInputBoxXpath = "//*[@placeholder='↵ to save']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException .class);
    }

    public boolean isHomepage(){
        try{
            fluentWait.until(x->x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public WebElement getAddPlaylistButton(){
        fluentWait.until(x->x.findElement(By.xpath(plusButtonXpath)).isEnabled());
        return driver.findElement(By.xpath(plusButtonXpath));
    }
    public WebElement getlistNameInputBox(){
        return driver.findElement(By.xpath(listNameInputBoxXpath));
    }
    public String getCreatedPlayListNameXpath(String listName){
        return "//a[text()='"+listName+"']";
    }
    public void addPlayList(String listName) {
        getAddPlaylistButton().click();
        getlistNameInputBox().sendKeys(listName);
        getlistNameInputBox().sendKeys(Keys.RETURN);
    }


    public boolean isplayListCreated(String listName) {
        var list = driver.findElements(By.xpath(getCreatedPlayListNameXpath(listName)));
        return list.size()>0;
    }
}
