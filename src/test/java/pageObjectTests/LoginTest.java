package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest_CorrectCredentials_successfulLogin(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, wrongPassword);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
    }
    @Test (enabled = false) // exclude test from a run
    public void loginTest_WrongCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }


    @Test
    public void loginTest_CorrectCredentials_successfulLogin1(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
    }
    @Test
    public void loginTest_WrongCredentials_redFrame1(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }

    @Test
    public void loginTest_CorrectCredentials_successfulLogin2(){
        LoginPage loginPage = new LoginPage(driver);// call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
//        loginPage.login("koeluser06@testpro.io", "te$t$tudent"); // STAGE 1
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isOpen()); // new method ISOPEN to verify in MainPage class
        mainPage.createPlayList("id");
    }
    @Test
    public void loginTest_WrongCredentials_redFrame2(){
        LoginPage loginPage = new LoginPage(driver); // call for the '''public class LoginPage'''
        loginPage.open();  // call for the '''public void open - > open'''
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isErrorState()); // this is a new function that need to be added to a loginPage
    }

}
