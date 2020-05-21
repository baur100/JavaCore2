package pageObjects;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.cssSelector("[type='email']");
    private final By pwdField = By.cssSelector("[type='password']");
    private final By submitBtn = By.cssSelector("[type='submit']");
    private final By errorFrm = By.cssSelector("[class='error']");

    public void openPage() {
        String url = "https://koelapp.testpro.io/";
        driver.get(url);
    }

    public WebElement getEmailField() { return driver.findElement(emailField); }

    public WebElement getPasswordField() { return driver.findElement(pwdField); }

    public WebElement getSubmitBtn() { return driver.findElement(submitBtn); }

    public WebElement getErrorFrm() { return wait.until(d -> d.findElement(errorFrm)); }

    public static String getToken() {
        String body = "{\"email\":\"testpro.user02@testpro.io\",\"password\":\"te$t$tudent02\"}";
        Response response = RestAssured.given()
                .baseUri("https://koelapp.testpro.io/")
                .contentType(ContentType.JSON)
                .body(body)
                .post("api/me");
        return response.jsonPath().getString("token");
    }
    public HomePage login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getSubmitBtn().click();
        return new HomePage(driver);
    }
}
