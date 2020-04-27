package HWs.Tests;

import HWs.pageObjects.HomePage;
import HWs.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest{

    @Test
    public void createPlayListTest_1ItemCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlayListName("zzz");
        homePage.addPlaylist(homePage.getPlayListName());
        Assert.assertTrue(homePage.isPlayListCreated());
    }
    @Test
    public void PlayListTest_ItemChanged() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlayListName("zzz");

        homePage.changePlaylistCheckingExisting(homePage.getPlayListName());
        Assert.assertTrue(homePage.isPlayListChanged());
    }
}
