Feature: Profile operations

Background:
Given user should be logged in
When user click on profile
Then profile page should display

Scenario: profile creation
When user click on add profile
Then profile should get added

Scenario: profile modification
When user click on edit profile
Then profile should get modified

Scenario: profile deletion
When user click on delete profile
Then profile should get deleted


