package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginPageTestsCopy extends BaseTest{
    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void new_loginPage_LoginWithValidCredentials_AuthenticationSucceeds() {
        boolean loginApproved;
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        loginApproved = homePage.isHomePage();
        Assert.assertTrue(loginApproved);
    }

    @Test
    public void new_loginPage_LoginWithInvalidCredentials_AuthenticationFails() {
        boolean loginDeclined;
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login("testpro.user02@testpro.io", "invalidPassword");
        loginDeclined = loginPage.getErrorFrm().isEnabled();
        Assert.assertTrue(loginDeclined);
    }
}
