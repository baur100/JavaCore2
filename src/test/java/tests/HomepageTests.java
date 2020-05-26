package tests;

import io.restassured.http.Header;
import io.restassured.response.Response;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static io.restassured.RestAssured.given;


public class HomepageTests extends BaseTest{
    private String id;

    @AfterMethod
    public void tearDown(){
        Header header = new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjMwMCwiaXNzIjoiaHR0cHM6Ly9rb2VsYXBwLnRlc3Rwcm8uaW8vYXBpL21lIiwiaWF0IjoxNTg5OTUxNjE3LCJleHAiOjE1OTA1NTY0MTcsIm5iZiI6MTU4OTk1MTYxNywianRpIjoiWVZqMWE2QTJTMnMyY3BraCJ9.rJkzNr4CP-kWTFPMwrIlGmWlu8zE-J44KQEnC0fZcOU");
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
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_createNewPlaylist_newPlaylistCreated(String login, String pwd, String playlist) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        id = homePage.createNewPlaylist(playlist);
        System.out.println(id);

        Assert.assertTrue(homePage.isPlaylistCreated(playlist));
    }
    @Parameters({"email","password","playlist", "new-playlist"})
    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void scrollDown(String login, String pwd, String playlist, String newPlaylist){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        homePage.createNewPlaylist(playlist);
        homePage.leftHandScrollDown(playlist);
        homePage.renamePlayList(playlist,newPlaylist);
        Assert.assertTrue(homePage.isPlaylistCreated(newPlaylist));

    }
    @Parameters({"email","password","playlist"})
    @Test
    public void addSongToPlayListAndDelitPlayList(String login, String pwd, String playlist){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        homePage.createNewPlayListAndAddSongToPlayList(playlist);
        Assert.assertTrue(homePage.isPlaylistCreated(playlist));
        driver.navigate().refresh();
        homePage.deletePlayList(playlist);
        driver.navigate().refresh();
        Assert.assertFalse(homePage.isPlaylistCreated(playlist));

    }
}
