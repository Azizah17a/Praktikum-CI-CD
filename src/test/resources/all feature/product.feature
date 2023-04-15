Feature: Change data Product

  As a user
  I want to get data product on frakeStore
  So that I can change data product

  Scenario: Post new product
    Given I am on the page to get data product
    When I enter change data product
    And I click new product button
    And I enter to post new product
    Then see new product on page

  Scenario: Delete data product
    Given I am on the page to get data product
    When I enter to ceklis data product
    And I click delete button
    Then I should see a delete text on page