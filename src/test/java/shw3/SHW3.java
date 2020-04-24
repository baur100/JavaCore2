package shw3;

import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SHW3 extends BaseTest {

    @Test
    public void homePage_changePlayListName_PlayListNameIsChanged() {
        String from = "TestPlayList2020";
        String to = "TestChange2020";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.windowMaximize();
        loginPage.openPage();

        HomePage homePage = loginPage.login(LoginPage.email, LoginPage.password);
        homePage.addPlayList("TestPlayList2020");
        homePage.playListScroll(from);
        homePage.changePlayListItemName(from, to);

        Assert.assertTrue(homePage.getPlayListItems(to).size() > 0);
    }
}
