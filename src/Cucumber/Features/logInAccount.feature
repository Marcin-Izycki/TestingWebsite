Feature: Log In

  Scenario: User can log in to acc

    Given an open browser with saucedemo.com
    Then I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I should be logged in and see product page