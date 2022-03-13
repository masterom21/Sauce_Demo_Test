package com.saucedemo.pages;

import com.saucedemo.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Util_Class {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement userName;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(id = "login-button")
    WebElement loginBtn;


    public void enterCredential(String user,String pass){
        sendTextToElement(userName ,user);
        sendTextToElement(Password,pass);

    }

    public  void clickLoginButton() {
        clickOnElement(loginBtn);
    }



}
