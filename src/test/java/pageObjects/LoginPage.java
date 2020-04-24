package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private final String emailPath = "[type='email']";
    private final String passwordPath = "[type='password']";
    private final String submitBtnPath = "[type='submit']";
    private final String url = "https://koelapp.testpro.io/";
    public static final String email = "testpro.user02@testpro.io";
    public static final String password = "te$t$tudent02";

    public LoginPage(WebDriver driver) { super(driver); }

    public WebElement getEmailField() { return driver.findElement(By.cssSelector(emailPath)); }
    public WebElement getPasswordField() { return driver.findElement(By.cssSelector(passwordPath)); }
    public WebElement getSubmitBtn() { return driver.findElement(By.cssSelector(submitBtnPath)); }

    public void openPage() {
        driver.get(url);
    }

    public HomePage login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubmitBtn().click();

        return new HomePage(driver);
    }
}
