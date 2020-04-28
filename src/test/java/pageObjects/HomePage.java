package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomePage {
    FluentWait<WebDriver> fluentWait;
    private WebDriver driver;
    private String homeButtonXpath = "//*[@class='home active']";
    private String plusButtonCssSelector = ".fa.fa-plus-circle";
    private String newPlaylistFieldXpath = "//*[@class='create']/*";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    public boolean isHomepage() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    public WebElement getPlusButton() {
        return driver.findElement(By.cssSelector(plusButtonCssSelector));
    }
    public WebElement getnewPlayListNameField (){
        return driver.findElement(By.xpath(newPlaylistFieldXpath));
    }
    public void createNewPlayList(String name){
        getPlusButton().click();
        getnewPlayListNameField().sendKeys(name);
        getnewPlayListNameField().sendKeys(Keys.ENTER);
    }
}
