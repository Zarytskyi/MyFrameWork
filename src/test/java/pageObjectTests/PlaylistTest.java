package pageObjectTests;

import helpers.TestObjectGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest extends BaseTest{


    @Test
    public void playListTests_createPlayList_playListCreated(){
        String name = faker.name().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playListId = mainPage.createPlayList(name); // we create a new function PlayListId and create
        // playlist with name... and get a last index to assert
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId, name)); // we create a boolean that contains playlistid and name
    }
    @Test
    public void playListTests_renamePlaylist_playListRenamed(){
         String name = TestObjectGenerator.randomString(8);
         String newName = faker.funnyName().name();
        System.out.println(newName);
         LoginPage loginPage = new LoginPage(driver);
         loginPage.open();
         MainPage mainPage = loginPage.login(username, password);
         String playListId = mainPage.createPlayList(name);
        mainPage.renamePlaylist(playListId, newName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId,newName));
    }

    @Test
    public void playListTests_createPlayList_playListCreated1(){
        String name = faker.name().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playListId = mainPage.createPlayList(name); // we create a new function PlayListId and create
        // playlist with name... and get a last index to assert
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId, name)); // we create a boolean that contains playlistid and name
    }
    @Test
    public void playListTests_renamePlaylist_playListRenamed1(){
        String name = TestObjectGenerator.randomString(8);
        String newName = faker.funnyName().name();
        System.out.println(newName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playListId = mainPage.createPlayList(name);
        mainPage.renamePlaylist(playListId, newName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId,newName));
    }

    @Test
    public void playListTests_createPlayList_playListCreated2(){
        String name = faker.name().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playListId = mainPage.createPlayList(name); // we create a new function PlayListId and create
        // playlist with name... and get a last index to assert
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId, name)); // we create a boolean that contains playlistid and name
    }
    @Test
    public void playListTests_renamePlaylist_playListRenamed2(){
        String name = TestObjectGenerator.randomString(8);
        String newName = faker.funnyName().name();
        System.out.println(newName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playListId = mainPage.createPlayList(name);
        mainPage.renamePlaylist(playListId, newName);
        Assert.assertTrue(mainPage.checkPlaylistExist(playListId,newName));
    }
}


// create a play list, scroll down, doubleclick, rename , enter , confirm that new playlist will have a new id ...