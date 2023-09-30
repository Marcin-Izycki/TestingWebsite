Feature: Delete product from cart

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: Delete product from cart
    When I select a product to add to the cart
    And I click the cart button
    Then the product should be added to the cart
    And I remove the product from the cart
    Then the product should be removed from the cart