package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomepageTests_new extends BaseTest{
    @Test
    public void new_loginTest_createNewPlaylist_newPlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.createNewPlaylist("HeyYoPlaylist");
        Assert.assertTrue(homePage.isPlaylistCreated("HeyYoPlaylist"));
    }
    @Test
    public void new_scrollDown(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.createNewPlaylist("zzHeyYoPlaylist");
        homePage.leftHandScrollDown("zzHeyYoPlaylist");
        homePage.renamePlayList("zzHeyYoPlaylist","newName");
        Assert.assertTrue(homePage.isPlaylistCreated("newName"));

    }
}
