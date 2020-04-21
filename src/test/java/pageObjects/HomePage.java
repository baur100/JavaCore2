package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver>fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String addPlaylistButtonXPath = "//*[contains(@class,'create')]";
    private String playListNameField = "//*[contains(@placeholder,'save')]";
    Actions actions = new Actions(driver);

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException .class)
                .ignoring(NullPointerException .class);


    }
    public WebElement getAddPlaylistButton(){
        return driver.findElement(By.xpath(addPlaylistButtonXPath));
    }
    public WebElement getPlayListNameField(){
        return driver.findElement(By.xpath(playListNameField));
    }


    public boolean isHomepage(){
        try{
            fluentWait.until(x->x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public boolean createNewPlaylist(String nameOfNewPlayList) throws InterruptedException {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(addPlaylistButtonXPath)));
        }catch (NullPointerException err){
            return false;
        }

        actions.moveToElement(getAddPlaylistButton()).perform();

        getAddPlaylistButton().click();
        try{
            fluentWait.until(x->x.findElement(By.xpath(playListNameField)));
        } catch (TimeoutException err) {
            return false;
        }
        getPlayListNameField().sendKeys(nameOfNewPlayList);
        return true;
        }




    }

