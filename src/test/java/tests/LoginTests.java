package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class LoginTests extends BaseTest{

    @Parameters({"email","password"})
    @Test
    public void loginTest_correctCredentials_loggedToApp(String login, String pwd){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login(login,pwd);
        Assert.assertTrue(homePage.isHomepage());
    }
    @Parameters({"email","wrong-password"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_incorrectCredentials_notLoggedToApp(String login, String pwd){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(login,pwd);
        Assert.assertTrue(loginPage.isError());
    }
    @Test (retryAnalyzer = RetryAnalyzer.class)
    public void test_Fails(){

        Assert.assertTrue(false);
    }
    @DataProvider(name = "Summing")
    public Object[][] createData1() {
        return new Object[][] {
                { 3, 3, 6 },
                { 2,8,10},
                {10,12,22},
                {58,3,61},
                {5,6,10},
                {-10,-15,-25}
        };
    }
    @Test(dataProvider = "Summing")
    public void test_Sum(int a, int b, int c){
        int xx = a + b;
        Assert.assertEquals(xx,c);
    }
    @DataProvider(name = "StringSumming")
    public Object[][] createData2() {
        return new Object[][] {
                {"ST","ing","STing"},
                {"5","6","11"},
                {"55","6","556"}
        };
    }
    @Test(dataProvider = "StringSumming")
    public void test_StringSum(String a, String b, String c){
        String xx = a + b;
        Assert.assertEquals(xx,c);
    }
    @DataProvider (name="Air_Tikets_price")
    public Object[][] createData3() {
        return new Object[][]{

                {1, 100, 0},
                {4, 100, 50},
                {18, 100, 100},
                {68, 100, 75}
        };
    }
    @Test (dataProvider = "Air_Tikets_price")
    public void test_Ait_Ticket_Price(int age, int price, int finalPrice) {
        int finalPriceOne=0;
        if (age < 2) {
            finalPriceOne = price * 0;
        } else if (age >= 2 && age <= 10) {
             finalPriceOne = price / 2;
        } else if (age > 10 && age < 65) {
             finalPriceOne = price;
        } else if (age >= 65) {
            finalPriceOne = price * 3 / 4;
        }


        Assert.assertEquals(finalPrice,finalPriceOne);
    }
}
