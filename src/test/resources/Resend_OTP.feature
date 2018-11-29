@resend_otp @sprint1_2
Feature: Resend OTP Validation

@reset @resend_otp0
Scenario: Able to receive OTP again if I have not received it at the first time - using Credit Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on fly and navigate to OTP screen
	And Get the first OTP number
	Then Tap on Resend OTP button
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen

@reset @resend_otp1
Scenario: Able to receive OTP again if I have not received it at the first time - using Debit Card
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	And Get the first OTP number
	Then Tap on Resend OTP button
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen

@reset @resend_otp2
Scenario: User should be able to register usign the latest OTP incase of multiple OTPs
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	And Trigger multiple OTPs by tapping Resend OTP button multiple times
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	
@reset @resend_otp3
Scenario: User should not able to register using the first OTP incase of muliple OTPs
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Debit Card number
	And Enter the Active Debit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	And Trigger multiple OTPs and send the first OTP to enter
	Then Verify the validation message appears

@reset @resend_otp4
Scenario: Register the user using Credit card to create existing user environment
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all sets! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@resend_otp5
Scenario: User should be able to reset PIN by entering resend OTP
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Tap on Resend OTP button
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	
