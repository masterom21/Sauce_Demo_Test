package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Step_Defination {
    @Given("^I am on sauceDemo page$")
    public void iAmOnSauceDemoPage() {
        System.out.println("I am on sauce lab page");

    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
     new LoginPage().enterCredential(username,password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @And("^I filter the products by \"([^\"]*)\"$")
    public void iFilterTheProductsBy(String price) {
        new ProductPage().sortProductsHighToLow(price);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().addCheapestProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickCartButton();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickonCheckOutbutton();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstName, String lastName, String zipCode) {
        new CheckOutPage().enterContactDetails(firstName,lastName,zipCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickContinueBtn();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
    new CheckOutPage().clickFinishBtn();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String expectedMessage) {

        Assert.assertEquals(expectedMessage, new LastPage().verifyMessage());

    }
}
