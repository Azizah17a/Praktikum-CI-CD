Feature: login FakeStore
  As a user
  I want to see the main page
  So that I can access my account

  Scenario: valid login
    Given I am on the Fakestoreapi.com login page
    When I enter my valid username and password
    And I click on the login button
    Then see a message welcome to Fakestore

  Scenario: Invalid login
    Given I am on the Fakestoreapi.com login page
    When I enter my invalid username
    And I enter my valid password
    And I click on the login button
    Then I should see an error message invalid username

  Scenario: Forgot password
    Given I am on the Fakestoreapi.com login page
    When I click on the forgot password button
    And I enter my registered email address
    And I click on the reset password button
    Then I should receive an email with instructions on resetting my password