Feature: Test create user functionality

Scenario: Create a user on the store page
Given I am on the product store page
When I click on sign up
And I fill in the registration data and click on sign up
Then the result is that a user is created
