@orders
Feature: Order information

@sanity @functional
Scenario: previously placed order info
Given user should be logged into app
And user is at the orders page
When user clicks on order history
Then user should see previously placed order

@functional 
Scenario: current placed order info
Given user should be logged into app
And user is at the orders page
When user clicks on current order
Then user should see track order information

@regression 
Scenario: cancelled order info
Given user should be logged into app
And user is at the orders page
When user clicks on cancel order button
Then user should see cancelled order info