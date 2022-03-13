package com.saucedemo.pages;

import com.saucedemo.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LastPage extends Util_Class {

    public LastPage() {
        PageFactory.initElements(driver,this);
    }



    @FindBy(css = ".complete-header")
    WebElement thankMessage;

    public String verifyMessage(){
        return thankMessage.getText();
    }
}
