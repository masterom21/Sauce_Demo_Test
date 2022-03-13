Feature: Search functionality
  As a user I want to purchase cheapest and costliest product from the sauceDemo after sorting the products by High to Low filter.

  Given I am on sauceDemo page

  Scenario: User navigates sauceDemo page and complete the Item purchase journey

    When I login with credential username "standard_user" and password "secret_sauce"
    And I click on Login button
    And I filter the products by "Price (high to low)"
    And I select cheapest & costliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "firstName", lastName "lastName" and zipPostalCode "Zip/PostalCode"
    And I click on continue button
    And I click on finish button
    Then I should be able to see message "THANK YOU FOR YOUR ORDER"