@res_pin_CIF_SMS @sprint1_2 @sprint1-3 @res
Feature: Existing registered user - Reset Pin validation using my CIF and SMS PIN
I should be able to reset my PIN by verifying myself using my CIF number and SMS PIN
	
@res_pin_CIF_SMS1 
Scenario: Reset PIN using CIF number and SMS PIN
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	Then Enter the valid SMS PIN 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all sets! screen1
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen

@res_pin_CIF_SMS2
Scenario: Reset Pin using CIF number & SMS PIN - Inactive CIF
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the inactive CIF Card number
	Then Enter the valid SMS PIN
	Then Verify the validation message appears for inactive CIF for reset PIN1
	
@res_pin_CIF_SMS3
Scenario: Reset Pin using CIF number & SMS PIN -incorrect number of CIF numbers
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the incorrect CIF number
	And Enter the valid SMS PIN
	Then Verify the user is not allowed to proceed further

@res_pin_CIF_SMS4
Scenario: Reset Pin using CIF number & SMS PIN -incorrect number of SMS PIN numbers
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Enter the incorrect SMS PIN number
	Then Verify the user is not allowed to proceed further

@res_pin_CIF_SMS5
Scenario: Reset Pin using CIF number & SMS PIN - SMS Pin is not set
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with no spin set
	And Enter the valid SMS PIN
	Then Verify the validation for SMS pin fails for reset PIN

@res_pin_CIF_SMS6
Scenario: Reset Pin using CIF number & SMS PIN - SMS PIN is not active
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with inactive pin
	And Enter the inactive SMS PIN number
	Then Verify the validation for SMS pin fails for reset PIN

@res_pin_CIF_SMS7
Scenario: Reset Pin using CIF number & SMS PIN - Invalid CIF Number or SMS PIN
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Enter the invalid SMS PIN number
	Then Verify the validation for SMS pin fails for reset PIN

#@res_pin_CIF_SMS8
#Scenario: Reset PIN using CIF number & SMS PIN - wrong TPIN for 5 times
#	Given Verify the screen redirected to landing page
#	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Tap on register using your customer number link and navigate to customer registration screen
#	Then Enter the valid customer number
#	And Enter the invalid SMS PIN number for 5 times
#	Then Verify the card is blocked error message appears
	
@res_pin_CIF_SMS9 @reset
Scenario: Pin Reset - Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the login reset
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	Then Enter the valid SMS PIN 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all sets! screen2 
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen