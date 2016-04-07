package com.google.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest {

    private WebDriver driver;
    String appURL = "http://accounts.google.com/Login";
    MainPage mainPage;


    @BeforeClass
    public void testSetUp() {
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void verifyGooglePageTittle() throws InterruptedException {
        driver.navigate().to(appURL);
        mainPage.enterEmail("myedyentsov@gmail.com");
        mainPage.clickNext();
        mainPage.enterPassword("{eqRnj{Frybn)))");
        mainPage.clickSignIn();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}