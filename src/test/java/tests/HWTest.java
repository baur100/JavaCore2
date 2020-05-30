//package tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pageObjects.HomePage;
//import pageObjects.LoginPage;
//
//public class HWTest extends BaseTest {
//    @Test
//    public void new_loginTest_createNewPlaylist_newPlaylistCreated() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.openPage();
//        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
//        homePage.createNewPlaylist("Nasyikat");
//        Assert.assertTrue(homePage.isPlaylistCreated("Nasyikat"));
//    }
//
//    @Test
//    public void scrollDown() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.openPage();
//        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
//        homePage.createNewPlaylist("Nasyikat");
//        homePage.leftHandScrollDown("Nasyikat");
//        homePage.renamePlayList("Nasyikat", "Nasu");
//        Assert.assertTrue(homePage.isPlaylistCreated("Nasu"));
//    }
//
//   }

