Feature: books
  as a user
  I want to get book details
  so that i can get the information

  Scenario: GET - as a user i have to able get books details by ISBN
    Given I set an endpoint for GET book details
    When I request GET book details
    Then I validate the status code for get book is 200
    And validate the book detail

