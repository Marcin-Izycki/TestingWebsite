Feature: Order product

  Scenario: Make an order and finish

    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I should be logged in and see product page
    Then I select a product to add to the cart
    And I click the cart button
    Then the product should be added to the cart
    Then I checkout
    And Complete the fields with valid data
    And Finish order