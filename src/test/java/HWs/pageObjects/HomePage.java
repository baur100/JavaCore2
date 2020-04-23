package HWs.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

@SuppressWarnings("ALL")
public class HomePage {
    private WebDriver driver;
    FluentWait<WebDriver>fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String homePlayListCreateCSSSelector = "[class='fa fa-plus-circle control create']";
    private String homePlayListInputXpatch = "//*[@placeholder='↵ to save']";
    private String PlayListName;// = "Shsmith"; //default
    private String homePlayListElementXpatch;// = "//*[@class='playlist playlist']/*[.='shsmith']";
    private String homePlayListActiveElementCSS = "[class='active']";
    private String homePlayListActiveEditingXpath = "//*[@type='text']";




    public void setPlayListName(String PlayListName){
        this.PlayListName=PlayListName;
    }

    public String getPlayListName() {
        return PlayListName;
    }
    public String getPlayListElementXpatch(){
        return homePlayListElementXpatch = "//*[@class='playlist playlist']/*[.='"+PlayListName+"']";
    }
    public WebElement getHomePlayListCreateCSSSelector() {return driver.findElement(By.cssSelector(homePlayListCreateCSSSelector));}
    public WebElement getHomePlayListInputXpatch() {return driver.findElement(By.xpath(homePlayListInputXpatch));}
    public WebElement getHomePlayListElementXpatch() {return driver.findElement(By.xpath(getPlayListElementXpatch()));}
    public WebElement getHomePlayListActiveElementCSS() {return driver.findElement(By.cssSelector(homePlayListActiveElementCSS));}
    public WebElement getHomePlayListActiveEditingXpath() {return driver.findElement(By.xpath(homePlayListActiveEditingXpath));}
    public WebElement getHomeSideBarXpath() {return driver.findElement(By.xpath("//*[@id='sidebar']"));}
    //public WebElement getHomePlayListElementXpatch() {return driver.findElement(By.xpath(homePlayListElementXpatch));}

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
    public boolean isPlayListCreated() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(getPlayListElementXpatch())).isDisplayed());
        } catch (NoSuchElementException err) {
            return false;
        }
        return true;
    }
    public boolean isPlayListChanged() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath("//*[@class='playlist playlist']/*[.='zzz.old']")).isDisplayed());
        } catch (NoSuchElementException | TimeoutException err) {
            return false;
        }
        return true;
    }
    public boolean isPlayListExists(){
        try {
            Thread.sleep(1000);
            getHomePlayListElementXpatch().isDisplayed(); //"+PlayListName+"
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


    public void changePlaylistCheckingExisting(String getPlayListName) throws InterruptedException {
        Actions actions = new Actions(driver);
        fluentWait.until(x->x.findElement(By.cssSelector(homePlayListCreateCSSSelector)).isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("scroll(0, 100)");
        while (isPlayListExists()){
            //actions.moveToElement(getHomePlayListElementXpatch()).perform();
            js.executeScript("document.querySelector('#sidebar').scrollTo(0,document.querySelector('#sidebar').scrollHeight);");
            getHomePlayListElementXpatch().click();
            actions.doubleClick(getHomePlayListElementXpatch()).perform();
            fluentWait.until(x->x.findElement(By.xpath(homePlayListActiveEditingXpath)).isDisplayed());
            getHomePlayListActiveEditingXpath().sendKeys(".old",Keys.ENTER);
        }

    }
}
