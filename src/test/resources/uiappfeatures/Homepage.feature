Feature: Homepage functionality

@basic
Scenario: Validation of title of page
Given I am at landing page
Then page title should have "Shopping"

@basic
Scenario: verify cart icon
Given I am at landing page
Then cart icon should get display

@functional
Scenario: checkout the deals section
Given I am at landing page
When I see the sport toys then I click on it
@regression
Scenario: Login to app
Given I am at landing page
When user click on signin button
And user enters username as "8176867662"
And user enters password as "123456" with signin