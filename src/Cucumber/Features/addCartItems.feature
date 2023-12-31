Feature: Add products to cart list

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: Add product to cart
    #Given  I run the "User logs in" scenario from "logInAccount.feature"
    When I select a product to add to the cart
    And I click the cart button
    Then the product should be added to the cart