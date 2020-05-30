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

public class HomepageTests extends BaseTest{
    private String id;
    private static Logger logger = LogManager.getLogger(HomepageTests.class);
    @AfterMethod
    public void tearDown(){
        Header header= new Header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9." +
                "eyJzdWIiOjMwMCwiaXNzIjoiaHR0cHM6Ly9rb2VsYXBwLnRlc3Rwcm8uaW8vYXBpL21lIiwiaWF0IjoxNTkwNDUzNDg2L" +
                "CJleHAiOjE1OTEwNTgyODYsIm5iZiI6MTU5MDQ1MzQ4NiwianRpIjoiSjQ4SEY4eHh0NVN4TERGNiJ9.gvEOQmgeGOrKpDJu4SDEVgm0TcbQPb9dbyjDnDzrcXk\"\n" );
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .header(header)
                        .when()
                        .delete("api/playlist/"+id)
                        .then()
                        .statusCode(400)
                        .extract()
                          .response();
    }
    @Parameters({"email","password","playlist"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_createNewPlaylist_newPlaylistCreated(String login, String pwd, String playlist) {
        logger.info("test started");
        LoginPage loginPage = new LoginPage(driver);
        logger.info("login page created");
        loginPage.openPage();
        logger.info("login page opened");
        HomePage homePage = loginPage.login(login,pwd);
        logger.info("logged to app");
      id= homePage.createNewPlaylist(playlist);

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
