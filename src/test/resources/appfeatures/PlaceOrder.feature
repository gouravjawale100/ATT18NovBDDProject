Feature: place order
Scenario: Order confirmation
Given I should be at product page
When I click on the add to cart button
Then product should get added
When I click on place order button
Then order should get confirmed