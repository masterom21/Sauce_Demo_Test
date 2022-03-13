package com.saucedemo.pages;

import com.saucedemo.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPage extends Util_Class {

    public CartPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#checkout")
    WebElement checkout;

    public void clickonCheckOutbutton(){
        clickOnElement(checkout);

    }


}
