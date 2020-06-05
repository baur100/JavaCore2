package apiTest;

import io.restassured.response.Response;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import tests.HomepageTests;

import java.time.Duration;

import static io.restassured.RestAssured.given;

public class Hw14SelAndAPI  {
    private WebDriver driver;

//    private FluentWait<WebDriver> fluentWait;
//    private int playlist_id;
//    private String token;
//
//    @BeforeMethod
//    public void startUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//
//        // explicitWait = new WebDriverWait(driver, 10);
//        fluentWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(Exception.class)
//                .ignoring(StaleElementReferenceException.class);
//
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://koelapp.testpro.io/");
//    }
//    @AfterMethod
//    public void tearDown(){
//        Response response = given()
//                .baseUri("https://koelapp.testpro.io/")
//                .header("Authorization","Bearer "+token)
//                .basePath("api/playlist/"+playlist_id)
//                .when()
//                .delete();
//    }
//    @Test
//
//    public String createNewPlaylist(String name) {
//        getPlusButton().click();
//        getNewPlaylistNameField().sendKeys(name);
//        getNewPlaylistNameField().sendKeys(Keys.ENTER);
//        String str =  driver.getCurrentUrl();
//        return str.split("/")[5];
//    }

}
