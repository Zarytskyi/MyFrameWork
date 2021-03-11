package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; // this variable is a part of selenium
import org.openqa.selenium.WebDriver;

import java.io.File; // importing in File file
import java.io.IOException;

public class ScreenShot {
    public static void take(WebDriver driver, String screenshotName){
        try{
            TakesScreenshot screenshot = (TakesScreenshot) driver; // casting operation (can cast one type to another)
            File file = screenshot.getScreenshotAs(OutputType.FILE); // using import we set a sc type to FILE
            FileUtils.copyFile(file, new File("./screenshot/"+screenshotName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
