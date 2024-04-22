Feature: Login functionality with data
Scenario: Login with valid data
Given User is at loginpage
When User enters username as "att30user"
And User enters password as "Test@1234"
And User clicks on submit
And user selects 1 server
Then User gets logged in