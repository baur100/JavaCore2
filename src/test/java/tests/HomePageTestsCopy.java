package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class HomePageTestsCopy extends BaseTest{
    @Test
    public void new_homePage_AddPlayList_PlaylistIsCreated() {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.addPlayList("zZounds");
        Assert.assertTrue(homePage.isPLCreated("zZounds"));
    }

    @Test
    public void new_homePage_ChangePlaylistName_NameIsChanged() {
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.addPlayList("zZounds");
        homePage.plScroll("zZounds");
        homePage.changePlayListItemName("zZounds", "zZounds_Changed");
        Assert.assertTrue(homePage.isPLCreated("zZounds_Changed"));
    }
}
