Feature: Login
  As a user
  I want to login
  So that I can access my account

  Scenario: Success login
    Given I go to login page
    When I input valid uname and valid password
    And click login button
    Then I go to homepage

  Scenario: failed logn
    Given I go to login page
    When I input null uname and valid password
    And click login button
    Then Get eror message

