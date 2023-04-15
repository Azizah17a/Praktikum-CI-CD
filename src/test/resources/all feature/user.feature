Feature: User frakeStore

  As a user
  I want to see the profile user page
  So that I can access my account

  Scenario: Add a new user
    Given I am on the profile user page
    When  I enter change a data user
    And I click add a new user button
    And I enter valid profile user
    And I click submit button
    Then see a new profile user on frakeStore

  Scenario: Delete a user
    Given I am on the profile user page
    When I enter to ceklis a data user
    And I click the delete user button
    Then see a message delete on page