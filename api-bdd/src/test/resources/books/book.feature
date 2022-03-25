Feature: get book details
  as a user
  I want to get some book details
  so that i can get the information

  Scenario: GET - as a user i have to able get list books
    Given I set an endpoint for GET book details with isbn
    When I input ISBN book
    When I request GET for book details
    Then I validate the status code for get book details is 200
    And validate the book details
