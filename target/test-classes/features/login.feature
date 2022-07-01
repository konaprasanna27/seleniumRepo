Feature: Application login
Scenario: Login with valid credentials
Given Open any browser
And Navigate to login page
When gives valid user name as "priyanka.pedamalla@team.itilite.com" and valid password as "Welcome@123" into required fields
And user should click on login button
Then verify user should login successfully
