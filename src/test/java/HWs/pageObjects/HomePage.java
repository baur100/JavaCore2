package HWs.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

@SuppressWarnings("ALL")
public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver>fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String homePlayListCreateCSSSelector = "[class='fa fa-plus-circle control create']";
    private String homePlayListInputXpatch = "//*[@placeholder='↵ to save']";
    private String PlayListName = "Shsmith"; //default
    private String homePlayListElementXpatch = "//*[@class='playlist playlist']/*[.='"+PlayListName+"']";
    private String homePlayListActiveElementCSS = "[class='active']";
    private String homePlayListActiveEditingXpath = "//*[@type='text']";



    public WebElement getHomePlayListCreateCSSSelector() {return driver.findElement(By.cssSelector(homePlayListCreateCSSSelector));}
    public WebElement getHomePlayListInputXpatch() {return driver.findElement(By.xpath(homePlayListInputXpatch));}
    public WebElement getHomePlayListElementXpatch() {return driver.findElement(By.xpath(homePlayListElementXpatch));}
    public WebElement homePlayListActiveElementCSS() {return driver.findElement(By.cssSelector(homePlayListActiveElementCSS));}
    public WebElement homePlayListActiveEditingXpath() {return driver.findElement(By.xpath(homePlayListActiveEditingXpath));}

    public void setPlayListName(String playListName) {this.PlayListName = playListName;}
    public String getPlayListName() {return PlayListName;}

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(800))
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
    public boolean isPlayListCreated(String PlayListName) {
        try {
            fluentWait.until(x -> x.findElement(By.xpath("//*[@class='playlist playlist']/*[.='" + PlayListName + "']")).isDisplayed());
        } catch (NoSuchElementException err) {
            return false;
        }
        return true;
    }
    public boolean isPlayListExists(String PlayListName){
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@class='playlist playlist']/*[.='"+PlayListName+"']")).isDisplayed(); //"+PlayListName+"
        }
        catch (NoSuchElementException | InterruptedException err){
            return false;
        }
        return true;
    }
    public void addPlaylist(String getPlayListName) {
        fluentWait.until(x->x.findElement(By.cssSelector(homePlayListCreateCSSSelector)).isDisplayed());
        getHomePlayListCreateCSSSelector().click();
        fluentWait.until(x->x.findElement(By.xpath(homePlayListInputXpatch)).isDisplayed());
        getHomePlayListInputXpatch().sendKeys(getPlayListName,Keys.ENTER);
    }

     //TODO in progress
    public void addPlaylistWithCheckingExisting(String getPlayListName) throws InterruptedException {
        Actions actions = new Actions(driver);
//        SimpleDateFormat sdf = new SimpleDateFormat(" M/dd/yyyy HH:mm");
//        String date = sdf.format(new Date());
        fluentWait.until(x->x.findElement(By.cssSelector(homePlayListCreateCSSSelector)).isDisplayed());
        Thread.sleep(2000);
        while (isPlayListExists(getPlayListName)){

            driver.findElement(By.xpath("//*[@class='playlist playlist']/*[.='"+PlayListName +"']")).click();
            actions.doubleClick(homePlayListActiveElementCSS()).perform();
            fluentWait.until(x->x.findElement(By.xpath(homePlayListActiveEditingXpath)).isDisplayed());
            homePlayListActiveEditingXpath().sendKeys(".old",Keys.ENTER);
        }
        getHomePlayListCreateCSSSelector().click();
        fluentWait.until(x->x.findElement(By.xpath(homePlayListInputXpatch)).isDisplayed());
        getHomePlayListInputXpatch().sendKeys(getPlayListName,Keys.ENTER); //+date
    }
}
