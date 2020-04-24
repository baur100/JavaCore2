package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Time;
import java.util.List;

public class HomePage extends BasePage{
    private final String homeBtnPath = "//*[@class='home active']";
    private final String addPlayListBtn = "//i[@class='fa fa-plus-circle control create']";
    private final String playListTextField = "//*[contains(@placeholder, 'to save')]";

    public HomePage(WebDriver driver) {
        super(driver);    }

    public WebElement getAddPlayListBtn () {
        return driver.findElement(By.xpath(addPlayListBtn));
    }

    public WebElement getPlayListTextField () {
        return  driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }

    public List<WebElement> getPlayListItems(String playListName) {
        return driver.findElements(By.xpath("//a[text()=" + "'" + playListName + "'" + "]"));
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

    public void isHomePage() {
        wait.until(driver -> driver.findElement(By.xpath(homeBtnPath)));
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

    public void playListScroll(String playListName) {
//        for (int i = 1; i <= 16; i++) {
//            ((JavascriptExecutor) driver).executeScript("document.getElementById('sidebar').scrollTo(0, " + 100 * i + ");");
//        }
        WebElement elem;
        for (int i = 1; i <= 16; i++) {
            try {
                elem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=" + "'" + playListName + "'" + "]")));
                ((JavascriptExecutor) driver).executeScript("document.getElementById('sidebar').scrollTo(0, " + 100 * i + ");");
            } catch (TimeoutException err) {
                ((JavascriptExecutor) driver).executeScript("document.getElementById('sidebar').scrollTo(0, " + 100 * i + ");");
            }
        }
    }

    public void changePlayListItemName(String from, String to) {
        Actions action = new Actions(driver);
        WebElement playListItem = wait.until(driver -> driver.findElement(By.xpath("//a[contains(text(), " + "'" + from + "')]")));
        action.doubleClick(playListItem).build().perform();
        WebElement inputField = wait.until(driver -> driver.findElement(By.xpath("//a[contains(text(), " + "'" + from + "')]/following-sibling::input")));
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputField.sendKeys(to);
        inputField.sendKeys(Keys.RETURN);
    }
}
