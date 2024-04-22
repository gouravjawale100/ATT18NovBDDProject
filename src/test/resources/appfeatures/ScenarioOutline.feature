Feature: signup 
Scenario Outline: Signup to application
Given user is at signup page
When user enters "<name>" on form
And user selects "<gender>"
And user select slot as <slotnumber>
Then user gets created

Examples:
| name | slotnumber | gender |
| Eder | 2 | male |
| Ron | 3 | male |
| Diana | 6 | female |
| Daniel | 9 | male |
