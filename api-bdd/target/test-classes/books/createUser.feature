Feature: create user
  as a user
  i want to crate account
  so that i can get a books

  Scenario: POST - Create User Positive
    Given I set endpoint for create user
    When I set username
    When I set password
    When Request post create user
    When I validate status code 201
    And validate the create user
