package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomepageTests extends tests.BaseTest {
    @Test
    public void loginTest_createNewPlaylist_newPlaylistCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        Thread.sleep(2000);
        homePage.createNewPlaylist("abc");
        Assert.assertTrue(homePage.isPlaylistCreated("abc"));
    }
    @Test
    public void renamePlaylistAtTheBottomOfThePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io","te$t$tudent02");
        Thread.sleep(2000);
//        homePage.createNewPlaylist("zebra");
        homePage.scroll("zebra");
        homePage.rename("zebra","zebra_renamed");
        Assert.assertTrue(homePage.isPlaylistRenamed("zebra_renamed"));
    }
}

