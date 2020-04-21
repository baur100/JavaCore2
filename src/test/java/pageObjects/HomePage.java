package pageObjects;

<<<<<<< HEAD
import org.openqa.selenium.*;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
>>>>>>> a587164... S6
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
<<<<<<< HEAD
    FluentWait<WebDriver> fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
    private String isPlayListCreated = "//*[@type='text'][1]";
=======
    FluentWait<WebDriver>fluentWait;
    private String homeButtonXpath = "//*[@class='home active']";
>>>>>>> a587164... S6

    public HomePage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
<<<<<<< HEAD
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

    public void addPlaylist(String nick_playlist) {
        fluentWait.until(driver -> driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        var creatplaylist = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        creatplaylist.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@type='text'][1]"));
        searchField.sendKeys("Nick playlist");
        searchField.sendKeys(Keys.ENTER);
    }


    public boolean isPlayListCreated(String nick_playlist) {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(isPlayListCreated)));
=======
                .ignoring(StaleElementReferenceException .class);
    }

    public boolean isHomepage(){
        try{
            fluentWait.until(x->x.findElement(By.xpath(homeButtonXpath)));
>>>>>>> a587164... S6
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}
<<<<<<< HEAD

=======
>>>>>>> a587164... S6
