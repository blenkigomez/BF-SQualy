Feature: laptop to cart

Scenario: Add laptop to cart
Given I am on the product store page
And I logged in with my username and password
When I click on laptop 
And I click to add to cart and acept popup
Then the result is that a laptop is added on my cart

Scenario: check that the laptop is in my cart
Given I am on the product store page
And I logged in with my username and password
When I click on Cart
Then the result is that the laptop is in my cart