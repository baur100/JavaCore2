package tests;

import listeners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomepageTests extends BaseTest {
    private static Logger logger = LogManager.getLogger(HomepageTests.class);
    @Parameters ({"email","password","playlist"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_createNewPlaylist_newPlaylistCreated(String login, String pwd, String playlist) {
        logger.info("test started ");
        LoginPage loginPage = new LoginPage(driver);
        logger.info("login page created ");
        loginPage.openPage();
        logger.info("login page opened ");
        HomePage homePage = loginPage.login(login, pwd);
        logger.info("logged to app");
        homePage.createNewPlaylist(playlist);
        logger.info("playlist created");
        Assert.assertTrue(homePage.isPlaylistCreated(playlist));
    }
    @Parameters ({"email","password","playlist","new-playlist"})
    @Test
    public void scrollDown(String login, String pwd,String playlist, String newPlaylist) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login, pwd);
        homePage.createNewPlaylist(playlist);
        homePage.leftHandScrollDown(playlist);
        homePage.renamePlayList(playlist, newPlaylist);
        Assert.assertTrue(homePage.isPlaylistCreated(newPlaylist));

    }
}