Feature: Login

@BD
Scenario: Verify user can login
Given Open Application "<URL>"
Then Click on Signinbutton
Then Click Signinlink
Then Enter user pass and click signin
Then Verify user can login


