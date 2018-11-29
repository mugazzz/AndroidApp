@reg_cred_card @sprint1_2
Feature: Registration process using Credit Card
I should be able to register using my Credit card and Credit card pin

@reg_cred_card0 @reset
Scenario: Register using Credit Card and Credit Card pin - Active Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on fly and navigate to OTP screen

@reg_cred_card1
Scenario: Register using Credit Card and Credit card pin - Inactive Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the inactive Credit Card number
	And Enter the inactive Credit Card PIN number
	Then Verify the validation message appears for inactive card

@reg_cred_card2
Scenario: Register using Credit Card and Credit card pin -incorrect number of card numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the incorrect Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the user is not allowed to proceed further
	
@reg_cred_card3
Scenario: Register using Credit Card and Credit card pin -incorrect number of card PIN numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the incorrect Credit Card PIN number
	Then Verify the user is not allowed to proceed further

@reg_cred_card4
Scenario: Register using Credit Card and Credit card pin - Pin is not set
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number with no Pin
	And Enter the Active Credit Card PIN number
	Then Verify the validation for Card pin fails
	
@reg_cred_card5
Scenario: Register using Credit Card and Credit card pin - Pin is not active
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number whose Pin is not active
	And Enter the Inactive Pin number
	Then Verify the validation for Card pin fails

@reg_cred_card6
Scenario: Register using Credit Card and Credit card pin - Expiry date is lesser than today
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Expired Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card expire validation message appears
	
@reg_card_card7
Scenario: Register using Credit Card and Credit card pin - Invalid Credit Card Number or Credit Card PIN
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the invalid Credit Card PIN number
	Then Verify the invalid card or PIN number Validation appears

#@reg_card_card8
#Scenario: Register using Credit Card and Credit card pin - wrong PIN for the respective card 5 times
#	Given Verify the screen redirected to landing page
#	And Verify the homescreen button Register using card number
#	When Tap on Register using card number button and navigate to registration screen
#	Then Enter the Active Credit Card number
#	And Enter the invalid Credit Card PIN number for 5 times
##	Then Verify the card is blocked error message appears
	
@reg_cred_card9
Scenario: Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen
	
	