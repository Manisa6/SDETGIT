Feature: User should able to login saucedemo browser
Scenario: Check login is successful with valid creds
Given User is on login page
When User enters valid username and password
And Click on login Button
Then User should navigated to home page
And Close browser
@mm
Scenario Outline: Check login is successful with valid creds
Given User is on login page
When User enters valid "<username>" , "<password>"
And Click on login Button
Then User should navigated to home page
And Close browser

Examples:
| username               |password      |
|standard_user           | secret_sauce |
#|locked_out_user         | secret_sauce |
|problem_user            | secret_sauce |
|performance_glitch_user | secret_sauce |
