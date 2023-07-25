Feature: Gear Page Test
  As a user I want to add product in the shopping cart successfully in Gear category
  @smoke
  Scenario: User should able to add product in the shopping cart successfully
    Given I am on homepage
    When I Mouse Hover on Gear Menu
    And I Click on Bags
    And I Click on Product Name Overnight Duffle
    And I verify the product is Overnight Duffle
    And I change quantity to three
    And I Click on ‘Add to Cart’ Button.
    And I Verify the text You added Overnight Duffle to your shopping cart
    And I Click on ‘shopping cart’ Link into message
    And I Verify the product name ‘Overnight Duffle’
    And I Verify the Qty is ‘3’
    And I Change Qty of bag to five
    And I Click on ‘Update Shopping Cart’ button
    Then I  Verify the product price

