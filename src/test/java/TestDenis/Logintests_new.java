package TestDenis;

import Listener.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsD.Homepage;
import pageObjectsD.Loginpage;


public class Logintests_new extends BaseTest {


    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void new_logintest_correctcredentials_loggedtoapp(){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        Homepage homepage = loginpage.login("testpro.user02@testpro.io","te$t$tudent02");
        Assert.assertTrue(homepage.ishomepage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void new_logintest_incorrectcrentials_notloggedtoapp(){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.openpage();
        loginpage.login("testpro.user02@testpro.io","789");
        Assert.assertTrue(loginpage.iserror());
    }
}
