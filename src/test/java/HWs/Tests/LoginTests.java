package HWs.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HWs.pageObjects.HomePage;
import HWs.pageObjects.LoginPage;

public class LoginTests {
    private WebDriver driver;
    // private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginTest_correctCredentials_loggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        Assert.assertTrue(homePage.isHomepage());
    }

    @Test
    public void loginTest_incorrectCredentials_notLoggedToApp() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login("testpro.user02@testpro.io", "********");
        Assert.assertTrue(loginPage.isError());
    }

    @Test
    public void createPlayListTest_1ItemCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.addPlaylist("sh11_test");
        Assert.assertTrue(homePage.isPlayListCreated("sh11_test"));
    }
    @Test //TODO in progress
    public void createPlayListTest_ItemCreatedAndCheckedCopy() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        HomePage homePage = loginPage.login("testpro.user02@testpro.io", "te$t$tudent02");
        homePage.setPlayListName("sh11_test");
        homePage.addPlaylistWithCheckingExisting(homePage.getPlayListName());
        Assert.assertTrue(homePage.isPlayListExists(homePage.getPlayListName()));
    }

}
