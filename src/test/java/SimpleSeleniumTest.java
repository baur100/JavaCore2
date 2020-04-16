import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleSeleniumTest {
    @Test
    public void faceBook_SignUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

//        Open page FaceBook.com

        driver.get("https://www.facebook.com/");


//        Enter User first name
        WebElement firstNameField = driver.findElement(By.xpath("//*[@name='firstname']"));
        firstNameField.sendKeys("Dan");

//        Enter user last name
        WebElement lastNameField = driver.findElement(By.xpath("//*[@id='u_0_o']"));
        lastNameField.sendKeys("Man");

//        Enter user birth date
        WebElement day_birth_date = driver.findElement(By.xpath("//*[@id='day']"));
        day_birth_date.sendKeys("3");

        WebElement month_birth_date = driver.findElement(By.xpath("//*[@id='month']"));
        month_birth_date.sendKeys("июн");

        WebElement year_birt_date = driver.findElement(By.xpath("//*[@id='year']"));
        year_birt_date.sendKeys("1999");

//        Choose user gender
        WebElement gender_radio_button = driver.findElement(By.xpath("//*[@for='u_0_7']"));
        gender_radio_button.click();

//        Click registration button
        WebElement registration_button = driver.findElement(By.id("u_0_13"));
        registration_button.click();

//        Assert
//        Error message is visible
        Thread.sleep(2000);
        WebElement error_massage = driver.findElement(By.id("js_5p"));
        System.out.println(error_massage.getText());





//        Kill WebDriver
        Thread.sleep(5000);
        driver.quit();


    }

}
