package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageTests extends BaseTest {
    private static Logger logger = LogManager.getLogger(HomePageTests.class);
    @Parameters({"email", "password", "playlist"})
    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_AddPlaylist_NewPlaylistAdded(String login, String pwd, String playlist) {
        logger.info("Test started");
        LoginPage loginPage = new LoginPage(driver);
        logger.info("Login page created");
        loginPage.openPage();
        logger.info("Login page opened");
        HomePage homePage = loginPage.login(login, pwd);
        logger.info("Logged to app");
        homePage.setPlaylistName(playlist + " " + homePage.getDate());
        homePage.addPlaylist();
        logger.info("Playlist created");
        Assert.assertTrue(homePage.isPlayListCreated());
    }


//    @Test
//    // Module_WhatTesting_ExpectedResult
//    public void homePageTest_Add5Playlists_New5PlaylistsAdded() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.openPage();
//        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
//        homePage.setPlaylistName("ag20 " + homePage.getDate());
//        homePage.add5Playlist();
//    }

//    @Test
//    // Module_WhatTesting_ExpectedResult
//    public void homePageTest_DeleteSimilarPlaylists_SimilarPlaylistSDeleted() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.openPage();
//        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
//        homePage.deletePlaylistsSimilarNames();
//        Assert.assertFalse(homePage.isSimilarPlaylistsCreated());
//    }

    @Parameters({"email", "password", "playlist", "new-playlist"})
    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_EditLastPlaylist_LastPlaylistEdited(String login, String pwd, String playlist, String newPlaylist) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login, pwd);
        homePage.findLastPlaylistAndEdit();
        Assert.assertTrue(homePage.isPlayListRenamed());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void playlist_addSongToPlaylist_SongsAddedToPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlaylistName("ag20 " + homePage.getDate());
        homePage.addPlaylist();
        homePage.setSongName("Stomps and Claps");
        homePage.findSongByTitle();
        homePage.addSongToPlaylist();
        homePage.navigateToLastAddedPlaylist();
        Assert.assertTrue(homePage.isSongAdded());
    }
}
