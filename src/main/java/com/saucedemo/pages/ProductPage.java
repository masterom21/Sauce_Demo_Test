package com.saucedemo.pages;

import com.saucedemo.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage extends Util_Class {


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement filter;
    @FindBy(css = "#shopping_cart_container")
    WebElement cartBtn;
    @FindBy(css = ".inventory_list .inventory_item:nth-of-type(6) .btn_inventory")
    WebElement cheapestProduct;


    public void clickCartButton() {
        clickOnElement(cartBtn);
    }

    public void sortProductsHighToLow(String price) {
        selectByVisibleTextFromDropDown(filter, price);

    }
    public void addCheapestProduct() {
        clickOnElement(cheapestProduct);
    }

}
