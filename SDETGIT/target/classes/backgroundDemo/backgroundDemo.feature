Feature:Background Demo

Background:User access sucelab demo application
Given User acess saucelab demo application
When User enter valid credentials

Scenario: Test menu items
And click on brodcrum menu
Then can see all menu items

Scenario: Add to cart
And click on Add to cart
Then Item added to cart
