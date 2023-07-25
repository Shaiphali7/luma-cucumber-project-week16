Feature: Men Page Test
  As a user I want to add product in the shopping cart successfully in Men category
  @sanity
  Scenario: User should able to add product in the shopping cart successfully
    Given I am on homepage
    When I Mouse Hover on Men Menu
    Then I Mouse Hover on Bottoms
    And I Click on Pants
    And I mouse Hover on product name Cronus Yoga Pant
    And I click on size 32
    And I  click on colour Black
    And I mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button
    And I verify the text You added Cronus Yoga Pant to your shopping cart
    And I Click on shopping cart Link into message
    And I verify the text shopping Cart
    And I verify the product name Cronus Yoga Pant
    And I verify the product size
    And I verify the product colour Black
