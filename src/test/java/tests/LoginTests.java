package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTests extends BaseTest {

    @Parameters({"email", "password"})
    @Test
    // Module_WhatTesting_ExpectedResult
    public void loginTest_CorrectCredentials_LoggedToApp(String login, String pwd) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login, pwd);
        Assert.assertTrue(homePage.isHomePage());
    }

    @Parameters({"email", "wrong-password"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    // Module_WhatTesting_ExpectedResult
    public void loginTest_IncorrectCredentials_NotLoggedToApp(String login, String pwd) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(login, pwd);
        Assert.assertTrue(loginPage.isError());
    }

    @Test(retryAnalyzer = RetryAnalyzer.class, enabled = false)
    // Module_WhatTesting_ExpectedResult
    public void test_Fails() {
        Assert.assertTrue(false);
    }

    @DataProvider(name = "Summary")
    public Object[][] createdDate1() {
        return new Object[][]{
                {32, 2, 34},
                {2, 8, 10},
                {3, 3, 7},
                {4, 3, 7}
        };
    }

    @Test(dataProvider = "Summary")
    public void test_Sum(int a, int b, int c) {
        int xx = a + b;
        Assert.assertEquals(a + b, c);
    }

    @DataProvider(name = "StringSummary")
    public Object[][] createdDate2() {
        return new Object[][]{
                {32, 2, 322},
                {2, 8, 28},
                {3, 3, 33},
                {4, 3, 43},
                {"A", "B", "AB"}
        };
    }

//    @Test(dataProvider = "StringSummary")
//    public void test_String_Sum(String a, String b, String c) {
//        String xx = a + b;
//        Assert.assertEquals(a + b, c);
//    }
}
