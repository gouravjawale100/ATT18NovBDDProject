Feature: Registration page
Scenario: create account with nominee
Given user should be at registration page
When user enters following information
| firstname | lastname | email | mobile |
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Chelsea | white | chelsea.white@gmail.com | 8877665544 |
And user click on submit button
Then account gets created