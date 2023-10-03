Feature: Log In

  Scenario: User logs in

    Given an open browser with saucedemo.com
    When I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I should be logged in and see product page