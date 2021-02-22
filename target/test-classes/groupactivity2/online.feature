Feature: Login Operations 
User login and registration page shall takes place here
@Authentication
Scenario: Operation for users
Given the user on the authentication form
When user enter valid data on the page
| Fields | Values |
| Email        | tonystark21199@gmail.com |
| password     | Laxman@21                |
Then the page is navigated to my account page 
@Registration
Scenario: Registration for users
Given open the chrome and launch the application
When user enter valid email on the page
Then the page is navigated to create account page
When the user enter the valid registration data 