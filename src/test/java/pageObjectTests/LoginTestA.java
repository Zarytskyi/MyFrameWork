package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTestA extends BaseTest{

    @Test(retryAnalyzer = RetryAnalyzer.class) // we call for a retryAnalyzer that we create in a package in this particular test
    public void loginTest_CorrectCredentials_successfulLoginA(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
        boolean pass = false; // we create a loop here to make test fail 2 times and pass 3rd time to use retryAnalyzer
        if(error_count==2){
            pass=true;
        }
        error_count++;
        Assert.assertTrue(pass);

    }
    @Test
    public void loginTest_WrongCredentials_redFrameA(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }


    @Test
    public void loginTest_CorrectCredentials_successfulLogin1A(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
    }
    @Test
    public void loginTest_WrongCredentials_redFrame1A(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }

    @Test
    public void loginTest_CorrectCredentials_successfulLogin2A(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
    }
    @Test
    public void loginTest_WrongCredentials_redFrame2A(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }

}
