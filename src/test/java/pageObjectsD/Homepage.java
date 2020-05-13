package pageObjectsD;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends BasePage {


    public Homepage(WebDriver driver) {
        super(driver);
    }

    public boolean ishomepage() {
        try {
            fluentWait.until(x -> x.findElement(By.cssSelector(HomepageSelectors.homebuttonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }

    private WebElement getplusbutton() {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(HomepageSelectors.plusbuttonCss)));

//        fluentWait.until(x->x.findElement(By.cssSelector(HomepageSelectors.plusbuttonCss)).isEnabled());
        return driver.findElement(By.cssSelector(HomepageSelectors.plusbuttonCss));
    }

    private WebElement getnewplaylistnamefield() {
        return driver.findElement(By.xpath(HomepageSelectors.newplaylistfieldXpath));
    }

    private String getPlaylistnameXpath(String name) {
        return "//a[text()='" + name + "']";
    }

    public void createnewplaylist(String name) {
        getplusbutton().click();
        getnewplaylistnamefield().sendKeys(name);
        getnewplaylistnamefield().sendKeys(Keys.ENTER);
    }

    public boolean isplaylistcreated(String name) {
        var list = driver.findElements(By.xpath(getPlaylistnameXpath(name)));
        return list.size() > 0;
    }

    public void leftHandscrollDown(String name) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement homepageIcon = fluentWait.until(x->x.findElement(By.cssSelector(HomepageSelectors.plusbuttonCss)));
        WebElement playlist = driver.findElement(By.xpath(getPlaylistnameXpath(name)));
        js.executeScript("arguments[0].scrollIntoView();", playlist);

//        Actions actions = new Actions(driver);
//        actions.moveToElement(playlist);
//        actions.perform();
    }

    public void renamePlaylist(String oldName, String newName) {
        WebElement playlist = driver.findElement(By.xpath(getPlaylistnameXpath(oldName)));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        WebElement textField = driver.findElement(By.xpath("//li[@class='playlist playlist editing']/input"));
        textField.sendKeys(Keys.COMMAND + "a");
        textField.sendKeys(Keys.DELETE);
        textField.sendKeys(newName);
        textField.sendKeys(Keys.ENTER);
    }

    //    public void addSongs(){
//        WebElement songs = driver.findElement(By.xpath(getallSongs));
//    }
//    private WebElement getallSongs(){
//        return driver.findElement(By.xpath(HomepageSelectors.allsongXpath));
//    }
    public WebElement getallSongs_Button() {
        return driver.findElement(By.xpath(HomepageSelectors.allSongsXpath));
    }

    public WebElement getSongsname() {
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomepageSelectors.allSongsXpath)));
        return driver.findElement(By.xpath(HomepageSelectors.songNameTWoXpath));
    }

    public WebElement getaddTOButton() {
        return driver.findElement(By.xpath(HomepageSelectors.addTObuttonXpath));
    }

    public WebElement getplaylistname() {
        return driver.findElement(By.tagName("DenisMAX"));
    }

//    public WebElement getmousehover() {
//        Actions actions = new Actions(driver);
//        WebElement addtoo = driver.findElement(By.xpath("//*[@id=\"usersWrapper\"]/h1/div/button"));
//        actions.moveToElement(addtoo);
//
//        WebElement playlistName = driver.findElement(By.xpath("//*[@id=\"queueWrapper\"]/h1/div/div/ul/li[163]"));
//        actions.moveToElement(playlistName);
//        actions.click().build().perform();
//    }
//        Actions actions = new Actions(driver);
//        driver.findElement(By.xpath(HomepageSelectors.buttonAddtoplylistXpath));
//        actions.moveToElement(getaddTOButton());

    public void playlistANDaddSongs()  {
        getallSongs_Button().click();
        Actions actions = new Actions(driver);
        actions.contextClick(getSongsname()).perform();
        actions.moveToElement(getaddTOButton()).perform();
        actions.moveToElement(getplaylistname()).perform();
    }
}
