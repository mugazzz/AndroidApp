@non_reg 
Feature: Home Screen - Non Registered users

@non_reg0 @reset
Scenario: Non registered user - Verify the links and options of home screen
	Given Verify the screen redirected to landing page
	Then Verify the homescreen button Register using card number
	And Verify the homescreen link Register using your customer number
	And Verify the homescreen link Contact Us
	And Verify the homescreen link Branch Locator

@non_reg1
Scenario: Change the language to Arabic - Non Registered user and also Change the language to English - Non Registered user
	Given Verify the screen redirected to landing page
	When Verify the toggle is English by default
	Then Tap on toggle button and change the language to Arabic
	Then Verify the home screen language changed to Arabic
	And Navigate to card number registration screens from home screen to confirm the language change
	And Navigate to customer number registration screens from home screen to confirm the language change 	
	Then change the languate to english and verify the screen