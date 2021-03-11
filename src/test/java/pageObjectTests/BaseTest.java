package pageObjectTests;

import com.github.javafaker.Faker;
import enums.BrowserType;
import enums.MyBrowserType;
import helpers.BrowserFabric;
import helpers.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseTest {
    protected WebDriver driver; // WE MAKE IT PROTECTED TO BE VISIBLE FROM A FUCKING CHILD CLASS (BASETEST)
    protected Faker faker;
    protected String username;
    protected String password;
    protected String wrongPassword;
    protected int error_count = 0;

    @Parameters({"email", "password", "wrongPassword"}) // we set this parameters in testNG
    // we could add browser for testNG chrome/firefox

    @BeforeMethod //
    public void startUp(String email, String password, String wrongPassword) { // String browser
        username = email;
        this.password = password;
        this.wrongPassword = wrongPassword;

    MyBrowserType browserType = MyBrowserType.CHROME;
//        BrowserType browserType = browser.equals("CHROME") ? BrowserType.CHROME : BrowserType.FIREFOX; // new type for if else
//        // ternary condition operator
    driver = BrowserFabric.getWEbDriver(browserType);
        faker = new Faker();
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException { // wa pass ItestResult variable into
        // AfterMethod
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            ScreenShot.take(driver, iTestResult.getName()+dtf.format(now));
        }
        driver.close();
    }
}
