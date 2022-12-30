@Test
Feature: Test create user functionality

    Background: product store page
        Given I am on the product store page

    Scenario: Create a user on the store page
        When I click on sign up
        And I fill in the registration data and click on sign up
        Then the result is that a user is created
