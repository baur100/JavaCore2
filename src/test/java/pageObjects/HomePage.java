package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) { super(driver); }

    public void isHomePage() {
        final By xpath = By.xpath("//*[@class='home active']");
        wait.until(d -> d.findElement(xpath));
    }

    public WebElement getAddPlayListBtn() {
        final By xpath = By.xpath("//i[@class='fa fa-plus-circle control create']");
        wait.until(d -> d.findElement(xpath).isEnabled());
        return driver.findElement(xpath);
    }

    public WebElement getPlayListTextField() {
        final By xpath = By.xpath("//*[contains(@placeholder, 'to save')]");
        return wait.until(d -> d.findElement(xpath));
    }

    public List<WebElement> getPlayListItems(String playListName) {
        return List.of(getPlayListItem(playListName));
    }

    public String getPlayListItemHref(String playListName) {
        final By xpath = By.xpath("//a[text()=" + "'" + playListName + "'" + "]");
        return wait.until(d -> d.findElement(xpath).getAttribute("href").substring(27));
    }

    public WebElement getPlayListItem(String playListName) {
        final By css = By.cssSelector("[href='" + getPlayListItemHref(playListName) + "']");
        return wait.until(d -> d.findElement(css));
    }

    public void addPlayList(String playListName) {
        isHomePage();
        getAddPlayListBtn().click();
        var textField = getPlayListTextField();
        textField.sendKeys(playListName);
        textField.sendKeys(Keys.RETURN);
        wait.until(driver -> driver.findElements(By.cssSelector("[class='success show']")));
    }

    public WebElement playListItemTextField(String playListName) {
        final By xpath = By.xpath("//a[contains(text(), " + "'" + playListName + "')]/following-sibling::input");
        return wait.until(d -> d.findElement(xpath));
    }

    public void playListScroll(String playListName) {
        final String scrollJs = "arguments[0].scrollIntoView(true);";
        ((JavascriptExecutor)driver).executeScript(scrollJs, getPlayListItem(playListName));
    }

    public void changePlayListItemName(String currentName, String ChangeToName) {
        var action = new Actions(driver);
        action.doubleClick(getPlayListItem(currentName)).build().perform();
        WebElement inputField = playListItemTextField(currentName);
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputField.sendKeys(ChangeToName);
        inputField.sendKeys(Keys.RETURN);
    }

    public Boolean isPlayListCreated(String playListName) {
        isHomePage();
        try {
            getPlayListItem(playListName);
            return true;
        } catch (TimeoutException | NoSuchElementException err) {
            return false;
        }
    }

    private void navigateSubMenu(String playListName) throws InterruptedException {
        var addTo = By.xpath("//ul[@class='menu song-menu' and not(contains(@style, 'display: none'))]" + "//child::li[@class='has-sub']");
        var playListItem = By.xpath("//ul[@class='menu song-menu' and not(contains(@style," +
                                    " 'display: none'))]//descendant::li[contains(text(), " + "'" + playListName + "'" + ")]");

        var addToMenuField = wait.until(d -> d.findElement(addTo));
        var action = new Actions(driver);

        action.moveToElement(addToMenuField).perform();

        var playListItemNav = wait.until(d -> d.findElement(playListItem));

        action.moveToElement(playListItemNav).perform();
        action.click(playListItemNav).perform();
    }

    private WebElement getAllSongsList() {
        final By css = By.cssSelector("[class='songs']");
        return wait.until(d -> d.findElement(css));
    }

    public void selectSongs(String playListName) throws InterruptedException {
        var list = setSongList("Opening");
        var actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).perform();
        for (var webElement : list) {
            actions.click(webElement);
        }
        actions.keyUp(Keys.CONTROL).perform();
        actions.contextClick(list.get(0)).perform();

        navigateSubMenu(playListName);
    }

    private List<WebElement> setSongList(String... songNames) {
        var songList = new ArrayList<WebElement>();
        for (var songName : songNames) {
            By xpath = By.xpath("//*[@id='songsWrapper']//td[contains(text(),'" + songName + "')]/parent::tr");
            var song = wait.until(d -> d.findElement(xpath));
            songList.add(song);
        }
        return songList;
    }

    public void addSongsToPlayList(String playListName) throws InterruptedException {
        wait.until(d -> getAllSongsList().isEnabled());
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", getAllSongsList());
        selectSongs(playListName);
        //selectSongs("zzzXYZ");
    }
}
