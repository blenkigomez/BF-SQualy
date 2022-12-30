
Feature: laptop to cart

Background: product store page
Given I am on the product store page
And I logged in with my username and password

Scenario: Add laptop to cart
When I click on laptop 
And I click to add to cart and acept popup
Then the result is that a laptop is added on my cart
