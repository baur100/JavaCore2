package TestDenis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjectsD.Homepage;
import pageObjectsD.Loginpage;

public class HomepageTests extends BaseTest {
    private static Logger logger = LogManager.getLogger(HomepageTests.class);
    @Parameters({"email","password","playlist"})
    @Test
    public void logintest_createnewplaylist(String login,String pwd,String playlist)  {
        logger.info("test started");
        Loginpage loginpage = new Loginpage(driver);
        logger.info("login page created");
        loginpage.openpage();
        logger.info("login page opened");
        Homepage homepage = loginpage.login(login,pwd);
        logger.info("logged to app");

        homepage.createnewplaylist(playlist);
        logger.info("playlist created");

        Assert.assertTrue(homepage.isplaylistcreated(playlist));
    }
    @Parameters({"email","password","playlist","newplaylist"})
    @Test
    public void scrollDown(String login,String pwd,String playlist,String newplaylist) {
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        Homepage homepage = loginpage.login(login,pwd);
        homepage.createnewplaylist(playlist);
        homepage.leftHandscrollDown(playlist);
        homepage.renamePlaylist(playlist,newplaylist);
        Assert.assertTrue(homepage.isplaylistcreated(newplaylist));
    }
    @Test
    public void playlist_addSongToPlaylist_SongsAddedToPlaylist() {
        Loginpage loginPage = new Loginpage(driver);
        loginPage.openpage();
        Homepage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.createnewplaylist("DenisMAX");
//        homePage.playlistANDaddSongs();
    }
}
