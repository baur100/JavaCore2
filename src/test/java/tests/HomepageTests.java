package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomepageTests extends BaseTest{
    @Parameters({"email","password","playlist"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_createNewPlaylist_newPlaylistCreated(String login, String pwd, String playlist) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        homePage.createNewPlaylist(playlist);
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
