package pageObjects;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private final String homeBtnPath = "//*[@class='home active']";
    private final String addPlayListBtn = "//i[@class='fa fa-plus-circle control create']";
    private final String playListTextField = "//*[contains(@placeholder, 'to save')]";
    private FluentWait<WebDriver> wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(5))
                    .pollingEvery(Duration.ofMillis(100))
                    .ignoring(NoSuchElementException.class)
                    .ignoring(NullPointerException.class)
                    .ignoring(TimeoutException.class)
                    .ignoring(StaleElementReferenceException.class);
    }

    public WebElement getAddPlayListBtn () {
        return driver.findElement(By.xpath(addPlayListBtn));
    }

    public WebElement getPlayListTextField () {
        return  driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }

    public void addPlayList(String playListName) {
        isHomePage();
        wait.until(driver -> getAddPlayListBtn());
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", getAddPlayListBtn());
        wait.until(driver -> getPlayListTextField());
        getPlayListTextField().sendKeys(playListName);
        getPlayListTextField().sendKeys(Keys.RETURN);
        wait.until(driver -> driver.findElements(By.cssSelector("[class='success show']")));
    }

    public Boolean isHomePage() {
        wait.until(driver -> driver.findElement(By.xpath(homeBtnPath)));
        return driver.findElements(By.xpath(homeBtnPath)).size() == 1;
    }

    public Boolean isPlayListCreated(String playListName) {
        isHomePage();
        try {
            wait.until(driver -> this.driver.findElement(By.xpath("//a[text()=" + "'" + playListName + "'" + "]")));
            return true;
        } catch (TimeoutException | NoSuchElementException err) {
            return false;
        }
    }
}
