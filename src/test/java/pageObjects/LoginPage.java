package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
    super(driver); // WHY WE DO IT
    }

    private WebElement getEmailField(){ //getter
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LoginPageLocators.cssEmailLocator)));// we can replace By statement and locator itself and create class for it
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){ //getter
        wait.until(ExpectedConditions.elementToBeClickable(LoginPageLocators.byPassword)); // we can replace By statement and locator itself and create class for it
        return driver.findElement(By.cssSelector("[type='password']"));
    }
    private WebElement getLoginButton(){ //getter
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
        return driver.findElement(By.cssSelector("button"));
    }

    public MainPage login(String username, String password){ //arguments that need to pass to login functionality AND IT RETURNS A MAIN PAGE AFTER LOGIN PAGE IS DONE
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);  // STAGE 2. WE ADD return status to a MAIN (NEW PAGE)
    }
    public void open(){ // function/method
        driver.get("https://koelapp.testpro.io/");
    }
    public boolean isErrorState() { //this is function
        try { // if element here exist TRY BLOCK will go to return stage. O
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        } catch (NoSuchElementException | TimeoutException ignored){}; // put {} after catch

        return driver.findElements(By.cssSelector(".error")).size()==1; // we say elements here to verify the size ==1
        // if there will be one element it will return true, if 0 = false. THAT'S WHY WE SAY BOOLEAN INT HE BEGINNING
    }
}
