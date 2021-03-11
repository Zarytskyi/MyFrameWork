package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,100);
        this.actions = actions;
    }
}
