package pageObjectsD;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends BasePage{
    private  String emailXpath = "//*[@type = 'email']";
    private String passwordXpath = "//*[@type = 'password']";
    private String loginButtonXpath = "//*[@type = 'submit']";
    private String errorXpath = "//*[@class = 'error']";


    public Loginpage(WebDriver driver) {
        super(driver);
    }
    private WebElement getemailfield(){
        return driver.findElement(By.xpath(emailXpath));
    }
    private WebElement getpaswswordfield(){
        return driver.findElement(By.xpath(passwordXpath));
    }
    private WebElement getloginbutton(){
        return driver.findElement(By.xpath(loginButtonXpath));
    }

    public void openpage(){
        driver.get(url);
    }

    public Homepage login (String email, String password){
        getemailfield().sendKeys(email);
        getpaswswordfield().sendKeys(password);
        getloginbutton().click();
        return new Homepage(driver);
    }

    public boolean iserror() {
        try{
            fluentWait.until(x->x.findElement(By.xpath(errorXpath)));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
}
