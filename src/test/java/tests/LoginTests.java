package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTests {
    private WebDriver driver;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void loginTest_CorrectCredentials_LoggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        Assert.assertTrue(homePage.isHomePage());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void loginTest_IncorrectCredentials_NotLoggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login("testpro.user02@testpro.io", "-te$t$tudent02");
        Assert.assertTrue(loginPage.isError());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_AddPlaylist_NewPlaylistAdded() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        var date = homePage.getDate();
        homePage.addPlaylist("ag20 " + date);
        Assert.assertTrue(homePage.isPlayListCreated());
    }

    @Test
    // Module_WhatTesting_ExpectedResult
    public void homePageTest_Add5Playlists_New5PlaylistsAdded(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        var date = homePage.getDate();
        homePage.add5Playlist("ag20 " + date);
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
}