Feature: Network page
  As a user
  I want to network page
  So that I can accept and ignore invitation

  Scenario: accept invitation
    Given I go to network page
    When I click accept invitation
    Then I have a connection with inviter

    Scenario: ignore invitation
      Given I go to network page
      When I click ignore invitation
      Then I rejected an invitation