package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomePageTests extends BaseTest {
    @Test(priority = 0)
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_AddPlaylist_NewPlaylistAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        var date = homePage.getDate();
        homePage.addPlaylist("ag20 " + date);
        Assert.assertTrue(homePage.isPlayListCreated());
    }

    @Test(priority = 1)
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_Add5Playlists_New5PlaylistsAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        var date = homePage.getDate();
        homePage.add5Playlist("ag20 " + date);
    }

    @Test(priority = 2)
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
}
