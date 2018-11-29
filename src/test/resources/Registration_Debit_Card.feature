@reg_debit_card @sprint1_2
Feature: Registration process using Debit Card
I should be able to register using my Debit Card and Debit Card pin

@reg_debit_card0 @reset
Scenario: Register using Debit Card and Debit card pin - Active Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on fly and navigate to OTP screen

@reg_debit_card1
Scenario: Register using Debit Card and Debit card pin - Inactive Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the inactive Debit Card number
	And Enter the inactive Debit Card PIN number
	Then Verify the validation message appears for inactive card

@reg_debit_card2
Scenario: Register using Debit Card and Debit card pin -incorrect number of card numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the incorrect Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the user is not allowed to proceed further

@reg_debit_card3
Scenario: Register using Debit Card and Debit card pin -incorrect number of card PIN numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the incorrect Debit Card PIN number
	Then Verify the user is not allowed to proceed further

@reg_debit_card4
Scenario: Register using Debit Card and Debit card pin - Pin is not set
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number with no Pin
	And Enter the Active Debit Card PIN number
	Then Verify the validation for Card pin fails

@reg_debit_card5
Scenario: Register using Debit Card and Debit card pin - Pin is not active
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number whose Pin is not active
	And Enter the Inactive Debit Pin number
	Then Verify the validation for Card pin fails

@reg_debit_card6
Scenario: Register using Debit Card and Debit card pin - Expiry date is lesser than today
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Expired Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card expire validation message appears

@reg_debit_card7
Scenario: Register using Debit Card and Debit card pin - Invalid Debit Card Number or Debit Card PIN
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the invalid Debit Card PIN number
	Then Verify the invalid card or PIN number Validation appears

#@reg_debit_card8
#Scenario: Register using Debit Card and Debit card pin - wrong PIN for the respective card 5 times
#	Given Verify the screen redirected to landing page
#	And Verify the homescreen button Register using card number
#	When Tap on Register using card number button and navigate to registration screen
#	Then Enter the Active Debit Card number
#	And Enter the invalid Debit Card PIN number for 5 times
#	#Then Verify the card is blocked error message appears

@reg_debit_card9
Scenario: Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen
	
