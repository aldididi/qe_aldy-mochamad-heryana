Feature: HomePage
  As a user
  I want to homepage
  So that I can use features on homepage

  Scenario: Search
    Given I go to homepage
    When I click search bar
    And type a words
    Then show some results