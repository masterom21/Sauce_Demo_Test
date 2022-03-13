$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the sauceDemo after sorting the products by High to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4383686700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigates sauceDemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on sauceDemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I filter the products by \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see message \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.iAmOnSauceDemoPage()"
});
formatter.result({
  "duration": 166259400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "StepDefs.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 342948300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 20266048900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 26
    }
  ],
  "location": "StepDefs.iFilterTheProductsBy(String)"
});
formatter.result({
  "duration": 208176700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 90801300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iOpenShoppingCart()"
});
formatter.result({
  "duration": 109840800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iGoToCheckout()"
});
formatter.result({
  "duration": 20139265700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "StepDefs.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 380920500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iClickOnContinueButton()"
});
formatter.result({
  "duration": 20109964700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.iClickOnFinishButton()"
});
formatter.result({
  "duration": 20128503300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 33
    }
  ],
  "location": "StepDefs.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 50364100,
  "status": "passed"
});
formatter.after({
  "duration": 787965300,
  "status": "passed"
});
});