Feature: This feature is about login test cases

@loginwithvaliddata @login
Scenario: User should be able to login successfully with valid data

Given User is in login page
When User enters emailid "prashanthi.skvl@gmail.com"
And User enters password "Test@123"
And User clicks signin button
Then User should be able to login successfully


@loginwithinvaliddata @login
Scenario Outline: User should not login with invalid data


Given User is in login page
When User enters emailid "<Emailid>"
And  User enters password "<Password>"
And User clicks signin button
Then User should be not login with invalid data


Examples:
|Emailid|Password|
|testing43215@gmail.com|test1234|
|testing6543@gmail.com|test3421|
