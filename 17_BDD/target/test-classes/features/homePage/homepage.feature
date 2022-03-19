Feature: HomePage
  As a user
  I want to homepage
  So that I can use features on homepage

  Scenario: Search
    Given I go to homepage
    When I click search bar
    And type a words
    Then show some results

  Scenario: Go to network page
     Given I go to homepage
     When I click MyNetwork button
     Then I directed to my network page