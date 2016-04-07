package com.google.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id='Email']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='next']")
    private WebElement next;

    @FindBy(xpath = "//*[@id='Passwd']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='signIn']")
    private WebElement signIn;

    public void enterEmail(String emailAdress){
        email.sendKeys();
    }

    public void clickNext(){
        next.click();
    }

    public void enterPassword(String passwordVal){
        password.sendKeys();
    }

    public void clickSignIn(){
        signIn.click();
    }
}