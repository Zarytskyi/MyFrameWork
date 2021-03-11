package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimpleTest {
    WebDriver driver;
    WebDriverWait wait; // explicit wait
    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); implicit wait
        driver.get("https://koelapp.testpro.io/");
        wait = new WebDriverWait(driver, 10);

    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
    @Test
    public void loginTest_correctCredentials_loggedToApp(){

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='email']")));
         WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
         WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
         WebElement loginButton = driver.findElement(By.cssSelector("[type='submit']"));
         emailField.sendKeys("koeluser06@testpro.io");
         passwordField.sendKeys("te$t$tudent");
         loginButton.click();

         wait.until(ExpectedConditions.elementToBeClickable(By.className("home")));
         boolean logged = false;                                                       // Assert 1st variant
         try {
             driver.findElement(By.className("home"));
             logged = true;
         } catch (NoSuchElementException ignored){}
        Assert.assertTrue(logged);
//         boolean logged = driver.findElement(By.cssSelector("home")).isDisplayed();  Assert 2nd variant
//         Assert.assertTrue(logged);
//        List<WebElement> homes = driver.findElements(By.xpath("//*[@class='home active']"));
//        Assert.assertEquals(1, homes.size());                                         Assert 3rd variant
    }

}
