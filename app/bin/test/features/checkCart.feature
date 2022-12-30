
Feature: check that the laptop to cart

    Background: product store page
        Given I am on the product store page
        And I logged in with my username and password

    Scenario: check that the laptop is in my cart
        When I click on Cart
        Then the result is that the laptop is in my cart