Feature: carts frakeStore

  As a user
  I want to see the cart page
  so that I can change the cart

  Scenario: Get user carts
    Given I am on the frakeStore carts page
    When I enter get user carts
    And I click search button
    And I enter write to search data user
    Then I see user cart on frakeStore

  Scenario: Delete a cart
    Given I am on the frakeStore carts page
    When I enter delete a cart
    And I click to search whoam delete a cart
    And I enter to ceklis a cart
    And I click on the delete button
    Then I should see a delete text on carts page