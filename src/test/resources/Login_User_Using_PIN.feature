@login_user
Feature: Existing user mobile banking PIN to login
I should be able to use my mobile banking PIN to login

@reset @login_user0
Scenario: Registering user using Credit Card to create exisiting logged in user envirnoment
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen

@login_user1
Scenario: Use mobile banking PIN to login - Successful login
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	
@login_user2
Scenario: Login using incorrect PIN
	Given Verify the screen redirected to landing page
	Then Enter the incorrect Login PIN
	And Validate the incorrect pin toast message
	
@login_user3
Scenario: Use  mobile banking PIN to login - After 3 times of failure should refer to reset PIN
	Given Verify the screen redirected to landing page
	Then Enter the incorrect Login PIN 3 times
	Then Check the validation error message appears regarding pin blocked
	And Verify the user automatically redirected to Reset password screen

#@login_fing
#Scenario: Finger print login
#	Given Verify the screen redirected to landing page
#	Then apply finger print
#	And Verify the user redirected to Dashboard screen successfully