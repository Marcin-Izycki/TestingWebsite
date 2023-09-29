Feature: Delete product from cart

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: Delete product from cart
    Given I have a product in the cart
    When I remove the product from the cart
    Then the product should be removed from the cart