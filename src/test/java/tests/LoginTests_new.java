package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTests_new extends BaseTest {

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
}