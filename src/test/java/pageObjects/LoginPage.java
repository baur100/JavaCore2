package pageObjects;

import org.openqa.selenium.*;


public class LoginPage extends BasePage{
    private final String emailXpath = "//*[@type='email']";
    private final String passwordXpath = "//*[@type='password']";
    private final String loginButtonXpath = "//*[@type='submit']";
    private final String errorXpath = "//*[@class='error']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get(url);
    }

    private WebElement getEmailField(){
        return driver.findElement(By.xpath(emailXpath));
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.xpath(passwordXpath));
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.xpath(loginButtonXpath));
    }

    public HomePage login(String email, String password){
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new HomePage(driver);
    }

    public boolean isError() {
        try{
            fluentWait.until(x->x.findElement(By.xpath(errorXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}