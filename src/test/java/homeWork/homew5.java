package homeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homew5 {
    @Test
    public void faceBook_SignUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

//        Open page FaceBook.com

        driver.get("https://www.facebook.com/");
    }
}