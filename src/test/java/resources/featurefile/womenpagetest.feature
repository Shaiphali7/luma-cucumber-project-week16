Feature: Women Page Test
  As a user I want to verify that product name is displayed in ascending order and price also displayed as per the filter
  @regression
  Scenario: Verify that jacket products name is displayed in ascending order
    Given I am on homepage
    When I mouse hover on women menu
    And I Mouse Hover on Tops
    And I Click on Jackets
    Then I verify product name displayed as per the sort by filter
@regression
    Scenario: Verify that jacket product price is displayed as per the price filter
      Given I am on homepage
      When I mouse hover on women menu
      And I Mouse Hover on Tops
      And I Click on Jackets
      Then I verify the product price is as per the sort by price filter
