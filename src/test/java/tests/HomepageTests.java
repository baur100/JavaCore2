package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomepageTests extends BaseTest{
    @Test
    public void loginTest_createNewPlaylist_newPlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.createNewPlaylist("HeyYoPlaylist");
        Assert.assertTrue(homePage.isPlaylistCreated("HeyYoPlaylist"));
    }
    @Test
    public void scrollDown(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.createNewPlaylist("zzHeyYoPlaylist");
        homePage.leftHandScrollDown("zzHeyYoPlaylist");
        homePage.renamePlayList("zzHeyYoPlaylist","newName");
        Assert.assertTrue(homePage.isPlaylistCreated("newName"));

    }
    @Test
    public void homepage_allSongs_addSongToPlaylist_byMenuButton(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.addSongToPlaylist_byMenuButton("The Only Home We Have", "zebra2");
    }
    @Test
    public void homepage_allSongs_addSongToPlaylist_byContextMenu(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.addSongToPlaylist_byRightClick("Lesser Faith", "zebra2");
    }
    @Test
    public void homepage_allSongs_playSong_byDoubleClick() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        homePage.allSongs_playSong_byDoubleClick("Lesser Faith");
        Assert.assertTrue(homePage.isMusicPlaying());
    }
}
