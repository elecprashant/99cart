Feature: to test signup functionality  cart functionality

Scenario: validate sign up functinality
Given Open the browser
And Enter the Url
And Create new user
And Enter the valid personal details and click signup
Then registration succesful "Email Already Registered" msg validate
When the user navigates to the login page
When the user enters valid login credentials
Then the user logged in successfully
 
