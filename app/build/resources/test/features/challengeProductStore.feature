Feature: challenge Product Store

    Background: Create a user on the store page and Login
        Given I am on the product store page
        When I click on sign up
        And I fill in the registration data and click on sign up
        And I click on Log in
        And I fill in the log in data and click on log in
        Then the result is that a user is login

    Scenario: Add laptop to cart
        Given I click on laptop
        When I click to add to cart and acept popup
        Then the result is that a laptop is added on my cart

    Scenario: check that the laptop is in my cart
        Given I click on Cart
        Then the result is that the laptop is in my cart

    Scenario: Logout on the store page
        When I click on Logout
        Then the result is that a user is logout
