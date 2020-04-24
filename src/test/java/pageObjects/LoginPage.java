package pageObjects;

import org.openqa.selenium.*;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(url);
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath(LoginPageSelectors.emailXpath));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath(LoginPageSelectors.passwordXpath));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(LoginPageSelectors.loginButtonXpath));
    }

    public HomePage login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new HomePage(driver);
    }

    public boolean isError() {
        try {
            fluentWait.until(x -> x.findElement(By.xpath(LoginPageSelectors.errorXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}
