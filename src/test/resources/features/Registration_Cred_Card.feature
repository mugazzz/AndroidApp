@reg_cred_card
Feature: Registration process using Credit Card
I should be able to register using my Credit card and Credit card pin

@reg_cred_card0
Scenario: Register usign Credit Card and Credit Card pin - Active Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credict Card PIN number
	Then Verify the card details are validated on fly and navigate to OTP screen

@reg_cred_card1
Scenario: Register using Credit Card and Credit card pin - incorrect number of card numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Inactive Credit Card number
	And Enter the Active Credict Card PIN number
	Then Verify the user is not allowed the user to proceed forward while incorrect number of card numbers
	
@reg_cred_card2
Scenario: Register using Credit Card and Credit card pin -incorrect number of card PIN numbers
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Invalid Credict Card PIN number
	Then Verify the user is not allowed the user to proceed forward while incorrect number of card numbers

@reg_cred_card3
Scenario: Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
#	Given Verify the screen redirected to landing page
#	And Verify the homescreen button Register using card number
#	When Tap on Register using card number button and navigate to registration screen
#	Then Enter the Active Credit Card number
#	And Enter the Active Credict Card PIN number
#	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app
	And Enter the OTP and confirm the screen navigates to you are all set! screen
#	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen
	
	