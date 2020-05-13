package TestDenis;

import Listener.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjectsD.Homepage;
import pageObjectsD.Loginpage;



public class Logintests extends BaseTest {

    @Parameters({"email","password"})
    @Test
    public void logintest_correctcredentials_loggedtoapp(String login,String pwd){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        Homepage homepage = loginpage.login("testpro.user02@testpro.io","te$t$tudent02");
        Assert.assertFalse(homepage.ishomepage());
    }
    @Parameters({"email","wrong-password"})
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void logintest_incorrectcrentials_notloggedtoapp(String login,String pwd){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        loginpage.login(login,pwd);
        Assert.assertTrue(loginpage.iserror());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class,enabled = false)
    public void test_Fails(){
    Assert.assertTrue(false);
    }


    @DataProvider(name ="Summing")
    public Object[][] createData1(){
        return new Object[][]{
                     {3,3,6},
                     {2,8,10},
                {10,12,22},
                {58,3,61},
                {5,6,10},
                {-10,-15,-25}
        };
    }
    @Test(dataProvider = "Summing")
    public void test_sum(int a,int b,int c){
        int xx = a+b;
        Assert.assertEquals(xx,c);
    }
}
