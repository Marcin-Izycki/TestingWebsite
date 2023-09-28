Feature: Sorting

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: Sort products by price (low to high)

    #Given I am logged in and on the products page
    When I sort products by price ascending
    Then I should see products sorted correctly