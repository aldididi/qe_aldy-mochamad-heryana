Feature: Login
  As a user
  I want to login
  So that I can access my homepage

  Scenario: As a user I have to be able to login in demoqa
    Given I am on the homepage
    When I click login
    And I directed to login page
    And I input valid username
    And I input valid password
    And I click login button
    Then I directed to homepage

    @LoginFailed
  Scenario: As a user I can't login to demo
    Given I am on the homepage
    When I click login
    And I directed to login page
    And I input valid username
    And I input invalid password
    And I click login button
    Then show validation invalid password

  Scenario: As a user I can register
  Given I am on the login page
  When I click new user
  And I directed to register page
  And I input first name
  And I input last name
    And I input username regis
    And I input password regis
  And I click "i'm not a robot"
  And I click register button
  And show alert message
  Then click ok successfull register


#  Scenario: Failed login
#    Given I am on the login page
#    When I input protected username
#    And I input valid password
#    And click login button
#    Then error message "Epic sadface: Sorry, this user has been locked out."