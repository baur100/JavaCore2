package tests;

import io.restassured.http.Header;
import io.restassured.response.Response;
import listeners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static io.restassured.RestAssured.given;

public class HomepageTests extends tests.BaseTest {
    private String id;
    private static Logger logger = LogManager.getLogger(HomepageTests.class);
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        Header header = new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjMwMCwiaXNzIjoiaHR0cHM6Ly9rb2VsYXBwLnRlc3Rwcm8uaW8vYXBpL21lIiwiaWF0IjoxNTg5OTMxODE5LCJleHAiOjE1OTA1MzY2MTksIm5iZiI6MTU4OTkzMTgxOSwianRpIjoiaUlHMlViYUNsR3BFS09xbiJ9.IpJwzrQ5NPwoIDkFFPSasAJmANLlBiGh5Zz0PXTl0lA");

        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .header(header)
                        .when()
                        .delete("api/playlist/"+id)
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();



    }

    @Parameters({"email","password","playlist"})
    @Test
    public void loginTest_createNewPlaylist_newPlaylistCreated(String login, String pwd, String playlist) {
        logger.info("test started");
        LoginPage loginPage = new LoginPage(driver);
        logger.info("login page created");
        loginPage.openPage();
        logger.info("login page opened");
        HomePage homePage = loginPage.login(login,pwd);
        logger.info("logged to app");
        id = homePage.createNewPlaylist(playlist);
        System.out.println("there id = " + id);

        logger.info("playlist created");

        Assert.assertTrue(homePage.isPlaylistCreated(playlist));
    }
    @Parameters({"email","password","playlist", "new-playlist"})
    @Test
    public void scrollDown(String login, String pwd, String playlist, String newPlaylist){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        homePage.createNewPlaylist(playlist);
        homePage.leftHandScrollDown(playlist);
        homePage.renamePlayList(playlist,newPlaylist);
        Assert.assertTrue(homePage.isPlaylistCreated(newPlaylist));

    }
}
