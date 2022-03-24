Feature: User
  as an admin
  I want to get detail user
  so that i can update user data

  Scenario: Get - as an admin I have to able to get detail user
    Given I set an endpoint for GET user detail
    When I request GET detail user
    Then I validate the status code is 200
    And validate the data detail

  Scenario: POST - As an admin I have to be able to create new user
    Given I set an endpoint for POST new user
    When I request POST detail user
    Then I validate the status code is 201
    And validate the data detail after create user