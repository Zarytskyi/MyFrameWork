package BestBuyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        wait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void startDown(){
        driver.quit();
    }

    @Test
    public void login_page_success()  {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c-modal-grid col-xs-6 ']//*[@type='button']")));
        WebElement popup = driver.findElement(By.xpath("//div[@class='c-modal-grid col-xs-6 ']//*[@type='button']"));
        popup.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search-input']")));
        WebElement searchField = driver.findElement(By.xpath("//input[@class='search-input']"));
        searchField.sendKeys("ps5");
        searchField.submit();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sony - PlayStation 5 Console']")));
        WebElement ps5Finder = driver.findElement(By.xpath("//*[text()='Sony - PlayStation 5 Console']"));
        ps5Finder.click();
        boolean ps5Fount = false;
                try {
                    driver.findElement(By.xpath("//span[contains(text(),'$499.99')]"));
                    ps5Fount = true;
                } catch (NoSuchElementException ignored){}
        Assert.assertTrue(ps5Fount);

    }
    @Test
    public void login_page_failed(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c-modal-grid col-xs-6 ']//*[@type='button']")));
        WebElement popup = driver.findElement(By.xpath("//div[@class='c-modal-grid col-xs-6 ']//*[@type='button']"));
        popup.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='search-input']")));
        WebElement searchField = driver.findElement(By.xpath("//input[@class='search-input']"));
        searchField.sendKeys("34ut34thb34");
        searchField.submit();
        boolean logged = false;                                                       // Assert 1st variant
        try {
            driver.findElement(By.className("home"));
            logged = true;
        } catch (NoSuchElementException ignored){}
    }
}

//a[@href="/featured-topics/"]/parent::div[@class="trending-topics--container--a08Wq"]/parent::section//div[@class="trending-topics--category--1RwE6"]//a[@href="/topic/python/"]