Feature: Login functionality

Background: product store page
Given I am on the product store page

Scenario: Login on the store page
When I click on Log in
And I fill in the log in data and click on log in
Then the result is that a user is login


