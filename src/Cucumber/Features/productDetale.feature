Feature: View product details

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: View product details
    #When I click on a product
    #Then I should see the details of the product