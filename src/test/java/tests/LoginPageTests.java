package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginPageTests extends BaseTest{
    @Parameters({"email", "password"})
    @Test(enabled = false)
    public void loginPage_LoginWithValidCredentials_AuthenticationSucceeds(String login, String pwd) {
        boolean loginApproved;
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        var homePage = loginPage.login(login, pwd);
        loginApproved = homePage.isHomePage();
        Assert.assertTrue(loginApproved);
    }

    @Test(enabled = false)
    public void loginPage_LoginWithInvalidCredentials_AuthenticationFails() {
        boolean loginDeclined;
        var loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login("testpro.user02@testpro.io", "invalidPassword");
        loginDeclined = loginPage.getErrorFrm().isEnabled();
        Assert.assertTrue(loginDeclined);
    }

    @Test
    public void loginPage_TestToken() {
        LoginPage login = new LoginPage(driver);
        System.out.println(login.getToken());
    }
}
