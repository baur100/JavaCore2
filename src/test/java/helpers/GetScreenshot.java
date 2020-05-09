package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GetScreenshot {
    public static void capture(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File file = screenshot.getScreenshotAs((OutputType.FILE));
            FileUtils.copyFile(file, new File("./screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            System.out.println("File IO problems" + e.getMessage());
        }
    }
}
