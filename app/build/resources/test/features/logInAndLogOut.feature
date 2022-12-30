Feature: Login and Logout functionality

Scenario: Login on the store page
Given I am on the product store page
When I click on Log in
And I fill in the log in data and click on log in
Then the result is that a user is login

Scenario: Logout on the store page
Given I am on the product store page
When I click on Logout
Then the result is that a user is logout
