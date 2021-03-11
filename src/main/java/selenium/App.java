package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// css = [name='something']
// css by id = #name
// css by class = .name

// absolute xpath if you go from a top of down from html to div to div
// related xpath
// xpath = //*[@name='something']             attribute and value
// xpath = (//*[@name='something'])[3]  we can add index in case there is more then one same unique ID
// index starts with 1..2..3

// xpath = //*[text()='Something']             this is inner text
// xpath = //*[contains(text(), 'something')]  partial text search
// xpath = //*[contains(@class,'something')]   partial attribute name
// xpath = //*[contains(text(), 'something') and @class,'something'] use AND to get more exact data



public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        Thread.sleep(5000);
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        driver.quit();

    }
}
