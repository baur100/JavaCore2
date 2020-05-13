package TestDenis;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsD.Homepage;
import pageObjectsD.Loginpage;

public class HomepageTests_new extends BaseTest {
    @Test
    public void new_logintest_createnewplaylist()  {
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        Homepage homepage = loginpage.login("testpro.user02@testpro.io","te$t$tudent02");
        homepage.createnewplaylist("DennisP");
        Assert.assertTrue(homepage.isplaylistcreated("DennisP"));
    }
    @Test
    public void new_scrollDown() {
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        Homepage homepage = loginpage.login("testpro.user02@testpro.io","te$t$tudent02");
        homepage.createnewplaylist("zzDennisP");
        homepage.leftHandscrollDown("zzDennisP");
        homepage.renamePlaylist("zzDennisP","newDennisP");
        Assert.assertTrue(homepage.isplaylistcreated("zzDennisPnewDennisP"));
    }
//    @Test
//    public void playlist_addSongToPlaylist_SongsAddedToPlaylist() {
//        Loginpage loginPage = new Loginpage(driver);
//        loginPage.openpage();
//        Homepage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
//        homePage.createnewplaylist("DenisMAX");
////        homePage.playlistANDaddSongs();
//    }
}
