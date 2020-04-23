package pageObjects;

import org.openqa.selenium.*;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean isHomepage(){
        try{
            fluentWait.until(x->x.findElement(By.xpath(HomePageSelectors.homeButtonXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
    public WebElement getPlusButton(){
        fluentWait.until(x-> x.findElement(By.cssSelector(HomePageSelectors.plusButtonCssSelector)).isEnabled());
        return driver.findElement(By.cssSelector(HomePageSelectors.plusButtonCssSelector));
    }
    private WebElement getNewPlaylistNameField(){
        return driver.findElement(By.xpath(HomePageSelectors.newPlaylistFieldXpath));
    }
    private String getPlaylistXpath(String name){
        return "//a[text()='"+name+"']";
    }
    public void createNewPlaylist(String name){
        getPlusButton().click();
        getNewPlaylistNameField().sendKeys(name);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
    }
    public boolean isPlaylistCreated(String name){
        var list = driver.findElements(By.xpath(getPlaylistXpath(name)));
        return list.size()>0;
    }
}

