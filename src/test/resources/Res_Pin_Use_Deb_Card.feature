@res_pin_use_DC @sprint1_2
Feature: Reset PIN using user Debit card
I should be able to reset my PIN by verifying myself using my Debit Card and Debit Card pin

@reset @res_pin_use_DC0
Scenario: Register the user using Debit card to create existing user environment
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@res_pin_use_DC1
Scenario: Reset PIN using Debit Card and Debit Card PIN - Active Card
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen

@res_pin_use_DC2
Scenario: Reset Pin using Debit Card and Debit card pin - Inactive Card
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number
	And Enter the invalid Debit Card PIN number
	Then Verify the invalid card or PIN number Validation appears
	
@res_pin_use_DC3
Scenario: Reset Pin using Debit Card and Debit card pin -incorrect number of card numbers
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the incorrect Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the user is not allowed to proceed further

@res_pin_use_DC4
Scenario: Reset Pin using Debit Card and Debit card pin -incorrect number of card PIN numbers
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number
	And Enter the incorrect Debit Card PIN number
	Then Verify the user is not allowed to proceed further

@res_pin_use_DC5
Scenario: Reset PIn using Debit Card and Debit card pin - Pin is not set
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number with no Pin
	And Enter the Active Debit Card PIN number
	Then Verify the validation for Card pin fails

@res_pin_use_DC6
Scenario: Reset Pin using Debit Card and Debit card pin - Pin is not active
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number whose Pin is not active
	And Enter the Inactive Debit Pin number
	Then Verify the validation for Card pin fails

@res_pin_use_DC7
Scenario: Reset Pin using Debit Card and Debit card pin - Expiry date is lesser than today
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Expired Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card expire validation message appears

@res_pin_use_DC8
Scenario: Reset Pin using Debit Card and Debit card pin - Invalid Debit Card Number or Debit Card PIN
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number
	And Enter the invalid Debit Card PIN number
	Then Verify the invalid card or PIN number Validation appears

#@res_pin_use_DC9
#Scenario: Reset PIN using Debit Card and Debit card pin - wrong PIN for the respective card 5 times
#	Given Verify the screen redirected to landing page
#	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Enter the Active Debit Card number
#	And Enter the invalid Debit Card PIN number for 5 times
#	Then Verify the card is blocked error message appears

@res_pin_use_DC10
Scenario: Reset PIN - Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen