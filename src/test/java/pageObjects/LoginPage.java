package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class LoginPage {
    private final String emailXpath = "//*[@type='email']";
    private final String passwordXpath = "//*[@type='password']";
    private final String loginButtonXpath = "//*[@type='submit']";
    private final String errorXpath = "//*[@class='error']";

    private final String url = "https://koelapp.testpro.io/";
    private WebDriver driver;
    FluentWait<WebDriver> fluentWait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        fluentWait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class)
                .ignoring(StaleElementReferenceException.class);
    }
<<<<<<< HEAD

    public void openPage() {
        driver.get(url);
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath(emailXpath));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath(passwordXpath));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(loginButtonXpath));
    }

    public HomePage login(String email, String password) {
=======
    public void openPage(){
        driver.get(url);
    }
    public WebElement getEmailField(){
        return driver.findElement(By.xpath(emailXpath));
    }
    public WebElement getPasswordField(){
        return driver.findElement(By.xpath(passwordXpath));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.xpath(loginButtonXpath));
    }
    public HomePage login(String email, String password){
>>>>>>> a587164... S6
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new HomePage(driver);
    }

    public boolean isError() {
<<<<<<< HEAD
        try {
            fluentWait.until(x -> x.findElement(By.xpath(errorXpath)));
=======
        try{
            fluentWait.until(x->x.findElement(By.xpath(errorXpath)));
>>>>>>> a587164... S6
        } catch (TimeoutException err) {
            return false;
        }
        return true;
<<<<<<< HEAD

    }
}
=======
    }
}
>>>>>>> a587164... S6
