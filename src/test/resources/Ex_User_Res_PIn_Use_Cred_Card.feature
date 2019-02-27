@ex_user_res_pin_use_CC @sprint1_2 @sprint1-3
Feature: Existing registered user - Reset Pin validation using Credit Card.
I should be able to reset my PIN by verifying myself using my Credit Card and Credit Card pin
	
@ex_user_res_pin_use_CC1
Scenario: Reset PIN using Credit Card and Credit Card PIN - Active Card
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@ex_user_res_pin_use_CC2
Scenario: Reset PIN using Credit Card and Credit card pin - Inactive Card
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the inactive Credit Card number
	And Enter the inactive Credit Card PIN number
	Then Verify the user is not allowed to proceed further
	#Then Verify the validation message appears for inactive card

@ex_user_res_pin_use_CC3
Scenario: Reset PIN using Credit Card and Credit card pin -incorrect number of card numbers
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the incorrect Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the user is not allowed to proceed further

@ex_user_res_pin_use_CC4
Scenario: Reset PIN using Credit Card and Credit card pin -incorrect number of card PIN numbers
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Enter the Active Credit Card number
And Enter the inactive Credit Card PIN number
	And Enter the incorrect Credit Card PIN number
	Then Verify the user is not allowed to proceed further

@ex_user_res_pin_use_CC5
Scenario: Reset PIN using Credit Card and Credit card pin - Pin is not set
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Credit Card number with no Pin
	And Enter the Active Credit Card PIN number
	Then Verify the user is not allowed to proceed further
	#Then Verify the validation for Card pin fails1

@ex_user_res_pin_use_CC6
Scenario: Reset PIN using Credit Card and Credit card pin - Pin is not active
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Credit Card number whose Pin is not active
	And Enter the Inactive Pin number
	Then Verify the user is not allowed to proceed further
	#Then Verify the card is blocked error message appears

@ex_user_res_pin_use_CC7
Scenario: Reset PIN using Credit Card and Credit card pin - Expiry date is lesser than today
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Expired Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the user is not allowed to proceed further
	#Then Verify the validation for Card pin fails

@ex_user_res_pin_use_CC8
Scenario: Reset PIN using Credit Card and Credit card pin - Invalid Credit Card Number or Credit Card PIN
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Enter the Active Credit Card number
And Enter the inactive Credit Card PIN number
	And Enter the invalid Credit Card PIN number
	Then Verify the user is not allowed to proceed further
	#Then Verify the validation for Card pin fails1


#@ex_user_res_pin_use_CC9
#Scenario: Reset using Credit Card and Credit card pin - wrong PIN for the respective card 5 times
#	Given Verify the screen redirected to landing page
#	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Enter the Active Credit Card number
#	And Enter the invalid Credit Card PIN number for 5 times
#	Then Verify the card is blocked error message appears

@ex_user_res_pin_use_CC10
Scenario: Reset PIN - Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the login credit
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen