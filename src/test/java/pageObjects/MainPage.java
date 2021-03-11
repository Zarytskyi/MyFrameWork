package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.log4testng.Logger;

import javax.swing.*;

public class MainPage  extends BasePage{ //STAGE 2

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public boolean isOpen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        return driver.findElements(By.cssSelector(".home")).size()==1; // here we verify that size = 1 and we have element present
    }

    private void clickPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-plus-circle control create']")));
        for (int i=0; i < 5; i++){
            try{
                driver.findElement(By.xpath("//i[@class='fa fa-plus-circle control create']")).click();
                break; // WE CLICK ON A ELEMENT 5 TIME, IF AFTER ONE ATTEMPT IT WILL BE CLICKED, WE NEED TO BREAK LOOP
                // THAT'S WHY WE PUT THIS STATEMENT HERE !
            } catch (ElementClickInterceptedException ignored){} // WE INGORE A CATCH EXEPTION IN THIS LINE
        }
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-plus-circle control create']")));
//        return driver.findElement(By.xpath("//i[@class='fa fa-plus-circle control create']"));
    }
    private WebElement getNewPlaylistFiled (){
        return driver.findElement(By.xpath("//form[@class='create']/input"));
    }
    private WebElement getEditPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }

    public String createPlayList(String name){
        clickPlusButton();
        getNewPlaylistFiled().sendKeys(name);
        getNewPlaylistFiled().sendKeys(Keys.ENTER); //this is enum that simulate ENTER on a keyboard.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".success.show")));
        String url = driver.getCurrentUrl();
//        System.out.println(url);
        return url.split("/")[5]; // we create a string here and split received url on parts with /

    }
    public boolean checkPlaylistExist(String playlistId, String name){
        WebElement newPlaylist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        return newPlaylist.getText().equals(name);
    }
    public void renamePlaylist(String playlistId, String newName){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        WebElement playlistToRename = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlistToRename);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")));
//        "//a[@href='#!/playlist/"+playlistId+"']//parent::li//input"
//        WebElement toClick = driver.findElement(By.xpath("//a[@href='#!/playlist/"+playlistId+"']//parent::li//input"));
        actions.doubleClick(playlistToRename).perform();

        getEditPlaylistField().sendKeys(Keys.COMMAND+"a");
        getEditPlaylistField().sendKeys(newName);
        getEditPlaylistField().sendKeys(Keys.RETURN);
    }
}
