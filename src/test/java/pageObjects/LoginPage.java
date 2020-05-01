package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        String url = "https://koelapp.testpro.io/";
        driver.get(url);
    }

    public WebElement getEmailField() {
        String emailPath = "[type='email']";
        return driver.findElement(By.cssSelector(emailPath)); }

    public WebElement getPasswordField() {
        String passwordPath = "[type='password']";
        return driver.findElement(By.cssSelector(passwordPath)); }

    public WebElement getSubmitBtn() {
        String submitBtnPath = "[type='submit']";
        return driver.findElement(By.cssSelector(submitBtnPath));
    }

    public HomePage login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubmitBtn().click();
        return new HomePage(driver);
    }
}
