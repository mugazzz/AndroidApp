@reg_new_mob_pin @reset
Feature: I should be able set my new mobile banking pin
	
#@reset @reg_new_mob_pin0
#Scenario: Verify account details during registration		
#	Given Verify the screen redirected to landing page
#	And Verify the homescreen button Register using card number
#	When Tap on Register using card number button and navigate to registration screen
#	Then Enter the Active Credit Card number
#	And Enter the Active Credit Card PIN number
#	Then Verify the card details are validated on flying and navigate to OTP screen
#	And Verify the account details for the registered user
	
@reg_new_mob_pin1
Scenario: Set new mobile banking pin - Matching PINs
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen

@reg_new_mob_pin2
Scenario: Set new mobile banking pin - incorrect number of PIN
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	Then Enter and Renter the incorrect Login Pins
	Then Verify the user is restricted to proceed further
	
@reg_new_mob_pin3
Scenario: Registration with a different device after initially setting the PIN on the first device
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen

 @reg_new_mob_pin3
 Scenario: Set new mobile banking pin - InCorrect Confirmation PIN
 	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	Then Enter the incorrect confirmation PIN
	Then Verify pin validation message appears
	
	