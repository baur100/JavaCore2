package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    private final By homeBtn = By.cssSelector("[class='home active']");
    private final By addPLBtn = By.cssSelector("[class='fa fa-plus-circle control create']");
    private final By plTxtField = By.cssSelector("form.create > input[type='text']");
    private final By songLst = By.cssSelector("[class='songs']");
    private final JavascriptExecutor js = (JavascriptExecutor)driver;

    public HomePage(WebDriver driver) { super(driver); }

    public WebElement getAddPLBtn() {
        wait.until(d -> d.findElement(addPLBtn).isEnabled());
        return driver.findElement(addPLBtn);
    }

    public WebElement getPLTxtField() { return wait.until(d -> d.findElement(plTxtField)); }

    public List<WebElement> getPLItems(String playListName) {
        return List.of(getPLItem(playListName));
    }

    public WebElement getPLItem(String playListName) {
        final By plItem = By.cssSelector("[href='" + getPLItemHref(playListName) + "']");
        return wait.until(d -> d.findElement(plItem));
    }

    public String getPLItemHref(String playListName) {
        final By href = By.xpath("//a[text()=" + "'" + playListName + "'" + "]");
        return wait.until(d -> d.findElement(href).getAttribute("href").substring(27));
    }

    public WebElement getPLItemTxtFld(String playListName) {
        final By xpath = By.xpath("//a[contains(text(), " + "'" + playListName + "')]/following-sibling::input");
        return wait.until(d -> d.findElement(xpath));
    }

    private WebElement getAllSongsLst() {
        return wait.until(d -> d.findElement(songLst));
    }

    public boolean isHomePage() {
        var home = wait.until(ExpectedConditions.elementToBeClickable(homeBtn));
        return home.isEnabled();
    }

    public boolean isPLCreated(String playListName) {
        try {
            getPLItem(playListName);
            return true;
        } catch (TimeoutException | NoSuchElementException err) {
            return false;
        }
    }

    public void plScroll(String playListName) {
        final String scrollJs = "arguments[0].scrollIntoView(true);";
        js.executeScript(scrollJs, getPLItem(playListName));
    }

    public void addPlayList(String playListName) {
        js.executeScript("arguments[0].click();", getAddPLBtn());
        var textField = getPLTxtField();
        textField.sendKeys(playListName);
        textField.sendKeys(Keys.RETURN);
        wait.until(driver -> driver.findElements(By.cssSelector("[class='success show']")));
    }

    public void changePlayListItemName(String currentName, String ChangeToName) {
        var action = new Actions(driver);
        action.doubleClick(getPLItem(currentName)).build().perform();
        WebElement inputField = getPLItemTxtFld(currentName);
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputField.sendKeys(ChangeToName);
        inputField.sendKeys(Keys.RETURN);
    }

    private void navigateSubMenu(String playListName) {
        var addTo = By.xpath("//ul[@class='menu song-menu' and not(contains(@style, 'display: none'))]" + "//child::li[@class='has-sub']");
        var playListItem = By.xpath("//ul[@class='menu song-menu' and not(contains(@style," +
                                    " 'display: none'))]//descendant::li[contains(text(), " + "'" + playListName + "'" + ")]");

        var addToMenuField = wait.until(d -> d.findElement(addTo));
        var action = new Actions(driver);

        action.moveToElement(addToMenuField).perform();

        var playListItemNav = wait.until(d -> d.findElement(playListItem));

        action.moveToElement(playListItemNav).click().build().perform();
    }

    public void selectSongs(String playListName) {
        var list = setSongLst("Opening");
        var actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL).perform();
        for (var webElement : list) {
            actions.click(webElement);
        }
        actions.keyUp(Keys.CONTROL).perform();
        actions.contextClick(list.get(0)).perform();

        navigateSubMenu(playListName);
    }

    private List<WebElement> setSongLst(String... songNames) {
        var songList = new ArrayList<WebElement>();
        for (var songName : songNames) {
            By xpath = By.xpath("//*[@id='songsWrapper']//td[contains(text(),'" + songName + "')]/parent::tr");
            var song = wait.until(d -> d.findElement(xpath));
            songList.add(song);
        }
        return songList;
    }

    public void addSongsToPL(String playListName) {
        wait.until(d -> getAllSongsLst().isEnabled());
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()", getAllSongsLst());
        selectSongs(playListName);
        //selectSongs("zzzXYZ");
    }
}
