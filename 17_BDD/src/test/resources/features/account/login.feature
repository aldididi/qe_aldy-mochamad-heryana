Feature: Login
  As a user
  I want to login
  So that I can access my account

  Scenario: Success login
    Given I go to login page
    When I input valid email and valid password
    And click login button
    Then I directed to homepage

  Scenario: Failed login wrong password
    Given I go to login page
    When I input valid email and wrong password
    And click login button
    Then get error message wrong password

  Scenario: Failed login wrong email
    Given I go to login page
    When I input wrong email and valid password
    And click login button
    Then get error message wrong password