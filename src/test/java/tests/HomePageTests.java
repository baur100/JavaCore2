package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageTests extends BaseTest {
    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_AddPlaylist_NewPlaylistAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlaylistName("ag20 " + homePage.getDate());
        homePage.addPlaylist();
        Assert.assertTrue(homePage.isPlayListCreated());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_Add5Playlists_New5PlaylistsAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlaylistName("ag20 " + homePage.getDate());
        homePage.add5Playlist();
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_DeleteSimilarPlaylists_SimilarPlaylistSDeleted() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.deletePlaylistsSimilarNames();
        Assert.assertFalse(homePage.isSimilarPlaylistsCreated());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_EditLastPlaylist_LastPlaylistEdited() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
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
