Feature: Log out from account

  Background:
    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button

  Scenario: Log out from account
    When I click the logout button
    Then I should be logged out and see the login page
