
Feature:Login too HRM Application
Background:
Given  User is on HRMLogin page "http://opensource-demo.orange"
@ValidCredentials
Scenario:Login with valid Credentials
When user enters username as "Admin" and password as "admin123"
Then user should be able to login successfully and new page open 

@MissingUsername
Scenario:Login with blank username 

When User enters username as"" and password as "admin123"
Then user should be able to see a message"Required" below Username