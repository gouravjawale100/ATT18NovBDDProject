Feature: login functionality
Scenario: login to application
Given I am at login screen
When I enter username
And I enter password
And I click on login button
Then I redirects to home page

Scenario: validating title
Given I am at login screen
Then I should see title