Feature: To order the food in Bristo Bites Website
Background:
  Given To launch the browser and maximize window

  @Regression
 Scenario: The user gives the invalid “User name” and “password”
 
 When  click the “Account” button
 And  Give the wrong “Username” and “Password”
 And click the “login” button
 
 @Smoke
 Scenario: The User successfully add the Dosa
 
 When I see the “HOME” button on the page and click it
 And I see a dropdown labeled “Dosa”
 And Click the dosa button
 And select the “Masala Dosa” option
 And Enter the page and check the “Available Time”
 
 @Sanity
 Scenario: The user fills out the registration form and ignores the confirm password
 
 When click the “Account” button
 And Fill out the registration form with dummy data
 And Skip the “confirm password” text label
 And click the register button
 
@Unit
Scenario:  The user search for the “Coke” can and check the price

When  Click the “search” icon
And search “Coke”
And check the can dollar is “$ 1.50”

@Sanity2
Scenario: The user selects the “Spanish Omelet”
When Click the “search” icon
And Find out the “Spanish Omelet” and Click the icon
And Select the option by probability
And check the dollar probability

 @Smoke1
 Scenario:  The user read “Our Story”
 When Click the “Our Story” option
 And Check the spelling mistake
 
 